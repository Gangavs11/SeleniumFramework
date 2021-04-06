package com.actitime.switchto;

import org.openqa.selenium.WebDriver;

import com.actitime.utils.ActitimeUtils;

public class HandlingAlerts
{

	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApplication("http://formy-project.herokuapp.com/switch-window");
		ActitimeUtils.click("id", "alert-button");
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
	}
}
