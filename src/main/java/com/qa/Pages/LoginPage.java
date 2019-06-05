package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.qa.Base.TestBase;


public class LoginPage extends TestBase
{
	
	@FindBy(name="loginRequestBean.userId")
	WebElement username;
	
	@FindBy(name="loginRequestBean.password")
	WebElement password;
	
	@FindBy(name="loginRequestBean.locNbr")
	WebElement store;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement submit_btn;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void LogintoApp(){
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		store.sendKeys(prop.getProperty("store"));
		submit_btn.click();
	}
}
