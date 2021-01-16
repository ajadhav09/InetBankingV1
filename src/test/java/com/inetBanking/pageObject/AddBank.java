package com.inetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddBank {
	WebDriver ldriver;
	
	public AddBank(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath="/html/body/div/aside/div/nav/ul/li[2]/a/p")
	@CacheLookup
	WebElement lnkAdmin;
	
	@FindBy(xpath="/html/body/div/aside/div/nav/ul/li[2]/ul/li[1]/a/p")
	@CacheLookup
	WebElement lnkAddBank;
	
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div/div/div[1]/div/div[2]/a")
	@CacheLookup
	WebElement lnkNewBank;
	
	@FindBy(name="BankName")
	@CacheLookup
	WebElement bankName;
	
	@FindBy(name="Address")
	@CacheLookup
	WebElement address;
	
	@FindBy(name="City")
	@CacheLookup
	WebElement city;
	
	@FindBy(name="State")
	@CacheLookup
	WebElement state;
	
//	@FindBy(name="Country")
//	@CacheLookup
//	WebElement contry;
	
	@FindBy(name="ZipCode")
	@CacheLookup
	WebElement pincode;
	
	@FindBy(name="RoutingNumber")
	@CacheLookup
	WebElement routingcode;
	
	@FindBy(name="ParentBank")
	@CacheLookup
	WebElement parentBank;
	
	@FindBy(name = "ParentBank")
	private WebElement DropdownParentBank;
	
	@FindBy(name="Email")
	@CacheLookup
	WebElement email;
	
	@FindBy(name="UserName")
	@CacheLookup
	WebElement username;
	
	@FindBy(name="Password")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[2]/form/div[5]/input")
	@CacheLookup
	WebElement btnSave;
	
	
	public void clickAdmin()
	{
		lnkAdmin.click();
	}
	
	public void clickAddBank()
	{
		lnkAddBank.click();
	}
	
	public void clickNewBank()
	{
		lnkNewBank.click();
	}
	
	public void setBankName(String bname)
	{
		bankName.sendKeys(bname);
	}
	
	public void setAddress(String Address)
	{
		address.sendKeys(Address);
	}
	
	public void setCity(String City)
	{
		city.sendKeys(City);
	}
	
	public void setState(String State)
	{
		state.sendKeys(State);
	}
	
	public void setZipCode(String zipcode)
	{
		pincode.sendKeys(zipcode);
	}
	
	public void setRoutingCode(String RoutingCode)
	{
		routingcode.sendKeys(RoutingCode);
	}
	
	public void ParentBankDrp() {
		parentBank.click();
	}

	public  void DropdownParentBank() {
	      Select drop = new Select(parentBank);
	      drop.selectByIndex(1);  
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
