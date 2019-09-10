Feature: AddCustomer flow

  Scenario: 
    Given user should be in the telecom home page
    And user click on add customer button
    When user enters all the fields with valid data
    And user clicks on submit button
    Then user should be displayed customer id is generated

  Scenario: 
    Given user should be in the telecom home page
    And user click on add customer button
    When user enters all the fields with valid data.
      | Rajasri | lakshmi | rajasri@gmail.com | Pondy | 9845673487 |
    And user clicks on submit button
    Then user should be displayed customer id is generated
