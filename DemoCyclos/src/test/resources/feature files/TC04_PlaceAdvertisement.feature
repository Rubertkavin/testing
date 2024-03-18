@four
Feature: Place Advertisement in cyclose website
  
Scenario: Successful login
    Given I open the Cyclos login page
    When I enter "demo" as username and "1234" as password
    And I click the login button
    Then I should be logged in successfully
 
  Scenario: Place Advertisement
  Given I open the Cyclos dashboard page
  When I click on Place AD
  Then I upload the Image 
  And I enter the Title
  Then I select Backing from the category dropdown field
  And I enter the Price amount
  Then I enter publication period date 
  When I select set promotional period checkbox
  Then I enter promotional period date
  And I enter promotional price 
  Then I enter the description
  Then I select Home from the address map dropdown field
  And I click on save button
  
