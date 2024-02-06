package PageObjects;

import java.io.IOException;

import Utils.TestContestSetup;
import io.cucumber.java.After;

public class hooks {
	TestContestSetup testContestSetup;
	
	public hooks(TestContestSetup testContestSetup) {
	this.testContestSetup=testContestSetup;	
	}
	@After
	public void AfterScenario() throws IOException {
		testContestSetup.testBase.WebDriverManager().quit();
		
	}

}
