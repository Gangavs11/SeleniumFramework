package com.actitime.select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedDropDownDemo {

	public static void main(String[] args) {
		System.out.println("--- Welcome to Customized Dropdown Demo  Flow ---");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://formy-project.herokuapp.com/dropdown");
		driver.findElement(By.id("dropdownMenuButton")).click();
		driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[text()='Enabled and disabled elements']")).click();

	}
}
