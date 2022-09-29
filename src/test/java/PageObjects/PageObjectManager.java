package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public CustomerPageObjects customerPage;
	public HomePageObjects homePage;
	public CustomerLoginPageObjects customerloginPage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public CustomerPageObjects getCustomerPage() {
		
		customerPage = new CustomerPageObjects(driver);
		return customerPage;
		
	}
	
	public HomePageObjects getHomePage() {
		homePage = new HomePageObjects(driver);
		return homePage;
	}
	
	public CustomerLoginPageObjects getCustomerLoginPage() {
		customerloginPage = new CustomerLoginPageObjects(driver);
		return customerloginPage;
	}

}
