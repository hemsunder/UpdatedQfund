package com.qa.missouri;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.qa.Base.TestBase;
import com.qa.Utilities.Shortcuts;

public class NewLoans extends TestBase{
	
	@FindBy(xpath="//td[contains(text(),'Payday Loan')]//parent::tr//td[@class='border']//input")
	WebElement MO_PDL;
	
	@FindBy(xpath="//input[@value='New Loan']")
	WebElement NewLoan_btn;
	
	@FindBy(name="advanceRequestBean.collateralTypeId")
	WebElement collateralType_dd;
	
	@FindBy(name="advanceRequestBean.chkgAcctNbr")
	WebElement chkgAcctNbr_tb;
	
	@FindBy(name="advanceRequestBean.disbursementType")
	WebElement disbursementType_dd;
	
	@FindBy(name="advanceRequestBean.courtesyCallFlag")
	WebElement courtesyCallFlag_dd;
	
	@FindBy(name="advanceRequestBean.loggedUserPassword")
	WebElement Password_tb;
	
	@FindBy(xpath="//input[@value='Finish Loan']")
	WebElement FinishLoan_btn;
	
	@FindBy(xpath="//input[@value='Yes']")
	WebElement yes_btn;
	
	@FindBy(xpath="//input[@value=' Ok ']")
	WebElement ok_btn;
	
	@FindBy(xpath="//table[@id='tableWid1']//b//input")
	WebElement ILPTerm1;
	
	@FindBy(xpath="//table[@id='tableWid2']//b//input")
	WebElement ILPTerm2;
	
	@FindBy(xpath="//table[@id='tableWid3']//b//input")
	WebElement ILPTerm3;
	
	@FindBy(name="collateralType")
	WebElement ILPcollateralType_dd;
	
	@FindBy(name="requestBean.siilBean.disbType")
	WebElement disbType_dd;
	
	@FindBy(name="requestBean.siilBean.advAmt")
	WebElement advAmt;
	
	@FindBy(name="requestBean.siilBean.disbAmtFirst")
	WebElement disbAmtFirst_tb;
	
	@FindBy(name="requestBean.siilBean.courtesyCallFlag")
	WebElement courtesyCallFlag;
	
	@FindBy(name="requestBean.password")
	WebElement ILPpassword;
	
	@FindBy(xpath="//input[@value='OK']")
	WebElement OK_btn;
	
	@FindBy(xpath="//table[@id='tableWid4']//b//input")
	WebElement MOSignatureTerm1;
	
	@FindBy(xpath="//table[@id='tableWid5']//b//input")
	WebElement MOSignatureTerm2;
	
	@FindBy(xpath="//table[@id='tableWid6']//b//input")
	WebElement MOSignatureTerm3;
	
	public NewLoans() {
		PageFactory.initElements(driver, this);
	}
	
	Shortcuts shortcuts;
	
	public void PDLNewLoan(){
		shortcuts = new Shortcuts();
		shortcuts.LogintoApp();
		shortcuts.newloanshortcut();
		shortcuts.openingcustomer();
		MO_PDL.click();
		NewLoan_btn.click();
		Select collateralTypedd = new Select(collateralType_dd);
		collateralTypedd.selectByVisibleText(prop.getProperty("collateralType"));
		String chkgAcctNbr = prop.getProperty("accountNbr");
		String acntnbr = chkgAcctNbr.substring(3);
		chkgAcctNbr_tb.sendKeys(acntnbr);
		Select disbursementTypedd = new Select(disbursementType_dd);
		disbursementTypedd.selectByVisibleText("Cash");
		Select courtesyCallFlagdd = new Select(courtesyCallFlag_dd);
		courtesyCallFlagdd.selectByVisibleText("No");
		Password_tb.sendKeys("1234");
		FinishLoan_btn.click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		yes_btn.click();
		ok_btn.click();
	}
	
	public void ILPTerm1NewLoan() {
		shortcuts = new Shortcuts();
		
		shortcuts.LogintoApp();
		shortcuts.newloanshortcut();
		shortcuts.openingcustomer();
		ILPTerm1.click();
		NewLoan_btn.click();
		Select ILPcollateralTypedd = new Select(ILPcollateralType_dd);
		ILPcollateralTypedd.selectByVisibleText(prop.getProperty("collateralType"));
		Select disbTypedd = new Select(disbType_dd);
		disbTypedd.selectByVisibleText(prop.getProperty("disbType"));
		String advance = advAmt.getAttribute("value");
		disbAmtFirst_tb.sendKeys(advance);
		Select courtesyCallFl = new Select(courtesyCallFlag);
		courtesyCallFl.selectByVisibleText("No");
		ILPpassword.sendKeys("1234");
		FinishLoan_btn.click();
		yes_btn.click();
		OK_btn.click();	
	}
	
	public void ILPTerm2NewLoan() {
		shortcuts = new Shortcuts();
		
		shortcuts.LogintoApp();
		shortcuts.newloanshortcut();
		shortcuts.openingcustomer();
		ILPTerm2.click();
		NewLoan_btn.click();
		Select ILPcollateralTypedd = new Select(ILPcollateralType_dd);
		ILPcollateralTypedd.selectByVisibleText(prop.getProperty("collateralType"));
		Select disbTypedd = new Select(disbType_dd);
		disbTypedd.selectByVisibleText(prop.getProperty("disbType"));
		String advance = advAmt.getAttribute("value");
		disbAmtFirst_tb.sendKeys(advance);
		Select courtesyCallFl = new Select(courtesyCallFlag);
		courtesyCallFl.selectByVisibleText("No");
		ILPpassword.sendKeys("1234");
		FinishLoan_btn.click();
		yes_btn.click();
		OK_btn.click();	
	}
	
	public void ILPTerm3NewLoan() {
		shortcuts = new Shortcuts();
		
		shortcuts.LogintoApp();
		shortcuts.newloanshortcut();
		shortcuts.openingcustomer();
		ILPTerm3.click();
		NewLoan_btn.click();
		Select ILPcollateralTypedd = new Select(ILPcollateralType_dd);
		ILPcollateralTypedd.selectByVisibleText(prop.getProperty("collateralType"));
		Select disbTypedd = new Select(disbType_dd);
		disbTypedd.selectByVisibleText(prop.getProperty("disbType"));
		String advance = advAmt.getAttribute("value");
		disbAmtFirst_tb.sendKeys(advance);
		Select courtesyCallFl = new Select(courtesyCallFlag);
		courtesyCallFl.selectByVisibleText("No");
		ILPpassword.sendKeys("1234");
		FinishLoan_btn.click();
		yes_btn.click();
		OK_btn.click();	
	}
	
	public void MOSignatureTerm1NewLoan() {
		shortcuts = new Shortcuts();
		
		shortcuts.LogintoApp();
		shortcuts.newloanshortcut();
		shortcuts.openingcustomer();
		MOSignatureTerm1.click();
		NewLoan_btn.click();
		Select ILPcollateralTypedd = new Select(ILPcollateralType_dd);
		ILPcollateralTypedd.selectByVisibleText("SIGNATURE");
		Select disbTypedd = new Select(disbType_dd);
		disbTypedd.selectByVisibleText(prop.getProperty("disbType"));
		String advance = advAmt.getAttribute("value");
		disbAmtFirst_tb.sendKeys(advance);
		Select courtesyCallFl = new Select(courtesyCallFlag);
		courtesyCallFl.selectByVisibleText("No");
		ILPpassword.sendKeys("1234");
		FinishLoan_btn.click();
		yes_btn.click();
		OK_btn.click();	
	}
	
	public void MOSignatureTerm2NewLoan() {
		shortcuts = new Shortcuts();
		
		shortcuts.LogintoApp();
		shortcuts.newloanshortcut();
		shortcuts.openingcustomer();
		MOSignatureTerm2.click();
		NewLoan_btn.click();
		Select ILPcollateralTypedd = new Select(ILPcollateralType_dd);
		ILPcollateralTypedd.selectByVisibleText("SIGNATURE");
		Select disbTypedd = new Select(disbType_dd);
		disbTypedd.selectByVisibleText(prop.getProperty("disbType"));
		String advance = advAmt.getAttribute("value");
		disbAmtFirst_tb.sendKeys(advance);
		Select courtesyCallFl = new Select(courtesyCallFlag);
		courtesyCallFl.selectByVisibleText("No");
		ILPpassword.sendKeys("1234");
		FinishLoan_btn.click();
		yes_btn.click();
		OK_btn.click();	
	}

	public void MOSignatureTerm3NewLoan() {
		shortcuts = new Shortcuts();
		
		shortcuts.LogintoApp();
		shortcuts.newloanshortcut();
		shortcuts.openingcustomer();
		MOSignatureTerm3.click();
		NewLoan_btn.click();
		Select ILPcollateralTypedd = new Select(ILPcollateralType_dd);
		ILPcollateralTypedd.selectByVisibleText("SIGNATURE");
		Select disbTypedd = new Select(disbType_dd);
		disbTypedd.selectByVisibleText(prop.getProperty("disbType"));
		String advance = advAmt.getAttribute("value");
		disbAmtFirst_tb.sendKeys(advance);
		Select courtesyCallFl = new Select(courtesyCallFlag);
		courtesyCallFl.selectByVisibleText("No");
		ILPpassword.sendKeys("1234");
		FinishLoan_btn.click();
		yes_btn.click();
		OK_btn.click();	
	}
}
