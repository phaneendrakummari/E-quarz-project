package com.epageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebase.Testbase;
import com.eutils.Utilsfile;

public class BuyNow  extends Testbase
{
	
	@FindBy(xpath="(//span[@class='w-0 flex-grow-1 pl-3'])[1]")
	WebElement category;                                                    // FROM CATEGORY BUY NOW PRODUCT
	@FindBy(xpath="//span[text()='Microwave oven']")
	WebElement subcategory;
	@FindBy(xpath="//a[@href='http://e-quarz.com/product/lg-20-l-solo-microwave-oven-ms2043db-black-laymMs']")
	WebElement product;
	@FindBy(xpath="//span[text()='Buy now']")
	WebElement buynowbutton;
	@FindBy(xpath="//select[@class='form-control']")
	WebElement shipping;
	 Utilsfile uf;
	 @FindBy(xpath="//a[@class='btn btn--primary pull-right']")
	 WebElement checkout;
	 @FindBy(id="same_as_shipping_address")
	 WebElement address;
	 @FindBy(xpath="//a[@class='btn btn--primary btn-block']")
	 WebElement proceed;
	 @FindBy(xpath="//button[@class='btn btn-block click-if-alone']")
	 WebElement cod;
	 @FindBy(xpath="//h5[@class='font-black __text-20px']")
	 WebElement orderplaced;
	 
	 //FROM ADD TO CART 
	 
	 @FindBy(xpath="//i[@class='navbar-tool-icon czi-cart']")
	 WebElement cart;
	 @FindBy(xpath="//a[@class='btn btn--primary btn-sm btn-block']")
	WebElement cartcheck;
	 
	public BuyNow(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	public void buynowcategory() 
	{
		Actions act = new Actions(driver);
		act.moveToElement(category).build().perform();
		subcategory.click();
		product.click();
		buynowbutton.click();
		uf=new Utilsfile();
//		String a=props.getProperty("value1");
//		System.out.println(a);
		uf.dropdown(shipping,"2");
		checkout.click();
		address.click();
		proceed.click();
		cod.click();
		String print = orderplaced.getText();
		assertEquals("Your order has been placed successfully! !", print);
	}
	public void buynowcart() throws Throwable 
	{
		Actions act = new Actions(driver);
		act.moveToElement(cart).build().perform();
		cartcheck.click();
		uf.dropdown(shipping, "2");
		checkout.click();
		//Thread.sleep(1000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//  	 js.executeScript("window.scrollBy(0,450)");
		address.click();
		proceed.click();
		cod.click();
	}

}
