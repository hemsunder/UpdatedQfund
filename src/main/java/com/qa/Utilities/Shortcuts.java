package com.qa.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.TestBase;

public class Shortcuts extends TestBase{
	
	@FindBy(name="ssn1")
	WebElement ssn1;
	
	@FindBy(name="ssn2")
	WebElement ssn2;
	
	@FindBy(name="ssn3")
	WebElement ssn3;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement submit;
	
	@FindBy(xpath="//input[@value='Go']")
	WebElement Go;
	
	@FindBy(linkText="Loan Transactions")
	WebElement Loan_Transactions;
	
	@FindBy(linkText="New Loan")
	WebElement New_Loan;
	
	@FindBy(name="loginRequestBean.userId")
	WebElement username;
	
	@FindBy(name="loginRequestBean.password")
	WebElement password;
	
	@FindBy(name="loginRequestBean.locNbr")
	WebElement store;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement submit_btn;
	
	public Shortcuts(){
		PageFactory.initElements(driver, this);
	}
	public void LogintoApp(){
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		store.sendKeys(prop.getProperty("store"));
		submit_btn.click();
	}
	
	public void newloanshortcut() {
		driver.switchTo().frame("topFrame");
		Loan_Transactions.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainFrame");
		New_Loan.click();
	}
	
	public void openingcustomer(){
		driver.switchTo().frame("bdyLoad");
		ssn1.sendKeys(prop.getProperty("ssn1"));
		ssn2.sendKeys(prop.getProperty("ssn2"));
		ssn3.sendKeys(prop.getProperty("ssn3"));
		submit.click();
		Go.click();
	}
	
	

}
