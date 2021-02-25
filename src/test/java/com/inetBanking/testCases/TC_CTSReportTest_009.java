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
		Thread.sleep(3000);
		
		//Processing details test cases
				report.clickProcessingDetails();
			//	report.setDate("22/01/2020");
			//	report.setEndDate("22/01/2020");
				report.vendor();
				report.DrVendor();
				report.setBranchName();
				report.DrpBranchname();
				report.setClient();
				report.DrpClient();
				report.setBatchnumber();
				report.drpBatchNumber();
				report.setDsnumber("15420521");
				report.setChequenumber("123456");
				report.setAmount("500");
				report.btSearch();
				
				//Paid Cheque details test cases
				report.clickPaidCheque();
			    report.vendorName();
				report.Vendordrp();
				report.setStartDate("25/02/2020");
				report.setendDate("25/02/2020");
				report.setbranchName();
				report.locationdrp();
				report.setclient();
				report.drpClient();
				report.setbatchnumber();
				report.drpBNumber();
				report.setdsnumber("7979566");
				report.setchequenumber("569874");
				report.setamount("1000");
				report.btsearch();
	}

}
