package com.actitime.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {

	public static void main(String[] args) {
		
		System.out.println("--- Welcome to Registration Automation Test Flow ---");
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://formy-project.herokuapp.com/form");
		
		driver.findElement(By.id("first-name")).sendKeys("Ganga");
		driver.findElement(By.id("last-name")).sendKeys("Kiran");
		driver.findElement(By.id("job-title")).sendKeys("Automation Tester");

		driver.findElement(By.id("radio-button-3")).click();
		driver.findElement(By.id("checkbox-1")).click();
		
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//td[text()='30' and @data-date='1577664000000']")).click();
		
		driver.findElement(By.xpath("//a[text()='Submit']")).click();
		
		System.out.println("--- End of Registration Automation Test Flow ---");
		
		driver.close();
	}
}
