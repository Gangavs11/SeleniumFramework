package com.actitime.utils;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeUtils extends DriverUtils
{
	
	public static void launchApplication(String url)
	{
		System.out.println("---[INFO] launching application  " + url);
		driver.get(url);
	}

	
	public static void login(String un,String pwd)
	{
		System.out.println("Login to applcition using " + un + " and " + pwd);
		sendKeys("id", "username", un);
		sendKeys("name", "pwd", pwd);
		click("id", "loginButton");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//validation TODO
	}
	
	
	public static void selectModule(String moduleName)
	{
		System.out.println("Clicking on module " + moduleName);
		
		switch (moduleName.toLowerCase()) 
		{
		case "tasks":
			click("xpath", "//a[div[text()='"  + moduleName.toUpperCase() +"']]");
			break;

		case "reports":
			click("xpath", "//a[div[text()='"  + moduleName.toUpperCase() +"']]");
			break;
		default:
			break;
		}
		
		
						//a[div[text()='        TASKS                   ']]
		
		System.out.println("Module " + moduleName + " selected successfully");
	}
	
	
	public static void clickOnNewCustomerButton()
	{
		System.out.println(" --- Clicking on new customer Button---");
		click("xpath","//div[@class='addNewContainer']");
		click("xpath", "//div[@class='item createNewCustomer ellipsis']");
		System.out.println("--- Add new customer is successfull ---");
	}
	
	
	public static void clickOnNewProjectButton()
	{
		System.out.println("--- Clicking on new Project Button---");
		click("xpath","//div[@class='addNewContainer']");
		click("xpath", "//div[@class='item createNewProject ellipsis']");
		System.out.println("--- Add new Project is successfull ---");
		
	}
	
	
	public static void createNewProject(String projectName,String customerName,String projectDesc) throws InterruptedException
	{
		System.out.println("Creating a Project for a customer " + customerName);
		System.out.println("Project details - Project Name "+ projectName + " and " + projectDesc);
	
		sendKeys("id", "projectPopup_projectNameField", projectName);

		click("id", "projectPopup_customerSelectorPlaceholder");
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(getMyElement("xpath", "//a[text()='-- Please Select Customer to Add Project for  --']/ancestor::ul")));
		scrollToElementVisible(getMyElement("xpath", "//a[text()='"+ customerName +"']"));
		click("xpath", "//a[text()='"+ customerName +"']");
		
		sendKeys("id", "projectPopup_projectDescriptionField", projectDesc);
		click("id", "projectPopup_commitBtn");
		
		waitForSuccessMessageToAppearAndDisAppear();
		
	
	}
	public static void createNewCustomer(String cn, String cd)
	{
		sendKeys("id", "customerLightBox_nameField", cn);
		sendKeys("id", "customerLightBox_descriptionField", cd);
		click("id", "customerLightBox_commitBtn");
		waitForSuccessMessageToAppearAndDisAppear();
	
	}
	
	public static void waitForSuccessMessageToAppearAndDisAppear()
	{
		System.out.println("Waiting for success message to appear...");
		WebDriverWait wait =  new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(getMyElement("xpath", "//div[@class='toast']")));
		
		System.out.println("waiting for success messasge to disapper");
		wait.until(ExpectedConditions.invisibilityOf(getMyElement("xpath", "//div[@class='toast']")));
	
		System.out.println("Success message disappeared...");
	}
	public static void logout()
	{
		System.out.println("--- logging out of the applicaiton");
		click("id", "logoutLink");
		System.out.println("Logout successfull");
	}
	
	
	
	
	
	
	
	
	
	
}
