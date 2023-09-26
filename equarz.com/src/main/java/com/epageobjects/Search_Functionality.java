package com.epageobjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebase.Testbase;

public class Search_Functionality  extends Testbase{
	
	@FindBy(xpath="//input[@class='form-control appended-form-control search-bar-input']")
	WebElement search;
	@FindBy(xpath="//ul[@class='list-group list-group-flush']")
	WebElement searchdd;
	
	public Search_Functionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void searchbar() 
	{
		search.sendKeys("pendrive");
		search.sendKeys(Keys.ENTER);
	}
	public void searchdropdown() {
		String optiontoselect="Mouse Hp";
		
		search.sendKeys("mous");
		List<WebElement> optionlist;
				
	}
	

}
