package com.inetBanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;


import com.inetBanking.pageObject.AddScannerBranch;
import com.inetBanking.pageObject.LoginPage;

public class TC_AddScannerBranch_006 extends BaseClass {

	@Test
	public void AddScannerBranch() throws InterruptedException, IOException 
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddScannerBranch addScannerbranch = new AddScannerBranch(driver);
		addScannerbranch.clickAdmin();
		addScannerbranch.clickAddscannerBranch();
		addScannerbranch.clickAddNewscannerBranch();
		logger.info("Providing Scanner branch details");
		
		String branchname = randomstring();
		addScannerbranch.setBranchName(branchname);
		
		String branchcode = randomNum();
		addScannerbranch.setBranchCode(branchcode);
		
		addScannerbranch.setAddress("Pune");
		addScannerbranch.StateDrp();
		addScannerbranch.DropdownState();
		
		addScannerbranch.setPincode("123456");
		addScannerbranch.setOriginatingBranchCode("123456789");
		addScannerbranch.setpresentingBranchRoutingNo("0123456012");
		addScannerbranch.settruncatingRTNo("123456781");
		addScannerbranch.setIFSCcode("SBIN0123456");
		
		String loccode = RandomString();
		addScannerbranch.setloccode(Keys.SHIFT+loccode);
		
		addScannerbranch.setRCMSName("puneip");
		addScannerbranch.VendorDrp();
		addScannerbranch.DropdownVendor();
		
		addScannerbranch.GridDrp();
		addScannerbranch.DropdownGrid();
		
		addScannerbranch.BranchtypeDrp();
		addScannerbranch.DropdownBranchType();
		
		String scannerid = randomNum();
		addScannerbranch.setScanner(scannerid);
		
		String email = randomstring()+"@gmail.com";
		addScannerbranch.setEmail(email);
		
		String mobileNo = randomNumber();
		addScannerbranch.setMobileNumber(mobileNo);
		
		String username = randomstring();
		addScannerbranch.setUsername(username);
		
		addScannerbranch.ClickSave();
		//Thread.sleep(3000);
		
		logger.info("validation started...");
		
		boolean res = driver.getPageSource().contains("new scanner branch added sucessfully");
		if(res==true)
		{
			capturescreen(driver,"AddScannerBranch");
			Assert.assertTrue(false);
			logger.info("Test case failed");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Test case passed");
		}
	}
		
}
