package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;



public class TestContextSetup {
	
	public WebDriver driver;
	public TestBase testBase;
	public PageObjectManager pageObjectManager;
	
	public TestContextSetup() throws IOException 
	{
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		
	}


}
