package com.actitime.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.actitime.utils.ActitimeUtils;
import com.actitime.utils.DriverUtils;

public class KeyBoardActionsDemo
{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("welcome to KeyBoard Operations demo");
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launchApplication("http://localhost/login.do");
		
		Actions act = new Actions(driver);
		
		/*
		 * act.sendKeys("admin").perform(); Thread.sleep(2000);
		 * act.sendKeys(Keys.TAB).perform(); Thread.sleep(2000);
		 * act.sendKeys("manager").perform(); Thread.sleep(2000);
		 * act.sendKeys(Keys.ENTER).perform();
		 */
		
		act.sendKeys("admin").sendKeys(Keys.TAB).sendKeys("manager").sendKeys(Keys.ENTER).build().perform();
	}

}
