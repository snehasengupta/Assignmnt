package StepDefinitions;

import org.testng.Assert;
import org.apache.log4j.Logger;

import Pages.DeviceAdmin_Page;
import Pages.DisplayOption_Page;
import Setup.Configuration;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeviceAdmin_Step {
	
	public boolean flag,expected;
	static Logger log = Logger.getLogger(DeviceAdmin_Step.class);

	
	@Given("^User is inside the application and clicks on App option$")
	public void user_is_inside_the_application_and_clicks_on_App_option() throws Throwable {
		
		log.info("Test started to check device admin features in app option");
	    
		
		DisplayOption_Page app=new DisplayOption_Page(Configuration.driver);
		
		app.EnterApp();
		
	}

	@Given("^User clicks on the Device Admin option and clicks on general$")
	public void user_clicks_on_the_Device_Admin_option_and_clicks_on_general() throws Throwable {
	    
		DeviceAdmin_Page admin=new DeviceAdmin_Page(Configuration.driver);
		admin.DeviceAdminClick();
		admin.GeneralClick();
	}

	@When("^user enables the admin rights$")
	public void user_enables_the_admin_rights() throws Throwable {
		
		
		
	    
		DeviceAdmin_Page admin=new DeviceAdmin_Page(Configuration.driver);
		flag=admin.capabilities.isEnabled();
		admin.CheckEnable();
		
	}
	
	
	@Then("^Validate the outcomes$")
	public void validate_the_outcomes() throws Throwable {
		
		
		
		
		DeviceAdmin_Page admin=new DeviceAdmin_Page(Configuration.driver);
		boolean actual=flag;
		expected =admin.capabilities.isEnabled();
		
		if(actual==false)
			Assert.assertNotEquals(actual, expected);
		else
			Assert.assertEquals(actual, expected);
		
		
		log.info("Test ends");
		
	}

}
