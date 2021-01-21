package com.inetBanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;


import com.inetBanking.pageObject.LoginPage;
import com.inetBanking.pageObject.AddClient;

public class TC_AddClient_007 extends BaseClass {
	
	@Test
	public void AddClient() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
        AddClient addclient = new AddClient(driver);
		addclient.clickAdmin();
		addclient.clickAddClient();
		addclient.clickCreateNewClient();
		
		logger.info("Providing client details");
		
		addclient.setClientName("Test");
		addclient.setClientCode("Test");
		addclient.setAccountNo("1234567890");
		addclient.StateDrp();
		addclient.DropdownState();
		addclient.setbranchId();
		addclient.DropdownBranchid();
		addclient.setAddress("Pune");
		addclient.setPincode("414202");
		
		String enrichment = randomAlphaNum();
		addclient.setEnrichment1(enrichment);
		
		String dsEnrichment1 = randomAlphaNum();
		addclient.setDsEnrichment1(dsEnrichment1);
		
		String dsEnrichment2 = randomAlphaNum();
		addclient.setDsEnrichment2(dsEnrichment2);
		
		String dsEnrichment3 = randomAlphaNum();
		addclient.setDsEnrichment3(dsEnrichment3);
		
		addclient.setSaveandContinue();
		
		String Pickpoint = randomAlphaNum();
		addclient.setPickpoint(Pickpoint);
		
		addclient.setpickPointDescription("test");
		
		addclient.setAddpickpoint();
		addclient.setSave();
		
        logger.info("validation started...");
		
		boolean res = driver.getPageSource().contains("new client added sucessfully");
		if(res==true)
		{
			capturescreen(driver,"AddClient");
			Assert.assertTrue(false);
			logger.info("Test case failed");
		}
		else
		{
			capturescreen(driver,"AddClient");
			Assert.assertTrue(true);
			logger.info("Test case passed");
		}
	
		
		
	}
	
	

}
