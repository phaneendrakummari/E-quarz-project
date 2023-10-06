package com.epageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebase.Testbase;

public class Myprofile extends Testbase{
	
	
	@FindBy(xpath="//div[@class='navbar-tool-icon-box bg-secondary']")
	WebElement profile;
	@FindBy(xpath="//a[text()=' My profile']")
	WebElement myprofile;
	@FindBy(xpath="//label[@class='spandHeadO m-0']")
	WebElement changeprofile;
	@FindBy(id="f_name")
	WebElement firstname;
	@FindBy(id="l_name")
	WebElement lastname;
	@FindBy(id="phone")
	WebElement phonenum;
	
	public Myprofile(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	public void Profilefun() throws Exception 
	{
		Actions act = new Actions(driver);
		act.moveToElement(profile).build().perform();
		myprofile.click();
		changeprofile.click();
		Robot rb = new Robot();
		rb.delay(5000);
		StringSelection ss= new StringSelection("\"C:\\Users\\Dell\\Downloads\\marolixpic.jfif\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		firstname.clear();
		firstname.sendKeys("KUMMARI");
		 lastname.clear();
		 lastname.sendKeys("Phaneendra");
		 phonenum.clear();
		 phonenum.sendKeys("9550230737");

	}

}
