package com.actitime.switchto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.actitime.utils.ActitimeUtils;

public class FrameUsingNAme {

	
	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApplication("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_lists_unordered");

		ActitimeUtils.click("xpath", "//button[contains(text(),'Run')]");
		
	//	driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(ActitimeUtils.getMyElement("name", "iframeResult"));
		List<WebElement> liitems = driver.findElements(By.xpath("//li"));
	
	
		for (WebElement liitem : liitems) {
			System.out.println(liitem.getText());
		}
		
		driver.switchTo().defaultContent();
		
		ActitimeUtils.click("id", "tryhome");
		
		
		
	}
}
