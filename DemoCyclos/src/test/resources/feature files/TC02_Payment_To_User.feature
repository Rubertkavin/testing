@two
Feature: Payment To User on cyclos website
  
Scenario: Successful login
    Given I open the Cyclos login page
    When I enter "demo" as username and "1234" as password
    And I click the login button
    Then I should be logged in successfully
 
  Scenario: Successfully Payment To User
    Given I open Cyclos login page
    When I click on Pay User 
    When I click on Contact list from To User Field
    When I select the BraBen from the contact list
    Then I enter payment Amout "100"
    Then I click on Next Button
    Then I click on Confirm button from the payment confirmation page

