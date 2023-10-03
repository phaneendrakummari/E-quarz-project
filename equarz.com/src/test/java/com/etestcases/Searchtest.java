package com.etestcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebase.Testbase;
import com.epageobjects.Login_functionality;
import com.epageobjects.Search_Functionality;

public class Searchtest extends Testbase{
	
	Search_Functionality sf;
	Login_functionality lg;
	
	public Searchtest() 
	{           
		super();
	}
	@BeforeMethod
	public void initialize() throws Throwable 
	{
		setup();
		lg=new Login_functionality(driver);
		lg.validatelogin(props.getProperty("username"),props.getProperty("password"));
		sf=new Search_Functionality(driver);
	}
	@Test
	public void search() 
	{
		sf.searchbar();
	}

}
