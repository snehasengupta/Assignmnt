package StepDefinitions;

import org.apache.log4j.Logger;
import org.testng.ITestResult;

import ScreenShot.Screenshots;
import Setup.Configuration;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	Configuration base=new Configuration();
	static Logger log = Logger.getLogger(Hooks.class);


	@Before
	public void browser() {
		
		log.info("Test application  has started");
		
		base.base();
	}

	@After
	public void quit() {
		
		log.info("All tests are executed");
		
		Configuration.driver.quit();
		
	}


	public void ss(ITestResult result) {
		
		if(ITestResult.FAILURE==result.getStatus())
			Screenshots.captureScreenshot(Configuration.driver, result.getName());
	}

}
