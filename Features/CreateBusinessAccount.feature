Feature: Business Account
       
Background: Below are the common steps for Each Scenario
     Given User Launch Chrome Browser 
     When  User open URL "http://dev.bitbatua.com/login"
     And   User enters Email as "prakash@lapits.com" and Password as "Prakash@1"
     And   Click On Login 
     Then  User can View DashBoard
       
Scenario: Create Business Account
     When  User click on Create Business Account
     Then  User Can View Create New Business Account
     When  User Enter Customer info
     And   Click On Add Account
     Then  User Can View Confirmation msg "Your Business Account has been created successfully!"
     And   close browser
     
Scenario: Search wallets by wallets Name
     When  Click on wallets
     And   Click on Search Wallets 
     Then  User Should Found Wallets in Search Table  
     
     
Scenario: Search wallets by wallets Email
     When  Click on wallets
     And   Click on Search Wallets
     Then  User Should Found Wallets in Search Table  
     
     
          