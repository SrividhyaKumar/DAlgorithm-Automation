@Arraypage
Feature: Cucumber Array example
@TC_AR_01
 Scenario Outline: open Ds Algo Home page and clicks started button and redirected to Array page
 Given The user is on the DS Algo Home Page
 When  The user clicks  Get Started button below the array
 Then  The user should be redirected to the Array Page
 @TC_AR_02
 Scenario Outline:  click on Array link and rdirect to array in python   
 Given  The user is on the Array in Python Page
 When   The user clicks a Arrays in Python link
 Then The user should be redirected to "Array in Python " 
 @TC_AR_03
 Scenario Outline: click try here and redirected to python editor
 Given The user is on the Array in Python Page
 When  The user clicks Try Here button of Array in Python Page
 Then  The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"
 @TC_AR_04
 Scenario Outline: without entering code click on run button  no error is displayed
 Given The user is on the Python Editor
 When  The user clicks the Run Button without entring the code in the Editor
 Then  Nothing happens to the page and no error message is displayed 


 