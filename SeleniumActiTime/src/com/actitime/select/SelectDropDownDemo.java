package com.actitime.select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("--- Welcome to Customized Dropdown Demo  Flow ---");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://formy-project.herokuapp.com/form");
		
		WebElement dropDownElement = driver.findElement(By.id("select-menu"));
		Select sel = new Select(dropDownElement);
		
		List<WebElement> options = sel.getOptions();
		
		System.out.println(options.size());
		
		for (WebElement option : options) 
		{
			
			System.out.println(option.getText());
			
		}
		
		sel.selectByIndex(1);
		
		Thread.sleep(2000);
		
		sel.selectByValue("3");
		
		Thread.sleep(2000);
		
		sel.selectByVisibleText("10+");
		
	}
}
