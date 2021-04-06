package com.actitime.testng;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.actitime.utils.ActitimeUtils;
import com.actitime.utils.DriverUtils;

public class CreateProject 
{

	WebDriver driver = null;
	
	@BeforeTest
	public void setup()
	{
		driver = ActitimeUtils.getMyDriver("ff");
		ActitimeUtils.launchApplication("http://localhost/login.do");
		ActitimeUtils.login("admin", "manager");
	}
	
	
	@Test
	public void createProject() throws InterruptedException
	{
		ActitimeUtils.selectModule("tasks");
		ActitimeUtils.clickOnNewProjectButton();
		ActitimeUtils.createNewProject("Project-5", "DP-Dec-Customer5", "Project-123-Desc");
	}
	
	@AfterMethod
	public void checkStatus(ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			try {
				DriverUtils.captureScreenShot();
				driver.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("PASS");
		}
	}
	@AfterTest
	public void tearDown()
	{
		ActitimeUtils.logout();
		driver.close();
	}
	
	
	
	
	
	
	
}
