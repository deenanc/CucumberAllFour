Feature: Swag Labs Login

Background: Swag Labs Login Page
Given User is in Swag Labs Login Page

@TC1
Scenario: Login without parameterization
Then User enters username and password and clicks login button

@TC2
Scenario: Login with parameterization
Then User enter "standard_user" and "secret_sause" and clicks login button

@TC3
Scenario: Login without data table header
Then User enters username and password and clicks login button TC3
|locked_out_user|secret_sause|

@TC4
Scenario: Login with data table header
Then User enters username and password and clicks login button TC4
|Username4|Password4|
|locked_out_user|secret_sause|

@TC5
Scenario: Login with example keyword
Then User enters <Username5> and <Password5> and clicks login button TC5
|Username5|Password5|
|standard_user|secret_sause|
|locked_out_user|secret_sause|
|problem_user|secret_sause|
|performance_glitch_user|secret_sause|

