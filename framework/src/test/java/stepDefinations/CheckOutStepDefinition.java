package stepDefinations;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.CheckOut;
import PageObjects.LandingPage;
import PageObjects.PageObjectManager;
import Utils.TestContestSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOutStepDefinition {
	public WebDriver driver;
	PageObjectManager pageObjectManager;
	TestContestSetup testContestSetup;
	LandingPage landingpage;
	CheckOut checkout;
	
	public CheckOutStepDefinition(TestContestSetup testContestSetup) {
	this.testContestSetup=testContestSetup;
	
	}
	@Given("user is on intial page")
	public void user_is_on_intial_page() {
		//System.out.println("test");
		//testContestSetup.testBase.WebDriverManager();
		//System.setProperty("webdriver.chrome.driver", "D:\\Users\\bhask\\eclipse-workspace\\framework\\drivers\\chromedriver.exe");
		//driver=new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	
	}

	@When("user adds product to cart and proceed to checkout")
	public void user_adds_product_to_cart_and_proceed_to_checkout() throws InterruptedException {
		LandingPage landingpage= testContestSetup.pageObjectManager.getLandingPage();
		landingpage.veg();
		//driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys("TOM");
		//pageObjectManager.getLandingPage().increment();
		landingpage.increment();
		//driver.findElement(By.xpath("//a[@class='increment']")).click();
		//driver.findElement(By.xpath("//a[@class='increment']")).click();
		//pageObjectManager.getLandingPage().AddtoCart();
		//landingpage.AddtoCart();
		//driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).click();
		landingpage.cart();
		//pageObjectManager.getLandingPage().cart();
		//driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		//driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
		//testContestSetup.driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
	}

	@Then("Promo code and place order are displayed")
	public void promo_code_and_place_order_are_displayed() {
	
		   /*Set<String> s1=driver.getWindowHandles();
		   Iterator<String> i1=s1.iterator();
		   String ParentWindow=i1.next();
		   String ChildWindow=i1.next();
		   driver.switchTo().window(ChildWindow);
		//pageObjectManager.checkout().checkkout(); */
		
		System.out.println("test pass"); 
		
		//CheckOut checkout=testContestSetup.pageObjectManager.checkout();
		//checkout.checkkout();
		//driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
	}


}
