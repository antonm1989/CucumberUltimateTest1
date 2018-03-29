package com.anton.steps.serenity;

import com.anton.ILocators;
import com.anton.pages.ConnectionsPage;
import com.anton.pages.DataAcquisitionPage;
import com.anton.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    LoginPage loginPage;
    ConnectionsPage connectionsPage;
    DataAcquisitionPage dataAcquisitionPage;


    @Step
    public void theUserIsOnTheHomePage(String arg0) {
        loginPage.getDriver().get(arg0);
    }

    @Step
    public void userShouldSeeTheLoginPage(String arg0) {
        Assert.assertEquals("This is not the login page", loginPage.getDriver().getCurrentUrl(), arg0);
    }

    @Step
    public void userShouldSeeLoginButton() {
        Assert.assertTrue("Login button is not present", loginPage.userShouldSeeLoginButton());
    }

    @Step
    public void userPerformLoginWithAnd(String arg0, String arg1) {
        loginPage.userPerformLoginWithAnd(arg0, arg1);
    }

    @Step
    public void userShouldSeeHomeLogo() {
        Assert.assertTrue("Home logo is not present", loginPage.userShouldSeeHomeLogo());
    }


    @Step
    public void userShouldSeeSourcesButton() {
        Assert.assertTrue("Sources button is not present", connectionsPage.userShouldSeeSourcesButton());
    }

    @Step
    public void userClicksOnSourcesButton() {
        connectionsPage.waitForPresenceOf(ILocators.SOURCES_BUTTON);
        connectionsPage.userClicksOnSourcesButton();
    }

    @Step
    public void userShouldSeeConnectionsPage(String arg0) {
        connectionsPage.getDriver().get(arg0);
    }

    @Step
    public void userShouldSeeCreateNewSourceButton() {
        Assert.assertTrue("Create New Source button is not present", connectionsPage.userShouldSeeCreateNewSourceButton());
    }

    @Step
    public void userClicksCreateNewSourceButton() {
        connectionsPage.userClicksCreateNewSourceButton();
    }

    @Step
    public void userShouldSeeAddSourceWindow() {
        Assert.assertTrue("Add Source window is not present", connectionsPage.userShouldSeeAddSourceWindow());
    }

    @Step
    public void userShouldSeeSelectDataProviderDropdown() {
        Assert.assertTrue("Select Data Provider dropdown is not present", connectionsPage.userShouldSeeSelectDataProviderDropdown());
    }

    @Step
    public void userClicksOnSelectDataProviderDropdown() {
        connectionsPage.userClicksOnSelectDataProviderDropdown();
    }

    @Step
    public void userShouldSeeOption(String arg0) {
        Assert.assertTrue(arg0 + " data provider option is not present", connectionsPage.userShouldSeeOption(arg0));
    }

    @Step
    public void userClicksOnOption(String arg0) {
        connectionsPage.userClicksOnOption(arg0);
    }


    @Step
    public void userShouldSeeConnectionNameField() {
        Assert.assertTrue("Connection Name field is not present", connectionsPage.userShouldSeeConnectionNameField());
    }

    @Step
    public void userEntersConnectionNameAs(String arg0) {
        connectionsPage.userEntersConnectionNameAs(arg0);
    }

    @Step
    public void userEntersServerNameAs(String arg0) {
        connectionsPage.userEntersServerNameAs(arg0);
    }

    @Step
    public void userEntersUserNameAs(String arg0) {
        connectionsPage.userEntersUserNameAs(arg0);
    }

    @Step
    public void userEntersPasswordAs(String arg0) {
        connectionsPage.userEntersPasswordAs(arg0);
    }

    @Step
    public void userClickGetDatabasesButton() {
        connectionsPage.userClickGetDatabasesButton();
    }

    @Step
    public void userShouldSeeDatabaseNameSelector() {
        Assert.assertTrue("Database Selector is not present", connectionsPage.userShouldSeeDatabaseNameSelector());
    }

    @Step
    public void userClicksOnDatabaseNameSelector() {
        connectionsPage.waitForPresenceOf(ILocators.NEW_CONNECTION_DATABASE_NAME_SELECTOR);
        connectionsPage.userClicksOnDatabaseNameSelector();
    }

    @Step
    public void userShouldSeeNGPOption() {
        Assert.assertTrue("NGP option is not present", connectionsPage.userShouldSeeNGPOption());
    }

    @Step
    public void userSelectsNGPOption() {
        connectionsPage.userSelectsNGPOption();
    }

    @Step
    public void userShouldSeeThatNGPOptionIsSelected() {
        Assert.assertTrue("NGP option is not selected", connectionsPage.userShouldSeeThatNGPOptionIsSelected());
    }

    @Step
    public void userShouldSeeThatPortNumberIsSetTo(String arg0) {
        Assert.assertTrue("Port Number is not set to 1433", connectionsPage.userShouldSeeThatPortNumberIsSetTo(arg0));
    }

    @Step
    public void userClicksTestSourceButton() {
        connectionsPage.userClickTestSourceButton();
    }

    @Step
    public void userShouldSeeSuccessfulTestConfirmationMessage() {
        Assert.assertTrue("Successful Test message is not present", connectionsPage.userShouldSeeSuccessfulTestConfirmationMessage());
    }

    @Step
    public void userClicksOnSaveButton() {
        connectionsPage.userClicksOnSaveButton();
    }


    @Step
    public void userShouldSeeCreatedConnection(String arg0) {
        Assert.assertTrue("Created connection " + arg0 + " is not present", connectionsPage.userShouldSeeCreatedConnection(arg0));
    }

    @Step
    public void userHoversMouseOverDataviewsMenu() {
        connectionsPage.userHoversMouseOverDataviewsMenu();
    }

    @Step
    public void userShouldSeeConnectionSettingsCog() {
        Assert.assertTrue("Connection Settings Cog is not present", connectionsPage.userShouldSeeConnectionSettingsCog());
    }

    @Step
    public void userHoversMouseOverConnectionSettingsCog() {
        connectionsPage.userHoversMouseOverConnectionSettingsCog();
    }

    @Step
    public void userShouldSeeDeleteMenuOption() {
        Assert.assertTrue("Delete Connection option is not present", connectionsPage.userShouldSeeDeleteMenuOption());
    }

    @Step
    public void userClickDeleteMenuOption() {
        connectionsPage.userClickDeleteMenuOption();
    }

    @Step
    public void userShouldSeeConfirmDeleteDialog() {
        Assert.assertTrue("Confirm Delete Connection dialog is not present", connectionsPage.userShouldSeeConfirmDeleteDialog());
    }

    @Step
    public void userShouldSeeDeleteButton() {
        Assert.assertTrue("Delete Connection button is not present", connectionsPage.userShouldSeeDeleteButton());
    }

    @Step
    public void userClicksDeleteButton() {
        connectionsPage.userClicksDeleteButton();
    }

    @Step
    public void connectionShouldBeRemoved() {
        Assert.assertFalse("Connection is not removed", connectionsPage.connectionShouldBeRemoved());
    }

    @Step
    public void userShouldSeeCreateANewDataviewOption() {
        Assert.assertTrue("Create a New Dataview option is not present", connectionsPage.userShouldSeeCreateANewDataviewOption());
    }

    @Step
    public void userClicksCreateANewDataviewOption() {
        connectionsPage.userClicksCreateANewDataviewOption();
    }

    @Step
    public void userShouldSeeDataAcquisitionPage(String arg0) {
        dataAcquisitionPage.getDriver().get(arg0);

    }

    @Step
    public void userShouldSeeCreateFromSourceButton() {
        Assert.assertTrue("Create Dataview From Source button is not present", dataAcquisitionPage.userShouldSeeCreateFromSourceButton());
    }

    @Step
    public void userClickCreateFromSourceButton() {
        dataAcquisitionPage.userClickCreateFromSourceButton();
    }

    @Step
    public void userShouldSeeConnectionName(String arg0) {
        Assert.assertTrue("Connection name is not present in Create From Source flow", dataAcquisitionPage.userShouldSeeConnectionName(arg0));
    }


    @Step
    public void userShouldSeeConnectionObjects() {
        Assert.assertTrue("Connection Objects Title is not present", dataAcquisitionPage.userShouldSeeConnectionObjects());
    }

    @Step
    public void userEntersTableNameIsSearchField(String arg0) {
        dataAcquisitionPage.userEntersTableNameIsSearchField(arg0);
    }


    @Step
    public void userSelectsTableInFilterResults(String arg0) {
        dataAcquisitionPage.userSelectsTableInFilterResults(arg0);
    }


    @Step
    public void userSelectsAllColumns() {
        dataAcquisitionPage.userSelectsAllColumns();
    }

    @Step
    public void userClicksOnConnectionName(String arg0) {
        dataAcquisitionPage.userClicksOnConnectionName(arg0);
    }

    @Step
    public void userShouldSeeTableInFilterResults(String arg0) {
        Assert.assertTrue("Table " + arg0 + " is not shown as 1st search result", dataAcquisitionPage.userShouldSeeTableInFilterResults(arg0));
    }

    public void userShouldSeeThatTableIsSelected(String arg0) {
        Assert.assertTrue("Table " + arg0 + " is not selected in search results", dataAcquisitionPage.userShouldSeeThatTableIsSelected());
    }

    public void userShouldSeeThatAllColumnsAreSelected() {
        Assert.assertTrue("Columns are not selected", dataAcquisitionPage.userShouldSeeThatAllColumnsAreSelected());
    }
}