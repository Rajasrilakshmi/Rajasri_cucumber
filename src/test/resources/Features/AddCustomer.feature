Feature: AddCustomer flow

  Scenario: 
    Given user should be in the telecom home page
    And user click on add customer button
    When user enters all the fields with valid data
    And user clicks on submit button
    Then user should be displayed customer id is generated
