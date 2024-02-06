package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.PageObjectManager;
import Utils.TestBase;
import Utils.TestContestSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageStepDefinition {
	public WebDriver driver;
	String ProductName;
	String Product1Name;
	TestContestSetup testContestSetup;
	PageObjectManager pageObjectManager;
	TestBase testbase;
	public LandingPageStepDefinition(TestContestSetup testContestSetup) {
		this.testContestSetup=testContestSetup;
		
	}

@Given("when user is on Greenkart landing page")
public void when_user_is_on_greenkart_landing_page() {
	
	//System.setProperty("webdriver.chrome.driver", "D:\\Users\\bhask\\eclipse-workspace\\framework\\drivers\\chromedriver.exe");
	//testContestSetup.driver=new ChromeDriver();
	//testContestSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
   // driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys("TOM");
    
}

@When("^user searched with Shortname (.+) and extracted actual name of product$")
public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
	
	//LandingPage landingpage= new LandingPage(testContestSetup.driver);
	//pageObjectManager=new PageObjectManager(testContestSetup.driver);
	LandingPage landingpage= testContestSetup.pageObjectManager.getLandingPage();
	landingpage.Search(shortName);
	Thread.sleep(2000);
	ProductName=landingpage.Gettext().split("-")[0].trim();
	System.out.println(ProductName +"is extracted from Homepage");
}

}
