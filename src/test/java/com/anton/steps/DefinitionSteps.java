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


    @Then("^user should see \"([^\"]*)\" option$")
    public void userShouldSeeOption(String arg0) throws Throwable {
        steps.userShouldSeeOption(arg0);
    }


    @When("^user clicks on \"([^\"]*)\" option$")
    public void userClicksOnOption(String arg0) throws Throwable {
        steps.userClicksOnOption(arg0);
    }

    @Then("^user should see Connection Name field$")
    public void userShouldSeeConnectionNameField() throws Throwable {
        steps.userShouldSeeConnectionNameField();
    }


    @When("^user enters Connection Name as \"([^\"]*)\"$")
    public void userEntersConnectionNameAs(String arg0) throws Throwable {
        steps.userEntersConnectionNameAs(arg0);
    }

    @When("^user enters Server Name as \"([^\"]*)\"$")
    public void userEntersServerNameAs(String arg0) throws Throwable {
        steps.userEntersServerNameAs(arg0);
    }

    @When("^user enters User Name as \"([^\"]*)\"$")
    public void userEntersUserNameAs(String arg0) throws Throwable {
        steps.userEntersUserNameAs(arg0);
    }

    @When("^user enters Password as \"([^\"]*)\"$")
    public void userEntersPasswordAs(String arg0) throws Throwable {
        steps.userEntersPasswordAs(arg0);
    }

    @When("^user click Get Databases button$")
    public void userClickGetDatabasesButton() throws Throwable {
        steps.userClickGetDatabasesButton();
    }

    @Then("^user should see Database Name selector$")
    public void userShouldSeeDatabaseNameSelector() throws Throwable {
        steps.userShouldSeeDatabaseNameSelector();
    }

    @When("^user clicks on Database Name selector$")
    public void userClicksOnDatabaseNameSelector() throws Throwable {
        steps.userClicksOnDatabaseNameSelector();
    }

    @Then("^user should see NGP option$")
    public void userShouldSeeNGPOption() throws Throwable {
        steps.userShouldSeeNGPOption();
    }

    @When("^user selects NGP option$")
    public void userSelectsNGPOption() throws Throwable {
        steps.userSelectsNGPOption();
    }

    @Then("^user should see that NGP option is selected$")
    public void userShouldSeeThatNGPOptionIsSelected() throws Throwable {
        steps.userShouldSeeThatNGPOptionIsSelected();
    }

    @Then("^user should see that Port Number is set to \"([^\"]*)\"$")
    public void userShouldSeeThatPortNumberIsSetTo(String arg0) throws Throwable {
        steps.userShouldSeeThatPortNumberIsSetTo(arg0);
    }

    @When("^user clicks Test Source button$")
    public void userClicksTestSourceButton() throws Throwable {
        steps.userClicksTestSourceButton();
    }

    @Then("^user should see Successful Test Confirmation message$")
    public void userShouldSeeSuccessfulTestConfirmationMessage() throws Throwable {
        steps.userShouldSeeSuccessfulTestConfirmationMessage();
    }

    @When("^user clicks on Save button$")
    public void userClicksOnSaveButton() throws Throwable {
        steps.userClicksOnSaveButton();
    }


    @Then("^user should see created connection \"([^\"]*)\"$")
    public void userShouldSeeCreatedConnection(String arg0) throws Throwable {
        steps.userShouldSeeCreatedConnection(arg0);
    }

    @When("^user hovers mouse over Dataviews menu$")
    public void userHoversMouseOverDataviewsMenu() throws Throwable {
        steps.userHoversMouseOverDataviewsMenu();
    }

    @Then("^user should see Connection Settings Cog$")
    public void userShouldSeeConnectionSettingsCog() throws Throwable {
        steps.userShouldSeeConnectionSettingsCog();
    }

    @When("^user hovers mouse over Connection Settings Cog$")
    public void userHoversMouseOverConnectionSettingsCog() throws Throwable {
        steps.userHoversMouseOverConnectionSettingsCog();
    }

    @Then("^user should see Delete Menu Option$")
    public void userShouldSeeDeleteMenuOption() throws Throwable {
        steps.userShouldSeeDeleteMenuOption();
    }

    @When("^user click Delete Menu Option$")
    public void userClickDeleteMenuOption() throws Throwable {
        steps.userClickDeleteMenuOption();
    }

    @Then("^user should see Confirm Delete Dialog$")
    public void userShouldSeeConfirmDeleteDialog() throws Throwable {
        steps.userShouldSeeConfirmDeleteDialog();

    }

    @And("^user should see Delete button$")
    public void userShouldSeeDeleteButton() throws Throwable {
        steps.userShouldSeeDeleteButton();

    }

    @When("^user clicks Delete button$")
    public void userClicksDeleteButton() throws Throwable {
        steps.userClicksDeleteButton();
    }

    @Then("^connection should be removed$")
    public void connectionShouldBeRemoved() throws Throwable {
        steps.connectionShouldBeRemoved();
    }

    @Then("^user should see Create A New Dataview option$")
    public void userShouldSeeCreateANewDataviewOption() throws Throwable {
        steps.userShouldSeeCreateANewDataviewOption();

    }

    @When("^user clicks Create A New Dataview option$")
    public void userClicksCreateANewDataviewOption() throws Throwable {
        steps.userClicksCreateANewDataviewOption();

    }

    @Then("^user should see DataAcquisition page \"([^\"]*)\"$")
    public void userShouldSeeDataAcquisitionPage(String arg0) throws Throwable {
        steps.userShouldSeeDataAcquisitionPage(arg0);
    }

    @And("^user should see Create From Source button$")
    public void userShouldSeeCreateFromSourceButton() throws Throwable {
        steps.userShouldSeeCreateFromSourceButton();
    }

    @When("^user click Create From Source button$")
    public void userClickCreateFromSourceButton() throws Throwable {
        steps.userClickCreateFromSourceButton();
    }

    @Then("^user should see Connection name \"([^\"]*)\"$")
    public void userShouldSeeConnectionName(String arg0) throws Throwable {
        steps.userShouldSeeConnectionName(arg0);
    }


    @Then("^user should see Connection Objects$")
    public void userShouldSeeConnectionObjects() throws Throwable {
        steps.userShouldSeeConnectionObjects();
    }

    @When("^user enters table name \"([^\"]*)\" is Search field$")
    public void userEntersTableNameIsSearchField(String arg0) throws Throwable {
        steps.userEntersTableNameIsSearchField(arg0);
    }


    @When("^user selects all columns$")
    public void userSelectsAllColumns() throws Throwable {
        steps.userSelectsAllColumns();
    }


    @When("^user clicks on Connection name \"([^\"]*)\"$")
    public void userClicksOnConnectionName(String arg0) throws Throwable {
        steps.userClicksOnConnectionName(arg0);
    }


    @Then("^user should see \"([^\"]*)\" table in filter results$")
    public void userShouldSeeTableInFilterResults(String arg0) throws Throwable {
        steps.userShouldSeeTableInFilterResults(arg0);
    }

    @When("^user selects table \"([^\"]*)\" in filter results$")
    public void userSelectsTableInFilterResults(String arg0) throws Throwable {
        steps.userSelectsTableInFilterResults(arg0);
    }

    @Then("^user should see that table \"([^\"]*)\" is selected$")
    public void userShouldSeeThatTableIsSelected(String arg0) throws Throwable {
        steps.userShouldSeeThatTableIsSelected(arg0);
    }

    @Then("^user should see that all columns are selected$")
    public void userShouldSeeThatAllColumnsAreSelected() throws Throwable {
        steps.userShouldSeeThatAllColumnsAreSelected();
    }
}
