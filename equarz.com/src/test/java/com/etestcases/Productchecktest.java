package com.etestcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ebase.Testbase;
import com.epageobjects.Login_functionality;
import com.epageobjects.ProductCheck;

public class Productchecktest extends Testbase {
	
	ProductCheck pc;
	Login_functionality lf;
	
	public Productchecktest() {
		 super();
		 
	}
	@BeforeClass
	public void initilaize() throws Throwable {
		setup();
		lf=new Login_functionality(driver);
		lf.validatelogin(props.getProperty("username"),props.getProperty("password"));
		pc=new ProductCheck(driver);
	}
	@Test
	public void productbuy() throws Throwable 
	{
		pc.productbuy();
	}
	

}
