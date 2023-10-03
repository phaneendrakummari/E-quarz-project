package com.etestcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebase.Testbase;
import com.epageobjects.Login_functionality;
import com.epageobjects.Wishlist;

public class WishlistTest extends Testbase {
	
	Wishlist wl;
	Login_functionality lg;
	
	public WishlistTest() {
		super();
	}
	
	@BeforeMethod
	public void initialize() throws Throwable {
		
		setup();
		lg= new Login_functionality(driver);
		lg.validatelogin(props.getProperty("username"),props.getProperty("password"));
		 wl = new Wishlist(driver);
	}
	@Test
	public void categorywishlist() 
	{
		wl.categorylist();
	}
	@Test
	public void bannerwishlist() 
	{
		wl.bannerlist();
	}
	@Test
	public void searchwishlist() 
	{
		wl.searchlist();
	}
	@Test
	public void homewishlist()
	{
		wl.homelist();
	}  
	@Test
	public void removewlist()
	{
	
		wl.removelist();
//		String message = textmsg.getText();
//		assertEquals("Product has been remove from wishlist!",message);
	}
	

}
