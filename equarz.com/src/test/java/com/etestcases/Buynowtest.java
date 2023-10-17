package com.etestcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ebase.Testbase;
import com.epageobjects.BuyNow;
import com.epageobjects.Login_functionality;

public class Buynowtest extends Testbase{
	
	BuyNow bn;
	Login_functionality lg;
	
	public Buynowtest()
	{
		super();
	}

	@BeforeMethod
	public void intialize() throws Throwable
	{
		setup();
		lg=new Login_functionality(driver);
		lg.validatelogin(props.getProperty("username"),props.getProperty("password"));
	    bn = new BuyNow(driver);
	     
	}
	@Test
	public void categorybuynow() 
	{
		bn.buynowcategory();
	}
	
	@Test
	public void cartbuynow() throws Throwable 
	{
		bn.buynowcart();
	}
	@AfterClass
	public void terminate() {
		driver.quit();
	}
//	@BeforeClass
//	public void login() throws Throwable
//	{
//		setup();
//		lg=new Login_functionality(driver);
//		lg.validatelogin(props.getProperty("username"),props.getProperty("password"));
//	}
}
