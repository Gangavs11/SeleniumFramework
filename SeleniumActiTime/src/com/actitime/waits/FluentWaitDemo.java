package com.actitime.waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {

	public static void main(String[] args) {

		System.out.println("--- Welcome to Autosuggestions Display Automation Test Flow ---");

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("file:///D:/Intellipaat/Intellipaat_08_December/html/CounterText.html");
		
		FluentWait<WebElement> wait =  new FluentWait<WebElement>(driver.findElement(By.id("counter")))	
				.pollingEvery(Duration.ofMillis(100))
				.withTimeout(Duration.ofSeconds(60))
				.ignoring(NoSuchElementException.class)
				.ignoring(Exception.class);
		
		
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {

			@Override
			public Boolean apply(WebElement element) 
			{
				String str =  element.getText();
				if(str.equals("45"))
				{
					System.out.println("found!!!!!");
					return true;
				}
				else
				{
					System.out.println("Waiting for the text to become 45!!!!!!");
					return false;
				}
			}
		};
		
		
		wait.until(fun);
		
		driver.close();
		
		
		
	}
}
