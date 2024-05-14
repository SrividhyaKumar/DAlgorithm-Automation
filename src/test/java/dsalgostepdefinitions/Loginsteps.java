package dsalgostepdefinitions;
import org.junit.Assert;

import dsalgodrivers.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import dsalgopages.Loginpages_pf;
public class Loginsteps {
	
	Loginpages_pf login = new Loginpages_pf(DriverFactory.getDriver());

	@Given(": User must be in the Loginpage")
	public void user_must_be_in_the_loginpage() throws InterruptedException {
		DriverFactory.getDriver().navigate().to("https://dsportalapp.herokuapp.com/login");
		Thread.sleep(2000);
	}

	@When(": The user clicks on login button by entering invalid values in {string} and {string} textboxes")
	public void the_user_clicks_on_login_button_by_entering_invalid_values_in_and_textboxes(String string, String string2) throws InterruptedException {
		login.enterUsernamePassword(string, string2);
		login.clickLogin();
		Thread.sleep(2000);	}

	@Then(": The user must be displayed with the warning message or error message {string}")
	public void the_user_must_be_displayed_with_the_warning_message_or_error_message(String string) {
		if(string.equalsIgnoreCase("Please fill out this field."))
		{
			String actualmessage = login.errMsgFillFields();
			Assert.assertEquals(string,actualmessage);
			System.out.println(actualmessage);
		}
		else if(string.equalsIgnoreCase("Invalid Username and Password")) {
			String actualmessage = login.invalidMessage();
			Assert.assertEquals(string,actualmessage);
			System.out.println(actualmessage);
		}

	}

	@When(": The user clicks on login button by entering valid values in {string} and {string} textboxes")
	public void the_user_clicks_on_login_button_by_entering_valid_values_in_and_textboxes(String string, String string2) {
		login.enterUsernamePassword(string, string2);
		login.clickLogin();

	}

	@Then(": User must be redirected to the DS-Algo Home page with username and successful login {string}")
	public void user_must_be_redirected_to_the_ds_algo_home_page_with_username_and_successful_login(String string) throws InterruptedException {
		String actualmessage = login.successMessage();
		Assert.assertEquals(string,actualmessage);
		Thread.sleep(2000);
	}




}
