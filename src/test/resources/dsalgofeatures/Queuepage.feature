@Queuepage
Feature: Queue

  Background: 
    Given : The user is on DS Algo Homepage
    When : The user clicks on Signin button
    And : The user enters "manasa" as username and "Sahasra@123" as password and clicks on login button
    Then :The user should get message as "You are logged in" in homepage
    @tc-Qp-1
    Scenario Outline:the user is on the queue in python page
    Given The user is in the Queue page after logged in
    When  The user clicks  Queue in Python button
    Then The user should be directed to  Queue in Python Page
    
    
      @tc-Qp-2
    Scenario Outline: click on try here
  Given The user is in the Implementation using Collections.deque page 
  When   The user clicks "Try Here" button
  Then   The user should be redirected to a page having an tryEditor with a Run button to test
    @tc-Qp-3
  Scenario Outline: the user is on tryeditor and write valid code and run button
  Given  The user is on the tryEditor page
  When   The User writes Valid python code
  And    click Run button
 Then    User is able to see the output in console
   @tc-Qp-4
 Scenario Outline:  enter invalid code and see error message
 Given The user is on the tryEditor page
 When the user writes invalid python code
 And click run on button
 Then  User is able to see the error msg in pop up window
   @tc-Qp-5
 Scenario Outline: user clicks on collections 
 Given The user is in the Queue page
When   The user clicks "Implementation using Collections.deque" button


 
    
    