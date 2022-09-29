package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePageObjects {
	
	
	 WebDriver driver;
	

	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	By accountButton = By.xpath("//button[@id='ACCOUNT']");
	By customerLogin = By.xpath("//*[contains(text(),'Customer Login')]");
	
	public void accountOptions() {
		driver.findElement(accountButton).click();
		driver.findElement(customerLogin).click();
	}
	
	public String getTitleOfHomePage() {
		return driver.getTitle();
	}


}
