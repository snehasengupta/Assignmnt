package StepDefinitions;

import org.testng.Assert;
import org.apache.log4j.Logger;
import Pages.HideAndShowAnimation_Page;
import Setup.Configuration;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HideAndShowAnimation_Step {
	
	Configuration base=new Configuration();
	Scenario scn;

	
	static Logger log = Logger.getLogger(HideAndShowAnimation_Step.class);


	@Given("^user is inside the application clicks on the animation option$")
	public void user_is_inside_the_application_clicks_on_the_animation_option() throws Throwable {
		
		log.info("Test started to check hide  animation of animation option");
		
		HideAndShowAnimation_Page animation=new HideAndShowAnimation_Page(Configuration.driver);

		animation.AnimationClick();
	}

	@Given("^user clicks on the hide and show animation option$")
	public void user_clicks_on_the_hide_and_show_animation_option() throws Throwable {
	    
		HideAndShowAnimation_Page animation=new HideAndShowAnimation_Page(Configuration.driver);
		animation.Hide_Show_Animation();
	}

	@Given("^user performs action on hide$")
	public void user_performs_action_on_hide() throws Throwable {
		
		
	    
		HideAndShowAnimation_Page animation=new HideAndShowAnimation_Page(Configuration.driver);
		animation.Hidenimation();
	}

	@Then("^Verify the hide action$")
	public void verify_the_hide_action() throws Throwable {
		
		log.info("Test ends");
	    
		HideAndShowAnimation_Page animation=new HideAndShowAnimation_Page(Configuration.driver);
		int expected=animation.ElementsNow();

		animation.ElementClick();
		animation.Elementhide();

		int actual=animation.elements.size();

		Assert.assertNotEquals(actual, expected);
	}

	@Given("^user performs action on show$")
	public void user_performs_action_on_show() throws Throwable {
		
		log.info("Test started to check show  animation of animation option");
	    
		HideAndShowAnimation_Page animation=new HideAndShowAnimation_Page(Configuration.driver);
		animation.Hidenimation();
		animation.ElementClick();
		animation.Elementhide();
		animation.ShowAnimation();
	}

	@Then("^Verify the show action$")
	public void verify_the_show_action() throws Throwable {
		
		
	    
		HideAndShowAnimation_Page animation=new HideAndShowAnimation_Page(Configuration.driver);
		int  expected_result=animation.ElementsNow();
		int actual_result=animation.elements.size();
		Assert.assertEquals(actual_result, expected_result);
		
		log.info("Test ends");
	}

}
