package dsalgostepdefinitions;
import org.junit.Assert;

import dsalgodrivers.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import dsalgopages.LinkedListPages_pf;
import dsalgopages.Loginpages_pf;
public class LinkedListSteps {
	
	LinkedListPages_pf linkedlist = new LinkedListPages_pf(DriverFactory.getDriver());
//	DataStructuresPages data = new DataStructuresPages(DriverFactory.getDriver());
//	Arraypages array = new Arraypages(DriverFactory.getDriver());
	

	@When(": The user clicks on Get Started button of Linked List")
	public void the_user_clicks_on_get_started_button_of_linked_list() throws InterruptedException {
		linkedlist.getStarted();
		Thread.sleep(2000);
	}

	@Then(": The user should be navigated to the Linked List page")
	public void the_user_should_be_navigated_to_the_linked_list_page() throws InterruptedException {
		System.out.println("User is navigated to Linked list page");
		Thread.sleep(2000);

	}

	Loginpages_pf LL = new Loginpages_pf(DriverFactory.getDriver());

	@Given(": User must be in the Loginpage for linkedlist")
	public void user_must_be_in_the_loginpage_for_linkedlist() throws InterruptedException {
		DriverFactory.getDriver().navigate().to("https://dsportalapp.herokuapp.com/login");
		Thread.sleep(2000);
	}

	@When(": The user clicks on login button by entering valid values in {string} and {string} textboxes linkedlist")
	public void the_user_clicks_on_login_button_by_entering_valid_values_in_and_textboxes_linkedlist(String string, String string2) throws InterruptedException {
		LL.enterUsernamePassword(string, string2);
		LL.clickLogin();
		Thread.sleep(2000);

	}

	@Then(": User must be redirected to the DSAlgo Home page with username and successful login {string}")
	public void user_must_be_redirected_to_the_dsalgo_home_page_with_username_and_successful_login(String string) {
		String actualmessage = LL.successMessage();
		Assert.assertEquals(string,actualmessage);
	}
	
	@When(": The user clicks on Introduction button")
	public void the_user_clicks_on_introduction_button() throws InterruptedException {
	    linkedlist.clickOnIntroduction();
	    Thread.sleep(2000);
	}
	
	@Then(": The user should be directed to {string} of Linked List Page")
	public void the_user_should_be_directed_to_of_linked_list_page(String string) {
		System.out.println("User is redirected to "+string+" page");

	}
	@Then(": The user clicks in the {string} button")
	public void the_user_clicks_in_the_button(String string) throws InterruptedException {
	 linkedlist.clickOnTryHere();
	 Thread.sleep(2000);
	}
	@Then(": User should be redirected to the page having an tryEditor with a Run button to test")
	public void user_should_be_redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test() {
		String currentUrl = "https://dsportalapp.herokuapp.com/tryEditor";
		//This will check to make sure USA is a part of the URL, and doesn't exist as another part of the URL.
		if(currentUrl.contains("/tryEditor")){
			System.out.println("Current Url is"+ currentUrl);
		} else {
			System.out.println("Invalid URL");
		}
	}
	@When(": The user clicks  Creating a Linked List button")
	public void the_user_clicks_creating_a_linked_list_button() {
		linkedlist.creatingLinkedList();
	}
	
	@When(": User clicks the Types of Linked List button")
	public void user_clicks_the_types_of_linked_list_button() {
		linkedlist.typesOfLinkedList();

	}
	
	@When(": User clicks Implement Linked List in Python")
	public void user_clicks_implement_linked_list_in_python() {
		linkedlist.implementLinkedList();
	}
	
	@When(": User clicks on Traversal button")
	public void user_clicks_on_traversal_button() {
		linkedlist.traversal();
	}
	
	@When(": User clciks on Insertion button")
	public void user_clciks_on_insertion_button() {
		linkedlist.insertion();

	}
	
	@When(": User clicks on Deletion button")
	public void user_clicks_on_deletion_button() {
		linkedlist.deletion();

	}
	
	
//	@When(": User clicks on Practice Question button")
//	public void user_clicks_on_practice_question_button() {
//		linkedlist.PracticeQ();
//	}
	@Then(": The user should be directed to {string} page of Linked List Page")
	public void the_user_should_be_directed_to_page_of_linked_list_page(String string) {
		String currentUrl = "https://dsportalapp.herokuapp.com/linked-list/practice";
		if(currentUrl.contains("/practice")){
			System.out.println("Current Url is"+ currentUrl);
		} else {
			System.out.println("Invalid URL of practice question");
		}
	}




}
