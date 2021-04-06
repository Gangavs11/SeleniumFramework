package com.actitime.tests;

import org.openqa.selenium.WebDriver;

import com.actitime.utils.ActitimeUtils;
import com.actitime.utils.ExcelUtils;

public class CreateCustomer {

	private static WebDriver driver = null;
	public static void main(String[] args) {
		String dataSheetName = "customerdata";
		String cn,cd,executionStatus;
		System.out.println("--- Welcome to Customer Creation ---");
		driver = ActitimeUtils.getMyDriver();
	
		ActitimeUtils.launchApplication("http://localhost/login.do");
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.selectModule("tasks");
	
		int iterationCount = ExcelUtils.excelRowCount(dataSheetName);
		for (int i = 1; i < iterationCount ; i++)
		{
			executionStatus =  ExcelUtils.getCellValueAsString(dataSheetName, i, 2);
			if(executionStatus.equalsIgnoreCase("yes"))
			{
				cn = ExcelUtils.getCellValueAsString(dataSheetName, i, 0);
				cd = ExcelUtils.getCellValueAsString(dataSheetName, i, 1);
			
				ActitimeUtils.clickOnNewCustomerButton();
				ActitimeUtils.createNewCustomer(cn,cd);
			}
			else
			{
				System.out.println("Execution status for the row "  +i + " is set to No ...");
			}
		}
		
		
		
		ActitimeUtils.logout();
		
	}
}
