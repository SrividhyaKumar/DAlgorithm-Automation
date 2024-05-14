#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
@LinkedList
Feature: Linked List functionality testing
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
      ##########################################

  #@TC_LoginPage_01
  #Scenario Outline: User logs in with valid username and password 
    #When : The user clicks on login button by entering valid values in "<username>" and "<password>" textboxes
    #Then : User must be redirected to the DS-Algo Home page with username and successful login "<message>"
    #Examples: 
       #|username    | password |message          |
       #|manasa | Sahasra@123 |You are logged in|
       
Background: 
Given : User must be in the Loginpage for linkedlist
When : The user clicks on login button by entering valid values in "manasa" and "Sahasra@123" textboxes linkedlist
Then : User must be redirected to the DSAlgo Home page with username and successful login "You are logged in"
When : The user clicks on Get Started button of Linked List
       
@TC_LinkedList_01
Scenario: User clicks on LinkedList Get Started from home page
Then : The user should be navigated to the Linked List page

@TC_LinkedList_02
Scenario: User clicks on Introduction link
When : The user clicks on Introduction button
Then : The user should be directed to "Introduction" of Linked List Page
And : The user clicks in the "Try here" button
Then : User should be redirected to the page having an tryEditor with a Run button to test

@TC_LinkedList_03
Scenario: User clicks on Create a Linked List
When : The user clicks  Creating a Linked List button
Then : The user should be directed to "Creating Linked LIst" of Linked List Page
And : The user clicks in the "Try here" button
Then : User should be redirected to the page having an tryEditor with a Run button to test

@TC_LinkedList_04
Scenario: User clicks on Types of Linked List
When : User clicks the Types of Linked List button
Then : The user should be directed to "Types of Linked List" of Linked List Page
And : The user clicks in the "Try here" button
Then : User should be redirected to the page having an tryEditor with a Run button to test

@TC_LinkedList_05
Scenario: User clicks on Implement Linked List in Python
When : User clicks Implement Linked List in Python
Then : The user should be directed to "Implement Linked List in Python" of Linked List Page
And : The user clicks in the "Try here" button
Then : User should be redirected to the page having an tryEditor with a Run button to test

@TC_LinkedList_06
Scenario: User clicks on Traversal
When : User clicks on Traversal button
Then : The user should be directed to "Traversal" of Linked List Page
And : The user clicks in the "Try here" button
Then : User should be redirected to the page having an tryEditor with a Run button to test

@TC_LinkedList_07
Scenario: User clicks on Insertion
When : User clciks on Insertion button
Then : The user should be directed to "Insertion" of Linked List Page
And : The user clicks in the "Try here" button
Then : User should be redirected to the page having an tryEditor with a Run button to test

@TC_LinkedList_08
Scenario: User clicks on Deletion
When : User clicks on Deletion button
Then : The user should be directed to "Insertion" of Linked List Page
And : The user clicks in the "Try here" button
Then : User should be redirected to the page having an tryEditor with a Run button to test

#@TC_LinkedList_09
#Scenario: User clicks on Practice Question
#When : User clicks on Practice Question button
#Then : The user should be directed to "Practice" page of Linked List Page

       
       
