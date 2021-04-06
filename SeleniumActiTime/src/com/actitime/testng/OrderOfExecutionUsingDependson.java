package com.actitime.testng;

import org.testng.annotations.Test;

public class OrderOfExecutionUsingDependson {

	@Test
	public void launch()
	{
		
	}
	
	@Test(dependsOnMethods = "launch")
	public void login()
	{
		
	}
	
	@Test(dependsOnMethods = {"launch", "login"})
	public void createCustomer()
	{
		
	}
	
	@Test(dependsOnMethods = {"launch", "login", "createCustomer"})
	public void logout()
	{
		
	}
	
	
	
	
	
}
