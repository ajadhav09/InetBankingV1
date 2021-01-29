package com.inetBanking.testCases;

import java.io.IOException;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObject.AddBank;
import com.inetBanking.pageObject.LoginPage;

public class TC_AddBankTest_003  extends BaseClass
{
	
	@Test
	public void addNewBank() throws InterruptedException, IOException 
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided");
		
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddBank addbank = new AddBank(driver);
		addbank.clickAdmin();
		addbank.clickAddBank();
		addbank.clickNewBank();
		logger.info("Providing Bank details");
		
		addbank.setBankName("SBI");
		addbank.setAddress("Mumbai");
		addbank.setCity("Mumbai");
		addbank.setState("Maharastra");
		addbank.setZipCode("410009");
		addbank.setRoutingCode("123456789");
		addbank.ParentBankDrp();
		addbank.DropdownParentBank();
		
		String email = randomstring()+"@gmail.com";
		addbank.setEmail(email);
		
		String username = randomstring();
		addbank.setUsername(username);
		addbank.setPassword("!TMtm123");
		addbank.clickSave();
		Thread.sleep(3000);
		
		logger.info("validation started...");
		
		boolean res = driver.getPageSource().contains("new bank added sucessfully");
		if(res==true)
		{
			capturescreen(driver,"AddBank");
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
