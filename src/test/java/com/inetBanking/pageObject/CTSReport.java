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
	
	


}
