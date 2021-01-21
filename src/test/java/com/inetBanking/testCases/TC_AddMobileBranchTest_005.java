package com.inetBanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;


import com.inetBanking.pageObject.AddMobileBranch;
import com.inetBanking.pageObject.LoginPage;

public class TC_AddMobileBranchTest_005 extends BaseClass{
	
	@Test
	public void addNewMobileBranch() throws InterruptedException, IOException 
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddMobileBranch addMobilebranch = new AddMobileBranch(driver);
		addMobilebranch.clickAdmin();
		addMobilebranch.clickAddMobileBranch();
		addMobilebranch.clickAddNewMobileBranch();
		logger.info("Providing Mobile branch details");
		
		String branchname = randomstring();
		addMobilebranch.setBranchName(branchname);
		
		String branchcode = randomNum();
		addMobilebranch.setBranchCode(branchcode);
		
		addMobilebranch.setAddress("Nashik");
		addMobilebranch.StateDrp();
		addMobilebranch.DropdownState();
		
		addMobilebranch.setPincode("123456");
		addMobilebranch.setOriginatingBranchCode("123456789");
		addMobilebranch.setpresentingBranchRoutingNo("0123456012");
		addMobilebranch.settruncatingRTNo("123456781");
		addMobilebranch.setIFSCcode("SBIN0123456");
		addMobilebranch.setloccode("NSK");
		addMobilebranch.setRCMSName("puneip");
		addMobilebranch.VendorDrp();
		addMobilebranch.DropdownVendor();
		
		addMobilebranch.GridDrp();
		addMobilebranch.DropdownGrid();
		
		String scannerid = randomNum();
		addMobilebranch.setScanner(scannerid);
		
		String mobileid = "M"+randomNum();
		addMobilebranch.setMobileId(mobileid);
		
		addMobilebranch.setFirstName("Anita");
		addMobilebranch.setLastName("Date");
		
		String email = randomstring()+"@gmail.com";
		addMobilebranch.setEmail(email);
		
		String mobileNo = randomNumber();
		addMobilebranch.setMobileNumber(mobileNo);
		
		String username = randomstring();
		addMobilebranch.setUsername(username);
		addMobilebranch.setPassword("!TMtm123");
		addMobilebranch.setIsScreenShare();
		addMobilebranch.clickSave();
		Thread.sleep(3000);
		
		logger.info("validation started...");
		
		boolean res = driver.getPageSource().contains("new mobile branch added sucessfully");
		if(res==true)
		{
			capturescreen(driver,"AddMobileBranch");
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

