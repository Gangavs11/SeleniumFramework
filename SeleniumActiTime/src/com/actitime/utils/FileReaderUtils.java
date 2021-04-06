package com.actitime.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReaderUtils {

	public static String getProperty(String propertyName) {
		String value = null;
		File f = null;
		FileInputStream fis = null;
		Properties props = null;
	
		try {
			f = new File("data\\globalvalues.properties");
			fis = new FileInputStream(f);
			props = new Properties();
			props.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (props.getProperty(propertyName) != null) 
		{
			value = props.getProperty(propertyName);
			System.out.println("returning " + value  + " from properties file");
		} else 
		{
			System.out.println("Property name " + propertyName + " is inValid.. please check the propertis file under data folder");
		}
		try 
		{
			fis.close();
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
}
