@Stack    
Feature: Stack in Homepage

Background: 
Given : User must be in the Loginpage for stack
When : The user clicks on login button by entering valid values in "manasa" and "Sahasra@123" textboxes stack
Then : User will be redirected to the DSAlgo Home page with username and successful login "You are logged in"
When : The user clicks on Get Started button of stack

@TC_Stack_01
Scenario: user navigates to stack page
#When : The user clicks on Get Started button of Stack
Then : The user should be navigated to  the Stack page

@TC_Stack_02
Scenario: User clicks on Operations in Stack
When : The user clicks on Opeartions in Stack
Then : The user should be directed to the "Operations in Stack" of stack Page
And : User clicks "Try here" button.
Then : user should be redirected to the page having an tryEditor with a Run button to test

@TC_Stack_03
Scenario: User clicks on Implementation
When : The user clicks on Implementation
Then : The user should be directed to the "Implementation" of stack Page
And : User clicks "Try here" button.
Then : user should be redirected to the page having an tryEditor with a Run button to test

@TC_Stack_04
Scenario: User clicks on Applications
When : The user clicks on Applications
Then : The user should be directed to the "Applications" of stack Page
And : User clicks "Try here" button.
Then : user should be redirected to the page having an tryEditor with a Run button to test


