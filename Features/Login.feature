Feature: Login

Scenario: Successfull Login with Valid Credentials 
     Given User Launch Chrome Browser 
     When  User open URL "http://dev.bitbatua.com/login"
     And   User enters Email as "prakash@lapits.com" and Password as "Prakash@1"
     And   Click On Login 
     Then  Page Title Should be "DashBoard Page"
     When  User click on log out link
     Then  Page Title Should be "Accept cryptocurrencies for online payments"
     And   close browser
     

Scenario Outline: Successfull Login with Valid Credentials 
     Given User Launch Chrome Browser 
     When  User open URL "http://dev.bitbatua.com/login"
     And   User enters Email as "<email>" and Password as "<password>"
     And   Click On Login 
     Then  Page Title Should be "DashBoard Page"
     When  User click on log out link
     Then  Page Title Should be "Accept cryptocurrencies for online payments"
     And   close browser
     
     
     Examples:
     | email | password |
     | prakash@lapits.com | Prakash@1 |
     | prakash@lapits.com | Prakash@2 |