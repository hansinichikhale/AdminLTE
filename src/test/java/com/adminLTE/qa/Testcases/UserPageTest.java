package com.adminLTE.qa.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.adminLTE.qa.base.TestBase;
import com.adminLTE.qa.pages.HomePage;
import com.adminLTE.qa.pages.LoginPage;
import com.adminLTE.qa.pages.UsersPage;

public class UserPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	UsersPage usersPage;
	
	public  UserPageTest() {
		super();
	}
	@Test(priority=1)
	public void setup() {
	initialization();
	 loginPage=new LoginPage();
	homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=2)
	public void clickOnUsersTest() {
		usersPage=homePage.clickOnUsers();
		
	}
	@Test(priority=3)
	public void clickOnAddUserTest() {
		usersPage.clickOnAddUser();
}
	@Test(priority=4)
	public void teardown() {
		driver.quit();;

}
	
}