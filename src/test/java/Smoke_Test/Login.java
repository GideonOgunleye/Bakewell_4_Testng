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
import org.testng.annotations.Test;

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

public class Login extends Chrome2 {
	
	//static WebDriver driver;
	//private Local l;
	
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
	
	@BeforeMethod (groups = {"Sanity","Smoke","BS_Smoke","BS_Sanity","Sanity_Chrome"})
	public void LoadElements() throws Exception {
		
/*	   System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-2.exe");
	   //driver = new ChromeDriver();  
	   //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		  
	   ChromeOptions o = new ChromeOptions();
	   o.addArguments("disable-extensions");
	   o.addArguments("--start-maximized");
	   driver = new ChromeDriver(o);
*/		
	   //LoginPageElements.ClientLogin();
	   
	   report = ExtentFactory.getInstance(); 
	   LoginPageElements = new Client_LoginPage(eDriver);
	   BillingPageElements = new Client_BillingPage(eDriver);
	   sslDashBoardElements = new Client_MySslDashBoard(eDriver);
	   CsrElements = new CsR(eDriver);
	   NavigationElements = new Client_NavigationLinks(eDriver);
	   AlertBoxElements = new AlertBox(eDriver);
	   IssuedCertificatesPageElements = new Client_IssuedCertificatesPage(eDriver);
	   CertificateDetailsPageElements = new Client_CertificateDetailsPage(eDriver);
	   ScreenShot = new TakeScreenShot();
	   MyProductsPageElements = new Client_MyProductsPage (eDriver);
	   AddToBasketPageElements = new Client_AddToBasketPage (eDriver);
	   ShoppingBasketPageElements = new Client_ShoppingBasketPage (eDriver);
	   ViewOrderPageElements = new Client_ViewOrderPage(eDriver);
	   CertificateValidationPageElements = new Client_CertificateValidationPage(eDriver);
	   PendingCertificatesPageElements = new Client_PendingCertificatesPage(eDriver);
	   MyUsersPageElements = new Client_MyUsersPage(eDriver);
	   NewUserPageElements = new Client_NewUserPage(eDriver);
	   EditUserPageElements = new Client_EditUserPage(eDriver);
	   RegisterDomainPageElements = new Client_RegisterDomainPage(eDriver);
	   DomainNamesEditPageElements = new Client_DomainNamesEditPage(eDriver);
		   
	   eDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	   Thread.sleep(5000);		
	}
	
	@AfterMethod (groups = {"Sanity","Smoke","BS_Smoke","BS_Sanity","Sanity_Chrome"})
	public void Logout () throws Exception {

		eDriver.navigate().refresh();

		Thread.sleep(1000);
		report.endTest(test);
		report.flush();
				 
		eDriver.quit();
		//if (l != null) l.stop();
		
	}

	@Test (groups = {"Sanity","Smoke","BS_Smoke","BS_Sanity","Sanity_Chrome"})
	public void Login_Validation() throws Exception {
		
		  report = ExtentFactory.getInstance3();
		  
		  test = report.startTest("Registered User Test --> User Login- " + "Valid Credentials");
		  
		  LoginPageElements.LoadLoginPage();
		  //new Client_LoginPage(driver).LoadLoginPage();
		  Thread.sleep(1000);
		  test.log(LogStatus.INFO, "Browser Opened and Url Entered");
		  test.log(LogStatus.INFO, "Login Page Loaded");
		  
		  LoginPageElements.ClickLoginLink();
		  eDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  test.log(LogStatus.INFO, "Clicked Login Link");
		  
		  LoginPageElements.EnterUserName("qa@ssl247.co.uk");
		  eDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  test.log(LogStatus.INFO, "Entereed Valid UserName");
		  
		  LoginPageElements.EnterPassword("Test1234");
		  eDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  test.log(LogStatus.INFO, "Entered Valid Password");
		  
		  Thread.sleep(1000);
		  
		  LoginPageElements.ClickLoginButton();
		  eDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  test.log(LogStatus.INFO, "Clicked Login Link");
		
		  Thread.sleep(3000);
		
	}


}
