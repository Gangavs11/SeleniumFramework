package com.actitime.testng;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.DataProvider;

public class DataProviderDemo
{
	@Test(dataProviderClass = TestData.class , dataProvider = "dp")
	public void dataProviderDemo(int a, String b)
	{
		System.out.println("Data provider values " + a +  " and " + b);
	}

	
	@Test(dataProviderClass = TestData.class, dataProvider = "customerData")
	public void createCustomer(String cn, String cd) throws FileNotFoundException
	{
		System.out.println("Test executing with customer name " + cn + " and " + cd);
		FileInputStream fis  = new FileInputStream("");
		
	}
}
