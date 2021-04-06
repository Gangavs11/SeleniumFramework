package com.actitime.tests;

import org.openqa.selenium.WebDriver;

import com.actitime.utils.ActitimeUtils;
import com.actitime.utils.FileReaderUtils;

public class CreateCustomerUsingExternalData {

	private static WebDriver driver = null;
	public static void main(String[] args) {
		
		System.out.println("--- Welcome to Customer Creation ---");
		driver = ActitimeUtils.getMyDriver();
	
		ActitimeUtils.launchApplication(FileReaderUtils.getProperty("url"));
		ActitimeUtils.login(FileReaderUtils.getProperty("username"), FileReaderUtils.getProperty("password"));
		ActitimeUtils.selectModule("tasks");
		ActitimeUtils.clickOnNewCustomerButton();
		ActitimeUtils.createNewCustomer("Int-Third-Cust-Dec", "Int-Third-Cust-Dec-Desc");
		ActitimeUtils.logout();
		
		/*

	     - delete customer
	     - create project
	     - create task
	*/
		
	}
}
