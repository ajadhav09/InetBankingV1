package com.inetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddClient {
WebDriver ldriver;

 public AddClient(WebDriver rdriver)
{
	ldriver= rdriver;
	PageFactory.initElements(rdriver, this);
	}
 
    @FindBy(xpath="/html/body/div/aside/div/nav/ul/li[2]/a/p")
	@CacheLookup
	WebElement lnkAdmin;
	
	@FindBy(xpath="/html/body/div/aside/div/nav/ul/li[2]/ul/li[5]/a/p")
	@CacheLookup
	WebElement lnkAddClient;
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]/div/div/div/div[1]/p/a")
	@CacheLookup
	WebElement lnkCreateNewClient;
	
	@FindBy(name="ClientName")
	@CacheLookup
	WebElement Clientname;
	
	@FindBy(name="ClientCode")
	@CacheLookup
	WebElement Clientcode;
	
	@FindBy(name="AccountNumber")
	@CacheLookup
	WebElement accountNumber;
	
	@FindBy(name="StateId")
	@CacheLookup
	WebElement State;
	
	@FindBy(name = "StateId")
	private WebElement DropdownState;
	
	@FindBy(name="BranchId")
	@CacheLookup
	WebElement branchId;
	
	@FindBy(name = "BranchId")
	private WebElement DropdownBranchid;
	
	@FindBy(name="Address")
	@CacheLookup
	WebElement address;
	
	@FindBy(name="PinCode")
	@CacheLookup
	WebElement pinCode;
	
	@FindBy(name="Enrichment1")
	@CacheLookup
	WebElement enrichment1;
	
	@FindBy(name="DSEnrichment1")
	@CacheLookup
	WebElement dsenrichment1;
	
	@FindBy(name="DSEnrichment2")
	@CacheLookup
	WebElement dsenrichment2;
	
	@FindBy(name="DSEnrichment3")
	@CacheLookup
	WebElement dsenrichment3;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div/div/div/form/div[1]/div/div/button[2]")
	@CacheLookup
	WebElement saveAndcontinue;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div/div/div/form/div[2]/div[10]/div[1]/input[2]")
	@CacheLookup
	WebElement Pickpoint;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div/div/div/form/div[2]/div[10]/div[2]/input")
	@CacheLookup
	WebElement pickPointDescription;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div/div/div/form/div[2]/div[10]/div[3]/button")
	@CacheLookup
	WebElement Addpickpoint;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div/div/div/form/div[1]/div/div/button[1]")
	@CacheLookup
	WebElement save;
	
	public void clickAdmin()
	{
		lnkAdmin.click();
	}
	
	public void clickAddClient()
	{
		lnkAddClient.click();
	}
	
	public void clickCreateNewClient()
	{
		lnkCreateNewClient.click();
	}
	
	public void setClientName(String clientname)
	{
		Clientname.sendKeys(clientname);
	}
	
	public void setClientCode(String clientcode)
	{
		Clientcode.sendKeys(clientcode);
	}
	
	public void setAccountNo(String Ac)
	{
		accountNumber.sendKeys(Ac);
	}
	
	public void StateDrp() {
		State.click();
	}

	public  void DropdownState() {
	      Select drop = new Select(State);
	      drop.selectByIndex(14);  
	}
	
	public void setbranchId() {
		branchId.click();
	}

	public  void DropdownBranchid() {
	      Select drop = new Select(branchId);
	      drop.selectByIndex(2);  
	}
	
	public void setAddress(String Address)
	{
		address.sendKeys(Address);
	}
	
	public void setPincode(String pincode)
	{
		pinCode.sendKeys(pincode);
	}
	
	public void setEnrichment1(String Enrichment1)
	{
		enrichment1.sendKeys(Enrichment1);
	}
	
	public void setDsEnrichment1(String dsEnrichment1)
	{
		dsenrichment1.sendKeys(dsEnrichment1);
	}
	
	public void setDsEnrichment2(String dsEnrichment2)
	{
		dsenrichment2.sendKeys(dsEnrichment2);
	}
	
	public void setDsEnrichment3(String dsEnrichment3)
	{
		dsenrichment3.sendKeys(dsEnrichment3);
	}
	
	public void setSaveandContinue()
	{
		saveAndcontinue.click();
	}
	
	public void setPickpoint(String pickpoint)
	{
		Pickpoint.sendKeys(pickpoint);
	}
	
	public void setpickPointDescription(String PickPointDescription)
	{
		pickPointDescription.sendKeys(PickPointDescription);
	}
	
	public void setAddpickpoint()
	{
		Addpickpoint.click();
	}
	
	public void setSave()
	{
		save.click();
	}
	
}
