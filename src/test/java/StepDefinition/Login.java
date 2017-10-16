package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

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


	@Given("^Users is on Home Page$")
	public void user_is_on_Home_Page() {
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-2.exe");
		//driver = new ChromeDriver();  
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		  
		ChromeOptions o = new ChromeOptions();
		o.addArguments("disable-extensions");
		o.addArguments("--start-maximized");
		driver = new ChromeDriver(o);
		String baseURL = "http://www.letskodeit.com/";
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.get(baseURL);
	}

	@When("^Users enters Username and Password$")
	public void user_enters_Username_and_Password() throws InterruptedException {
		
		WebElement signupLink = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
		signupLink.click();		
		WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
		loginLink.click();
		WebElement emailField = driver.findElement(By.xpath("//div[@id='memberLoginDialogemail']//input"));
		emailField.sendKeys("test@email.com");
		WebElement passwordField = driver.findElement(By.xpath("//div[@id='memberLoginDialogpassword']//input"));
		passwordField.sendKeys("abcabc");
		
		Thread.sleep(1000);
	}

	@When("^Clicks Go button$")
	public void clicks_Go_button() throws InterruptedException {
		WebElement goButton = driver.findElement(By.id("memberLoginDialogoklink"));
		goButton.click();
		
		Thread.sleep(3000);
	}

	@Then("^He can visit the practice page$")
	public void he_can_visit_the_practice_page() {
		WebElement practicePage = driver.findElement(By.id("DrpDwnMn05label"));
		practicePage.click();
	}

	@Then("^A message is displayed$")
	public void a_message_is_displayed() {
		System.out.println("Login Successful");
	}
    

}
