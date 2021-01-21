package com.inetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddVendor {
WebDriver ldriver;
	
	public AddVendor(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="/html/body/div/aside/div/nav/ul/li[2]/a/p")
	@CacheLookup
	WebElement lnkAdmin;
	
	@FindBy(xpath="/html/body/div/aside/div/nav/ul/li[2]/ul/li[2]/a/p")
	@CacheLookup
	WebElement lnkAddVendor;
	
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div/div/div[1]/div/div[2]/a")
	@CacheLookup
	WebElement lnkNewVendor;
	
	@FindBy(name="VendorCode")
	@CacheLookup
	WebElement vendorCode;
	
	@FindBy(name="VendorName")
	@CacheLookup
	WebElement vendorName;
	
	@FindBy(name="ContactPerson")
	@CacheLookup
	WebElement contactPerson;
	
	@FindBy(name="MobileNumber")
	@CacheLookup
	WebElement mobileNumber;
	
	@FindBy(name="EmailId")
	@CacheLookup
	WebElement email;
	
	@FindBy(name="UserName")
	@CacheLookup
	WebElement username;
	
	@FindBy(name="Password")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[2]/form/div[5]/div[1]/div/input")
	@CacheLookup
	WebElement btnSave;
	
	
	public void clickAdmin()
	{
		lnkAdmin.click();
	}
	
	public void clickAddVendor()
	{
		lnkAddVendor.click();
	}
	
	public void clickNewVendor()
	{
		lnkNewVendor.click();
	}
	
	public void setVendorCode(String vcode)
	{
		vendorCode.sendKeys(vcode);
	}
	
	public void setVendorName(String vname)
	{
		vendorName.sendKeys(vname);
	}
	
	public void setContactPerson(String cperson)
	{
		contactPerson.sendKeys(cperson);
	}
	
	public void setMobileNumber(String MoNumber)
	{
		mobileNumber.sendKeys(MoNumber);
	}
	
	public void setEmail(String Email)
	{
		email.sendKeys(Email);
	}
	
	public void setUsername(String Username)
	{
		username.sendKeys(Username);
	}
	
	public void setPassword(String Password)
	{
		password.sendKeys(Password);
	}
	
	public void clickSave()
	{
		btnSave.click();
	}
	

}
