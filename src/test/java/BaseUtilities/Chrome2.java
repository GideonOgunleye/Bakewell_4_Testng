package BaseUtilities;

import org.testng.annotations.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Chrome2 {
	
	
	protected static WebDriver d ;
	protected EventFiringWebDriver driver;

  @BeforeMethod 
  public void beforeTest() throws IOException  {
	
 	 
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-2.exe");
	  //driver = new ChromeDriver();  
	  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	  
	  ChromeOptions o = new ChromeOptions();
	  o.addArguments("disable-extensions");
	  o.addArguments("--start-maximized");
	  d = new ChromeDriver(o);
	  
	  driver = new EventFiringWebDriver(d);
	  HandleEvents he = new HandleEvents();
	  driver.register(he);
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   
  }

  @AfterMethod 
  public void afterTest() throws Exception {
	  
	  Thread.sleep(1000);
		 //report.endTest(test);
		 
	driver.quit();

	  
  }

 
  
}
