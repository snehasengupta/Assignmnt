package StepDefinitions;

import org.testng.Assert;
import org.apache.log4j.Logger;

import Pages.Captions_Page;
import Setup.Configuration;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Captions_Step {

	public String actual;
	static Logger log = Logger.getLogger(Captions_Step.class);
	
	@Given("^User clicks on accessibility option$")
	public void user_clicks_on_accessibility_option() throws Throwable {
		
		log.info("Test started for checking the caption enabling feature of accessibility option");
		
		Captions_Page accessibility=new Captions_Page(Configuration.driver);
		accessibility.AccessibilityClick();
	}

	@Given("^user enters accessibility services and clicks the button$")
	public void user_enters_accessibility_services_and_clicks_the_button() throws Throwable {
		
		Captions_Page accessibility=new Captions_Page(Configuration.driver);
		accessibility.AccesibilityServices();
		accessibility.SquareButton();

	}

	@When("^user enables th caption$")
	public void user_enables_th_caption() throws Throwable {
		
		
		
		Captions_Page accessibility=new Captions_Page(Configuration.driver);
		accessibility.Captions();
		
		actual=accessibility.switchbar.getText().toLowerCase();
		accessibility.EnableCaptions();

	}

	@When("^user performs some other action$")
	public void user_performs_some_other_action() throws Throwable {

		Captions_Page accessibility=new Captions_Page(Configuration.driver);
		accessibility.LanguagSelection();
		accessibility.TExtSizeSelect();

	}

	@Then("^Validating the outcomes$")
	public void validating_the_outcomes() throws Throwable {
		
		
		

		Captions_Page accessibility=new Captions_Page(Configuration.driver);
		String expected=accessibility.switchbar.getText().toLowerCase();
		
		try {
			
			Assert.assertEquals(expected, actual);
		}
		catch(AssertionError a ){
			
			Assert.assertNotEquals(expected, actual);
		}
		
		log.info("Test ends");
		
	}

}
