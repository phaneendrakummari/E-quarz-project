package com.epageobjects;

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
	WebElement popclose;                                                                
	
	@FindBy(xpath=" (//span[text()='Books'])[1]")
	WebElement catbooks;
	
	@FindBy(xpath="(//span[text()='School text books'])[1]")                                    // FROM CATEGORY
	WebElement subbooks;
	
	@FindBy(xpath="(//div[@class='single-product-details'])[2]")
	WebElement selbook;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addtocart;
	
	@FindBy(xpath="(//img[@class='d-block w-100 __slide-img'])[1]")                         // FROM BANNER 
	WebElement banner;
	
	@FindBy(xpath="(//a[@href='http://e-quarz.com/product/dhingra-mens-slim-fit-tuxedo-3pcs-suit-coat-pant-and-waistcoat-InysDn'])[1]")
    WebElement coat;
	
	@FindBy(xpath="//input[@class='form-control appended-form-control search-bar-input']")
	WebElement search;
	
	@FindBy(xpath="(//span[@class='input-group-text __text-20px'])[1]")
	WebElement seabutton;
	
	public Productsearch( WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public Homepage catproduct() throws Throwable {
		
		popclose.click();
		Actions act = new Actions(driver);
		act.moveToElement(catbooks).build().perform();
		subbooks.click();
		selbook.click();
		addtocart.click();
//		Thread.sleep(2000);
		return new Homepage();
	}
      public void banproduct() {
    	  
    	  popclose.click();
    	  banner.click();
    	  coat.click();
    	  addtocart.click();

    	 
      }
      public void productsearch() throws Throwable 
      {
    	  
    	  popclose.click();
    	  Thread.sleep(2000);
    	  search.sendKeys(props.getProperty("searchproduct"));
    	  seabutton.click();
    	  
      }
      
			}

