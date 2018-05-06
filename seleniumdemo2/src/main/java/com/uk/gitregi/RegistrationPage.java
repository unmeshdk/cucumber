package com.uk.gitregi;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {
	@FindBy(id = "user_login")
	WebElement username;

	@FindBy(id = "user_password")
	WebElement password;

	@FindBy(id = "user_email")
	WebElement email;

	@FindBy(id = "signup_button")
	WebElement button;

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public void setUsername(String username) {
		this.username.sendKeys(username);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public void clickSubmitButton() {
		button.submit();
	}

}
