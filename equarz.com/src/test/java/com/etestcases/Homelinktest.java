package com.etestcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
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
      @BeforeClass
      public void login() throws Throwable 
      {
    	  
    	  setup();
    	  lg=new Login_functionality(driver);
    	  lg.validatelogin(props.getProperty("username"),props.getProperty("password"));
    	  
      }
      @BeforeMethod
      public void initialize() throws Throwable
      {
//    	  setup();
//    	  lg=new Login_functionality(driver);
//    	  lg.validatelogin(props.getProperty("username"),props.getProperty("password"));
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
      @Test 
      public void TopRated() {
    	  hl.toprated();
      }
      @Test
      public void Profile() {
    	  hl.profile();
      }
      @Test
      public void TrackOrder() {
    	  hl.ordertrack();
      }
      @Test 
      public void Refundpolicy() {
    	  hl.policyrefund();
      }
      @Test 
      public void Returnpolicy() {
    	  hl.policyreturn();
    	  
      }
      @Test
      public void Cancelation() {
    	  hl.cancel();
      }
      @Test 
      public void SupportTicket() {
    	  hl.ticket();
      }
      @Test
      public void AboutCompany() {
    	  hl.Company();
      }
      @Test
      public void Contactus() {
    	  hl.AboutUS();
      }
      @Test
      public void Helptopic() {
    	  hl.Help();
      }
      @Test
      public void twitter() {
    	  hl.Twiter();
      }
      @Test
      public void Linkeidn() {
    	  hl.linkedin();
      }
      @Test
      public void Instagram() {
    	  hl.insta();
      }
      @Test
      public void FaceBook() {
    	  hl.facebok();
      }
      @Test 
      public void Pininterst() {
    	  hl.pininterst();
      }
      @Test
      public void Googleplus() {
    	  hl.googlepluss();
      }
}
