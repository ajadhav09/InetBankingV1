package com.inetBanking.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObject.AddUser;
import com.inetBanking.pageObject.LoginPage;

public class TC_AddUserTest_008 extends BaseClass {
	
	@Test
	public void AddUserTest() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("user name is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		Thread.sleep(2000);
		
		AddUser adduser = new AddUser(driver);
		adduser.clickAdmin();
		adduser.clickAddUser();
		adduser.clickCreate();
		
		String username = randomstring();
		adduser.setUsername(username);
		
		adduser.setName("Anita");
		adduser.setSurname("Date");
		
		String email = randomstring()+"gmail.com";
		adduser.setEmailaddress(email);
		
		adduser.setPassword("!TMtm123");
		adduser.setConfirmPassword("!TMtm123");
		adduser.setSave();
		
		logger.info("Validation started");
		
		//boolean res = driver.getPageSource().contains("Users / CTS Application");
		if(driver.getTitle().equals("Users / CTS Application"))
		{
			Assert.assertTrue(true);
			logger.info("Test case passed");
			
		}
		else {
			capturescreen(driver,"AddUserTest");
			Assert.assertTrue(false);
			logger.info("Test case failed");
		}
	}
	

}
