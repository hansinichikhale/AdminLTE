package com.adminLTE.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adminLTE.qa.base.TestBase;

public class LoginPage extends TestBase {

		
//Page factory or Object Repository
	@FindBy(id="email")
WebElement username;
	@FindBy(id="password")
	
	WebElement password;
	@FindBy(xpath="//*[@type='submit']")
	WebElement signInbtn;
	
	//initializing the page objects
	public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle(){
		return driver.getTitle();

}
	public HomePage login(String un,String pwd){
	username.sendKeys(un);
	password.sendKeys(pwd);
	signInbtn.click();
	return new HomePage();
		
}
}