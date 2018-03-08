package com.anton.pages;

import net.thucydides.core.pages.PageObject;
import com.anton.ILocators;


public class ConnectionsPage extends PageObject {
    public boolean userShouldSeeSourcesButton() {
        return $(ILocators.SOURCES_BUTTON).isPresent();
    }

    public void userClicksOnSourcesButton() {
        $(ILocators.SOURCES_BUTTON).click();
    }

    public boolean userShouldSeeCreateNewSourceButton() {
        return $(ILocators.CREATE_NEW_SOURCE_BUTTON).isPresent();
    }

    public void userClicksCreateNewSourceButton() {
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
        return $(ILocators.NEW_SOURCE_NAME_FIELD).isPresent();
    }
}


