package com.adminLTE.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.adminLTE.qa.base.TestBase;

public class AddUserPage extends TestBase{
	//@FindBy(id="username")
	@FindBy(xpath="//*[@id=\"username\"]")
	WebElement usernamebox;
	
	@FindBy(id="mobile")
	WebElement mobilebox;
	
	@FindBy(id="email")
	WebElement emailbox;
	
	/*@FindBy(id="Female")
	WebElement genderbox;*/
	
	//@FindBy(xpath="//select[@className='form-control']")
	//WebElement statebox;
	
	@FindBy(id="password")
	WebElement psswordbox;
	
	
	@FindBy(id="submit")
	WebElement subbtn;
	
	public AddUserPage() {
		PageFactory.initElements(driver, this);
}
	public void createNewUser(String un,String mob,String em)
	{
		//Select select=new Select(driver.findElement(By.name("State")));
		//select.selectByVisibleText(sb);
		usernamebox.sendKeys(un);
		mobilebox.sendKeys(mob);
		emailbox.sendKeys(em);
		//genderbox.click();
		subbtn.click();
		
	}
}