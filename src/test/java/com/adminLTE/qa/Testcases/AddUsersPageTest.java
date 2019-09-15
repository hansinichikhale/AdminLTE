package com.adminLTE.qa.Testcases;




import org.testng.annotations.Test;

import com.adminLTE.qa.base.TestBase;
import com.adminLTE.qa.pages.AddUserPage;
import com.adminLTE.qa.pages.HomePage;
import com.adminLTE.qa.pages.LoginPage;
import com.adminLTE.qa.pages.UsersPage;

public class AddUsersPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	UsersPage usersPage;
	AddUserPage addUsersPage;
	public  AddUsersPageTest() {
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
	public void createNewUserTest() {
		addUsersPage.createNewUser("Hansini", "9096859582", "hansinichikhale@gmail.com" );
}
	/*@Test(priority=5)
	public void teardown() {
		driver.quit();;

}*/
}