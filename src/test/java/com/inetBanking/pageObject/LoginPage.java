package com.inetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(name="usernameOrEmailAddress")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(name="Password")
	@CacheLookup
	WebElement txPassword;
	
	@FindBy(id="LoginButton")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="/html/body/div/nav/ul[2]/li[2]/a/img")
	@CacheLookup
	WebElement lnkImage;
	
	@FindBy(xpath="/html/body/div/nav/ul[2]/li[2]/div/a")
	@CacheLookup
	WebElement lnkLogout;
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
	public void clickImage()
	{
		lnkImage.click();
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}

	

	
}
