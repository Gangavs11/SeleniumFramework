package com.actitime.testng;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.actitime.utils.ActitimeUtils;
import com.actitime.utils.DriverUtils;

public class CreateCustomerTest {

	WebDriver driver = null;

	@Parameters("url")
	@BeforeTest
	public void launch(String appUrl)
	{
		driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApplication(appUrl);
		
	}
	
	@Parameters({"username","password"})
	@BeforeClass
	public void login(String un,String pwd)
	{
		ActitimeUtils.login(un, pwd);
		ActitimeUtils.selectModule("tasks");
	}
	
	
	@Test(priority = 1, dataProviderClass = TestData.class, dataProvider = "customerData")
	public void createCustomer(String cn,String cd)
	{
		Reporter.log("Creating a customer with " + cn + " and " + cd + "<br>");
		ActitimeUtils.clickOnNewCustomerButton();
		ActitimeUtils.createNewCustomer(cn,cd);
	}
	
	
	@Test(priority = 2, dataProviderClass =  TestData.class, dataProvider = "createProject")
	public void createProject(String pn, String cn, String pd) throws InterruptedException
	{
		Reporter.log("Creating a Project with " + pn + " and " + cn + " and " +pd +  "<br>");
		ActitimeUtils.selectModule("reports");
		ActitimeUtils.selectModule("tasks");
		ActitimeUtils.clickOnNewProjectButton();
		ActitimeUtils.createNewProject(pn, cn, pd);
	
	}
	
	
	@AfterClass
	public void logout()
	{
		ActitimeUtils.logout();
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		
	}
	
}
