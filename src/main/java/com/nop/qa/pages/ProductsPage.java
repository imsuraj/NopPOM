package com.nop.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nop.qa.base.TestBase;

public class ProductsPage extends TestBase{

	//Web Object
	
	@FindBy(xpath="//span[text()='Products']")
	WebElement productsSubMenu;

	@FindBy(xpath="//h1[contains(text(),'Products')]")
	WebElement productsHeading;

	@FindBy(xpath="//a[@class='btn bg-blue']")
	WebElement addNewButton;

	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement exportButton;

	@FindBy(xpath="//button[@name='importexcel']")
	WebElement importButton;

	@FindBy(xpath="//button[@name='save']")
	WebElement saveButton;


	//Initializing PageObje
	public ProductsPage() {
		PageFactory.initElements(driver, this);
	}


	
	//Actions or methods on Products Page

	public String verifyProductsTitle() {
		return driver.getTitle();
	}


	public void clickOnProductsSubMenu() {
		productsSubMenu.click();
	}


	public boolean verifyProductPageHeading() {
		return productsHeading.isDisplayed();
	}

	public boolean verifyAddNewButton() {
		return addNewButton.isDisplayed();
	}


	public boolean verifyExportButton() {
		return exportButton.isDisplayed();
	}


	public boolean verifyImportButton() {
		return importButton.isDisplayed();
	}

	public void clickOnAddNewButton() {
		addNewButton.click();
		
	}
	public boolean verifySaveButton() {
		return saveButton.isDisplayed();
	}








}
