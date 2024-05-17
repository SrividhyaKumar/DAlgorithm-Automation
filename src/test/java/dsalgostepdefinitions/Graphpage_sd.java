package dsalgostepdefinitions;

import java.io.IOException;

import dsalgodrivers.DriverFactory;
import dsalgopages.Datastructurepage_pf;
import dsalgopages.Graphpage_pf;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Graphpage_sd {

	Graphpage_pf graphpage=new  Graphpage_pf(DriverFactory.getDriver());
	Datastructurepage_pf datapage=new  Datastructurepage_pf(DriverFactory.getDriver());
	@When(": The user clicks on Get Started button of Graph")
	public void the_user_clicks_on_get_started_button_of_graph() {
	  
	  graphpage.clickgetstarted();
	    System.out.println("User clicks on Get Started");
	}

	@Then(": The user should be navigated to the Graph page")
	public void the_user_should_be_navigated_to_the_graph_page() {
		 System.out.println("User get navigated to Graph page");
	    
	}

	@When(": The user clicks on Graph")
	public void the_user_clicks_on_graph() {
	   graphpage.clickgraph();
	    
	}

	@Then(": The user should be directed to the {string} of Graph Page")
	public void the_user_should_be_directed_to_the_of_graph_page(String string) {
		System.out.println("User navigated to "+string+" page");
	    
	}

	@Then(": The user clicks on {string} button..")
	public void the_user_clicks_on_button(String string) {
	    
	    graphpage.tryHere();
	}

	@Then(": user should be redirected to a page having an TryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() throws IOException {
	    graphpage.pythonEditor();
	    
	}

	@When(": The user clicks on Graph Representations")
	public void the_user_clicks_on_graph_representations() {
	    graphpage.clickgraphrepresentation();
	    
	}
	
	
	
}
