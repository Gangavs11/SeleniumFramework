package com.actitime.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.actitime.utils.ActitimeUtils;

public class MouseMovementOperations {

	private static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		
		driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApplication("https://www.flipkart.com/");
		
		WebDriverWait wait  =  new WebDriverWait(driver, 10);
		WebElement closeElement = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='_3Njdz7']/button"))));
		
		closeElement.click();
		
		Actions act = new Actions(driver);

		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Women']"))).perform();
		printElements();
		Thread.sleep(2000);

		act.moveToElement(driver.findElement(By.xpath("//span[text()='Men']"))).perform();
		Thread.sleep(2000);
		printElements();

		act.moveToElement(driver.findElement(By.xpath("//span[text()='Baby & Kids']"))).perform();
		Thread.sleep(2000);
		printElements();
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Sports, Books & More']"))).perform();
		printElements();
	}
	
	public static void printElements()
	{
		System.out.println("************************* Printing elements after moving mouse ********************************");
		
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='_2OZ78M _1fj2FQ']//li[@class='_1KCOnI _3ZgIXy']"));
		
		for (WebElement element : elements) 
		{
			System.out.println("----- " + element.getText() + " -----");
			
		}
	}
	
	
	
	
	
	
	

}
