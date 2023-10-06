package com.epageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebase.Testbase;

public class Wishlist extends Testbase {
	
	int i,j;
	
	@FindBy(xpath=" (//span[text()='Books'])[1]")
	WebElement category;
	@FindBy(xpath="(//span[text()='School text books'])[1]")                    //FROM CATEGORY
	WebElement subcat;
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/ncert-text-bookexemplar-problems-solutions-mathematics-class-10-8C8xbH']")
	WebElement book;
	@FindBy(xpath="//button[@class='btn __text-18px text-danger'] ")
	WebElement wishlist;
	@FindBy(xpath="//span[@class='countWishlist']")
	WebElement countlist;
	
	@FindBy(xpath="//span[@class='carousel-control-next-icon']")
	WebElement sidearrow;
	@FindBy(xpath="(//img[@class='d-block w-100 __slide-img'])[2]")
	WebElement banner;
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/selvia-women-dress-isfrnK']")
	WebElement dress;
	
	@FindBy(xpath="//input[@class='form-control appended-form-control search-bar-input']")
	WebElement search;
	@FindBy(xpath="//button[@class='input-group-append-overlay search_button']")               //SEARCHWISLIST
	WebElement searchbtn;
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/gem-190-l-2-star-direct-cool-single-door-refrigerator-grdn-2102cmbtv-camelot-blue-2022-model-SyTbcW']")
	WebElement product;
	
	@FindBy(xpath="(//a[@href='http://e-quarz.com/product/esd-safe-pcb-magazine-rack-ByUIpG'])[1]")
	WebElement homeproduct;
	//@FindBy()
	
	@FindBy(xpath="//a[@href='http://e-quarz.com/wishlists']")
	WebElement wishlistremove;
	@FindBy(xpath="//i[@class='czi-close-circle']")
	WebElement cancelbutton;
	@FindBy(xpath="//div[text()='Product has been remove from wishlist!']")
	WebElement textmsg;
	
	public Wishlist (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public void categorylist () 
	{
	    String str=countlist.getText();
	    i=Integer.parseInt(str);
	    i+=0;
		Actions act = new Actions(driver);
		act.moveToElement(category).build().perform();
		subcat.click();
		book.click();
		wishlist.click();
		String str1=countlist.getText();
		j=Integer.parseInt(str1);
		assertEquals(i, j);
	}
	public void bannerlist() {
		sidearrow.click();
		banner.click();
		dress.click();
		wishlist.click();
	}
	public void searchlist() 
	{
		search.sendKeys("refrigerator");
		searchbtn.click();
		product.click();
		wishlist.click();
	}
	public void homelist() 
	{
		
	  JavascriptExecutor js = (JavascriptExecutor) driver;
  	  js.executeScript("window.scrollBy(0,550)");
  	  homeproduct.click();
  	  wishlist.click();
	}
	public void removelist() 
	{
		wishlistremove.click();
		cancelbutton.click();
		String message = textmsg.getText();
		assertEquals("Product has been remove from wishlist!",message);
	}

}
