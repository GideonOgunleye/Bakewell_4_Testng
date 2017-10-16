package Test_Build;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import BaseUtilities.AlertBox;
import BaseUtilities.BrowserStack;
import BaseUtilities.CsR;
import BaseUtilities.ExtentFactory;
import BaseUtilities.TakeScreenShot;
import PageFactory.Admin.Admin_AccountEndUsersPage;
import PageFactory.Admin.Admin_AddAccountPage;
import PageFactory.Admin.Admin_BillingPage;
import PageFactory.Admin.Admin_BulkEditCertContactsPage;
import PageFactory.Admin.Admin_BulkTransferCertsPage;
import PageFactory.Admin.Admin_CertificateDetailsPage;
import PageFactory.Admin.Admin_CertificateValidationPage;
import PageFactory.Admin.Admin_CertificatesPage;
import PageFactory.Admin.Admin_ClientAccountsPage;
import PageFactory.Admin.Admin_CodeSigningCertsValidationPage;
import PageFactory.Admin.Admin_EditUserPage;
import PageFactory.Admin.Admin_IncompleteCertificatesPage;
import PageFactory.Admin.Admin_IncompleteCodeSigningCertsPage;
import PageFactory.Admin.Admin_IncompleteSmimePage;
import PageFactory.Admin.Admin_IssuedCertificatesPage;
import PageFactory.Admin.Admin_LoginPage;
import PageFactory.Admin.Admin_MySslDashBoard;
import PageFactory.Admin.Admin_NavigationLinks;
import PageFactory.Admin.Admin_NewUserPage;
import PageFactory.Admin.Admin_OrdersPage;
import PageFactory.Admin.Admin_OutgoingEmailsLogPage;
import PageFactory.Admin.Admin_PendingCertificatesPage;
import PageFactory.Admin.Admin_ProposalsPage;
import PageFactory.Admin.Admin_SearchCertificatesPage;
import PageFactory.Admin.Admin_ShoppingBasketPage;
import PageFactory.Admin.Admin_SmimeValidationPage;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;


public class Admin_User extends BrowserStack {
	
	AlertBox	AlertBoxElements;
	ExtentReports report;
	ExtentTest test;
	
	TakeScreenShot ScreenShot;
	CsR CsrElements;
	Admin_AccountEndUsersPage	Admin_AccountEndUsersPageElements;
	Admin_AddAccountPage	Admin_AddAccountPageElements;
	Admin_BillingPage	Admin_BillingPageElements;
	Admin_BulkEditCertContactsPage	Admin_BulkEditCertContactsPageElements;
	Admin_BulkTransferCertsPage	Admin_BulkTransferCertsPageElements;
	Admin_CertificateDetailsPage	Admin_CertificateDetailsPageElements;
	Admin_CertificatesPage	Admin_CertificatesPageElements;
	Admin_CertificateValidationPage	Admin_CertificateValidationPageElements;
	Admin_ClientAccountsPage	Admin_ClientAccountsPageElements;
	Admin_CodeSigningCertsValidationPage	Admin_CodeSigningCertsValidationPageElements;
	Admin_EditUserPage	Admin_EditUserPageElements;
	Admin_IncompleteCertificatesPage	Admin_IncompleteCertificatesPageElements;
	Admin_IncompleteCodeSigningCertsPage	Admin_IncompleteCodeSigningCertsPageElements;
	Admin_IncompleteSmimePage	Admin_IncompleteSmimePageElements;
	Admin_IssuedCertificatesPage	Admin_IssuedCertificatesPageElements;
	Admin_LoginPage	Admin_LoginPageElements;
	Admin_MySslDashBoard	Admin_MySslDashBoardElements;
	Admin_NavigationLinks	Admin_NavigationLinksElements;
	Admin_NewUserPage	Admin_NewUserPageElements;
	Admin_OrdersPage	Admin_OrdersPageElements;
	Admin_OutgoingEmailsLogPage	Admin_OutgoingEmailsLogPageElements;
	Admin_PendingCertificatesPage	Admin_PendingCertificatesPageElements;
	Admin_ProposalsPage	Admin_ProposalsPageElements;
	Admin_SearchCertificatesPage	Admin_SearchCertificatesPageElements;
	Admin_ShoppingBasketPage	Admin_ShoppingBasketPageElements;
	Admin_SmimeValidationPage	Admin_SmimeValidationPageElements;
	
@BeforeMethod (groups = {"Smoke","BS_Smoke"})
public void Login() throws Exception {

	/*	  Admin_LoginPageElements = new Admin_LoginPage(driver);
		  Admin_BillingPageElements = new Admin_BillingPage(driver);
		  Admin_MySslDashBoardElements = new Admin_MySslDashBoard(driver);
		  Admin_MySslDashBoardElements = new Admin_MySslDashBoard(driver);
		  AlertBoxElements = new AlertBox(driver);
		  Admin_ProposalsPageElements = new Admin_ProposalsPage(driver);
		  Admin_NavigationLinksElements = new Admin_NavigationLinks(driver);
		  Admin_ClientAccountsPageElements = new Admin_ClientAccountsPage(driver);
		  Admin_CertificatesPageElements = new Admin_CertificatesPage(driver);
		  Admin_IssuedCertificatesPageElements = new Admin_IssuedCertificatesPage(driver);
		  Admin_CertificateDetailsPageElements = new Admin_CertificateDetailsPage(driver);
		  Admin_AddAccountPageElements = new Admin_AddAccountPage(driver);
		  ScreenShot = new TakeScreenShot();
		  Admin_OutgoingEmailsLogPageElements = new  Admin_OutgoingEmailsLogPage(driver);
	*/
	
	AlertBoxElements	= new AlertBox(driver);
	CsrElements	= new CsR(driver);
	ScreenShot	= new TakeScreenShot();
	Admin_AccountEndUsersPageElements	= new Admin_AccountEndUsersPage(driver);
	Admin_AddAccountPageElements	= new Admin_AddAccountPage(driver);
	Admin_BillingPageElements	= new Admin_BillingPage(driver);
	Admin_BulkEditCertContactsPageElements	= new Admin_BulkEditCertContactsPage(driver);
	Admin_BulkTransferCertsPageElements	= new Admin_BulkTransferCertsPage(driver);
	Admin_CertificateDetailsPageElements	= new Admin_CertificateDetailsPage(driver);
	Admin_CertificatesPageElements	= new Admin_CertificatesPage(driver);
	Admin_CertificateValidationPageElements	= new Admin_CertificateValidationPage(driver);
	Admin_ClientAccountsPageElements	= new Admin_ClientAccountsPage(driver);
	Admin_CodeSigningCertsValidationPageElements	= new Admin_CodeSigningCertsValidationPage(driver);
	Admin_EditUserPageElements	= new Admin_EditUserPage(driver);
	Admin_IncompleteCertificatesPageElements	= new Admin_IncompleteCertificatesPage(driver);
	Admin_IncompleteCodeSigningCertsPageElements	= new Admin_IncompleteCodeSigningCertsPage(driver);
	Admin_IncompleteSmimePageElements	= new Admin_IncompleteSmimePage(driver);
	Admin_IssuedCertificatesPageElements	= new Admin_IssuedCertificatesPage(driver);
	Admin_LoginPageElements	= new Admin_LoginPage(driver);
	Admin_MySslDashBoardElements	= new Admin_MySslDashBoard(driver);
	Admin_NavigationLinksElements	= new Admin_NavigationLinks(driver);
	Admin_NewUserPageElements	= new Admin_NewUserPage(driver);
	Admin_OrdersPageElements	= new Admin_OrdersPage(driver);
	Admin_OutgoingEmailsLogPageElements	= new Admin_OutgoingEmailsLogPage(driver);
	Admin_PendingCertificatesPageElements	= new Admin_PendingCertificatesPage(driver);
	Admin_ProposalsPageElements	= new Admin_ProposalsPage(driver);
	Admin_SearchCertificatesPageElements	= new Admin_SearchCertificatesPage(driver);
	Admin_ShoppingBasketPageElements	= new Admin_ShoppingBasketPage(driver);
	Admin_SmimeValidationPageElements	= new Admin_SmimeValidationPage(driver);
	
	
	
	//Admin_LoginPageElements.AdminLogin();
	 
	report = ExtentFactory.getInstance(); 	 
			 
}

@AfterMethod (alwaysRun = true, groups = {"Smoke","BS_Smoke"})
public void Log_Out (ITestResult result) throws Exception {


	String path =  ScreenShot.Image(driver, "TestSecreenShot-" + result.getMethod().getMethodName());
	String imagePath = test.addScreenCapture(path);
	test.log(LogStatus.INFO, "Test Complete", imagePath);


	/*User Log Out*/
	driver.navigate().refresh();

	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,-500)", "");

	Thread.sleep(1000);

	 try{ 
		 
 /*		 
		 if (Admin_LoginPageElements.LoginLinkIsVisible()){
			 
			 test.log(LogStatus.INFO, "Logout Button Not Visible");
			 System.out.println("Logout Button Not Visible");
			 String path2 = ScreenShot.Image(driver, "Logout");
			 String imagePath2 = test.addScreenCapture(path2);
			 test.log(LogStatus.INFO, imagePath2);
			 report.endTest(test);
			 report.flush();
			 
		 }else if (Admin_LoginPageElements.AdminLogoutButtonIsVisible()) {
			 
			  Admin_LoginPageElements.ClickAdminLogoutButton();
			  test.log(LogStatus.INFO, "Admin User Logged Out");
			  String path2 = ScreenShot.Image(driver, "Logout");
			  String imagePath2 = test.addScreenCapture(path2);
			  test.log(LogStatus.INFO, imagePath2);
			  report.endTest(test);
			  report.flush();
			 
		 }
	*/	 
	  
	 }catch (Exception e) {
			
			test.log(LogStatus.FAIL, "Logout Validation Failed");
			test.log(LogStatus.INFO, e);
			String path2 = ScreenShot.Image(driver, "Logout");
			String imagePath2 = test.addScreenCapture(path2);
			test.log(LogStatus.INFO, imagePath2);
			report.endTest(test);
			report.flush();
			System.out.println("Exception " + e);
			driver.quit();
			//Assert.fail("Exception " + e);
	}
}

//Main Test Starts Here



}
