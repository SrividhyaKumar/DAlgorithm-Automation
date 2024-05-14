package dsalgostepdefinitions;
import dsalgodrivers.DriverFactory;
import dsalgopages.Datastructurepage_pf;
import dsalgopages.Queuepage_pf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Queuepage_sd {

	Queuepage_pf queuepage=new  Queuepage_pf(DriverFactory.getDriver());
	Datastructurepage_pf datapage=new  Datastructurepage_pf(DriverFactory.getDriver());
	
	@Given("The user is in the Queue page after logged in")
	public void the_user_is_in_the_queue_page_after_logged_in() {
		queuepage.home();
		System.out.println("open the queue page");
	
	}
	@When("The user clicks  Queue in Python button")
	public void the_user_clicks_queue_in_python_button() {
		System.out.println("click the queue in python");
	}
	@Then("The user should be directed to  Queue in Python Page")
	public void the_user_should_be_directed_to_queue_in_python_page() {
		System.out.println("user redirect the queueinpython page");
	}
	@When("The user clicks {string} button")
	    public void the_user_clicks_onbutton(String string) {
		System.out.println("click on tryhere");
		}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		System.out.println("open the browser with run button page");
	}

	@Given("The user is on the tryEditor page")
	public void the_user_is_on_the_try_editor_page() {
		System.out.println("open the browser try editor with run button page");
	}

	@When("The User writes Valid python code")
	public void the_user_writes_valid_python_code() {
		 System.out.println("enter the validcode");
	}

	@When("click Run button")
	public void click_run_button() {
		System.out.println("click on run button");
	}

	@Then("User is able to see the output in console")
	public void user_is_able_to_see_the_output_in_console() {
		System.out.println("output in console");
	}
	@When("the user writes invalid python code")
	public void the_user_writes_invalid_python_code() {
	 System.out.println("enter the code");
	}

	@When("click run on button")
	public void click_run_on_button() {
		System.out.println("click on run button");
	}

	@Then("User is able to see the error msg in pop up window")
	public void user_is_able_to_see_the_error_msg_in_pop_up_window() {
		System.out.println("error message");
	}

	@Given("The user is in the Queue page")
	public void the_user_is_in_the_queue_page() {
	    DriverFactory.getDriver();
	}
	@Then("The user is in the Implementation using Collections.deque page")
	public void the_user_is_in_the_implementation_using_collections_deque_page() {
		 System.out.println("open the browser Implementation using Collections.deque");
	}
	

	
}



