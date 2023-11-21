package com.epageobjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ebase.Testbase;
import com.eutils.Utilsfile;

public class ProductCheck extends Testbase{

	@FindBy(xpath="(//span[@class='w-0 flex-grow-1 pl-3'])[1]")
	WebElement category;                                                    
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
//	@FindBy(xpath="//a[@class='btn btn--primary pull-right']")
//	 WebElement checkout;
	 @FindBy(id="same_as_shipping_address")
	 WebElement address;
	 @FindBy(xpath="//a[@class='btn btn--primary btn-block']")
	 WebElement proceed;
	 @FindBy(xpath="//button[@class='btn btn-block click-if-alone']")
	 WebElement cod;
	 @FindBy(xpath="//h5[@class='font-black __text-20px']")
	 WebElement orderplaced;
	@FindBy(id="signinSrEmail")
	WebElement adminemail;
	@FindBy(id="signupSrPassword")
	WebElement adminpassword;
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement adminsignin;
	@FindBy(xpath="//button[text()='Ok, let me check']")
	WebElement letmecheck;
	@FindBy(xpath="//i[@class='tio-shopping-cart-outlined nav-icon']")
	WebElement orders;
	@FindBy(xpath="//a[@title='Pending']")
	WebElement pending;
	@FindBy(xpath="//input[@id='datatableSearch_']")
	WebElement searchbar;
	@FindBy(xpath="//button[text()='Search']")
	WebElement search;
	
//	@FindBy(xpath="//i[@class='tio-shopping-cart-outlined nav-icon']")
//	WebElement order;
//	@FindBy(xpath="//a[@title='Pending']")
//	WebElement pending;
//	@FindBy(id="datatableSearch_")
//	WebElement datasearch;
//	@FindBy(xpath="//button[text()='Search']")
//	WebElement searchclick;
	@FindBy(xpath="//a[@title='View']")
	WebElement view;
	@FindBy(xpath="//select[@class='status form-control']")
	WebElement status;
	@FindBy(xpath="//button[text()='Yes  Change it!']")
	WebElement change;
	
	@FindBy(xpath="//small[text()='Hello, Jakkam']")
	WebElement dashboard;
	@FindBy(xpath="//a[text()=' My order ']")
	WebElement myorder;
	@FindBy(xpath="//a[text()='Track your order']")
	WebElement track;
	@FindBy(xpath="//input[@name='order_id']")
	WebElement orderid;
	@FindBy(xpath="//input[@name='phone_number']")
	WebElement phno;
	@FindBy(xpath="//button[text()='Track Order']")
	WebElement trackorder;
	@FindBy(xpath="//span[@class='text-uppercase ']")
	WebElement orderstatus;
	
	
	public ProductCheck(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	public void productbuy() throws Throwable {
		
		Actions act = new Actions(driver);
		act.moveToElement(category).build().perform();
		subcategory.click();
		product.click();
		buynowbutton.click();
		uf = new Utilsfile();
		uf.dropdown(shipping,"2");
		checkout.click();
		address.click();
		proceed.click();
		cod.click();
		String print = orderplaced.getText();
		assertEquals("Your order has been placed successfully! !", print);	
		//ADMIN PANEL 
		WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
		newTab.get("http://e-quarz.com/admin/auth/login");
		adminemail.sendKeys("arun@marolix.com");
		adminpassword.sendKeys("Reset@123");
		Thread.sleep(10000);
		adminsignin.click();
		letmecheck.click();
		orders.click();
		pending.click();
		searchbar.sendKeys("100275");
		search.click();
		view.click();
		Select con=new Select(status);
		con.selectByVisibleText(" Confirmed");
		//uf.dropdown(status, "Confirmed");
		change.click();
		String window1=driver.getWindowHandle();
		uf.windowhandles(window1);
		act.moveToElement(dashboard).build().perform();
		myorder.click();
		track.click();
		orderid.sendKeys("100275");
		phno.sendKeys("8106637137");
	    trackorder.click();
	    String text=orderstatus.getText();
	    System.out.println(text);
	    //assertEquals(, null)
	
	}
}
