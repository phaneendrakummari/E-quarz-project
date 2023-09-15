package com.epageobjects;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ebase.Testbase;

public class Productsearch extends Testbase{
	
	@FindBy(xpath="//button[@class='close __close']")
	WebElement popupclose;                                                                
	
	@FindBy(xpath=" (//span[text()='Books'])[1]")
	WebElement catbooks;
	
	@FindBy(xpath="(//span[text()='School text books'])[1]")                    //FROM CATEGORY
	WebElement subbooks;
	
	@FindBy(xpath="(//div[@class='single-product-details'])[2]")
	WebElement selbook;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addtocart;
	
	@FindBy(xpath="(//img[@class='d-block w-100 __slide-img'])[1]")             //FROM BANNER 
	WebElement banner;
	
	@FindBy(xpath="(//a[@href='http://e-quarz.com/product/dhingra-mens-slim-fit-tuxedo-3pcs-suit-coat-pant-and-waistcoat-InysDn'])[1]")
    WebElement coat;
	
	@FindBy(xpath="//input[@class='form-control appended-form-control search-bar-input']")
	WebElement search;
	
	@FindBy(xpath="//button[@class='input-group-append-overlay search_button']")
	WebElement searchbtn;
	
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/hp-247-g8-laptop-amd-athlon-p-3045b-hd-14-inches355cm-hd-8gb-ram-ddr4-1tb-hddwindows-11-home-w11-sl-one-year-warranty-bl']")
	WebElement laptop;
	
	@FindBy(xpath="//button[@class='buy_btn']")                             //From Deal of the Day 
	WebElement dealbutton;
	
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/cello-13Fe4g']")       //From Homeproduct 
	WebElement homeproduct;                                                   //Home product 
	
	@FindBy(xpath="//div[text()='Successfully added!']")
	WebElement successful;
	
	public Productsearch( WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public Homepage cateogoryproduct() throws Throwable {
		
		//popupclose.click();
		Actions act = new Actions(driver);
		act.moveToElement(catbooks).build().perform();
		subbooks.click();
		selbook.click();
		addtocart.click();
		String print= successful.getText();
  	  assertEquals("Successfully added!", print);
		
		return new Homepage();
	}
      public void banerproduct() 
      {
    	 // popupclose.click();
    	  banner.click();
    	  coat.click();
    	  addtocart.click();   
    	  String print= successful.getText();
    	  assertEquals("Successfully added!", print);
      }
      public Homepage productsearch() throws Throwable 
      {
    	  //popupclose.click();
    	  search.sendKeys("laptop");
    	  searchbtn.click();
    	  laptop.click();
    	  addtocart.click(); 
    	  String print= successful.getText();
    	  assertEquals("Successfully added!", print);
    	 return new Homepage();  
    	 
      }
      public void dealproduct() throws InterruptedException 
      {
    	  //popupclose.click();
    	  Thread.sleep(2000);
    	  JavascriptExecutor js = (JavascriptExecutor) driver;
    	  js.executeScript("window.scrollBy(0,450)");
    	  dealbutton.click();
    	  addtocart.click();
    	  String print= successful.getText();
    	  assertEquals("Successfully added!", print);
      }
      public void homeproduct()
      {
    	 // popupclose.click();
    	  JavascriptExecutor js = (JavascriptExecutor) driver;
    	  js.executeScript("window.scrollBy(0,700)");
    	  homeproduct.click();
    	  addtocart.click();
    	  String print= successful.getText();
    	  assertEquals("Successfully added!", print);
    	  
      }
      
      
			}

