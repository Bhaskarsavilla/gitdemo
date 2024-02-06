package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut {
		WebDriver driver;
		public CheckOut(WebDriver driver) {
			this.driver=driver;
			
		}
		By CheckOutt=By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");
		
		public void checkkout()
		{
			driver.findElement(CheckOutt).click();
		}
}
