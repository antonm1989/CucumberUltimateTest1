package com.anton.steps.serenity;

import com.anton.ILocators;
import com.anton.pages.ConnectionsPage;
import com.anton.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    LoginPage loginPage;
    ConnectionsPage connectionsPage;


    @Step
    public void theUserIsOnTheHomePage(String arg0) {
        loginPage.getDriver().get(arg0);
    }
    @Step
    public void userShouldSeeTheLoginPage(String arg0) {
        Assert.assertEquals("this is not the login page", loginPage.getDriver().getCurrentUrl(),arg0);
    }
    @Step
    public void userShouldSeeLoginButton() {
        Assert.assertTrue("Login button is not present", loginPage.userShouldSeeLoginButton());
    }
    @Step
    public void userPerformLoginWithAnd(String arg0, String arg1) {
        loginPage.userPerformLoginWithAnd(arg0,arg1);
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
    public void userShouldSeeSQLServerOption() {
        Assert.assertTrue("SQL Server option is not present", connectionsPage.userShouldSeeSQLServerOption());
    }
    @Step
    public void userClicksOnSQLServerOption() {
        connectionsPage.userClicksOnSQLServerOption();
    }
    @Step
    public void userShouldSeeSQLServerOptionSelected() {
        Assert.assertTrue("SQL Server option is not selected", connectionsPage.userShouldSeeSQLServerOptionSelected());
    }
    @Step
    public void userShouldSeeConnectionNameField() {
        Assert.assertTrue("Connection Name field is not present", connectionsPage.userShouldSeeConnectionNameField());
    }

    @Step
    public void userEntersConnectionNameAs(String arg0) {connectionsPage.userEntersConnectionNameAs(arg0);
    }
    @Step
    public void userEntersServerNameAs(String arg0) {connectionsPage.userEntersServerNameAs(arg0);
    }
    @Step
    public void userEntersUserNameAs(String arg0) {connectionsPage.userEntersUserNameAs(arg0);
    }
    @Step
    public void userEntersPasswordAs(String arg0) {connectionsPage.userEntersPasswordAs(arg0);
    }
    @Step
    public void userClickGetDatabasesButton() {connectionsPage.userClickGetDatabasesButton();
    }
    @Step
    public void userShouldSeeDatabaseNameSelector() {
        Assert.assertTrue("Database Selector is not present",connectionsPage.userShouldSeeDatabaseNameSelector());
    }
    @Step
    public void userClicksOnDatabaseNameSelector() {
        connectionsPage.waitForPresenceOf(ILocators.NEW_CONNECTION_DATABASE_NAME_SELECTOR);
        connectionsPage.userClicksOnDatabaseNameSelector();
    }
    @Step
    public void userShouldSeeNGPOption() {
        Assert.assertTrue("NGP option is not present",connectionsPage.userShouldSeeNGPOption());
    }
    @Step
    public void userSelectsNGPOption() {
        connectionsPage.userSelectsNGPOption();
    }
    @Step
    public void userShouldSeeThatNGPOptionIsSelected() {
        Assert.assertTrue("NGP option is not selected",connectionsPage.userShouldSeeThatNGPOptionIsSelected());
    }
    @Step
    public void userShouldSeeThatPortNumberIsSetTo(String arg0) {
        Assert.assertTrue("Port Number is not set to 1433",connectionsPage.userShouldSeeThatPortNumberIsSetTo(arg0));
    }
    @Step
    public void userClickTestSourceButton() {
        connectionsPage.userClickTestSourceButton();
    }
    @Step
    public void userShouldSeeSuccessfulTestConfirmationMessage() {
        Assert.assertTrue("Successful Test message is not present",connectionsPage.userShouldSeeSuccessfulTestConfirmationMessage());
    }
    @Step
    public void userClicksOnSaveButton() {
        connectionsPage.userClicksOnSaveButton();
    }
    @Step
    public void userShouldSeeCreatedConnection() {
        Assert.assertTrue("Created connection is not present",connectionsPage.userShouldSeeCreatedConnection());
    }
}