package com.actitime.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.actitime.utils.ActitimeUtils;

public class DragAndDropDemo {

	
	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getMyDriver();
		ActitimeUtils.launchApplication("https://jqueryui.com/droppable/");
		
		Actions act = new Actions(driver);
		
		driver.switchTo().frame(0);
		act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
		
		System.out.println(driver.findElement(By.id("droppable")).getText());
	}
}
