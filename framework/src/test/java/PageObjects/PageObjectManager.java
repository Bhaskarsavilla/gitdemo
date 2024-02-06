package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	LandingPage landingpage;
	OffersPage offersPagee;
	CheckOut checkout;
	WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LandingPage getLandingPage() {
	landingpage= new LandingPage(driver);
	return landingpage;
	}
	
	public OffersPage offersPagee() {
	offersPagee=new OffersPage(driver);
	return offersPagee;
	}
	
	public CheckOut checkout() {
		checkout=new CheckOut(driver);
		return checkout;
	}

}
