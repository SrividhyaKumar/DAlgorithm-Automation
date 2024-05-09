Feature: Tree in Homepage

  Background: 
    Given : The user is on DS Algo Homepage
    When : The user clicks on Signin button
    And : The user enters "manasa" as username and "Sahasra@123" as password and clicks on login button
    Then :The user should get message as "You are logged in" in homepage

  @TC_TR_01
  Scenario: Click on Get started
    When : The user clicks on Get Started button of Tree
    Then : The user should be navigated to the Tree page

  @TC_TR_02
  Scenario: Click on Overview of Trees
    When : The user clicks on Overview of Trees
    Then : The user should be directed to the "Overview of Trees" of Tree Page
    And : The user clicks the "Try here" button.
    Then : user should be redirected to a page having a TryEditor with a Run button to test

  @TC_TR_03
  Scenario: Click on Terminologies
    When : The user clicks on Terminologies
    Then : The user should be directed to the "Terminologies" of Tree Page
    And : The user clicks the "Try here" button.
    Then : user should be redirected to a page having a TryEditor with a Run button to test

  @TC_TR_04
  Scenario: Click on Types of Trees
    When : The user clicks on Types of Trees
    Then : The user should be directed to the "Types of Trees" of Tree Page
    And : The user clicks the "Try here" button.
    Then : user should be redirected to a page having a TryEditor with a Run button to test

  @TC_TR_04
  Scenario: Click on Tree Traversals
    When :  The user clicks on Tree Traversals
    Then : The user should be directed to the "Tree Traversals" of Tree Page
    And : The user clicks the "Try here" button.
    Then : user should be redirected to a page having a TryEditor with a Run button to test

 # @TC_TR_05
 # Scenario: Click on Traversal Illustration
  #  When :  The user clicks on Traversal Illustration
   # Then : The user should be directed to the "Traversal Illustration" of Tree Page
    #And : The user clicks the "Try here" button.
    #Then : user should be redirected to a page having a TryEditor with a Run button to test

  @TC_TR_06
  Scenario: Click on Binary Trees
    When :  The user clicks on Binary Trees
    Then : The user should be directed to the "Binary Trees" of Tree Page
    And : The user clicks the "Try here" button.
    Then : user should be redirected to a page having a TryEditor with a Run button to test

  @TC_TR_07
  Scenario: Click on Types of Binary Trees
    When :  The user clicks on Types of Binary Trees
    Then : The user should be directed to the "Types of Binary Trees" of Tree Page
    And : The user clicks the "Try here" button.
    Then : user should be redirected to a page having a TryEditor with a Run button to test

  @TC_TR_08
  Scenario: Click on Implementation in Python
    When :  The user clicks on Implementation in Python
    Then : The user should be directed to the "Implementation in Python" of Tree Page
    And : The user clicks the "Try here" button.
    Then : user should be redirected to a page having a TryEditor with a Run button to test

  @TC_TR_09
  Scenario: Click on Binary Tree traversals
    When :  The user clicks on Binary Tree traversals
    Then : The user should be directed to the "Binary Tree traversals" of Tree Page
    And : The user clicks the "Try here" button.
    Then : user should be redirected to a page having a TryEditor with a Run button to test

  @TC_TR_10
  Scenario: Click on Implementation of Binary Trees
    When :  The user clicks on Implementation of Binary Trees
    Then : The user should be directed to the "Implementation of Binary Trees" of Tree Page
    And : The user clicks the "Try here" button.
    Then : user should be redirected to a page having a TryEditor with a Run button to test

  @TC_TR_11
  Scenario: Click on Binary Search Trees
    When :  The user clicks on Binary Search Trees
    Then : The user should be directed to the "Binary Search Trees" of Tree Page
    And : The user clicks the "Try here" button.
    Then : user should be redirected to a page having a TryEditor with a Run button to test

  @TC_TR_12
  Scenario: Click on Implementation of BST
    When :  The user clicks on Implementation of BST
    Then : The user should be directed to the "Implementation of BST" of Tree Page
    And : The user clicks the "Try here" button.
    Then : user should be redirected to a page having a TryEditor with a Run button to test
