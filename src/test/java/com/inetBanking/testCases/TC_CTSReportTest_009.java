package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObject.CTSReport;
import com.inetBanking.pageObject.LoginPage;

public class TC_CTSReportTest_009 extends BaseClass 
{
	@Test
	public void CTSReport() throws InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		logger.info("User get login sucessfully");
		Thread.sleep(2000);
		
		//Pickup activity test cases
		CTSReport report = new CTSReport(driver);
		report.clickPickUp();
		report.VendorDrp();
		report.DrpVendorName();
	//	report.setDate("25/01/2021");
		report.btnsearch();
		Thread.sleep(3000);
		
		//Scanning activity test cases
		report.clickScanningActivity();
	//	report.setStartDate("22/01/2020");
		report.Vendor();
		report.DrpVendor();
		report.setlocation();
		report.drpLocation();
		report.Search();
	}

}
