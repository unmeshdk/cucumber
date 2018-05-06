package com.uk.gitregi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.uk.selelium.helper.WebDriverHelper;

public class GitRegistrationTest {

	static WebDriver driver;
	private RegistrationPage registrationPage;

	@BeforeClass
	public static void setUpDriverEnv() {
	
		
		driver = WebDriverHelper.getChromeWebDrivers();
		driver.manage().window().maximize();
	}

	@Before
	public void setUpTestEnv() {
		driver.get("https://github.com/join");
		registrationPage = new RegistrationPage();
		PageFactory.initElements(driver, registrationPage);
	}
	
	//@Test
	public void testForBlankUserNameAndPassword() {
		registrationPage.setUsername("");
		registrationPage.setPassword("");
		registrationPage.setEmail("");
		registrationPage.clickSubmitButton();
		String actualErrorMessage = driver.findElement(By.xpath("//div[@class='flash flash-error my-3']")).getText();
		System.out.println("error Message :- " + actualErrorMessage);
		String expectedErrorMessage = "There were problems creating your account";
		Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
	}
	
	
	@Test
	public void testForRegistrationSuccess() {
		registrationPage.setUsername("mytest123456udk1234");
		registrationPage.setPassword("mytest123456");
		registrationPage.setEmail("mytest123456udk@gmail.com");
		registrationPage.clickSubmitButton();
		//String message1 = 
		//String message2 = driver.findElement(By.xpath("//p[@class='lead']")).getText();
		String actualSuccessMessage =  driver.findElement(By.xpath("//p[@class='lead']//strong")).getText(); 
		System.out.println("success Message :- " + actualSuccessMessage);
		String expectedsuccessMessage = "@mytest123456udk1234";
		Assert.assertEquals(expectedsuccessMessage, actualSuccessMessage);
	}
}
