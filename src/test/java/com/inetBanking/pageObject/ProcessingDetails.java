package com.inetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProcessingDetails {
	
	WebDriver ldriver;
	public ProcessingDetails(WebDriver rdriver)
	{
		rdriver = ldriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "/html/body/div/aside/div/nav/ul/li[8]/a/p")
	@CacheLookup
	WebElement lnkProcessingdetails;
	
	/*
	 * @FindBy(id = "btnserach")
	 * 
	 * @CacheLookup WebElement search;
	 */
	
	@FindBy(name ="vendor")
	@CacheLookup
	WebElement Vendor;
	
	@FindBy(name ="vendor")
	@CacheLookup
	private WebElement DrpVendor;
	
	@FindBy(name = "startdate")
	@CacheLookup
	WebElement StartDate;
	
	@FindBy(name = "enddate")
	@CacheLookup
	WebElement Enddate;
	
	@FindBy(name = "location")
	@CacheLookup
	WebElement BranchName;
	
	@FindBy(name = "location")
	private WebElement DrpBranchname;
	
	@FindBy(name = "client")
	@CacheLookup
	WebElement client;
	
	@FindBy(name = "client")
	private WebElement DrpClient;
	
	@FindBy(name = "BatchNumber")
	@CacheLookup
	WebElement batchNumber;
	
	@FindBy(name = "BatchNumber")
	@CacheLookup
	WebElement drpBatchNumber;
	
	@FindBy(name = "dsnumber")
	@CacheLookup
	WebElement dsNumber;
	
	@FindBy(name = "chequenumber")
	@CacheLookup
	WebElement ChequeNumber;
	
	@FindBy(name = "amount")
	@CacheLookup
	WebElement Amount;
	
	@FindBy(name = "btnserach")
	@CacheLookup
	WebElement Search;
	
	public void clickProcessingDetails()
	{
		lnkProcessingdetails.click();
	}
	
    public void VendorDrp() {
    	Vendor.click();
	}

	public  void DrpVendor() {
	      Select drop = new Select(Vendor);
	      drop.selectByIndex(2);  
	}
	
	public void setDate(String sdate)
	{
		StartDate.clear();
		StartDate.sendKeys(sdate);
	}
	public void setEndDate(String Edate)
	{
		Enddate.clear();
		Enddate.sendKeys(Edate);
	}
	
	public void setBranchName()
	{
		BranchName.click();
	}
	
	public  void DrpBranchname() {
	      Select drop = new Select(BranchName);
	      drop.selectByIndex(12);  
	}
	
	
	public void setClient()
	{
		client.click();
	}
	
	public  void DrpClient() {
	      Select drop = new Select(client);
	      drop.selectByIndex(1);  
	}
	
	public void setBatchnumber()
	{
		batchNumber.click();
	}
	
	public  void drpBatchNumber() {
	      Select drop = new Select(batchNumber);
	      drop.selectByIndex(1);  
	}
	
	public void setDsnumber(String dsnumber)
	{
		dsNumber.sendKeys(dsnumber);
	}
	
	public void setChequenumber(String cheqnumber)
	{
		ChequeNumber.sendKeys(cheqnumber);
	}
	
	public void setAmount(String amount)
	{
		Amount.sendKeys(amount);
	}
	
	public void btSearch()
	{
		Search.click();
	}
	

}
