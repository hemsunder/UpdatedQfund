package com.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.Base.TestBase;
import com.qa.Pages.LoginPage;
import com.qa.Pages.RegistrationPage;
import com.qa.missouri.NewLoans;

public class Testcase extends TestBase {
	LoginPage loginpage;
	RegistrationPage registration;
	NewLoans newloans;
	
	
	
	public Testcase(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		initialization();
		loginpage = new LoginPage();
		registration = new RegistrationPage();
		newloans = new NewLoans();
		
		
	}
	
	@Test(priority=1, enabled=false)
	public void TestApplication(){
		loginpage.LogintoApp();
		registration.Registration();
		
	}
	
	@Test(priority=2, enabled=true)
	public void NewLoanTest() {
		//newloans.PDLNewLoan();
		//newloans.MOSignatureTerm3NewLoan();
		
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}

}
