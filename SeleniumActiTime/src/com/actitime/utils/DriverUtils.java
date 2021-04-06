package com.actitime.utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtils {

	public static WebDriver driver = null;

	public static WebDriver getMyDriver() {
		System.out.println("---[INFO] creating driver object ---");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Integer.valueOf(FileReaderUtils.getProperty("timeout")),
				TimeUnit.SECONDS);
		driver.manage().window().maximize();

		return driver;
	}

	public static WebDriver getMyDriver(String type) {
		System.out.println("---[INFO] creating driver object for ---" + type);

		switch (type) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "ff":
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("type didnt match please pass chrome or ff");
			break;
		}

		driver.manage().timeouts().implicitlyWait(Integer.valueOf(FileReaderUtils.getProperty("timeout")),
				TimeUnit.SECONDS);
		driver.manage().window().maximize();

		return driver;

	}

	public static WebElement getMyElement(String identifier, String identifierValue) {
		WebElement element = null;
		System.out.println("finding the element using " + identifier + " and " + identifierValue);

		switch (identifier.toLowerCase()) {
		case "id":
			element = driver.findElement(By.id(identifierValue));
			break;
		case "name":
			element = driver.findElement(By.name(identifierValue));
			break;
		case "tagname":
			element = driver.findElement(By.tagName(identifierValue));
			break;
		case "classname":
			element = driver.findElement(By.className(identifierValue));
			break;
		case "linktext":
			element = driver.findElement(By.linkText(identifierValue));
			break;
		case "paritallinktext":
			element = driver.findElement(By.partialLinkText(identifierValue));
			break;
		case "css":
			element = driver.findElement(By.cssSelector(identifierValue));
			break;
		case "xpath":
			element = driver.findElement(By.xpath(identifierValue));
			break;

		default:
			System.out.println("Please check your identifier..!!!!!" + identifier);
			break;
		}

		return element;

	}

	public static void click(String identifier, String identifierValue) {
		System.out.println("--Clicking on an element using " + identifier + " and " + identifierValue);
		getMyElement(identifier, identifierValue).click();
		System.out.println("--Click is successfull --");
	}

	public static void sendKeys(String identifier, String identifierValue, String textToType) {
		System.out.println(
				"$$ Typing on an element  using " + identifier + " and " + identifierValue + " and text " + textToType);
		getMyElement(identifier, identifierValue).sendKeys(textToType);
		System.out.println("$$ Type operation is successfull");

	}

	public static void scrollToElementVisible(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", ele);
	}
	
	
	
	
	
	public static void captureScreenShot() throws IOException
	{
		TakesScreenshot ss = (TakesScreenshot) driver;
		String fileName = "screenshots\\SS_"+ getCurrentDateAndTime() + ".png";
		
		File screenShot = ss.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenShot, new File(fileName));
		
	}
	
	
	public static String getCurrentDateAndTime()
	{
		return new Date().toString().replace(" ", "_").replace(":", "_");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
