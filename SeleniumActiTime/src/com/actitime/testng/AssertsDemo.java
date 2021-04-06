package com.actitime.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertsDemo
{
	
	
	
	@Test
	public void testAsserts()
	{
		System.out.println("--Welcome to Asserts--");
		int a = 10;
		int b = 20;
		
		int c =  a + b;
		Assert.assertEquals(c, 40);
		System.out.println("addition " + c);
	
		int d = a-b;
		Assert.assertEquals(d, -10);
		System.out.println("Substraction " + d);
		System.out.println("---Ended-------");
	}

}
