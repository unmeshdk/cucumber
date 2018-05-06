package com.uk.advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.uk.selelium.helper.WebDriverHelper;

public class WebDriverRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverHelper.getChromeWebDrivers();
		driver.get(WebDriverHelper.WEB_PAGE_LOCATION + "\\RadioButtonTest.html");
		By elements  = By.name("color");
		
		List<WebElement> radioButtons = driver.findElements(elements);
		
		WebElement radioBtn= radioButtons.get(1);
		
		radioBtn.click();
		
		for (WebElement radioButton : radioButtons) {
			if(radioButton.isSelected()) {
				System.out.println(radioButton.getAttribute("value"));
			}
		}

		Thread.sleep(3000);
		
		radioButtons.get(2).click();
		
		for (WebElement radioButton : radioButtons) {
			if(radioButton.isSelected()) {
				System.out.println(radioButton.getAttribute("value"));
			}
		}
	}

}
