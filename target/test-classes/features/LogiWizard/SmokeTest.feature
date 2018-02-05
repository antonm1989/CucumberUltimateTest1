Feature: Setup data in datahub admin
  In order to be able to build a visualization from data
  As a User
  I want to setup required data in datahub admin

  Scenario: Open a home page
    Given the user is on the home page "http://172.26.7.119:3000/datahub"
    Then user should see the home page "http://172.26.7.119:3000/datahub/Account/Login"
    And user should see login button

  Scenario: Check login functionality
    Given the user is on the home page "http://172.26.7.119:3000/datahub"
    Then user should see the home page "http://172.26.7.119:3000/datahub/Account/Login"
    When user perform login with "admin" and "password"
    Then user should see home logo

