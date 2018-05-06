package com.uk.selelium.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverHelper {
	
	public static final String WEB_PAGE_LOCATION = "D:\\SDET\\cucumber\\seleniumdemo2\\webpages";
	
	static {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\unkulkar\\Downloads\\chromedriver.exe");
		System.setProperty("webdriver.firefox.driver",
				"D:\\Users\\unkulkar\\Downloads\\geckodriver.exe");
	}
	public static WebDriver getChromeWebDrivers(){
		
		WebDriver driver = new ChromeDriver();
		
		return driver;
	} 
	
public static WebDriver getFirefoxWebDrivers(){
		
		WebDriver driver = new FirefoxDriver();
		
		return driver;
	} 

}
