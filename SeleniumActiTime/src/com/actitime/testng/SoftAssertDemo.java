package com.actitime.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {

	
	@Test
	public void testAsserts()
	{
		SoftAssert sa  = new SoftAssert();
		System.out.println("--Welcome to Asserts--");
		int a = 10;
		int b = 20;
		
		int c =  a + b;
		sa.assertEquals(c, 40);
		System.out.println("addition " + c);
	
		int d = a-b;
		sa.assertEquals(d, -10);
		System.out.println("Substraction " + d);
		System.out.println("---Ended-------");
		
		sa.assertAll();
	}

}
