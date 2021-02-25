package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObject.ProcessingDetails;
import com.inetBanking.pageObject.LoginPage;

public class TC_ProcessingDetails_010 extends BaseClass {
	
	@Test
	public void ProcessingDetails() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		logger.info("User get login sucessfully");
		Thread.sleep(2000);
		
		//Processing details test cases
		ProcessingDetails pd = new ProcessingDetails(driver);
		Thread.sleep(200);
		pd.clickProcessingDetails();
		//pd.btnSearch();
		pd.VendorDrp();
		pd.DrpVendor();
		pd.setDate("30/01/2021");
		pd.setEndDate("30/01/2021");
		pd.setBranchName();
		pd.DrpBranchname();
		pd.setClient();
		pd.DrpClient();
		pd.setBatchnumber();
		pd.drpBatchNumber();
		
		String ds = randomNumber();
		pd.setDsnumber(ds);
		
		pd.setChequenumber("012345");
		pd.setAmount("100");
		
	}
}
