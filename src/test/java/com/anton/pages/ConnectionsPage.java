package com.anton.pages;

import net.thucydides.core.pages.PageObject;
import com.anton.ILocators;
import org.openqa.selenium.By;


public class ConnectionsPage extends PageObject {
    public boolean userShouldSeeSourcesButton() {
        return $(ILocators.SOURCES_BUTTON).isPresent();
    }

    public void userClicksOnSourcesButton() {

        $(ILocators.SOURCES_BUTTON).waitUntilClickable();
        $(ILocators.SOURCES_BUTTON).click();
    }

    public boolean userShouldSeeCreateNewSourceButton() {
        return $(ILocators.CREATE_NEW_SOURCE_BUTTON).isPresent();
    }

    public void userClicksCreateNewSourceButton() {
        $(ILocators.CREATE_NEW_SOURCE_BUTTON).waitUntilClickable();
        $(ILocators.CREATE_NEW_SOURCE_BUTTON).click();
    }

    public boolean userShouldSeeAddSourceWindow() {
        return $(ILocators.ADD_SOURCE_WINDOW).isPresent();
    }

    public boolean userShouldSeeSelectDataProviderDropdown() {
        return $(ILocators.DATA_PROVIDER_DROPDOWN).isPresent();
    }

    public void userClicksOnSelectDataProviderDropdown() {
        $(ILocators.DATA_PROVIDER_DROPDOWN).click();
    }

    public boolean userShouldSeeSQLServerOption() {
        return $(ILocators.SQL_SERVER_OPTION).isPresent();
    }

    public void userClicksOnSQLServerOption() {
        $(ILocators.SQL_SERVER_OPTION).click();
    }


    public boolean userShouldSeeSQLServerOptionSelected() {
        return $(ILocators.SQL_SERVER_SELECTED_OPTION).isVisible();
    }

    public boolean userShouldSeeConnectionNameField() {
        return $(ILocators.NEW_CONNECTION_SOURCE_NAME_FIELD).isPresent();
    }

    public void userEntersConnectionNameAs(String arg0) {
        $(ILocators.NEW_CONNECTION_SOURCE_NAME_FIELD).clear();
        $(ILocators.NEW_CONNECTION_SOURCE_NAME_FIELD).sendKeys(arg0);

    }

    public void userEntersServerNameAs(String arg0) {
        $(ILocators.NEW_CONNECTION_SERVER_NAME_FIELD).clear();
        $(ILocators.NEW_CONNECTION_SERVER_NAME_FIELD).sendKeys(arg0);

    }

    public void userEntersUserNameAs(String arg0) {
        $(ILocators.NEW_CONNETION_USER_NAME_FIELD).clear();
        $(ILocators.NEW_CONNETION_USER_NAME_FIELD).sendKeys(arg0);

    }

    public void userEntersPasswordAs(String arg0) {
        $(ILocators.NEW_CONNECTION_PASSWORD_FIELD).clear();
        $(ILocators.NEW_CONNECTION_PASSWORD_FIELD).sendKeys(arg0);

    }

    public void userClickGetDatabasesButton() {
        $(ILocators.NEW_CONNECTION_GET_DATABASES_BUTTON).click();
    }

    public boolean userShouldSeeDatabaseNameSelector() {
        return $(ILocators.NEW_CONNECTION_DATABASE_NAME_SELECTOR).isPresent();
    }

    public void userClicksOnDatabaseNameSelector() {
        $(ILocators.NEW_CONNECTION_DATABASE_NAME_SELECTOR).click();


    }

    public boolean userShouldSeeNGPOption() {
        return $(ILocators.NEW_CONNECTION_DATABASE_SELECTOR_NGP_OPTION).isPresent();
    }

    public void userSelectsNGPOption() {
        $(ILocators.NEW_CONNECTION_DATABASE_SELECTOR_NGP_OPTION).click();

    }

    public boolean userShouldSeeThatNGPOptionIsSelected() {
        return $(ILocators.NEW_CONNECTION_DATABASE_NAME_SELECTOR).getText().contains("NGP");
    }

    public boolean userShouldSeeThatPortNumberIsSetTo(String arg0) {
        $(ILocators.NEW_CONNECTION_PORT_NUMBER_FIELD).waitUntilPresent();
        return $(ILocators.NEW_CONNECTION_PORT_NUMBER_FIELD).getText().contains(arg0);
    }

    public void userClickTestSourceButton() {
        $(ILocators.NEW_CONNECTION_TEST_SOURCE_BUTTON).waitUntilClickable();
        $(ILocators.NEW_CONNECTION_TEST_SOURCE_BUTTON).click();
    }

    public boolean userShouldSeeSuccessfulTestConfirmationMessage() {
        $(ILocators.NEW_CONNECTION_SUCCESSFUL_TEST_ALERT_MESSAGE).waitUntilPresent();
        return $(ILocators.NEW_CONNECTION_SUCCESSFUL_TEST_ALERT_MESSAGE).isPresent();
    }

    public void userClicksOnSaveButton() {
        $(ILocators.NEW_CONNECTION_SAVE_BUTTON).waitUntilClickable();
        $(ILocators.NEW_CONNECTION_SAVE_BUTTON).click();
    }

    public boolean userShouldSeeCreatedConnection() {
        $(ILocators.CREATED_CONNECTION_TITLE).waitUntilPresent();
        return $(ILocators.CREATED_CONNECTION_TITLE).isPresent();
    }
}


