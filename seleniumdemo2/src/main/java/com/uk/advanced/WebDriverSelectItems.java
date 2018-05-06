package com.uk.advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.uk.selelium.helper.WebDriverHelper;

public class WebDriverSelectItems {

	public static void main(String[] args) {
		WebDriver driver = WebDriverHelper.getChromeWebDrivers();
		driver.get(WebDriverHelper.WEB_PAGE_LOCATION + "/SelectItemTest.html");
		
		WebElement selectElement = driver.findElement(By.id("select1"));
		Select select = new Select(selectElement);
		select.selectByVisibleText("Maybe");

	}

}
