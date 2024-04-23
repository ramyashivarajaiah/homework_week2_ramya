Feature: Login Functionality
  As a user i want

  Scenario: User should login successfully
    Given /i am on home page
    When I enter username and password
    And I click on login button
    Then I sucessfully login
