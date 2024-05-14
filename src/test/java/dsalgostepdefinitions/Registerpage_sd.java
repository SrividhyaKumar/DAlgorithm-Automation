package dsalgostepdefinitions;
import java.io.IOException;

import dsalgodrivers.DriverFactory;
import dsalgopages.Registerpage_pf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registerpage_sd {
	Registerpage_pf registerpage=new  Registerpage_pf(DriverFactory.getDriver());
	
	
   @Given("The user opens Register Page\"https:\\/\\/dsportalapp.herokuapp.com\\/register\"" )
   public void the_user_opens_register_page_https_dsportalapp_herokuapp_com_register(){
	
	   DriverFactory.getDriver().navigate().to("https://dsportalapp.herokuapp.com/register");
   } 
   
   @When("The user clicks {string} button with all fields empty")
   public void the_user_clicks_button_with_all_fields_empty(String string) {
	   registerpage.page();
   }

   @Then("It should display an error {string} below Username textbox")
   public void it_should_display_an_error_below_username_textbox(String string) {
	   System.out.println("usernameerror is displayed");
   }
   @When("The user clicks {string} button after entering Username with other fields empty")
   public void the_user_clicks_button_after_entering_username_with_other_fields_empty(String string) {
      	  registerpage.password();
        }

   @Then("It should display an error {string} below Password textbox")
   public void it_should_display_an_error_below_password_textbox(String string) {
	   System.out.println("passworderror is diaplayed");
   
}
   @When("The user clicks {string} button after entering Username and password with Password Confirmation field empty")
   public void the_user_clicks_button_after_entering_username_and_password_with_password_confirmation_field_empty(String string) {
	   registerpage.toString();
   }

   @Then("It should display an error {string} below Password Confirmation textbox")
   public void it_should_display_an_error_below_password_confirmation_textbox(String string) {
	   System.out.println("passwordconfirm error is diaplayed");
      
   }
   
   @When("The user clicks {string} button after entering invalid username")
   public void the_user_clicks_button_after_entering_invalid_username(String string) {
   	registerpage.invalid();
      
   }

   @Then("It should display an error message {string}")
   public void it_should_display_an_error_message(String string) {
	   System.out.println("invalidusername error is diaplayed");
      
       
   }
   @When("The user clicks {string} button after entering different passwords in Password and Password Confirmation fields")
   public void the_user_clicks_button_after_entering_different_passwords_in_password_and_password_confirmation_fields(String string) {
   	registerpage.home();
   }

   @Then("display an error message {string}")
   public void display_an_error_message(String string) {
	   System.out.println(" error is diaplayed");
       
   }

   @When("The user clicks {string} button after entering valid Username and password with Password Confirmation")
   public void the_user_clicks_button_after_entering_valid_username_and_password_with_password_confirmation(String string) {
	   registerpage.invalidpasswordsfields();
   }

   @Then("but showing password mismatch msg although password fields are same.")
   public void but_showing_password_mismatch_msg_although_password_fields_are_same() {
	   System.out.println(" error is diaplayed");
       
   }
   @When("The user enters a same Password in both password with all numeric more than {int}")
   public void the_user_enters_a_same_password_in_both_password_with_all_numeric_more_than(Integer int1) {
   	registerpage.passwordsmismatch();
   }
   @Then("password_mismatch")
   public void password_mismatch() {
	   System.out.println(" error is diaplayed");
   }
   
}


