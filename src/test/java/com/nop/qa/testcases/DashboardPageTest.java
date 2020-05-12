package com.nop.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nop.qa.base.TestBase;
import com.nop.qa.pages.ProductsPage;
import com.nop.qa.pages.DashboardPage;
import com.nop.qa.pages.LoginPage;
import com.nop.qa.util.TestUtil;

public class DashboardPageTest extends TestBase{
	DashboardPage dashboardPage;
	LoginPage loginPage;
	ProductsPage productsPage;
	TestUtil testUtil;
	
	
	public DashboardPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		dashboardPage = new DashboardPage();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
		dashboardPage =  loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	
	
	@Test
	public void dashboadPageTitleTest() {
		
		log.info("****************************** Starting test case *****************************************");
		log.info("****************************** dashboadPageTitleTest *****************************************");
		
		String title = dashboardPage.verifyDashboardPageTitle();
		
		Assert.assertEquals(title, "Dashboard / nopCommerce administration");
		log.info("****************************** Ending test case *****************************************");
		log.info("****************************** dashboadPageTitleTest *****************************************");
	}
	
	
	@Test
	public void verifyUserNameTest() {
		log.info("****************************** Starting test case *****************************************");
		log.info("****************************** verifyUserNameTest *****************************************");
		
		Assert.assertTrue(dashboardPage.verifyCorrectUserName());
		
		log.info("****************************** Ending test case *****************************************");
		log.info("****************************** verifyUserNameTest *****************************************");
	}
	
	@Test
	public void logoutLinkTest() {
		log.info("****************************** Starting test case *****************************************");
		log.info("****************************** logoutLinkTest *****************************************");
		
		Assert.assertTrue(dashboardPage.verifyLogoutLink());
		
		log.info("****************************** Ending test case *****************************************");
		log.info("****************************** logoutLinkTest *****************************************");
	}
	
	
	@Test
	public void dashboadHeadingTest() {
		log.info("****************************** Starting test case *****************************************");
		log.info("****************************** dashboadHeadingTest *****************************************");
		
		Assert.assertTrue(dashboardPage.verifyDashboadHeading());
		
		log.info("****************************** Ending test case *****************************************");
		log.info("****************************** dashboadHeadingTest *****************************************");
		
	}
	
	
	
	@Test
	public void catalogMenuTest() {
		log.info("****************************** Starting test case *****************************************");
		log.info("****************************** catalogMenuTest *****************************************");
		
		Assert.assertTrue(dashboardPage.verifyCatalogMenu());
		
		log.info("****************************** Ending test case *****************************************");
		log.info("****************************** catalogMenuTest *****************************************");
		
	}
	
	@Test
	public void salesMenuTest() {
		log.info("****************************** Starting test case *****************************************");
		log.info("****************************** salesMenuTest *****************************************");
		
		Assert.assertTrue(dashboardPage.verifySalesMenu());
		
		log.info("****************************** Ending test case *****************************************");
		log.info("****************************** salesMenuTest *****************************************");
		
	}
	
	@Test
	public void customerMenuTest() {
		log.info("****************************** Starting test case *****************************************");
		log.info("****************************** customerMenuTest *****************************************");
		
		Assert.assertTrue(dashboardPage.verifyCustomersMenu());
		
		log.info("****************************** Ending test case *****************************************");
		log.info("****************************** customerMenuTest *****************************************");
		
	}
	
	
	
	@Test
	public void clickCatalogMenuTest() {
		log.info("****************************** Starting test case *****************************************");
		log.info("****************************** clickCatalogMenuTest *****************************************");
		
		dashboardPage.clickOnCatalogMenu();
		
		log.info("****************************** Ending test case *****************************************");
		log.info("****************************** clickCatalogMenuTest *****************************************");
		
	}
	
	@Test
	public void clickSalesMenuTest() {
		log.info("****************************** Starting test case *****************************************");
		log.info("****************************** clickSalesMenuTest *****************************************");
		
		dashboardPage.clickOnSalesMenu();
		
		log.info("****************************** Ending test case *****************************************");
		log.info("****************************** clickSalesMenuTest *****************************************");
		
	}
	
	@Test
	public void clickCustomerMenuTest() {
		log.info("****************************** Starting test case *****************************************");
		log.info("****************************** clickCustomerMenuTest *****************************************");
		
		dashboardPage.clickOnCustomerMenu();
		
		log.info("****************************** Ending test case *****************************************");
		log.info("****************************** clickCustomerMenuTest *****************************************");
		
	}
	
	@Test
	public void logoutTest() {
		log.info("****************************** Starting test case *****************************************");
		log.info("****************************** logoutTest *****************************************");
		
		dashboardPage.clickOnLogoutLink();
		
		log.info("****************************** Ending test case *****************************************");
		log.info("****************************** logoutTest *****************************************");
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
