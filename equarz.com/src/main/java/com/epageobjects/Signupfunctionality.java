package com.epageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebase.Testbase;

public class Signupfunctionality extends Testbase{
	
	@FindBy(xpath="//input[@class='form-control']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@name='l_name']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement emailaddress;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement phonenumber;
	
	@FindBy(id="si-password")
	WebElement password;
	
	@FindBy(name="con_password")
	WebElement confrimpassword;
	
	@FindBy(name="remember")
	WebElement checkbox;
	
	@FindBy(id="sign-up")
	WebElement signbtn;
	
	public Signupfunctionality (WebDriver driver)
	{
	      PageFactory.initElements(driver, this);	
	}
	
	public Homepage verifysignup(String frst ,String last, String email, String phone, String pass, String copass) throws Throwable {
		
		firstname.sendKeys(frst);
		lastname.sendKeys(last);
		emailaddress.sendKeys(email);
		phonenumber.sendKeys(phone);
		password.sendKeys(pass);
		confrimpassword.sendKeys(copass);
		checkbox.click();
		Thread.sleep(10000);
		signbtn.click();
		
		return new Homepage();
		
	}
	
}
