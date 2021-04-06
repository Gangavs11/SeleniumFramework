package com.actitime.switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.actitime.utils.ActitimeUtils;

public class FrameDemo {

	
	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApplication("https://jqueryui.com/droppable/");
		
		Actions act = new Actions(driver);
		
		driver.switchTo().frame(0);
		act.dragAndDrop(ActitimeUtils.getMyElement("id","draggable"), ActitimeUtils.getMyElement("id","droppable")).perform();
		
		System.out.println(ActitimeUtils.getMyElement("id","droppable").getText());
		
		
		driver.switchTo().defaultContent();
		ActitimeUtils.click("linktext", "Draggable");
	}
}
