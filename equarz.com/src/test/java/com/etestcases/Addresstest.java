package com.etestcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ebase.Testbase;
import com.epageobjects.Address_functionality;
import com.epageobjects.Login_functionality;
import com.eutils.Utilsfile;


public class Addresstest extends Testbase{
	
	Address_functionality af;
	Login_functionality lg;
	private final String sheetname="dataaddress";
	
	public Addresstest()
	{
		super();
	}
	@DataProvider
	public String[][] dataaddress() throws Throwable {
		
		return  Utilsfile.readdata(sheetname);
		
	}
	@BeforeClass
    public void login() throws Throwable 
	{
		setup();
  	  lg=new Login_functionality(driver);
  	  lg.validatelogin(props.getProperty("username"),props.getProperty("password"));
  	  af=new Address_functionality(driver);
	}
	@Test(dataProvider = "dataaddress", dataProviderClass = Addresstest.class , description = "New address added successfuly")
	public void AddressNew(String conname,String mobile,String cityy,String zzipcode,String Addresses) 
	{
		af.newaddress(conname,mobile,cityy,zzipcode,Addresses);
	}
	@Test
	public void Deleteaddress() 
	{
		af.deleteaddress();
	}
    @Test 
    public void EditAddress()
    {
    	af.editaddress();
    }
    @AfterMethod
    public void teardown()
    {
    	driver.quit();
    }
}
