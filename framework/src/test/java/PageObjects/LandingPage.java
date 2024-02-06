package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		
	}
	By search=By.xpath("//input[@placeholder='Search for Vegetables and Fruits']");
	By SearchItemName=By.cssSelector("h4.product-name");
	By TopDeals=By.xpath("//a[normalize-space()='Top Deals']");
	By add= By.xpath("//a[@class='increment']");
	By addcart=By.xpath("//button[normalize-space()='ADD TO CART']");
	By cartt=By.xpath("//img[@alt='Cart']");
	
	
	public void Search(String name) {
		driver.findElement(search).sendKeys(name);
		
	}
	public void veg() {
			
		driver.findElement(search).sendKeys("Tom");
	}

	public String Gettext() {
		return driver.findElement(SearchItemName).getText();
		 
	}
	
	public void  SelectTopDeals() {
	driver.findElement(TopDeals).click();
	}

	public void increment() {
		driver.findElement(add).click();
		
	}
	
	public void AddtoCart() {
		driver.findElement(addcart).click();
		
	}
	
	public void cart() {
		driver.findElement(cartt).click();
		
	}
}
