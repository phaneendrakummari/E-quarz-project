package com.etestcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebase.Testbase;
import com.epageobjects.Login_functionality;
import com.epageobjects.Productsearch;
import com.epageobjects.Signupfunctionality;

public class Producttest extends Testbase {
	
	Productsearch pt;
	Login_functionality lg;
	Signupfunctionality sf;
	//WebDriver driver;
	 
	public Producttest() 
	{
		super();
		
	}
	
	@BeforeMethod
	public void prdinitialze() throws Throwable 
	{
		setup();
		sf=new Signupfunctionality(driver);
		lg= new Login_functionality(driver);
		lg.validatelogin(props.getProperty("username"),props.getProperty("password"));
		 pt = new Productsearch(driver);
	 
	}
	@Test(priority = 3)
	public  void verifyproduct()  throws Throwable 
	{
		 pt.catproduct(); 
		 String url=driver.getCurrentUrl();
		 Assert.assertEquals("http://e-quarz.com/product/class-5-grade-5-mathematics-practice-workbook-with-answers-cbseicse-book-question-papers-mental-math-mixed-word-problems", url);
		 
	}
	@Test(priority = 2)
	public void bannerproduct()
	{
		pt.banproduct();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/product/dhingra-mens-slim-fit-tuxedo-3pcs-suit-coat-pant-and-waistcoat-InysDn", url);
	}
	@Test(priority = 1)

	public void seaproduct() throws Throwable
	{
		
		pt.productsearch();
	
	}
}
