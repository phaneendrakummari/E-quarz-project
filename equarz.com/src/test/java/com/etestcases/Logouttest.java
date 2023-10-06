package com.etestcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ebase.Testbase;
import com.epageobjects.Login_functionality;
import com.epageobjects.Logout_functionality;

public class Logouttest extends Testbase{
	
	Logout_functionality log;
	Login_functionality lf;
	
	public Logouttest() {
		super();
	}
	@BeforeClass
	public void initialize() throws Throwable {
		setup();
	  	  lf=new Login_functionality(driver);
	  	  lf.validatelogin(props.getProperty("username"),props.getProperty("password"));
	  	  log=new Logout_functionality(driver);
	}
	@Test
	public void LOGOUT()
	{
		log.Logout();
		
	}
	@Test
	public void Refresh() 
	{
		log.REFresh();
	}

}
