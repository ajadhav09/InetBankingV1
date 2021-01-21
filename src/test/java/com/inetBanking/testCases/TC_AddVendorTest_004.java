package com.inetBanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;


import com.inetBanking.pageObject.AddVendor;
import com.inetBanking.pageObject.LoginPage;

public class TC_AddVendorTest_004 extends BaseClass {
	
	@Test
	public void addNewVendor() throws InterruptedException, IOException 
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddVendor addvendor = new AddVendor(driver);
		addvendor.clickAdmin();
		addvendor.clickAddVendor();
		addvendor.clickNewVendor();
		logger.info("Providing Vendor details");
		
		addvendor.setVendorCode("12340");
		addvendor.setVendorName("Dhfl");
		addvendor.setContactPerson("Anita");
		
		String mobilenumber = randomNumber();
		addvendor.setMobileNumber(mobilenumber);
		
		String email = randomstring()+"@gmail.com";
		addvendor.setEmail(email);
		
		String username = randomstring();
		addvendor.setUsername(username);
		
		addvendor.setPassword("!TMtm123");
		addvendor.clickSave();
		Thread.sleep(3000);
		
		logger.info("validation started...");
		
		boolean res = driver.getPageSource().contains("new vendor added sucessfully");
		if(res==true)
		{
			capturescreen(driver,"AddVendor");
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
