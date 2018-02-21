Feature: Setup data in datahub admin
  In order to be able to build a visualization from data
  As a User
  I want to setup required data in datahub admin


  Scenario: Check login functionality
    Given the user is on the home page "http://172.26.7.119:3000/datahub"
    Then user should see the home page "http://172.26.7.119:3000/datahub/Account/Login"
    When user perform login with "admin" and "password"
    Then user should see home logo


    Then user should see Sources button
    When user clicks on Sources button
    Then user should see Connections page "http://172.26.7.119:3000/datahub/Connections"
    Then user should see Create New Source button
    When user clicks Create New Source button
    Then user should see Add Source window

    

