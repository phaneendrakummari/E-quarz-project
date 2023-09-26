package com.epageobjects;

import static org.testng.Assert.assertEquals;

import java.awt.Point;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebase.Testbase;

public class Homelinks extends Testbase 
{

	@FindBy(xpath="//a[text()='Terms & Conditions']")
	WebElement scroll;
	@FindBy(xpath="//a[text()='Featured Products']")
	WebElement featureproduct;
	@FindBy(xpath="//a[text()='Latest Products']")
	WebElement latestproduct;
	@FindBy(xpath="//a[text()='Best Selling Products']")
	WebElement bestselling;
	@FindBy(xpath="//a[text()='Top Rated Products']")
	WebElement toprated;
	@FindBy(xpath="//a[text()='Profile Info']")
	WebElement profile;
	@FindBy(xpath="//a[text()='Track Order']")
	WebElement trackorder;
	@FindBy(xpath="//a[text()='Refund policy']")
	WebElement refundpolicy;
     @FindBy(xpath="//a[text()='Return policy']")
     WebElement returnpolicy;
	@FindBy(xpath="//a[text()='Cancellation policy']")
	WebElement cancellation;
//	@FindBy(xpath="//i[@class='fa fa-twitter']")
//	WebElement twitter;
	
	
	public Homelinks(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	public void featureproduct() 
	{
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
     	featureproduct.click();
	    String url = driver.getCurrentUrl();
	    assertEquals("http://e-quarz.com/products?data_from=featured&page=1", url);
	}
	public void latestproduct() {
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
		latestproduct.click();
		String url = driver.getCurrentUrl();
	    assertEquals("http://e-quarz.com/products?data_from=latest&page=1", url);
	    
	}
	public void bestseling() {
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
     	bestselling.click();
     	String url = driver.getCurrentUrl();
	    assertEquals("http://e-quarz.com/products?data_from=best-selling&page=1", url);	
	}
//		toprated.click();
//		profile.click();
//		trackorder.click();
//		refundpolicy.click();
//		returnpolicy.click();
//		cancellation.click();
//		//twitter.click();

	}
