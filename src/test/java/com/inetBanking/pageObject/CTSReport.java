package com.inetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CTSReport {
	WebDriver ldriver;
	public CTSReport(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Pickup Activity test parameter
	
	@FindBy(xpath = "/html/body/div/aside/div/nav/ul/li[6]/a/p")
	@CacheLookup
	WebElement lnkPickupActivity;
	
	@FindBy(name="ddlvendor")
	@CacheLookup
	WebElement VendorName;
	
	@FindBy(name = "ddlvendor")
	private WebElement DrpVendorName;
	
	/*
	 * @FindBy(name = "startdate")
	 * 
	 * @CacheLookup WebElement startDate;
	 */
	
	@FindBy(id = "btnserach")
	@CacheLookup
	WebElement btnSearch;
	
	//Scanning activity record search
	
	@FindBy(xpath = "/html/body/div/aside/div/nav/ul/li[7]/a/p")
	@CacheLookup
	WebElement lnkScanningActivity;
	
	/*
	 * @FindBy(name = "startdate")
	 * 
	 * @CacheLookup WebElement sdate;
	 */
	
	@FindBy(name="vendor")
	@CacheLookup
	WebElement vendor;
	
	@FindBy(name = "vendor")
	private WebElement DrpVendor;
	
	@FindBy(name = "location")
	@CacheLookup
	WebElement Location;
	
	@FindBy(name = "location")
	private WebElement drpLocation;
	
	@FindBy(xpath = "/html/body/div/div[1]/div/div/div/div[1]/div[2]/div/div[4]/div/button")
	@CacheLookup
	WebElement search;
	
	
	//Processing details record search
	@FindBy(xpath = "/html/body/div/aside/div/nav/ul/li[8]/a")
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
	private WebElement DrVendor;
	
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
	
	
	//Paid cheque details record search
		@FindBy(xpath = "/html/body/div/aside/div/nav/ul/li[9]/a/p")
		@CacheLookup
		WebElement lnkPaidCheque;
		
		@FindBy(name ="vendor")
		@CacheLookup
		WebElement Vendorname;
		
		@FindBy(name ="vendor")
		@CacheLookup
		private WebElement Vendordrp;
		
		@FindBy(name = "startdate")
		@CacheLookup
		WebElement Startdate;
		
		@FindBy(name = "enddate")
		@CacheLookup
		WebElement EndDate;
		
		@FindBy(name = "location")
		@CacheLookup
		WebElement location;
		
		@FindBy(name = "location")
		private WebElement locationdrp;
		
		@FindBy(name = "client")
		@CacheLookup
		WebElement clientName;
		
		@FindBy(name = "client")
		private WebElement drpClient;
		
		@FindBy(name = "BatchNumber")
		@CacheLookup
		WebElement BNumber;
		
		@FindBy(name = "BatchNumber")
		@CacheLookup
		WebElement drpBNumber;
		
		@FindBy(name = "dsnumber")
		@CacheLookup
		WebElement DSNumber;
		
		@FindBy(name = "chequenumber")
		@CacheLookup
		WebElement chequeNumber;
		
		@FindBy(name = "amount")
		@CacheLookup
		WebElement amount;
		
		@FindBy(name = "btnserach")
		@CacheLookup
		WebElement BTNsearch; 
	
	//Pickup Activity code
	
	public void clickPickUp()
	{
		lnkPickupActivity.click();
	}
	
    public void VendorDrp() {
		VendorName.click();
	}

	public  void DrpVendorName() {
	      Select drop = new Select(VendorName);
	      drop.selectByIndex(2);  
	}
	
	/*
	 * public void setDate(String date) { startDate.clear();
	 * startDate.sendKeys(date); }
	 */
	
	public void btnsearch()
	{
		btnSearch.click();
	}
	
	//Scanning activity code
	public void clickScanningActivity()
	{
		lnkScanningActivity.click();
	}
	
	/*
	 * public void setStartDate(String date) { sdate.clear(); sdate.sendKeys(date);
	 * }
	 */

	public void Vendor() {
		vendor.click();
	}

	public  void DrpVendor() {
	      Select drop = new Select(vendor);
	      drop.selectByIndex(2);  
	}
	
	public void setlocation() {
		Location.click();
	}

	public  void drpLocation() {
	      Select drop = new Select(Location);
	      drop.selectByIndex(5);  
	}
	
	public void Search()
	{
		search.click();
	}
	
	//Processing details page code
	
	public void clickProcessingDetails()
	{
		lnkProcessingdetails.click();
	}
	
    public void vendor() {
    	Vendor.click();
	}

	public  void DrVendor() {
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
	
	//Paid cheque details page code
	
		public void clickPaidCheque()
		{
			lnkPaidCheque.click();
		}
		
	    public void vendorName() {
	    	Vendorname.click();
		}

		public  void Vendordrp() {
		      Select drop = new Select(Vendorname);
		      drop.selectByIndex(2);  
		}
		
		public void setStartDate(String sdate)
		{
			Startdate.clear();
			Startdate.sendKeys(sdate);
		}
		public void setendDate(String Edate)
		{
			EndDate.clear();
			EndDate.sendKeys(Edate);
		}
		
		public void setbranchName()
		{
			location.click();
		}
		
		public  void locationdrp() {
		      Select drop = new Select(location);
		      drop.selectByIndex(12);  
		}
		
		
		public void setclient()
		{
			clientName.click();
		}
		
		public  void drpClient() {
		      Select drop = new Select(clientName);
		      drop.selectByIndex(1);  
		}
		
		public void setbatchnumber()
		{
			BNumber.click();
		}
		
		public  void drpBNumber() {
		      Select drop = new Select(BNumber);
		      drop.selectByIndex(1);  
		}
		
		public void setdsnumber(String dsnumber)
		{
			DSNumber.sendKeys(dsnumber);
		}
		
		public void setchequenumber(String cheqnumber)
		{
			chequeNumber.sendKeys(cheqnumber);
		}
		
		public void setamount(String Amount)
		{
			amount.sendKeys(Amount);
		}
		
		public void btsearch()
		{
			BTNsearch.click();
		}
	
	


}
