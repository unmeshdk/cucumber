package com.uk.advanced;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.uk.selelium.helper.WebDriverHelper;
public class WebDriverCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = WebDriverHelper.getChromeWebDrivers();
		
		driver.get(WebDriverHelper.WEB_PAGE_LOCATION + "/CheckboxTest.html");
		
		By element = By.id("lettuceCheckbox");
		

		WebElement checkbox = driver.findElement(element);
		
		Thread.sleep(2000);
		
		checkbox.click();
		
		if(checkbox.isSelected()) {
			System.out.println("Value of checkBox :- "+checkbox.getAttribute("value") );
		}
	}	

}
