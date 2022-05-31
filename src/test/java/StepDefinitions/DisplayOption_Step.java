package StepDefinitions;

import org.testng.Assert;
import org.apache.log4j.Logger;

import Pages.DisplayOption_Page;
import Setup.Configuration;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DisplayOption_Step {
	
	public String actual;
	
	static Logger log = Logger.getLogger(DisplayOption_Step.class);

	
	@Given("^User is in the application and clicks on app$")
	public void user_is_in_the_application_and_clicks_on_app() throws Throwable {
		
		
		log.info("Test started to check the display title feature in app option");
	    
		DisplayOption_Page app=new DisplayOption_Page(Configuration.driver);
		
		app.EnterApp();
	    
	}
	
	@Given("^user clicks on action bar$")
	public void user_clicks_on_action_bar() throws Throwable {
	
		DisplayOption_Page app=new DisplayOption_Page(Configuration.driver);
		app.Actionbar();
	}

	@When("^user clicks on display action$")
	public void user_clicks_on_display_action() throws Throwable {
		
	
	
		DisplayOption_Page app=new DisplayOption_Page(Configuration.driver);
		app.Displayoption();
		
	}

	@When("^user clicks on display show title$")
	public void user_clicks_on_display_show_title() throws Throwable {
		
		
		
		DisplayOption_Page app=new DisplayOption_Page(Configuration.driver);
		actual=app.Displaytitle();

	}

	@Then("^validating the title is visble$")
	public void validating_the_title_is_visble() throws Throwable {
		
		
	
		String expected="true";
		Assert.assertEquals(actual, expected);
		
		log.info("Test ends");
		
	}
}
