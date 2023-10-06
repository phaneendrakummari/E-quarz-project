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
	@FindBy(xpath=" //a[@href='http://e-quarz.com/account-tickets']")
	WebElement supportticket;
	@FindBy(xpath="//a[@href='http://e-quarz.com/about-us']")
	WebElement company;
	@FindBy(xpath="//a[@href='http://e-quarz.com/contacts']")
	WebElement contact;
	@FindBy(xpath="//a[@href='http://e-quarz.com/helpTopic']")
	WebElement help;
	@FindBy(xpath="//i[@class='fa fa-twitter']")
	WebElement twitter;
	@FindBy(xpath="//a[@class='social-btn text-white sb-light sb-linkedin mr-2 mb-2']")
	WebElement linkedin;
	@FindBy(xpath="//a[@class='social-btn text-white sb-light sb-instagram mr-2 mb-2']")
	WebElement instagram;
	@FindBy(xpath="//a[@class='social-btn text-white sb-light sb-facebook mr-2 mb-2']")
	WebElement facebook;
	@FindBy(xpath="//a[@class='social-btn text-white sb-light sb-pinterest mr-2 mb-2']")
	WebElement pininterest;
	@FindBy(xpath="//a[@class='social-btn text-white sb-light sb-google-plus mr-2 mb-2']")
	WebElement googleplus;
	
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
	public void latestproduct() 
	{
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
		latestproduct.click();
		String url = driver.getCurrentUrl();
	    assertEquals("http://e-quarz.com/products?data_from=latest&page=1", url);
	    
	}
	public void bestseling() 
	{
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
     	bestselling.click();
     	String url = driver.getCurrentUrl();
	    assertEquals("http://e-quarz.com/products?data_from=best-selling&page=1", url);	
	}
	public void toprated()
	{
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
		toprated.click();
     	String url = driver.getCurrentUrl();
	    assertEquals("http://e-quarz.com/products?data_from=top-rated&page=1", url);	
	}
	public void profile() {
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
		profile.click();
     	String url = driver.getCurrentUrl();
	    assertEquals("http://e-quarz.com/user-account", url);	
	}
	public void ordertrack() 
	{
	org.openqa.selenium.Point ps = scroll.getLocation();
    JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy"+ps);
	trackorder.click();
 	String url = driver.getCurrentUrl();
    assertEquals("http://e-quarz.com/track-order", url);	
	}
	public void policyrefund() 
	{
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
		refundpolicy.click();
     	String url = driver.getCurrentUrl();
	    assertEquals("http://e-quarz.com/refund-policy", url);	
	}	
	public void policyreturn() 
	{
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
		returnpolicy.click();
     	String url = driver.getCurrentUrl();
	    assertEquals("http://e-quarz.com/return-policy", url);	
	
	}
	public void cancel() 
	{
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
		cancellation.click();
     	String url = driver.getCurrentUrl();
	    assertEquals("http://e-quarz.com/cancellation-policy", url);	
		
	}
	public void ticket()
	{
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
		supportticket.click();
		String url = driver.getCurrentUrl();
	    assertEquals("http://e-quarz.com/account-tickets", url);
	}
	public void Company() 
	{
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
		company.click();
		String url = driver.getCurrentUrl();
	    assertEquals("http://e-quarz.com/about-us", url);

	}
	public void AboutUS() {
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
		contact.click();
		String url = driver.getCurrentUrl();
	    assertEquals("http://e-quarz.com/contacts", url);	
	
	}
	public void Help() {
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
		help.click();
		String url = driver.getCurrentUrl();
	    assertEquals("http://e-quarz.com/helpTopic", url);		
	}
	public void Twiter() {
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
		twitter.click();
	}
	public void linkedin() {
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
		linkedin.click();
	}
	public void insta() {
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
		instagram.click();	
	}
	public void facebok() {
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
		facebook.click();	
	}
	public void pininterst() {
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
		pininterest.click();	
	}
	public void googlepluss() {
		org.openqa.selenium.Point ps = scroll.getLocation();
        JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy"+ps);
		googleplus.click();	
		
	}
}
		
