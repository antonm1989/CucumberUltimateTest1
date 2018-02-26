package com.anton.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.anton.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps steps;


    @Given("^the user is on the home page \"([^\"]*)\"$")
    public void theUserIsOnTheHomePage(String arg0) throws Throwable {
        steps.theUserIsOnTheHomePage(arg0);
    }

    @Then("^user should see the login page \"([^\"]*)\"$")
    public void userShouldSeeTheLoginPage(String arg0) throws Throwable {
        steps.userShouldSeeTheLoginPage(arg0);
    }

    @And("^user should see login button$")
    public void userShouldSeeLoginButton() throws Throwable {
        steps.userShouldSeeLoginButton();
    }

    @Then("^user perform login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userPerformLoginWithAnd(String arg0, String arg1) throws Throwable {
       steps.userPerformLoginWithAnd(arg0, arg1);
    }

    @Then("^user should see home logo$")
    public void userShouldSeeHomeLogo() throws Throwable {
        steps.userShouldSeeHomeLogo();
    }

    @When("^user clicks on Sources button$")
    public void userClicksOnSourcesButton() throws Throwable {
       steps.userClicksOnSourcesButton();

    }

    @Then("^user should see Sources button$")
    public void userShouldSeeSourcesButton() throws Throwable {
        steps.userShouldSeeSourcesButton();

    }

    @Then("^user should see Connections page \"([^\"]*)\"$")
    public void userShouldSeeConnectionsPage(String arg0) throws Throwable {
        steps.userShouldSeeConnectionsPage(arg0);

    }

    @Then("^user should see Create New Source button$")
    public void userShouldSeeCreateNewSourceButton() throws Throwable {
      steps.userShouldSeeCreateNewSourceButton();
    }

    @When("^user clicks Create New Source button$")
    public void userClicksCreateNewSourceButton() throws Throwable {
       steps.userClicksCreateNewSourceButton();
    }

    @Then("^user should see Add Source window$")
    public void userShouldSeeAddSourceWindow() throws Throwable {
        steps.userShouldSeeAddSourceWindow();
    }

    @Then("^user should see Select Data Provider dropdown$")
    public void userShouldSeeSelectDataProviderDropdown() throws Throwable {
        steps.userShouldSeeSelectDataProviderDropdown();
    }

    @When("^user clicks on Select Data Provider dropdown$")
    public void userClicksOnSelectDataProviderDropdown() throws Throwable {
        steps.userClicksOnSelectDataProviderDropdown();
    }

    @Then("^user should see SQL Server option$")
    public void userShouldSeeSQLServerOption() throws Throwable {
        steps.userShouldSeeSQLServerOption();
    }

    @When("^user clicks on SQL Server option$")
    public void userClicksOnSQLServerOption() throws Throwable {
        steps.userClicksOnSQLServerOption();
    }

    @Then("^user should see SQL Server option selected$")
    public void userShouldSeeSQLServerOptionSelected() throws Throwable {
        steps.userShouldSeeSQLServerOptionSelected();

    }
}
