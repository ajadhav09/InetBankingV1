package com.inetBanking.testCases;

import java.io.IOException;

import org.junit.Assert;

import org.testng.annotations.Test;

import com.inetBanking.pageObject.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws IOException
	{
		
		logger.info("Url is Opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Enter Username");
		
		lp.setPassword(password);
		logger.info("Enter password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("HomePage / CTS Application"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test passed");
			
		}
		else 
		{
			capturescreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login Test failed");
		}
	}
}