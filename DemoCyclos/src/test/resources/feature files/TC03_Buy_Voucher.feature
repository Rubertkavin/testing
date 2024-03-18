@three
Feature: Buy Voucher
  
Scenario: Successful login
    Given I open the Cyclos login page
    When I enter "demo" as username and "1234" as password
    And I click the login button
    Then I should be logged in successfully
 
 Scenario: Successfully Buy Voucher
 Given I open cyclos login page
 When I click on "My Voucher"
 Then I Click on "Buy Voucher" from the market place page
 Then I select "cinema voucher" 
 And I enter number of vouchers as "2"
 Then I enter Amout per voucher as "10"
 Then I select Usage as "This voucher is a gift"
 When I click on "Next" button
 Then I clik on "Confirm"
 
 