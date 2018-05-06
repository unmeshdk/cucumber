package com.uk.selelium.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverHelper {
	
	public static final String WEB_PAGE_LOCATION = "D:\\SDET\\cucumber\\seleniumdemo2\\webpages";
	
	static {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\unkulkar\\Downloads\\chromedriver.exe");
	}
	public static WebDriver getChromeWebDrivers(){
		
		WebDriver driver = new ChromeDriver();
		
		return driver;
	} 

}
