package StepDefinitions;

import org.openqa.selenium.WebDriver;

import PageObjects.CustomerLoginPageObjects;
import Utils.TestContextSetup;
import io.cucumber.java.en.When;

public class CustomerLoginPageStepDefinition {
	
	TestContextSetup testContextSetup;
	public WebDriver driver;
	CustomerLoginPageObjects customerLoginPageObjects;
	
	public CustomerLoginPageStepDefinition(TestContextSetup testContextSetup) {
		
		this.testContextSetup = testContextSetup;
		this.customerLoginPageObjects = testContextSetup.pageObjectManager.getCustomerLoginPage();
		
	}
	
	@When("^User enters login credentials (.+) and (.+)$")
	public void user_enters_login_credentials(String username, String password) {
		customerLoginPageObjects.enterCredentials(username, password);
		
	}
}
