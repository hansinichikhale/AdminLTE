package com.adminLTE.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adminLTE.qa.base.TestBase;

public class HomePage extends TestBase  {
	@FindBy(xpath="//p[contains(text(),'Kiran')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//span[contains(text(),'Users')]")
	
	WebElement userLink;
	
	@FindBy(xpath="//span[contains(text(),'Operators')]")
	WebElement operatorLink;
	
	@FindBy(xpath="//span[contains(text(),'Logout')]")
	WebElement logoutLink;
	
	//initializing the page objects
		public HomePage() {
		PageFactory.initElements(driver, this);
		}
		public String validateHomePageTitle(){
			return driver.getTitle();
		}
			
			public boolean verifyCorrectUserNameLabel() {
				return userNameLabel.isDisplayed();
}
		public UsersPage clickOnUsers() {
			userLink.click();
			return new UsersPage();
}
		public OperatorsPage clickOnOperators() {
			operatorLink.click();
			return new OperatorsPage();
}
		public LogoutPage clickOnLogout() {
			logoutLink.click();
			return new LogoutPage();
}
		
}