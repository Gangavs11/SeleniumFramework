package com.actitime.autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsDemo {

	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("--- Welcome to Autosuggestions Display Automation Test Flow ---");
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Intellipaat");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//li[@class='sbct']"));
		
		System.out.println("-- Total suggestions displayed --" + suggestions.size());
		for(WebElement suggestion : suggestions)
		{
			System.out.println(suggestion.getText());
		}
			
		
	}
}
