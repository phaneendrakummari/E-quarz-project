package com.epageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebase.Testbase;

public class Logout_functionality  extends Testbase{
	
	@FindBy(xpath="//div[@class='navbar-tool-icon-box bg-secondary']")
	WebElement profile;
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutbutton;
	
	//div[@class='toast toast-info']
	
	public Logout_functionality(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public void Logout()
	{
		profile.click();
		logoutbutton.click();
		System.out.println(driver.getTitle());
//		driver.navigate().refresh();
//		driver.navigate().back();
	}
	public void REFresh() {
		profile.click();
		logoutbutton.click();
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		
	}
    
}
