package com.etestcases;

import org.openqa.selenium.WebDriver;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTPageSetup;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebase.Testbase;
import com.epageobjects.Signupfunctionality;
import com.eutils.Utilsfile;



public class Signuptest extends Testbase{
	
	Signupfunctionality sf;
	//WebDriver driver;
	
	public Signuptest()
	{
		super();
	}
    @BeforeMethod
    public void initialize() {
    	
    	setup();
    	sf= new Signupfunctionality(driver);	
    }
    @Test(priority = 1)
    public void testurl() 
    {
    	
    	String testurl = driver.getCurrentUrl();
    	Assert.assertEquals("http://e-quarz.com/customer/auth/sign-up", testurl);
    }
    
    @Test(priority = 2,dataProvider = "setdata", dataProviderClass = Utilsfile.class)
    public void registersignup(String frst ,String last, String email, String phone, String pass, String copass ) throws Throwable {
    	
    	sf.verifysignup(frst, last, email, phone, pass, copass);
    }
    
}
