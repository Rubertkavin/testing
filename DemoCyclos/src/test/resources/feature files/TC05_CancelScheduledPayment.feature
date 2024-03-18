@five
Feature: Cancel the Scheduled Payment
  

  Scenario Outline: create Scheduled payment
    Given Login cyclos website
    When Click on banking from the cyclos home page
    Then Click on Payment to system
    And Input the Amount 
    Then Click on Scheduled payment option from scheduling field
    And Input the date in due date field
    Then Enter the description 
    And Click on Next button
    Then Click on Confirm button in payment
    
    Scenario Outline: Cancel the scheduled payment
       Given Click on banking from home page
       Then Click on scheduled Payment
       Then Select anyone of the payment form the scheduled payment
       And Click on cancel this scheduled payment
       Then Click on Confirm button 
    
    
    

   
