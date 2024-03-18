@one
Feature: Login to Cyclos Website

  Scenario: Successful login
    Given I open the Cyclos login page
    When I enter "demo" as username and "1234" as password
    And I click the login button
    Then I should be logged in successfully