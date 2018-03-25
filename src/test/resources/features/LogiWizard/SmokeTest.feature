Feature: Setup data in DH3 admin
  In order to be able to build a visualization in wizard
  As a User
  I want to setup required data in DH3 admin


  Scenario: Create connection and Dataview

    Given the user is on the home page "http://localhost:3000/datahub"
    Then user should see the login page "http://localhost:3000/datahub/Account/Login"

    When user perform login with "admin" and "password"
    Then user should see home logo
    And user should see Sources button

    When user clicks on Sources button
    Then user should see Connections page "http://localhost:3000/datahub/Connections"
    And user should see Create New Source button

    When user clicks Create New Source button
    Then user should see Add Source window
    And user should see Select Data Provider dropdown

    When user clicks on Select Data Provider dropdown
    Then user should see SQL Server option

    When user clicks on SQL Server option
    Then user should see SQL Server option selected
    And user should see Connection Name field

    When user enters Connection Name as "QASQL2K8"
    And user enters Server Name as "QASQL2K8"
    And user enters User Name as "sa"
    And user enters Password as "LGXpass"
    And user click Get Databases button
    Then user should see Database Name selector

    When user clicks on Database Name selector
    Then user should see NGP option

    When user selects NGP option
    Then user should see that NGP option is selected

    When user clicks Test Source button
    Then user should see Successful Test Confirmation message

    When user clicks on Save button
    Then user should see created connection

    When user hovers mouse over Dataviews menu
    Then user should see Create A New Dataview option

    When user clicks Create A New Dataview option
    Then user should see DataAcquisition page "http://localhost:3000/Datahub/DataAcquisition"
    And user should see Create From Source button

    When user click Create From Source button
    Then user should see Connection name


    #When user clicks on Sources button
    #Then user should see Connections page "http://localhost:3000/datahub/Connections"
    #And user should see Create New Source button

    #Then user should see Connection Settings Cog

    #When user hovers mouse over Connection Settings Cog
    #Then user should see Delete Menu Option

    #When user click Delete Menu Option
    #Then user should see Confirm Delete Dialog
    #And user should see Delete button

    #When user clicks Delete button
    #Then connection should be removed




