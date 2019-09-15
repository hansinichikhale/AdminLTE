package com.adminLTE.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adminLTE.qa.base.TestBase;

public class UsersPage extends TestBase{
			@FindBy(xpath="//button[contains(text(),'Add User')]")
			WebElement adduserLink;
			public  UsersPage() {
				PageFactory.initElements(driver, this);
				}
			
			
			public AddUserPage clickOnAddUser() {
				adduserLink.click();
				return new AddUserPage();
		}
			
		}

