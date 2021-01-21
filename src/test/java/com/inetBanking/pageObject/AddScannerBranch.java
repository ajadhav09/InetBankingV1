package com.inetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddScannerBranch {
WebDriver ldriver;
	
	public AddScannerBranch(WebDriver rdriver)
	{
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath="/html/body/div/aside/div/nav/ul/li[2]/a/p")
	@CacheLookup
	WebElement lnkAdmin;
	
	@FindBy(xpath="/html/body/div/aside/div/nav/ul/li[2]/ul/li[4]/a/p")
	@CacheLookup
	WebElement lnkScannerBranch;
	
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div/div/div[1]/div/div[2]/a")
	@CacheLookup
	WebElement lnkNewScannerBranch;
	
	@FindBy(name="BranchName")
	@CacheLookup
	WebElement Branchname;
	
	@FindBy(name="BranchCode")
	@CacheLookup
	WebElement branchCode;
	
	@FindBy(name="Address")
	@CacheLookup
	WebElement address;
	
	@FindBy(name="StateId")
	@CacheLookup
	WebElement State;
	
	@FindBy(name = "StateId")
	private WebElement DropdownState;
	
	@FindBy(name="PinCode")
	@CacheLookup
	WebElement pinCode;
	
	@FindBy(name="ORIGINATING_BRANCH_NO")
	@CacheLookup
	WebElement OriginatingBranchCode;
	
	@FindBy(name="PresentingBranchRoutingNo")
	@CacheLookup
	WebElement presentingBranchRoutingNo;
	
	@FindBy(name="TruncatingRTNo")
	@CacheLookup
	WebElement truncatingRTNo;
	
	@FindBy(name="IFSCCode")
	@CacheLookup
	WebElement IFSCcode;
	
	@FindBy(name="Loccode")
	@CacheLookup
	WebElement loccode;
	
	@FindBy(name="RCMSName")
	@CacheLookup
	WebElement RCMSName;
	
	@FindBy(name="VendorId")
	@CacheLookup
	WebElement Vendor;
	
	@FindBy(name = "VendorId")
	private WebElement DropdownVendor;
	
	@FindBy(name="Grid")
	@CacheLookup
	WebElement grid;
	
	@FindBy(name = "Grid")
	private WebElement DropdownGrid;
	
	@FindBy(name="ScannerId")
	@CacheLookup
	WebElement Scanner;
	
	@FindBy(name="BranchType")
	@CacheLookup
	WebElement branchType;
	
	@FindBy(name = "BranchType")
	private WebElement DropdownBranchType;

	@FindBy(name="EmailId")
	@CacheLookup
	WebElement EmailId;
	
	@FindBy(name="MobileNumber")
	@CacheLookup
	WebElement MobileNumber;
	
	@FindBy(name="UserName")
	@CacheLookup
	WebElement Username;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div/div[2]/form/div[8]/div/button")
	@CacheLookup
	WebElement BtnSave;
	

	public void clickAdmin()
	{
		lnkAdmin.click();
	}
	
	public void clickAddscannerBranch()
	{
		lnkScannerBranch.click();
	}
	
	public void clickAddNewscannerBranch()
	{
		lnkNewScannerBranch.click();
	}
	
	public void setBranchName(String branchname)
	{
		Branchname.sendKeys(branchname);
	}
	
	public void setBranchCode(String branchcode)
	{
		branchCode.sendKeys(branchcode);
	}
	
	public void setAddress(String Address)
	{
		address.sendKeys(Address);
	}
	
	public void StateDrp() {
		State.click();
	}

	public  void DropdownState() {
	      Select drop = new Select(State);
	      drop.selectByIndex(3);  
	}
	
	public void setPincode(String pincode)
	{
		pinCode.sendKeys(pincode);
	}
	
	public void setOriginatingBranchCode(String OriBranchCode)
	{
		OriginatingBranchCode.sendKeys(OriBranchCode);
	}
	
	public void setpresentingBranchRoutingNo(String PreBranchCode)
	{
		presentingBranchRoutingNo.sendKeys(PreBranchCode);
	}
	
	public void settruncatingRTNo(String TrBranchCode)
	{
		truncatingRTNo.sendKeys(TrBranchCode);
	}
	
	public void setIFSCcode(String ifsccode)
	{
		IFSCcode.sendKeys(ifsccode);
	}
	
	public void setloccode(String locationCode)
	{
		loccode.sendKeys(locationCode);
	}
	
	public void setRCMSName(String rcmsname)
	{
		RCMSName.sendKeys(rcmsname);
	}
	
	public void VendorDrp() {
		Vendor.click();
	}

	public  void DropdownVendor() {
	      Select drop = new Select(Vendor);
	      drop.selectByIndex(2);  
	}
	
	public void GridDrp() {
		grid.click();
	}

	public  void DropdownGrid() {
	      Select drop = new Select(grid);
	      drop.selectByIndex(1);  
	}
	
	public void BranchtypeDrp() {
		branchType.click();
	}

	public  void DropdownBranchType() {
	      Select drop = new Select(branchType);
	      drop.selectByIndex(1);  
	}
	
	public void setScanner(String scannerid)
	{
		Scanner.sendKeys(scannerid);
	}
	
	public void setEmail(String Email)
	{
		EmailId.sendKeys(Email);
	}
	
	public void setMobileNumber(String MoNumber)
	{
		MobileNumber.sendKeys(MoNumber);
	}
	
	public void setUsername(String username)
	{
		Username.sendKeys(username);
	}
	
	public void ClickSave()
	{
		BtnSave.click();
	}
	
	

}
