package com.nop.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nop.qa.base.TestBase;
import com.nop.qa.pages.DashboardPage;
import com.nop.qa.pages.LoginPage;
import com.nop.qa.util.TestUtil;

public class LoginPageTest extends TestBase{

	LoginPage loginPage;
	DashboardPage dashboardPage;
	TestUtil testUtil;


	/*We create this constructor because we are using prop in initialization method and to use prop we have to call the TestBase class
	constructor using super class.*/
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		testUtil = new TestUtil();
	}
	
	
	@Test(priority = 1)
	public void loginPageTitleTest() {

		log.info("****************************** Starting test case *****************************************");
		log.info("****************************** loginPageTitleTest *****************************************");

		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Your store. Login");

		log.info("****************************** Ending test case *****************************************");
		log.info("****************************** loginPageTitleTest *****************************************");
	}

	@Test(priority = 2)
	public void loginTest() {
		log.info("****************************** Starting test case *****************************************");
		log.info("****************************** loginTest *****************************************");

		dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));

		log.info("****************************** Ending test case *****************************************");
		log.info("****************************** loginTest *****************************************");

	}



	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
}
