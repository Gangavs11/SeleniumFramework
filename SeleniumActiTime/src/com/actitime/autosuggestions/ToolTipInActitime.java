package com.actitime.autosuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipInActitime {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		System.out.println(System.getProperty("webdriver.chrome.driver"));
		WebDriver driver =  new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		WebElement userNameTextBox = driver.findElement(By.id("username"));
		userNameTextBox.sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		
		WebElement settingIconWE= driver.findElement(By.xpath("//div[@class='popup_menu_icon warning_icon']"));
		System.out.println("ToolTip - " + settingIconWE.getAttribute("title"));
		
	}
}
