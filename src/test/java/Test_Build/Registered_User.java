package Test_Build;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import BaseUtilities.AlertBox;
import BaseUtilities.Chrome2;
import BaseUtilities.CsR;
import BaseUtilities.TakeScreenShot;
import PageFactory.Client.Client_AccountEndUsersPage;
import PageFactory.Client.Client_AddAccountPage;
import PageFactory.Client.Client_AddToBasketPage;
import PageFactory.Client.Client_BillingPage;
import PageFactory.Client.Client_CertificateDetailsPage;
import PageFactory.Client.Client_CertificateValidationPage;
import PageFactory.Client.Client_CertificatesPage;
import PageFactory.Client.Client_ClientAccountsPage;
import PageFactory.Client.Client_CodeSigningCertsValidationPage;
import PageFactory.Client.Client_DomainNamesEditPage;
import PageFactory.Client.Client_EditUserPage;
import PageFactory.Client.Client_IncompleteCertificatesPage;
import PageFactory.Client.Client_IncompleteCodeSigningCertsPage;
import PageFactory.Client.Client_IncompleteSmimePage;
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
import PageFactory.Client.Client_SmimeValidationPage;
import PageFactory.Client.Client_ViewOrderPage;
//import org.json.simple.parser.JSONParser;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

//import org.testng.annotations.BeforeMethod;

public class Registered_User extends Chrome2  {
	
	AlertBox	AlertBoxElements;
	ExtentReports report;
	ExtentTest test;
	TakeScreenShot ScreenShot;
	CsR CsrElements;
	Client_AccountEndUsersPage	Client_AccountEndUsersPageElements;
	Client_AddAccountPage	Client_AddAccountPageElements;
	Client_AddToBasketPage	Client_AddToBasketPageElemnts;
	Client_BillingPage	Client_BillingPageElements;
	Client_CertificateDetailsPage	Client_CertificateDetailsPageElements;
	Client_CertificatesPage	Client_CertificatesPageElements;
	Client_CertificateValidationPage	Client_CertificateValidationPageElements;
	Client_ClientAccountsPage	Client_ClientAccountsPageElements;
	Client_CodeSigningCertsValidationPage	Client_CodeSigningCertsValidationPageElements;
	Client_DomainNamesEditPage	Client_DomainNamesEditPageElements;
	Client_EditUserPage	Client_EditUserPageElements;
	Client_IncompleteCertificatesPage	Client_IncompleteCertificatesPageElements;
	Client_IncompleteCodeSigningCertsPage	Client_IncompleteCodeSigningCertsPageElements;
	Client_IncompleteSmimePage	Client_IncompleteSmimePageElements;
	Client_IssuedCertificatesPage	Client_IssuedCertificatesPageElements;
	Client_LoginPage	Client_LoginPageElements;
	Client_MyProductsPage	Client_MyProductsPageElements;
	Client_MySslDashBoard	Client_MySslDashBoardElements;
	Client_MyUsersPage	Client_MyUsersPageElements;
	Client_NavigationLinks	Client_NavigationLinksElements;
	Client_NewUserPage	Client_NewUserPageElements;
	Client_PendingCertificatesPage	Client_PendingCertificatesPageElements;
	Client_RegisterDomainPage	Client_RegisterDomainPageElements;
	Client_ShoppingBasketPage	Client_ShoppingBasketPageElements;
	Client_SmimeValidationPage	Client_SmimeValidationPageElements;
	Client_ViewOrderPage	Client_ViewOrderPageElements;

	
	@BeforeMethod (groups = {"Sanity","Smoke","BS_Smoke","BS_Sanity","BS_Sanity","BS_DailySanity","Smoke_Firefox","Smoke_Chrome","Sanity_Chrome"})
	public void Login () throws Exception {
		
	
	}

	
	@AfterMethod (groups = {"Sanity","Smoke","BS_Smoke","BS_Sanity","BS_DailySanity", "BS_Sanity","Smoke_Firefox","Smoke_Chrome","Sanity_Chrome"}, alwaysRun = true)
	public void Logout (ITestResult result) throws Exception {


		
	}
	
}
