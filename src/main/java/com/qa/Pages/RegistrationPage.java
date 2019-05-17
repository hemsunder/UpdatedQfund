package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.qa.Base.TestBase;

public class RegistrationPage extends TestBase{
	
	@FindBy(linkText="Borrower")
	WebElement Borrower;
	
	@FindBy(linkText="Registration")
	WebElement Registration;
	
	@FindBy(name="ssn1")
	WebElement ssn1;
	
	@FindBy(name="ssn2")
	WebElement ssn2;
	
	@FindBy(name="ssn3")
	WebElement ssn3;
	
	@FindBy(name="ssn4")
	WebElement ssn4;
	
	@FindBy(name="ssn5")
	WebElement ssn5;
	
	@FindBy(name="ssn6")
	WebElement ssn6;
	
	@FindBy(name="customerBean.lastNm")
	WebElement lastname;
	
	@FindBy(name="customerBean.firstNm")
	WebElement firstname;
	
	@FindBy(name="customerBean.addressLn")
	WebElement address;
	
	@FindBy(name="customerBean.city")
	WebElement city;
	
	@FindBy(name="customerBean.stateCd")
	WebElement state_dd;
	
	@FindBy(name="customerBean.postalCd")
	WebElement postalID;
	
	@FindBy(name="customerBean.monthsAtAddress")
	WebElement months_at;
	
	@FindBy(name="phoneNbr1")
	WebElement phoneNbr1;
	
	@FindBy(name="phoneNbr2")
	WebElement phoneNbr2;
	
	@FindBy(name="phoneNbr3")
	WebElement phoneNbr3;
	
	@FindBy(name="customerBean.phoneCd")
	WebElement phone_dd;
	
	@FindBy(name="customerBean.isCustomerEmailQuest")
	WebElement email_check;
	
	@FindBy(name="customerBean.driversLicNbr")
	WebElement photoid;
	
	@FindBy(name="customerBean.driversLicSt")
	WebElement IDState_dd;
	
	@FindBy(name="dlexpiry1")
	WebElement dlexpiry1;
	
	@FindBy(name="dlexpiry2")
	WebElement dlexpiry2;
	
	@FindBy(name="dlexpiry3")
	WebElement dlexpiry3;
	
	@FindBy(name="customerBean.photoIdType")
	WebElement photoTye_dd;
	
	@FindBy(name="customerBean.drivingZipcode")
	WebElement ZipCode;
	
	@FindBy(name="dob1")
	WebElement dob1;
	
	@FindBy(name="dob2")
	WebElement dob2;
	
	@FindBy(name="dob3")
	WebElement dob3;
	
	@FindBy(name="customerBean.incomeCdDisp")
	WebElement income_dd;
	
	@FindBy(name="customerBean.empNmDisp")
	WebElement employer;
	
	@FindBy(name="customerBean.roomEmpStatus")
	WebElement empstatus_dd;
	
	@FindBy(name="workPhoneNbrDisp1")
	WebElement workPhoneNbrDisp1;
	
	@FindBy(name="workPhoneNbrDisp2")
	WebElement workPhoneNbrDisp2;
	
	@FindBy(name="workPhoneNbrDisp3")
	WebElement workPhoneNbrDisp3;
	
	@FindBy(name="customerBean.incomeAmtDisp")
	WebElement net_income;
	
	@FindBy(name="customerBean.grossAmtDisp")
	WebElement gross_income;
	
	@FindBy(name="customerBean.payFreqCdDisp")
	WebElement pay_freq;
	
	@FindBy(name="customerBean.monthlyDate")
	WebElement monthlyDate;
	
	@FindBy(name="rad_semi")
	WebElement rad_semi;
	
	@FindBy(xpath="//input[@value='5' and @id='rad_wk6']")
	WebElement friday;
	
	@FindBy(name="payStubReviewed1")
	WebElement payStubReviewed1;
	
	@FindBy(name="payStubReviewed2")
	WebElement payStubReviewed2;
	
	@FindBy(name="payStubReviewed3")
	WebElement payStubReviewed3;
	
	@FindBy(name="payStubDate1")
	WebElement payStubDate1;
	
	@FindBy(name="payStubDate2")
	WebElement payStubDate2;
	
	@FindBy(name="payStubDate3")
	WebElement payStubDate3;
	
	@FindBy(name="hireDate1")
	WebElement hireDate1;
	
	@FindBy(name="hireDate2")
	WebElement hireDate2;
	
	@FindBy(name="hireDate3")
	WebElement hireDate3;
	
	@FindBy(name="customerBean.directDeposit")
	WebElement directDeposit;
	
	@FindBy(name="statementEndDtDisp1")
	WebElement statementEndDtDisp1;
	
	@FindBy(name="statementEndDtDisp2")
	WebElement statementEndDtDisp2;
	
	@FindBy(name="statementEndDtDisp3")
	WebElement statementEndDtDisp3;
	
	@FindBy(name="customerBean.abaNbrDisp")
	WebElement abaNbrDisp;
	
	@FindBy(name="checkAbaNbrDisp")
	WebElement checkAbaNbrDisp;
	
	@FindBy(name="customerBean.accountNbrDisp")
	WebElement accountNbrDisp;
	
	@FindBy(name="checkAccountNbrDisp")
	WebElement checkAccountNbrDisp;
	
	@FindBy(name="customerBean.contName")
	WebElement ref1lastname;
	
	@FindBy(name="customerBean.contactFirstName")
	WebElement ref1firstname;
	
	@FindBy(name="customerBean.contactrelationDisp")
	WebElement ref1relationship_dd;
	
	@FindBy(name="cphoneNbrDisp1")
	WebElement cphoneNbrDisp1;
	
	@FindBy(name="cphoneNbrDisp2")
	WebElement cphoneNbrDisp2;
	
	@FindBy(name="cphoneNbrDisp3")
	WebElement cphoneNbrDisp3;
	
	@FindBy(name="customerBean.nameDispSummary")
	WebElement ref2lastname;
	
	@FindBy(name="customerBean.referenceFirstNameSummary")
	WebElement ref2firstname;
	
	@FindBy(name="customerBean.relationDispSummary")
	WebElement ref2relationship_dd;
	
	@FindBy(name="refPhoneNbr1")
	WebElement refPhoneNbr1;
	
	@FindBy(name="refPhoneNbr2")
	WebElement refPhoneNbr2;
	
	@FindBy(name="refPhoneNbr3")
	WebElement refPhoneNbr3;
	
	@FindBy(name="bt_Reference")
	WebElement bt_Reference;
	
	@FindBy(name="customerBean.bankrupty")
	WebElement bankrupty_dd;
	
	@FindBy(xpath="//input[@value='Save & Next > ']")
	WebElement save_next_btn;
	
	@FindBy(xpath="//td[@class='subHeading']/b")
	WebElement Customer_num;
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void Registration(){
		String state = prop.getProperty("state_dd");
		String pay_frequency = prop.getProperty("pay_freq");
		
		driver.switchTo().frame("topFrame");
		Borrower.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainFrame");
		Registration.click();
		driver.switchTo().frame("bdyLoad");
		ssn1.sendKeys(prop.getProperty("ssn1"));
		ssn2.sendKeys(prop.getProperty("ssn2"));
		ssn3.sendKeys(prop.getProperty("ssn3"));
		ssn4.sendKeys(prop.getProperty("ssn1"));
		ssn5.sendKeys(prop.getProperty("ssn2"));
		ssn6.sendKeys(prop.getProperty("ssn3"));
		lastname.sendKeys(prop.getProperty("lastname"));
		firstname.sendKeys(prop.getProperty("firstname"));
		address.sendKeys("109 Avenue");
		city.sendKeys("Hyd");
		Select statedd=new Select(state_dd);
		statedd.selectByVisibleText(state);
		if (state.equalsIgnoreCase("Missouri")) {
			postalID.sendKeys("63010");
		}		
		else if (state.equalsIgnoreCase("Kansas")) {
			postalID.sendKeys("66103");
		}
		else if (state.equalsIgnoreCase("Texas")) {
			postalID.sendKeys("75457");
		}
		else if (state.equalsIgnoreCase("Nevada")) {
			postalID.sendKeys("89148");
		}
		else if (state.equalsIgnoreCase("Illinois")) {
			postalID.sendKeys("62462");
		}
		else if (state.equalsIgnoreCase("Idaho")) {
			postalID.sendKeys("83211");
		}
		else if (state.equalsIgnoreCase("xxxxx")) {
			postalID.sendKeys("");
		}
		else if (state.equalsIgnoreCase("xxxxx")) {
			postalID.sendKeys("");
		}
		months_at.sendKeys("15");
		phoneNbr1.sendKeys("300");
		phoneNbr2.sendKeys("312");
		phoneNbr3.sendKeys("3123");
		Select phonedd=new Select(phone_dd);
		phonedd.selectByVisibleText("Home");
		email_check.click();
		photoid.sendKeys(prop.getProperty("photoid"));
		Select IDStatedd=new Select(IDState_dd);
		IDStatedd.selectByVisibleText(state);
		dlexpiry1.sendKeys("01");
		dlexpiry2.sendKeys("01");
		dlexpiry3.sendKeys("2030");
		Select photoTyedd=new Select(photoTye_dd);
		photoTyedd.selectByVisibleText("Driver License");
		if (state.equalsIgnoreCase("Missouri")) {
			ZipCode.sendKeys("63010");
		}		
		else if (state.equalsIgnoreCase("Kansas")) {
			ZipCode.sendKeys("66103");
		}
		else if (state.equalsIgnoreCase("Texas")) {
			ZipCode.sendKeys("75457");
		}
		else if (state.equalsIgnoreCase("Nevada")) {
			ZipCode.sendKeys("89148");
		}
		else if (state.equalsIgnoreCase("Illinois")) {
			ZipCode.sendKeys("62462");
		}
		else if (state.equalsIgnoreCase("Idaho")) {
			ZipCode.sendKeys("83211");
		}
		else if (state.equalsIgnoreCase("xxxxx")) {
			ZipCode.sendKeys("");
		}
		else if (state.equalsIgnoreCase("xxxxx")) {
			ZipCode.sendKeys("");
		}
		dob1.sendKeys("01");
		dob2.sendKeys("01");
		dob3.sendKeys("1980");
		Select incomedd=new Select(income_dd);
		incomedd.selectByVisibleText("Salary");
		employer.sendKeys("VTL");
		Select empstatusdd=new Select(empstatus_dd);
		empstatusdd.selectByVisibleText("Active");
		workPhoneNbrDisp1.sendKeys("523");
		workPhoneNbrDisp2.sendKeys("564");
		workPhoneNbrDisp3.sendKeys("7686");
		net_income.sendKeys(prop.getProperty("net_income"));
		gross_income.sendKeys(prop.getProperty("gross_income"));
		Select payfreq=new Select(pay_freq);
		payfreq.selectByVisibleText(pay_frequency);
		if (pay_frequency.equalsIgnoreCase("Monthly")) {
			Select monthlyDatedd=new Select(monthlyDate);
			monthlyDatedd.selectByVisibleText("Last Day");		
		}
		else if (pay_frequency.equalsIgnoreCase("Semi-Monthly")){
			rad_semi.click();		
		}
		else if (pay_frequency.equalsIgnoreCase("Weekly")) {
			friday.click();
		}
		else {
			friday.click();
		}
		
		payStubReviewed1.sendKeys("01");
		payStubReviewed2.sendKeys("01");
		payStubReviewed3.sendKeys("2019");
		payStubDate1.sendKeys("01");
		payStubDate2.sendKeys("01");
		payStubDate3.sendKeys("2019");
		hireDate1.sendKeys("01");
		hireDate2.sendKeys("01");
		hireDate3.sendKeys("2019");	
		Select directDepositdd=new Select(directDeposit);
		directDepositdd.selectByVisibleText("Yes");
		statementEndDtDisp1.sendKeys("01");
		statementEndDtDisp2.sendKeys("01");
		statementEndDtDisp3.sendKeys("2019");
		abaNbrDisp.sendKeys("111111118");
		checkAbaNbrDisp.sendKeys("111111118");
		accountNbrDisp.sendKeys(prop.getProperty("accountNbr"));
		checkAccountNbrDisp.sendKeys(prop.getProperty("accountNbr"));
		ref1lastname.sendKeys("Rajni");
		ref1firstname.sendKeys("Kanth");
		Select ref1relationshipdd=new Select(ref1relationship_dd);
		ref1relationshipdd.selectByVisibleText("Other");
		cphoneNbrDisp1.sendKeys("321");
		cphoneNbrDisp2.sendKeys("546");
		cphoneNbrDisp3.sendKeys("8745");
		ref2lastname.sendKeys("James");
		ref2firstname.sendKeys("Watson");
		Select ref2relationshipdd=new Select(ref2relationship_dd);
		ref2relationshipdd.selectByVisibleText("Other");
		refPhoneNbr1.sendKeys("909");
		refPhoneNbr2.sendKeys("546");
		refPhoneNbr3.sendKeys("8721");
		bt_Reference.click();
		Select bankruptydd=new Select(bankrupty_dd);
		bankruptydd.selectByVisibleText("No");
		save_next_btn.click();
		System.out.println(Customer_num.getText());
		
	}

}
