package com.actitime.utils;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationUtils extends DriverUtils
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
		
		click("xpath", "//a[div[text()='"  + moduleName.toUpperCase() +"']]");
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
	
	
	public static void createNewCustomer(String cn, String cd)
	{
		sendKeys("id", "customerLightBox_nameField", cn);
		sendKeys("id", "customerLightBox_descriptionField", cd);
		click("id", "customerLightBox_commitBtn");
		
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
