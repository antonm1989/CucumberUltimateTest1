Feature: Setup data in datahub admin
  In order to be able to build a visualization from data
  As a User
  I want to setup required data in datahub admin


  Scenario: Check login functionality
    Given the user is on the home page "http://localhost:3000/datahub"
    Then user should see the login page "http://localhost:3000/datahub/Account/Login"
    When user perform login with "admin" and "password"
    Then user should see home logo


    Then user should see Sources button
    When user clicks on Sources button
    Then user should see Connections page "http://localhost:3000/datahub/Connections"
    Then user should see Create New Source button
    When user clicks Create New Source button
    Then user should see Add Source window
    Then user should see Select Data Provider dropdown
    When user clicks on Select Data Provider dropdown
    Then user should see SQL Server option
    When user clicks on SQL Server option
    Then user should see SQL Server option selected
    Then user should see Connection Name field
    When user enters Connection Name as "QASQL2K8"
    When user enters Server Name as "QASQL2K8"
    When user enters User Name as "sa"
    When user enters Password as "LGXpass"
    When user click Get Databases button
    Then user should see Database Name selector
    When user clicks on Database Name selector
    Then user should see NGP option
    When user selects NGP option
    Then user should see that NGP option is selected
    #Then user should see that Port Number is set to "1433"
    When user click Test Source button
    Then user should see Successful Test Confirmation message
    When user clicks on Save button
    Then user should see created connection




