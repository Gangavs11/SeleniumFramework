package com.actitime.testng;

import org.testng.annotations.DataProvider;

public class TestData 
{
	
	@DataProvider
	public Object[][] dp()
	{
		return new Object[][] 
		{ 
			new Object[] { 1, "a" }, 
			new Object[] { 2, "b" }, 
			new Object[] { 3, "c" }, 
			new Object[] { 4, "d" }, 
			new Object[] { 5, "e" }, 
			new Object[] { 6, "f" }, 
			new Object[] { 7, "g" }, 
			new Object[] { 8, "h" }, 
			new Object[] { 9, "i" }, 
			new Object[] { 10, "j" }, 
		};
	}

	
	@DataProvider
	public Object[][] customerData()
	{
		return new Object[][] 
		{ 
			new Object[] { "DP-Dec-Customer9","DP-Dec-Customer-Desc-1"}, 
			new Object[] { "DP-Dec-Customer10","DP-Dec-Customer-Desc-2"}, 
			new Object[] { "DP-Dec-Customer11","DP-Dec-Customer-Desc-3"}, 
			new Object[] { "DP-Dec-Customer12","DP-Dec-Customer-Desc-4"}, 
		};
	}
	
	
	
	
	@DataProvider
	public Object[][] createProject()
	{
		return new Object[][] 
		{ 
			new Object[] { "Project-1", "DP-Dec-Customer5","DP-Dec-Project-Desc-1"}, 
			new Object[] { "Project-1", "DP-Dec-Customer6","DP-Dec-Project-Desc-2"}, 
			new Object[] { "Project-2", "DP-Dec-Customer5","DP-Dec-Project-Desc-1"}, 
			new Object[] { "Project-2", "DP-Dec-Customer6","DP-Dec-Project-Desc-2"}, 
			new Object[] { "Project-1", "DP-Dec-Customer7","DP-Dec-Project-Desc-3"}, 
			new Object[] { "Project-1", "DP-Dec-Customer8","DP-Dec-Project-Desc-4"}, 
		};
	}
	
	
	
	
	
	
	
}
