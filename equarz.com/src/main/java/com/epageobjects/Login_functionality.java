package com.epageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebase.Testbase;

public class Login_functionality extends Testbase {
	
	@FindBy(id="si-email")
	WebElement user;
	
	@FindBy(id="si-password")
	WebElement pass;
	
//	@FindBy(name="default_captcha_value")
//	WebElement captchavalue;
//	
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement signinbtn;
	
	public Login_functionality(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	public Homepage validatelogin(String user1 , String password1) throws Throwable {
		
		user.sendKeys(user1);
		pass.sendKeys(password1);
		Thread.sleep(10000);
//		captchavalue.click();
		signinbtn.click();
//		user.sendKeys(props.getProperty("username"));
//		pass.sendKeys(props.getProperty("password"));
		return new Homepage ();
	}
	
	
	

}
