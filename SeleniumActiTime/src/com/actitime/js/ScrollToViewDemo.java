package com.actitime.js;

import static com.actitime.utils.ActitimeUtils.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.actitime.utils.DriverUtils;

public class ScrollToViewDemo
{
	
	@Test
	public void javaScriptExecutorDemo()
	{
		WebDriver driver = getMyDriver();
		launchApplication("http://formy-project.herokuapp.com/scroll");
		
		scrollToElementVisible(DriverUtils.getMyElement("id", "name"));
	}

	
}
