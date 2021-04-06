package dummy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReaderDemo {

	
	public static void main(String[] args) throws IOException {
		
		File f = new File("data\\globalvalues.properties");
		FileInputStream fis = new FileInputStream(f);
		
		
		Properties props = new Properties();
		props.load(fis);
		
		System.out.println(props.getProperty("url"));
		System.out.println(props.getProperty("username"));
		System.out.println(props.getProperty("password"));
		System.out.println(props.getProperty("timeout"));
		System.out.println(props.getProperty("browser"));
		
		
		fis.close();
		
	}
}
