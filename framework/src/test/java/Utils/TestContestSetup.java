package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestContestSetup {
	public WebDriver driver;
	public String ProductName;
	public PageObjectManager pageObjectManager ;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TestContestSetup() throws IOException {
		testBase=new TestBase();
		pageObjectManager=new PageObjectManager(testBase.WebDriverManager());
		genericUtils=new GenericUtils(testBase.WebDriverManager());

	}
	
	

}
