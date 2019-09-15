package com.adminLTE.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adminLTE.qa.base.TestBase;
import com.adminLTE.qa.pages.HomePage;
import com.adminLTE.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	LoginPageTest(){
		super();	
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		 loginPage=new LoginPage();
	}
	@Test(priority=1)
	public void loginpageTitleTest() {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "AdminLTE 2 | Log in");
	}
	@Test(priority=2)
	public void loginTest() {
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

