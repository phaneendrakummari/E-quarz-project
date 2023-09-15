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
	//Signupfunctionality sf;
	//WebDriver driver;
	 
	public Producttest() 
	{
		super();
		
	}
	
	@BeforeMethod
	public void prdinitialze() throws Throwable 
	{
		 setup();
		 lg= new Login_functionality(driver);
		 lg.validatelogin(props.getProperty("username"),props.getProperty("password"));
		 pt = new Productsearch(driver);
	 
	}
	@Test(priority = 4)
	public  void verifyproduct()  throws Throwable 
	{
		 pt.cateogoryproduct(); 
		 
	}
	@Test(priority = 3)
	public void bannerproduct()
	{
		pt.banerproduct();
	}
	@Test(priority = 1)

	public void seaproduct() throws Throwable
	{
		
		pt.productsearch();
	
	}
	@Test(priority = 5)
	public void dealofproduct() throws InterruptedException
	{
		pt.dealproduct();
		
	}
	@Test(priority = 2)
	public void producthome()
	{
		pt.homeproduct();
	}
	@AfterMethod
	public void teardown() 
	{
		driver.close();
		
	}
	
}
