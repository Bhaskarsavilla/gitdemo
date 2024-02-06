package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	WebDriver driver;
	
	public OffersPage(WebDriver driver) {
	this.driver=driver;	
	}
	
	By item =By.xpath("//input[@id='search-field']");
	By GetProduct=By.xpath("//td[normalize-space()='Tomato']");
	
	//testContestSetup.driver.findElement(By.xpath("//td[normalize-space()='Tomato']")).getText();
	//testContestSetup.driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys(shortName);
	
	
	public void Search(String name) {
		driver.findElement(item).sendKeys(name);
	}
	
	public String GetText() {
		return driver.findElement(GetProduct).getText();
		
	}
	
}
