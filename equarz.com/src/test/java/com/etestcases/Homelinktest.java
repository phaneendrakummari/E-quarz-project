package com.etestcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ebase.Testbase;
import com.epageobjects.Homelinks;
import com.epageobjects.Login_functionality;

public class Homelinktest extends Testbase
{
      Homelinks hl;
      Login_functionality lg;
      
      public Homelinktest() 
      {
    	  super();
      }
      @BeforeMethod
      public void initialize() throws Throwable
      {
    	  setup();
    	  lg=new Login_functionality(driver);
    	  lg.validatelogin(props.getProperty("username"),props.getProperty("password"));
    	  hl=new Homelinks(driver);
      }
      @Test
      public void featurproduct()
      {
    	  hl.featureproduct();
      }
      @Test
      public void latstproduct() {
    	  hl.latestproduct();
      }
      @Test
      public void bestselling() {
    	  hl.bestseling();
      }
}
