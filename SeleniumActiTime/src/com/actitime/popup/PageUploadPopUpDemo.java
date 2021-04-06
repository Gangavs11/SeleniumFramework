package com.actitime.popup;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.actitime.utils.ActitimeUtils;

public class PageUploadPopUpDemo {
	
	public static void main(String[] args) throws IOException {
		Runtime.getRuntime().exec("D:\\Intellipaat\\Intellipaat_08_December\\autoit\\pageUploadPopUp.exe");
		
		WebDriver driver=  ActitimeUtils.getMyDriver();
		
		ActitimeUtils.launchApplication("https://formy-project.herokuapp.com/fileupload");
		
		ActitimeUtils.click("xpath", "//button[text()='Choose']");
		
		
		
		System.out.println("Popup Handled");
		
	}

}
