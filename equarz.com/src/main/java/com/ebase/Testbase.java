package com.ebase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.eutils.Listenerevent;

public class Testbase {
	
	public FileInputStream file;
	public  Properties props;
	public static WebDriver driver;
	EventFiringWebDriver edriver;
	Listenerevent event;
	
	public Testbase() {
		props = new Properties(); 
		try {
			file = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\equarz.com\\src\\main\\java\\com\\epropertieconfigure\\propfile");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			props.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	 public void setup() {
		 String	browsertype=props.getProperty("browser");
			
			if(browsertype.equalsIgnoreCase("chrome")) {
				//System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				
				 driver = new ChromeDriver();
			}
			else if (browsertype.equalsIgnoreCase("edge")) {
				
				driver = new EdgeDriver();
			}
//			else if (browsertype.equalsIgnoreCase("firefox") {
//				
//				driver = new FirefoxDriver();
//			}
//			edriver = new EventFiringWebDriver(driver);
//			event = new Listenerevent();	
//			edriver.register(event);
//			driver=edriver;
			
			driver.manage().window().maximize();
			driver.get(props.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));	
	 }
	 
	
	

}
