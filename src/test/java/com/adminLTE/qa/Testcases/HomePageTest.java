package com.adminLTE.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adminLTE.qa.base.TestBase;
import com.adminLTE.qa.pages.AddUserPage;
import com.adminLTE.qa.pages.HomePage;
import com.adminLTE.qa.pages.LoginPage;
import com.adminLTE.qa.pages.LogoutPage;
import com.adminLTE.qa.pages.OperatorsPage;
import com.adminLTE.qa.pages.UsersPage;



public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	UsersPage usersPage;
	OperatorsPage operatorsPage;
	LogoutPage logoutPage;
	
	
public HomePageTest() {
	super();
}
@BeforeMethod
public void setup() {
	
initialization();
log.info("This is bowser opening");
 loginPage=new LoginPage();
homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
}
@Test(priority=1)
public void verifyHomePageTitleTest() {
	log.info("==========================Testcases starting====================");
	String homePageTitle=homePage.validateHomePageTitle();
	Assert.assertEquals( homePageTitle, "AdminLTE 2 | Dashboard");
}
	@Test(priority=2)
	public void verifyUserNameText() {
		Assert.assertTrue(homePage.verifyCorrectUserNameLabel());
}
	@Test(priority=3)
	public void clickOnUsersTest() {
		log.debug("This is simple debug message");
		log.fatal("This is simple fetal message");
		
		usersPage=homePage.clickOnUsers();
	
	}
	@Test(priority=4)
	public void clickOnOperatorsTest() {
		operatorsPage=homePage.clickOnOperators();
	}
	@Test(priority=5)
	public void clickOnLogoutTest() {
		logoutPage=homePage.clickOnLogout();
	}
	
@AfterMethod
public void teardown()
{
driver.quit();
}
}