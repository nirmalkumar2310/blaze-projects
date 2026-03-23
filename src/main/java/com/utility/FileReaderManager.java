package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class FileReaderManager {
	private static Properties property;
	private static void setupProperty() {
		
		File file=new File("C:\\Users\\nirma\\eclipse-workspace\\MavenProject\\src\\main\\resource\\TestData.properties");
		
		try {
			FileInputStream fis=new FileInputStream(file);
			 property = new Properties();
			 property.load(fis);
		} catch (FileNotFoundException e) {
		} catch (IOException e) {	
		}
         
	}
	
	public static String getProperty(String key) {
	setupProperty();
	String value=property.getProperty(key);
	return value;
	}
	
	public static void main(String[]args) {
		
	}
}
