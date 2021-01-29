package com.inetBanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUser {
	WebDriver ldriver;
	
	public AddUser(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	    @FindBy(xpath="/html/body/div/aside/div/nav/ul/li[2]/a/p")
		@CacheLookup
		WebElement lnkAdmin;
	    
	    @FindBy(xpath="/html/body/div/aside/div/nav/ul/li[2]/ul/li[7]/a/p")
		@CacheLookup
		WebElement lnkUser;
	    
	    @FindBy(xpath="/html/body/div/div[1]/section[1]/div/div/div[2]/a")
		@CacheLookup
		WebElement lnkCreate;
	    
	    @FindBy(name="UserName")
	  	@CacheLookup
	  	WebElement username;
	    
	    @FindBy(name="Name")
	  	@CacheLookup
	  	WebElement name;
	    
	    @FindBy(name="Surname")
	  	@CacheLookup
	  	WebElement surname;
	    
	    @FindBy(name="EmailAddress")
	  	@CacheLookup
	  	WebElement emailAddress;
	    
	    @FindBy(name="Password")
	  	@CacheLookup
	  	WebElement password;
	    
	    @FindBy(name="ConfirmPassword")
	  	@CacheLookup
	  	WebElement confirmPassword;
	    
	    @FindBy(xpath= "/html/body/div[1]/div[1]/div[1]/div/div/form/div[2]/button[2]")
	    @CacheLookup
	    WebElement btnSave;
	    
	    public void clickAdmin()
		{
			lnkAdmin.click();
		}
		
		public void clickAddUser()
		{
			lnkUser.click();
		}
		
		public void clickCreate()
		{
			lnkCreate.click();
		}
		
		public void setUsername(String Username)
		{
			username.sendKeys(Username);
		}
		
		public void setName(String Name)
		{
			name.sendKeys(Name);
		}
		
		public void setSurname(String Surname)
		{
			surname.sendKeys(Surname);
		}
		
		public void setEmailaddress(String email)
		{
			emailAddress.sendKeys(email);
		}
		
		public void setPassword(String Password)
		{
			password.sendKeys(Password);
		}
		
		public void setConfirmPassword(String Confirmpassword)
		{
			confirmPassword.sendKeys(Confirmpassword);
		}
		
		public void setSave()
		{
			btnSave.click();
		}

}
