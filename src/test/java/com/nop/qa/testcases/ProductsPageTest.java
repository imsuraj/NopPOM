package com.nop.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nop.qa.base.TestBase;
import com.nop.qa.pages.CategoriesPage;
import com.nop.qa.pages.DashboardPage;
import com.nop.qa.pages.LoginPage;
import com.nop.qa.pages.ProductsPage;
import com.nop.qa.util.TestUtil;

public class ProductsPageTest extends TestBase{
	
	ProductsPage productPage;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	TestUtil testUtil;
	CategoriesPage categoriesPage;
	

	public ProductsPageTest() {
		super();
	}


	@BeforeMethod
	public void setUp() {
		initialization();
		productPage = new ProductsPage();
		loginPage = new LoginPage();
		dashboardPage = new DashboardPage();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
		dashboardPage =  loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		dashboardPage.clickOnCatalogMenu();
		productPage.clickOnProductsSubMenu();
	}


	@Test(priority = 1)
	public void verifyProductsPageTitle() {
		log.info("****************************** Starting test case *****************************************");
		log.info("****************************** verifyProductsPageTitle *****************************************");
	
		String title = productPage.verifyProductsTitle();
		
		Assert.assertEquals(title, "Products / nopCommerce administration");
		log.info("****************************** Ending test case *****************************************");
		log.info("****************************** verifyProductsPageTitle *****************************************");
	}
	
	@Test(priority = 2)
	public void verifyProductsPageLabel() {
		log.info("****************************** Starting test case *****************************************");
		log.info("****************************** verifyProductsPageLabel *****************************************");
		
		Assert.assertTrue(productPage.verifyProductPageHeading(), "Products label is missing on the page.");
		
		log.info("****************************** Ending test case *****************************************");
		log.info("****************************** verifyProductsPageLabel *****************************************");
		
	}

	
	@Test(priority = 3)
	public void verifyAddNewButtonTest() {
		log.info("****************************** Starting test case *****************************************");
		log.info("****************************** verifyAddNewButtonTest *****************************************");
		
		Assert.assertTrue(productPage.verifyAddNewButton(), "Add New is missing on the page.");
		
		log.info("****************************** Ending test case *****************************************");
		log.info("****************************** verifyAddNewButtonTest *****************************************");
		
	}
	
	@Test(priority = 4)
	public void verifyExportButtonTest() {
		log.info("****************************** Starting test case *****************************************");
		log.info("****************************** verifyExportButtonTest *****************************************");
		
		Assert.assertTrue(productPage.verifyExportButton(), "Export button is missing on the page.");
		
		log.info("****************************** Ending test case *****************************************");
		log.info("****************************** verifyExportButtonTest *****************************************");
		
	}
	
	@Test(priority = 5)
	public void verifyImportButtonTest() {
		log.info("****************************** Starting test case *****************************************");
		log.info("****************************** verifyImportButtonTest *****************************************");
		
		Assert.assertTrue(productPage.verifyImportButton(), "Import button is missing on the page.");
		
		log.info("****************************** Ending test case *****************************************");
		log.info("****************************** verifyImportButtonTest *****************************************");
		
	}
	
	
	@Test
	public void verifyClickOnAddNewButtonTest() {
		log.info("****************************** Starting test case *****************************************");
		log.info("****************************** verifyClickOnAddNewButtonTest *****************************************");
		
		productPage.clickOnAddNewButton();
		Assert.assertTrue(productPage.verifySaveButton(), "Save button is missing on the page.");
		
		log.info("****************************** Ending test case *****************************************");
		log.info("****************************** verifyClickOnAddNewButtonTest *****************************************");
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
