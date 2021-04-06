package com.actitime.select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("--- Welcome to MultiSelect Dropdown Demo  Flow ---");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/Intellipaat/Intellipaat_08_December/html/multiSelect.html");
		
		
		Select dropDown = new Select(driver.findElement(By.tagName("select")));
		
		dropDown.selectByIndex(0);
		Thread.sleep(2000);
		dropDown.selectByValue("mercedes");
		Thread.sleep(2000);
		dropDown.selectByVisibleText("Audi");
		Thread.sleep(2000);
		dropDown.deselectByIndex(3);
		Thread.sleep(2000);
		dropDown.deselectByVisibleText("Volvo");
		Thread.sleep(2000);
		dropDown.deselectByValue("mercedes");
		
		
		
		dropDown.selectByIndex(0);
		Thread.sleep(2000);
		dropDown.selectByValue("mercedes");
		Thread.sleep(2000);
		dropDown.selectByVisibleText("Audi");
		
		Thread.sleep(2000);
		dropDown.deselectAll();
		
		
		
	}
}
