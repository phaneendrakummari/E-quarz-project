package com.etestcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ebase.Testbase;
import com.epageobjects.Login_functionality;
import com.epageobjects.Myprofile;

public class Myprofiletest extends Testbase{
	
	Myprofile mp;
	Login_functionality lg;
	
	public Myprofiletest() {
		super();
	}
	@BeforeClass
	public void initialize() throws Throwable {
		setup();
	  	  lg=new Login_functionality(driver);
	  	  lg.myprofilepic();
	  	  mp=new Myprofile(driver);
	}
	@Test
	public void Profilepic() throws Throwable 
	{
		mp.Profilefun();
	}
	@Test
	public void editprofilepic() throws Throwable 
	{
		mp.editpic();
	}
	

}
