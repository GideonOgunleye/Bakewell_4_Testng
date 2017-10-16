package PageFactory.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import BaseUtilities.DriverLoad;

public class Admin_MyProductsPage extends DriverLoad{

	public Admin_MyProductsPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
		//PageFactory.initElements(driver, this);
		
	}
	
	
	/*****Page Elements******/
	@FindBy(xpath = ".//*[@id='mainContainer']/div[7]/div[2]/div[2]/div[1]/div/address/strong[1]")
	WebElement PageHeader;
	

	

}
