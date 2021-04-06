package com.actitime.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.actitime.utils.ActitimeUtils;

public class OtherFunctionsinActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApplication("https://jqueryui.com/droppable/");
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.PAGE_DOWN).perform();	
	}
}
