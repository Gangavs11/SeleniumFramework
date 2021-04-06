package com.actitime.popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.utils.ActitimeUtils;

public class HiddenDivisionPopUp {
	
	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getMyDriver();
		
		ActitimeUtils.launchApplication("http://formy-project.herokuapp.com/datepicker");
		
		ActitimeUtils.click("id", "datepicker");
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ActitimeUtils.getMyElement("xpath", "//div[contains(@class,'datepicker datepicker-dropdown')]")));
		
		ActitimeUtils.click("xpath","//td[@class='day' and text()='15']");
		
		String selectedDate = ActitimeUtils.getMyElement("id", "datepicker").getText();
	
		System.out.println("date selected..." + selectedDate);
	}

}
