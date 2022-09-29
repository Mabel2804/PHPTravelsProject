package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.HomePageObjects;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageStepDefinition {
	
	TestContextSetup testContextSetup;
	public WebDriver driver;
	HomePageObjects homePageObjects;
	
	public HomePageStepDefinition(TestContextSetup testContextSetup) 
	{
		this.testContextSetup = testContextSetup;
		this.homePageObjects = this.testContextSetup.pageObjectManager.getHomePage();
		
	}

	@Given("User is at the PHP Travels website")
	public void user_is_on_the_phptravels_home_page() {
		Assert.assertTrue(homePageObjects.getTitleOfHomePage().contains("PHP Travels"));
		
	}
	
	@When("User wants to login to the travel portal")
	public void user_wants_to_login_to_the_travel_portal() {
		homePageObjects.accountOptions();
	}
	

}
