@Registerpage

Feature: Cucumber Register example
@TC_RS_01
   Scenario Outline: Don't enter any field then click on register and error msg is displayed  at username
   Given The user opens Register Page"https://dsportalapp.herokuapp.com/register"
   When   The user clicks "Register" button with all fields empty
   Then   It should display an error "Please fill out this field" below Username textbox
 @TC_RS_02
  Scenario Outline: Enter the username and then leave other fields empty then click registeranderror message is displayed at password field
    Given The user opens Register Page"https://dsportalapp.herokuapp.com/register"
    When  The user clicks "Register" button after entering Username with other fields empty
    Then It should display an error "Please fill out this field" below Password textbox
    @TC_RS_03
    Scenario Outline: Enter username and password and leave the password confiration empty and click registration then error message shown in  password confirmation
    Given  The user opens Register Page"https://dsportalapp.herokuapp.com/register"
    When   The user clicks "Register" button after entering Username and password with Password Confirmation field empty
    Then   It should display an error "Please fill out this field" below Password Confirmation textbox
      @TC_RS_04
      Scenario Outline:   Enter a invalid username then click register  then it shows please enter valid username       
      Given  The user opens Register Page"https://dsportalapp.herokuapp.com/register"          
      When  The user clicks "Register" button after entering invalid username
      Then   It should display an error message "Please enter a valid username"
      @TC_RS_05
      Scenario Outline: Entering  different passwords  in both fields then it shows error message
      Given  The user opens Register Page"https://dsportalapp.herokuapp.com/register"
      When  The user clicks "Register" button after entering different passwords in Password and Password Confirmation fields 
      Then  display an error message "password_mismatch:The two password fields didn’t match."
      @TC_RS_06
      Scenario Outline: Enter valid username and password 
      Given The user opens Register Page"https://dsportalapp.herokuapp.com/register"
      When  The user clicks "Register" button after entering valid Username and password with Password Confirmation 
      Then  but showing password mismatch msg although password fields are same.
      @TC_RS_07
      Scenario Outline: Enter valid usensme and  enter numreic in both password confirm then it shows error
      Given  The user opens Register Page"https://dsportalapp.herokuapp.com/register"
      When   The user enters a same Password in both password with all numeric more than 8
      Then   password_mismatch