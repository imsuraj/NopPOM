package com.nop.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nop.qa.base.TestBase;

public class LoginPage extends TestBase{

	//page factory

	@FindBy(id="Email")
	WebElement loginEmail;

	@FindBy(id="Password")
	WebElement loginPassword;

	@FindBy(xpath="//input[@type='submit' and @value='Log in']")
	WebElement loginButton;

	
	//Initializing page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//These are actions---different features of the login page.
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public DashboardPage login(String email, String password) {
		loginEmail.clear();
		loginEmail.sendKeys(email);
		loginPassword.clear();
		loginPassword.sendKeys(password);
		loginButton.click();
		
		return new DashboardPage();
	}

}
