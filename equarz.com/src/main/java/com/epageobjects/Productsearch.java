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
	
	@FindBy(xpath="//button[@class='buy_btn']")                             //From Deal of the Day 
	WebElement dealbutton;
	
	@FindBy(xpath="(//a[@href='http://e-quarz.com/product/furlay-foldable-recliner-easy-chair-for-home-use-multi-position-with-arm-rest-locking-system-jet-blackmetal-aFTtLO'])[1]")       //From Homeproduct 
	WebElement homeproduct;
	
	@FindBy(xpath="//div[text()='Successfully added!']")
	WebElement successful;
	
	public Productsearch( WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public Homepage cateogoryproduct() throws Throwable {
		
		popupclose.click();
		Actions act = new Actions(driver);
		act.moveToElement(catbooks).build().perform();
		subbooks.click();
		selbook.click();
		addtocart.click();
		return new Homepage();
	}
      public void banerproduct() 
      {
    	  popupclose.click();
    	  banner.click();
    	  coat.click();
    	  addtocart.click();    	 
      }
      public void productsearch() throws Throwable 
      {
    	  popupclose.click();
    	  search.sendKeys(props.getProperty("searchproduct"));
    	  searchbtn.click();
    	  
      }
      public void dealproduct() throws InterruptedException 
      {
    	  popupclose.click();
    	  Thread.sleep(2000);
    	  JavascriptExecutor js = (JavascriptExecutor) driver;
    	  js.executeScript("window.scrollBy(0,450)");
    	  dealbutton.click();
    	  addtocart.click();  
      }
      public void homeproduct()
      {
    	  popupclose.click();
    	  JavascriptExecutor js = (JavascriptExecutor) driver;
    	  js.executeScript("window.scrollBy(0,700)");
    	  homeproduct.click();
    	  addtocart.click();
    	  String print= successful.getText();
    	  assertEquals("Successfully added!", print);
    	  
      }
      
      
			}

