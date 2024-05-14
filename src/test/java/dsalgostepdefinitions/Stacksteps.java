package dsalgostepdefinitions;
import java.io.IOException;

import org.junit.Assert;

import dsalgodrivers.DriverFactory;
import io.cucumber.java.en.*;
import dsalgopages.Loginpages_pf;
//import dsalgopages.Arraypages;
import dsalgopages.StackPages_pf;


public class Stacksteps {
	StackPages_pf sp = new StackPages_pf(DriverFactory.getDriver());
	Loginpages_pf st = new Loginpages_pf(DriverFactory.getDriver());
	
	@Given(": User must be in the Loginpage for stack")
	public void user_must_be_in_the_loginpage_for_stack() throws InterruptedException {
		DriverFactory.getDriver().navigate().to("https://dsportalapp.herokuapp.com/login");
		Thread.sleep(2000);
	}
	
	@When(": The user clicks on login button by entering valid values in {string} and {string} textboxes stack")
	public void the_user_clicks_on_login_button_by_entering_valid_values_in_and_textboxes_stack(String string, String string2) throws InterruptedException {
		st.enterUsernamePassword(string, string2);
		st.clickLogin();
		Thread.sleep(2000);

	}
	
	@Then(": User will be redirected to the DSAlgo Home page with username and successful login {string}")
	public void user_will_be_redirected_to_the_dsalgo_home_page_with_username_and_successful_login(String string) {
		String actualmessage = st.successMessage();
		Assert.assertEquals(string,actualmessage);
	}
	
	@When(": The user clicks on Get Started button of stack")
	public void the_user_clicks_on_get_started_button_of_stack() throws InterruptedException {
		sp.getStarted();
		Thread.sleep(2000);
	}
	
	@Given(": The user is on DS Algo Homepage")
	public void the_user_is_on_ds_algo_homepage() {
	    //datastructure.Homepage();
	   
	}

	StackPages_pf stack = new StackPages_pf(DriverFactory.getDriver());
	//Arraypages array = new Arraypages(DriverFactory.getDriver());

	@Then(": The user should be navigated to  the Stack page")
	public void the_user_should_be_navigated_to_the_stack_page() {
		System.out.println("User is navigated to Stack Page");

	}

	@When(": The user clicks on Opeartions in Stack")
	public void the_user_clicks_on_opeartions_in_stack() {
		sp.operationInStack();
	}

	@Then(": The user should be directed to the {string} of stack Page")
	public void the_user_should_be_directed_to_the_of_stack_page(String string) {
		System.out.println("User is navigated to "+string+" page");

	}
	@Then(": User clicks {string} button.")
	public void user_clicks_button(String string) {
		sp.clickTryHere();
	}

	@Then(": user should be redirected to the page having an tryEditor with a Run button to test")
	public void user_should_be_redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test() throws IOException {
		//sp.pythonEditor();

	}

	@When(": The user clicks on Implementation")
	public void the_user_clicks_on_implementation() {
		sp.clickOnImplementation();
	}

	@When(": The user clicks on Applications")
	public void the_user_clicks_on_applications() {
		sp.clickOnApplication();
	}

//	@Given(": The user is on DS Algo Portal homepage")
//	public void the_user_is_on_ds_algo_portal_homepage() {
//	}
//
//	@When(": The user clicks on Signin button")
//	public void the_user_clicks_on_signin_button() {
//	    
//	}
//
//	@When(": The user enters {string} as username and {string} as password and clicks on login button")
//	public void the_user_enters_as_username_and_as_password_and_clicks_on_login_button(String string, String string2) {
//	} 
//
//	@Then(":The user should get message as {string} in homepage")
//	public void the_user_should_get_message_as_in_homepage(String string) {
//	  
//	}

	




}
