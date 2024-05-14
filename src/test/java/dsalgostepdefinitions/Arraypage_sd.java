package dsalgostepdefinitions;
import java.io.IOException;

import dsalgodrivers.DriverFactory;
import dsalgopages.Datastructurepage_pf;
import dsalgopages.Arraypage_pf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Arraypage_sd {
	Arraypage_pf arraypage=new  Arraypage_pf(DriverFactory.getDriver());
	Datastructurepage_pf datapage=new  Datastructurepage_pf(DriverFactory.getDriver());
	@Given("The user is on the DS Algo Home Page")
	public void the_user_is_on_the_ds_algo_home_page() {
		System.out.println("open the url");
	}

	@When("The user clicks  Get Started button below the array")
	public void the_user_clicks_get_started_button_below_the_array() {
		  
		System.out.println("click on GetStarted");
	   
	}
	@Then("The user should be redirected to the Array Page")
	public void the_user_should_be_redirected_to_the_array_page() {
		System.out.println("open the array page");
	    
	}
	
	@Given("The user is on the Array in Python Page")
	public void the_user_is_on_the_array_in_python_page() {
		System.out.println("open the array page");
	}

	@When("The user clicks a Arrays in Python link")
	public void the_user_clicks_a_arrays_in_python_link() {
		System.out.println("click on Arrays in python link");
		
	}


	@Then("The user should be redirected to {string}")
	public void the_user_should_be_redirected_to(String string) {
		System.out.println("open the arraysinpage");
	}

	@When("The user clicks Try Here button of Array in Python Page")
	public void the_user_clicks_try_here_button_of_array_in_python_page() {
		System.out.println("click on Tryhere");
	}

	@Then("The user should be redirected to a page having an Python Editor with a url {string}")
	public void the_user_should_be_redirected_to_a_page_having_an_python_editor_with_a_url(String string) {
		System.out.println("opens python editor");
	}
	@Given("The user is on the Python Editor")
	public void the_user_is_on_the_python_editor() {
		System.out.println("opens python editor");
	}

	@When("The user clicks the Run Button without entring the code in the Editor")
	public void the_user_clicks_the_run_button_without_entring_the_code_in_the_editor() {
		System.out.println("click on RUN");
	}

	@Then("Nothing happens to the page and no error message is displayed")
	public void nothing_happens_to_the_page_and_no_error_message_is_displayed() {
		System.out.println("No error msg is diaplayed");
	}
}