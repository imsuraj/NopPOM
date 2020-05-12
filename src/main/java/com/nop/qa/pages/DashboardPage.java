package com.nop.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nop.qa.base.TestBase;

public class DashboardPage extends TestBase{

	//Page Objects
	@FindBy(xpath="//li[contains(text(),'John Smith')]")
	WebElement loggedInUser;

	@FindBy(xpath="//h1[contains(text(),'Dashboard')]")
	WebElement dashboardHeading;

	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutLink;

	@FindBy(xpath="//span[text()='Catalog']")
	WebElement catalogMenu;


	@FindBy(xpath="//span[text()='Sales']")
	WebElement salesMenu;

	@FindBy(xpath="//li[@class='treeview']//a[@href='#']//span[text()='Customers']")
	WebElement customersMenu;



	//Initializing Page Objects
	public DashboardPage () {
		PageFactory.initElements(driver, this);
	}

	//These are actions---different features of the dashboad page. 

	public String verifyDashboardPageTitle() {
		return driver.getTitle();
	}

	public boolean verifyCorrectUserName() {
		return loggedInUser.isDisplayed();
	}

	public boolean verifyDashboadHeading() {
		return dashboardHeading.isDisplayed();
	}

	public boolean verifyLogoutLink() {
		return logoutLink.isDisplayed();
	}

	public void clickOnLogoutLink() {
		logoutLink.click();
	}


	public boolean verifyCatalogMenu() {

		return catalogMenu.isDisplayed();
	}

	public boolean verifySalesMenu() {

		return salesMenu.isDisplayed();
	}


	public boolean verifyCustomersMenu() {

		return catalogMenu.isDisplayed();
	}	

	public void clickOnCatalogMenu() {
		catalogMenu.click();
	}
	
	public void clickOnSalesMenu() {
		salesMenu.click();
	}
	
	public void clickOnCustomerMenu() {
		customersMenu.click();
	}

}
