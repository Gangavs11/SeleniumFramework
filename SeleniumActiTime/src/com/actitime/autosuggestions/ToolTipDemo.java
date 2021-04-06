package com.actitime.autosuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo {

	public static void main(String[] args) {
		System.out.println("--- Welcome to Autosuggestions Display Automation Test Flow ---");

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		WebElement appsIcon = driver.findElement(By.xpath("//a[@class='gb_D gb_oc']"));
		
		String actualTooltip = appsIcon.getAttribute("title");
		
		if(actualTooltip.equals("Google apps"))
		{
			System.out.println("Actual Tool Tip : " + actualTooltip);
			System.out.println("Strings are matched..!!!!");
		}
		else
		{
			System.out.println("FAIL-- Tool tip didnt match");
		}
				
	}
}
