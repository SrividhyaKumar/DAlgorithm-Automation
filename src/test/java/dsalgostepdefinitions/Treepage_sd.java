package dsalgostepdefinitions;

import java.io.IOException;

import org.junit.Assert;

import dsalgodrivers.DriverFactory;
import dsalgopages.Datastructurepage_pf;
import dsalgopages.Treepage_pf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Treepage_sd {
	
  Treepage_pf treepage=new Treepage_pf(DriverFactory.getDriver());
  Datastructurepage_pf datapage=new  Datastructurepage_pf(DriverFactory.getDriver());

    
	@When(": The user clicks on Get Started button of Tree")
	public void the_user_clicks_on_get_started_button_of_tree() {
	    treepage.clickgetstarted();
	    System.out.println("User clicks on Get Started");
	}

	@Then(": The user should be navigated to the Tree page")
	public void the_user_should_be_navigated_to_the_tree_page() {
		 System.out.println("User get navigated to Tree page");
	   
	}

	@When(": The user clicks on Overview of Trees")
	public void the_user_clicks_on_overview_of_trees() {
	    
	   treepage.clickOnOverview();
	}

	@Then(": The user should be directed to the {string} of Tree Page")
	public void the_user_should_be_directed_to_the_of_tree_page(String string) {
		System.out.println("User navigated to "+string+" page");
	   
	}

	@Then(": The user clicks the {string} button.")
	public void the_user_clicks_the_button(String string) {
	   treepage.tryHere();
	   
	}

	@Then(": user should be redirected to a page having a TryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test() throws IOException {
	   treepage.pythonEditor();
	}

	@When(": The user clicks on Terminologies")
	public void the_user_clicks_on_terminologies() {
	    treepage.clickTerminologies();
	   
	}

	@When(": The user clicks on Types of Trees")
	public void the_user_clicks_on_types_of_trees() {
	   treepage.typesOfTrees();
	   
	}

	@When(":  The user clicks on Tree Traversals")
	public void the_user_clicks_on_tree_traversals() {
	    treepage.treeTraversal();
	   
	}

//	@When(":  The user clicks on Traversal Illustration")
//	public void the_user_clicks_on_traversal_illustration() {
//	    
//	 //  treepage.traversalIllustration();
//	}

	@When(":  The user clicks on Binary Trees")
	public void the_user_clicks_on_binary_trees() {
	    treepage.binaryTrees();
	   
	}

	@When(":  The user clicks on Types of Binary Trees")
	public void the_user_clicks_on_types_of_binary_trees() {
	    treepage.typesOfBinaryTrees();
	   
	}

	@When(":  The user clicks on Implementation in Python")
	public void the_user_clicks_on_implementation_in_python() {
	    treepage.implementationInPython();
	   
	}

	@When(":  The user clicks on Binary Tree traversals")
	public void the_user_clicks_on_binary_tree_traversals() {
	    
	   treepage.binaryTreeTraversal();
	}

	@When(":  The user clicks on Implementation of Binary Trees")
	public void the_user_clicks_on_implementation_of_binary_trees() {
	  treepage.implementationOfBinaryTrees();
	   
	}

	@When(":  The user clicks on Binary Search Trees")
	public void the_user_clicks_on_binary_search_trees() {
	    
	   treepage.binarySearchTree();
	}

	@When(":  The user clicks on Implementation of BST")
	public void the_user_clicks_on_implementation_of_bst() {
	    treepage.implementationOfBST();
	   
	}


}
