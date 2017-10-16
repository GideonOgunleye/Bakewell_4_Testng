package TestRunner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;		


//@RunWith(Cucumber.class)

//@CucumberOptions(features="src/test/java/features",
//@CucumberOptions(features="features",
//plugin = {"pretty", "html:target/cucumber-html-report"},
//glue={"Sanity_Test"}
//tags={"@Login"}
@CucumberOptions (
		monochrome = true,
		features = "src/test/java/features", 
		//format={"pretty", "json:target/report.json"},
		plugin = {"pretty", "html:target/cucumber-html-report"},
		glue = "Smoke_Test",
		tags = "@Login"
)
		
@Test 
public class Runner extends AbstractTestNGCucumberTests {
	
	public WebDriver driver;
	
	@BeforeClass ()
	  public void beforeTest() throws IOException  {
		
	 	 
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-2.exe");
		  //driver = new ChromeDriver();  
		  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		  
		  ChromeOptions o = new ChromeOptions();
		  o.addArguments("disable-extensions");
		  o.addArguments("--start-maximized");
		  driver = new ChromeDriver(o);
		  
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
	  }

	  @AfterClass ()
	  public void afterTest() throws Exception {
		  
		  Thread.sleep(1000);
			 //report.endTest(test);
			 
		driver.quit();

		  
	  }

}
