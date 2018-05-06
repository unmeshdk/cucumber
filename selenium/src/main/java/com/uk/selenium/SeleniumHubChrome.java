package com.uk.selenium;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHubChrome {

		public static void main(String[] args) {
			try {
//				System.setProperty("webdriver.firefox.driver", "D:\\Users\\unkulkar\\Downloads\\geckodriver.exe");
//				WebDriver driver = new FirefoxDriver();
//				// driver.get("http://www.google.com");
//				//
//				WebElement searchField = driver.findElement(By.id("lst-ib"));
//				searchField.sendKeys("pluralsight");
				// searchField.submit();
				//
				// WebElement imagesLink =
				// driver.findElements(By.linkText("Images")).get(0);
				// imagesLink.click();
				//
				// WebElement imageElement
				// =driver.findElements(By.cssSelector("a[class = rg_l]")).get(0);
				//
				// WebElement imageLink =
				// imageElement.findElements(By.tagName("img")).get(0);
				// imageLink.click();
				//

				String nodeURL = "http://10.102.54.223:4444/wd/hub";

				// System.setProperty("webdriver.chrome.driver","D:\\SatishTrainingData\\TrainingsTopicsWise\\SeleniumAndWebDriver\\ChromeDriver\\chromedriver.exe");
				// DesiredCapabilities capability = DesiredCapabilities.chrome();

				DesiredCapabilities capability = DesiredCapabilities.chrome();
				capability.setBrowserName("firefox");
				capability.setPlatform(Platform.WINDOWS);
				System.out.println(capability);
				WebDriver driver2 = new RemoteWebDriver(new URL(nodeURL), capability);
				driver2.get("http://www.google.com");
				WebElement searchField1 = driver2.findElement(By.id("lst-ib"));
				searchField1.sendKeys("pluralsight");
				searchField1.submit();

				// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver2, 10);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));

				WebElement imagesLink1 = driver2.findElements(By.linkText("Images")).get(0);
				imagesLink1.click();

				WebElement imageElement1 = driver2.findElements(By.cssSelector("a[class = rg_l]")).get(0);
				WebElement imageLink1 = imageElement1.findElements(By.tagName("img")).get(0);
				imageLink1.click();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

}
