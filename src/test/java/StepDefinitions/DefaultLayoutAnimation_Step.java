package StepDefinitions;

import org.apache.log4j.Logger;

import Pages.DefaultLayoutAnimation_Page;
import Setup.Configuration;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DefaultLayoutAnimation_Step {
	
	public int actual,expected;
	
	static Logger log = Logger.getLogger(DefaultLayoutAnimation_Step.class);
	
	@Given("^User is in the application and uer clicks on animation button$")
	public void user_is_in_the_application_and_uer_clicks_on_animation_button() throws Throwable {
		
		log.info("Test started to check the Add feature in animation layout feature");
		
		DefaultLayoutAnimation_Page layout=new DefaultLayoutAnimation_Page(Configuration.driver);
		layout.AnimationClick();
		
	}

	@Given("^user clicks on default layout animation$")
	public void user_clicks_on_default_layout_animation() throws Throwable {
		
		DefaultLayoutAnimation_Page layout=new DefaultLayoutAnimation_Page(Configuration.driver);
		layout.DeaultLayout();

	}

	@When("^user performs add operation$")
	public void user_performs_add_operation() throws Throwable {
		
		
		
		DefaultLayoutAnimation_Page layout=new DefaultLayoutAnimation_Page(Configuration.driver);
		
		expected=layout.ListSize()-1;

		layout.AddButton();

		actual=layout.ListSize();

	}

	@Then("^validating the outcomes against the action$")
	public void validating_the_outcomes_against_the_action() throws Throwable {
		
		

		Assert.assertNotSame(expected, actual);
		
		log.info("Test ends");
	}
}
