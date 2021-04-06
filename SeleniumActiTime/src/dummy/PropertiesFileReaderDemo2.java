package dummy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.actitime.utils.FileReaderUtils;

public class PropertiesFileReaderDemo2 {

	
	public static void main(String[] args) throws IOException {
		
		FileReaderUtils.getProperty("url");
		FileReaderUtils.getProperty("username");
		FileReaderUtils.getProperty("password");
		FileReaderUtils.getProperty("timeout");
		FileReaderUtils.getProperty("browser");
		FileReaderUtils.getProperty("browser1");
		
	}
}
