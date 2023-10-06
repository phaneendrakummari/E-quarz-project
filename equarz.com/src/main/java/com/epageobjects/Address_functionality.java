package com.epageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebase.Testbase;

public class Address_functionality  extends Testbase{
	
	@FindBy(xpath="//div[@class='navbar-tool-icon-box bg-secondary']")
	WebElement profile;
	@FindBy(xpath="//a[@href='http://e-quarz.com/account-oder'] ")
	WebElement myorder;
	@FindBy(xpath="//a[@href='http://e-quarz.com/account-address']")
	WebElement address;
	@FindBy(id="add_new_address")
	WebElement addnewaddress;
	@FindBy(id="name")
	WebElement personname;
	@FindBy(id="phone")
	WebElement phone;
	@FindBy(id="address-city")
	WebElement city;
	@FindBy(id="zip")
	WebElement zip;
	@FindBy(xpath="//div[@class='filter-option-inner-inner']")
	WebElement country;
	@FindBy(xpath="//input[@role='textbox']")
	WebElement searchbox;
	@FindBy(xpath="//span[text()='India']")
	WebElement india;
	@FindBy(id="address")
	WebElement Homeaddress;
	@FindBy(xpath="//button[text()='Add Informations  ']")
	WebElement addinformation;
	
	//DeLETE ADDRESS
	@FindBy(xpath="(//i[@class='fa fa-trash fa-lg'])[7]")
	WebElement deleteicon;
	
	//..EDIT ADDRESS
	@FindBy(xpath="//a[@href='http://e-quarz.com/account-address-edit/7']")
	WebElement editbutton;
	@FindBy(id="person_name")
	WebElement namee;
	@FindBy(id="own_phone")
	WebElement ownphone;
	@FindBy(xpath="//div[@class='filter-option-inner-inner']")
	WebElement countryedit;
	@FindBy(xpath="//input[@role='textbox']")
	WebElement searchedit;
	@FindBy(xpath="//span[text()='India']")
	WebElement indiaedit;
	@FindBy(id="address")
	WebElement editedadd;
	@FindBy(xpath="//button[@class='btn btn--primary'] ")
	WebElement update;
	
	
	public Address_functionality(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void newaddress(String contactname,String phonenum,String citycode,String zipcode,String addresses) 
	{
		Actions act = new Actions(driver);
		act.moveToElement(profile).build().perform();
		myorder.click();
		address.click();
		addnewaddress.click();
		personname.sendKeys(contactname);
		phone.sendKeys(phonenum);
		city.sendKeys(citycode);
		zip.sendKeys(zipcode);
		country.click();
		searchbox.sendKeys("ind");
		india.click();
		Homeaddress.sendKeys(addresses);
		addinformation.click();
		
		//return new Homepage();
		
	}
	public void deleteaddress() 
	{
		Actions act = new Actions(driver);
		act.moveToElement(profile).build().perform();
		myorder.click();
		address.click();
		//addnewaddress.click();
		deleteicon.click();
		Alert ale = driver.switchTo().alert();
		ale.accept();
	}
	public void editaddress() 
	{
		Actions act = new Actions(driver);
		act.moveToElement(profile).build().perform();
		myorder.click();
		address.click();
		editbutton.click();
		namee.clear();
		namee.sendKeys("PhaneendraK");
		ownphone.clear();
		ownphone.sendKeys("9550230737");
		countryedit.click();
		searchedit.sendKeys("ind");
		indiaedit.click();
		editedadd.clear();
		editedadd.sendKeys("Nandyal AP");
		update.click();
	}

}
