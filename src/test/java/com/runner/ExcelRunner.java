package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.reuseableMethods.BaseClass;
import com.utility.ReadExcel;


public class ExcelRunner extends BaseClass {
	
public static void main(String[] args) throws Throwable  {
		
		browserLaunch("chrome");
		
        urlLaunch("https://www.youtube.com/");	
        
        implicitWait(20);
        
        WebElement searchBar = driver.findElement(By.name("search_query"));
        passValue(searchBar, ReadExcel.getExcel(0,0));
        WebElement searchBtn = driver.findElement(By.xpath("//button[@title='Search']"));
        elementClick(searchBtn);
        staticWait(5000);
        takeScreenshot("C:\\Users\\nirma\\eclipse-workspace\\MavenProject\\screenshots//img1.png");
        
	}
	
}
