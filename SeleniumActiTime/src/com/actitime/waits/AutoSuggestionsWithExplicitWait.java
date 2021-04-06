package com.actitime.waits;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestionsWithExplicitWait {

	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("--- Welcome to Autosuggestions Display Automation Test Flow ---");
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium Online ");
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@class='erkvQe']"))));
				
		List<WebElement> suggestions = driver.findElements(By.xpath("//li[@class='sbct']"));
		
		System.out.println("-- Total suggestions displayed --" + suggestions.size());
		for(WebElement suggestion : suggestions)
		{
			System.out.println(suggestion.getText());
		}
			
		
	}
}
