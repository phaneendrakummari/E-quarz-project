package com.etestcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

import com.ebase.Testbase;
import com.epageobjects.Login_functionality;
import com.eutils.Utilsfile;

public class Logintest extends Testbase {
	
	Login_functionality lg;
	private final String sheetname="logindata";
	
	public Logintest()
	{
		
		super();
	}
	@DataProvider
	public String[][] logindata() throws Throwable {
		
		return  Utilsfile.readdata(sheetname);
		
	}
	@BeforeMethod
	public void initialize() 
	{
		setup();
		lg = new Login_functionality(driver);
	  
	}
	@Test(dataProvider = "readdata", dataProviderClass = Logintest.class)
	public void verifylogin(String username, String password) throws Throwable 
	{
		
		lg.validatelogin(username,password);
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/",url);
	}

}
