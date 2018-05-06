package com.uk.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	
public static void main(String[] args) {
		
		try{
			System.setProperty("webdriver.firefox.driver",
					"D:\\Users\\unkulkar\\Downloads\\geckodriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://www.google.com");
			WebElement searchField = driver.findElement(By.id("lst-ib"));
			searchField.sendKeys("pluralsight");
			searchField.submit();
			
			WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
			imagesLink.click();
			
			WebElement imageElement = driver.findElements(By.cssSelector("a[class=rg_l]")).get(0);
			WebElement imageLink = driver.findElements(By.tagName("img")).get(0);
			
			imageLink.click();
			
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
	}
}
