package Smoke_Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.browserstack.local.Local;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import BaseUtilities.AlertBox;
import BaseUtilities.Chrome2;
import BaseUtilities.CsR;
import BaseUtilities.ExtentFactory;
import BaseUtilities.TakeScreenShot;
import PageFactory.Client.Client_AddToBasketPage;
import PageFactory.Client.Client_BillingPage;
import PageFactory.Client.Client_CertificateDetailsPage;
import PageFactory.Client.Client_CertificateValidationPage;
import PageFactory.Client.Client_DomainNamesEditPage;
import PageFactory.Client.Client_EditUserPage;
import PageFactory.Client.Client_IssuedCertificatesPage;
import PageFactory.Client.Client_LoginPage;
import PageFactory.Client.Client_MyProductsPage;
import PageFactory.Client.Client_MySslDashBoard;
import PageFactory.Client.Client_MyUsersPage;
import PageFactory.Client.Client_NavigationLinks;
import PageFactory.Client.Client_NewUserPage;
import PageFactory.Client.Client_PendingCertificatesPage;
import PageFactory.Client.Client_RegisterDomainPage;
import PageFactory.Client.Client_ShoppingBasketPage;
import PageFactory.Client.Client_ViewOrderPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
/*import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
*/
//import BaseUtilities.AlertBox;
//import BaseUtilities.Chrome2;
//import BaseUtilities.CsR;
//import BaseUtilities.ExtentFactory;
//import BaseUtilities.TakeScreenShot;
//import PageFactory.Client.Client_AddToBasketPage;
//import PageFactory.Client.Client_BillingPage;
//import PageFactory.Client.Client_CertificateDetailsPage;
//import PageFactory.Client.Client_CertificateValidationPage;
//import PageFactory.Client.Client_DomainNamesEditPage;
//import PageFactory.Client.Client_EditUserPage;
//import PageFactory.Client.Client_IssuedCertificatesPage;
//import PageFactory.Client.Client_LoginPage;
//import PageFactory.Client.Client_MyProductsPage;
//import PageFactory.Client.Client_MySslDashBoard;
//import PageFactory.Client.Client_MyUsersPage;
//import PageFactory.Client.Client_NavigationLinks;
//import PageFactory.Client.Client_NewUserPage;
//import PageFactory.Client.Client_PendingCertificatesPage;
//import PageFactory.Client.Client_RegisterDomainPage;
//import PageFactory.Client.Client_ShoppingBasketPage;
//import PageFactory.Client.Client_ViewOrderPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	static WebDriver driver;
	private Local l;
	
	ExtentReports report;
	ExtentTest test;
	Client_LoginPage 	LoginPageElements;
	Client_BillingPage BillingPageElements;
	Client_MySslDashBoard sslDashBoardElements;
	CsR CsrElements;
	Client_NavigationLinks NavigationElements;
	AlertBox AlertBoxElements;
	TakeScreenShot ScreenShot;
	Client_IssuedCertificatesPage IssuedCertificatesPageElements;
	Client_CertificateDetailsPage CertificateDetailsPageElements;
	Client_MyProductsPage MyProductsPageElements;
	Client_AddToBasketPage AddToBasketPageElements;
	Client_ShoppingBasketPage  ShoppingBasketPageElements;
	Client_ViewOrderPage ViewOrderPageElements;
	Client_CertificateValidationPage CertificateValidationPageElements;
	Client_PendingCertificatesPage PendingCertificatesPageElements;
	Client_MyUsersPage MyUsersPageElements;
	Client_NewUserPage NewUserPageElements;
	Client_EditUserPage EditUserPageElements;
	Client_RegisterDomainPage RegisterDomainPageElements;
	Client_DomainNamesEditPage DomainNamesEditPageElements;
	
	@Before
	public void LoadElements(Scenario scenario) throws Exception {
		
/*	   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-2.exe");
	   //driver = new ChromeDriver();  
	   //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		  
	   ChromeOptions o = new ChromeOptions();
	   o.addArguments("disable-extensions");
	   o.addArguments("--start-maximized");
	   driver = new ChromeDriver(o);
*/		
		
        String USERNAME = System.getenv("developmentteam12");
        String ACCESS_KEY = System.getenv("AKNscSG2dLkmDUkzTRyJ");
        String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@hub.browserstack.com/wd/hub";

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", System.getProperty("browser"));

        if (System.getProperty("local") != null && System.getProperty("local").equals("true")) {
            caps.setCapability("browserstack.local", "true");
            l = new Local();
            Map<String, String> options = new HashMap<String, String>();
            options.put("key", ACCESS_KEY);
            l.start(options);
        }		
		
	   report = ExtentFactory.getInstance(); 
	   LoginPageElements = new Client_LoginPage(driver);
	   BillingPageElements = new Client_BillingPage(driver);
	   sslDashBoardElements = new Client_MySslDashBoard(driver);
	   CsrElements = new CsR(driver);
	   NavigationElements = new Client_NavigationLinks(driver);
	   AlertBoxElements = new AlertBox(driver);
	   IssuedCertificatesPageElements = new Client_IssuedCertificatesPage(driver);
	   CertificateDetailsPageElements = new Client_CertificateDetailsPage(driver);
	   ScreenShot = new TakeScreenShot();
	   MyProductsPageElements = new Client_MyProductsPage (driver);
	   AddToBasketPageElements = new Client_AddToBasketPage (driver);
	   ShoppingBasketPageElements = new Client_ShoppingBasketPage (driver);
	   ViewOrderPageElements = new Client_ViewOrderPage(driver);
	   CertificateValidationPageElements = new Client_CertificateValidationPage(driver);
	   PendingCertificatesPageElements = new Client_PendingCertificatesPage(driver);
	   MyUsersPageElements = new Client_MyUsersPage(driver);
	   NewUserPageElements = new Client_NewUserPage(driver);
	   EditUserPageElements = new Client_EditUserPage(driver);
	   RegisterDomainPageElements = new Client_RegisterDomainPage(driver);
	   DomainNamesEditPageElements = new Client_DomainNamesEditPage(driver);
		 
		//LoginPageElements.ClientLogin();
		

		  
		  
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	   Thread.sleep(5000);		
	}
	
	@After
	public void Logout () throws Exception {

		driver.navigate().refresh();

		Thread.sleep(1000);
		report.endTest(test);
		report.flush();
				 
		driver.quit();
		if (l != null) l.stop();
		
	}

	@Given("^Client is on Home Page$")
	public void Client_is_on_Home_Page() throws Exception {
		
		  report = ExtentFactory.getInstance3();
		  
		  test = report.startTest("Registered User Test --> User Login- " + "Valid Credentials");
		  
		  //LoginPageElements.LoadLoginPage();
		  new Client_LoginPage(driver).LoadLoginPage();
		  Thread.sleep(1000);
		  test.log(LogStatus.INFO, "Browser Opened and Url Entered");
		  test.log(LogStatus.INFO, "Login Page Loaded");
		
	}

	@When("^Client enters Username and Password$")
	public void Client_enters_Username_and_Password() throws InterruptedException {
		
		  LoginPageElements.ClickLoginLink();
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  test.log(LogStatus.INFO, "Clicked Login Link");
		  
		  LoginPageElements.EnterUserName("qa@ssl247.co.uk");
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  test.log(LogStatus.INFO, "Entereed Valid UserName");
		  
		  LoginPageElements.EnterPassword("Test1234");
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  test.log(LogStatus.INFO, "Entered Valid Password");
		
		Thread.sleep(1000);
	}

	@When("^Clicks Login button$")
	public void clicks_Login_button() throws InterruptedException {
		
		  LoginPageElements.ClickLoginButton();
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  test.log(LogStatus.INFO, "Clicked Login Link");
		
		Thread.sleep(3000);
	}

	@Then("^Myssl Dashboard is opened$")
	public void Myssl_Dashboard_is_opened() throws Exception {
		
		  try {
				
				 
			 if(driver.getTitle().contains("MySSL® » Dashboard")){
				 
				 System.out.println("Admin User Logged In");
				 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			 	 test.log(LogStatus.PASS, "Admin User Logged In");
				 String path2 = ScreenShot.Image(driver, "Logout");
				 String imagePath2 = test.addScreenCapture(path2);
				 test.log(LogStatus.INFO, imagePath2);
				 
				 LoginPageElements.ClickLogoutButton();
				 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				 
			 }else {
				 
				 System.out.println("Dashboard Page NOT Opened");
				 System.out.println("Title Page Displayed Is:- "+ driver.getTitle());
			 	 test.log(LogStatus.FAIL, "Dashboard Page NOT Opened");
			 	 
			 }
			  
			}catch(Exception e) {
				
				test.log(LogStatus.FAIL, "Element Not Found");
				test.log(LogStatus.INFO, e);
				System.out.println("Element Not Found");
				String path2 = ScreenShot.Image(driver, "Element");
				String imagePath2 = test.addScreenCapture(path2);
				test.log(LogStatus.INFO, imagePath2);
				report.endTest(test);
				report.flush();
				System.out.println("Exception" + e);
				Assert.fail("Exception " + e);
			
				}
	}

  

}
