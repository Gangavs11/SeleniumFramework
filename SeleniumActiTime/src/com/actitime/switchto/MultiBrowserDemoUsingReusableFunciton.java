package com.actitime.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.actitime.utils.ActitimeUtils;

public class MultiBrowserDemoUsingReusableFunciton {

	private static WebDriver driver = null;
	
	
	public static void main(String[] args) {
		
		driver = ActitimeUtils.getMyDriver();
		
		ActitimeUtils.launchApplication("https://www.irctc.co.in/eticketing/errors.html#");
		printAllHyperLinksOfThePage();
		
		ActitimeUtils.click("linktext", "Contact Us");
		Set<String> windowIDs = driver.getWindowHandles();
		
		Iterator<String> it = windowIDs.iterator();
		
		String parentWindowID = it.next();
		String childWindowID = it.next();
		
		System.out.println("Parent window ID " + parentWindowID);
		System.out.println("Child window ID " + childWindowID);
		
		driver.switchTo().window(childWindowID);
		printAllHyperLinksOfThePage();
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		ActitimeUtils.click("linktext", "Home");
		
		printAllHyperLinksOfThePage();
		
		driver.close();
		
		
	}
	
	
	public static void printAllHyperLinksOfThePage()
	{
		List<WebElement> hyperLinks = driver.findElements(By.xpath("//a"));
		System.out.println("There are total " + hyperLinks.size() + " number of hyperlinks found");
		int count =1;
		for (WebElement hyperlink : hyperLinks) 
		{
			System.out.println(count + " : " + hyperlink.getText());
			count++;
		}
		
	}
	
	
	
	
	
	
}
