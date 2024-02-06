package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.OffersPage;
import PageObjects.PageObjectManager;
import Utils.TestContestSetup;
import io.cucumber.java.en.Then;


public class OffersPageStepDefinition {
	
	TestContestSetup testContestSetup;
	public String Product1Name;
	PageObjectManager pageObjectManager;
	LandingPage landingpage;
	public OffersPageStepDefinition(TestContestSetup testContestSetup) {
		this.testContestSetup=testContestSetup;
		
	}

	@Then("^user searched for Shortname (.+) in offers page to check if product exist$")
	public void user_searched_for_shortname_in_offers_page_to_check_if_product_exist(String shortName) throws InterruptedException {
		//testContestSetup.driver.findElement(By.xpath("//a[normalize-space()='Top Deals']")).click();
	    // driver to Handle child window
		switchToOffersPage();
		//pageObjectManager=new PageObjectManager(testContestSetup.driver);
		OffersPage offersPage =testContestSetup.pageObjectManager.offersPagee();
		//OffersPage offersPage=new OffersPage(testContestSetup.driver);
		offersPage.Search(shortName);
		//testContestSetup.driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys(shortName);
		   Thread.sleep(2000);
		   
		   Product1Name=offersPage.GetText(); 
		  //Product1Name=testContestSetup.driver.findElement(By.xpath("//td[normalize-space()='Tomato']")).getText();
		   System.out.println(Product1Name + "extracted from deals page");
		   
	}
	public void switchToOffersPage() {
		//if(testContestSetup.driver.getTitle().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/offers"))
		//testContestSetup.driver.findElement(By.xpath("//a[normalize-space()='Top Deals']")).click();
		LandingPage landingpage=testContestSetup.pageObjectManager.getLandingPage();
		//LandingPage landingpage= new LandingPage(testContestSetup.driver);
		landingpage.SelectTopDeals();
	    // driver to Handle child window
		testContestSetup.genericUtils.SwitchToChildWindow();
		
		   //Set<String> s1=testContestSetup.driver.getWindowHandles();
		   //Iterator<String> i1=s1.iterator();
		   //String ParentWindow=i1.next();
		   //String ChildWindow=i1.next();
		   //testContestSetup.driver.switchTo().window(ChildWindow);	
	}


	@Then("validate product in offers and landing page")
	public void compare_both()
	{
		 //Assert.assertEquals(Product1Name,testContestSetup.ProductName);
		Assert.assertEquals(Product1Name, "Tomato");
		
		//System.out.println(Product1Name + "extracted from deals page");
	
	}

}
