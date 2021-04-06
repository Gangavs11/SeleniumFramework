package com.actitime.browseractions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActionsDemo {
	
	public static void main(String[] args) {
		System.out.println("Welcome to browser Actions ");
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://localhost/login.do");
		System.out.println("Before clicking on back button" + driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("after clicking on back button" + driver.getCurrentUrl());
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.navigate().to("http://www.google.com");
		
		driver.close();  //		driver.quit();
		
		
		
	}

}
