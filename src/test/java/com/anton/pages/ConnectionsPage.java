package com.anton.pages;

import net.thucydides.core.pages.PageObject;
import com.anton.ILocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ConnectionsPage extends PageObject {


    public boolean userShouldSeeSourcesButton() {
        return $(ILocators.SOURCES_BUTTON).isVisible();
    }

    public void userClicksOnSourcesButton() {

        $(ILocators.SOURCES_BUTTON).waitUntilClickable();
        $(ILocators.SOURCES_BUTTON).click();
    }

    public boolean userShouldSeeCreateNewSourceButton() {
        return $(ILocators.CREATE_NEW_SOURCE_BUTTON).isVisible();
    }

    public void userClicksCreateNewSourceButton() {
        $(ILocators.CREATE_NEW_SOURCE_BUTTON).waitUntilClickable();
        $(ILocators.CREATE_NEW_SOURCE_BUTTON).click();
    }

    public boolean userShouldSeeAddSourceWindow() {
        return $(ILocators.ADD_SOURCE_WINDOW).isVisible();
    }

    public boolean userShouldSeeSelectDataProviderDropdown() {
        return $(ILocators.DATA_PROVIDER_DROPDOWN).isVisible();
    }

    public void userClicksOnSelectDataProviderDropdown() {
        $(ILocators.DATA_PROVIDER_DROPDOWN).click();
    }

    public boolean userShouldSeeSQLServerOption() {
        return $(ILocators.SQL_SERVER_OPTION).isVisible();
    }

    public void userClicksOnSQLServerOption() {
        $(ILocators.SQL_SERVER_OPTION).click();
    }


    public boolean userShouldSeeSQLServerOptionSelected() {
        return $(ILocators.SQL_SERVER_SELECTED_OPTION).isVisible();
    }

    public boolean userShouldSeeConnectionNameField() {
        return $(ILocators.NEW_CONNECTION_SOURCE_NAME_FIELD).isVisible();
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
        waitABit(5000);
        return $(ILocators.NEW_CONNECTION_DATABASE_NAME_SELECTOR).isVisible();
    }

    public void userClicksOnDatabaseNameSelector() {
        $(ILocators.NEW_CONNECTION_DATABASE_NAME_SELECTOR).click();


    }

    public boolean userShouldSeeNGPOption() {
        return $(ILocators.NEW_CONNECTION_DATABASE_SELECTOR_NGP_OPTION).isVisible();
    }

    public void userSelectsNGPOption() {
        $(ILocators.NEW_CONNECTION_DATABASE_SELECTOR_NGP_OPTION).click();

    }

    public boolean userShouldSeeThatNGPOptionIsSelected() {
        return $(ILocators.NEW_CONNECTION_DATABASE_NAME_SELECTOR).getText().contains("NGP");
    }

    public boolean userShouldSeeThatPortNumberIsSetTo(String arg0) {
        $(ILocators.NEW_CONNECTION_PORT_NUMBER_FIELD).waitUntilVisible();
        return $(ILocators.NEW_CONNECTION_PORT_NUMBER_FIELD).getText().contains(arg0);
    }

    public void userClickTestSourceButton() {
        $(ILocators.NEW_CONNECTION_TEST_SOURCE_BUTTON).waitUntilClickable();
        $(ILocators.NEW_CONNECTION_TEST_SOURCE_BUTTON).click();
        waitABit(5000);
    }

    public boolean userShouldSeeSuccessfulTestConfirmationMessage() {
        $(ILocators.NEW_CONNECTION_SUCCESSFUL_TEST_ALERT_MESSAGE).waitUntilVisible();
        return $(ILocators.NEW_CONNECTION_SUCCESSFUL_TEST_ALERT_MESSAGE).isVisible();
    }

    public void userClicksOnSaveButton() {
        $(ILocators.NEW_CONNECTION_SAVE_BUTTON).waitUntilClickable();
        $(ILocators.NEW_CONNECTION_SAVE_BUTTON).click();
        waitABit(9000);
    }

    public boolean userShouldSeeCreatedConnection(String arg0) {
        return $(ILocators.CREATED_CONNECTION_TITLE.replace("$1",arg0)).isVisible();
    }
    

    public void userHoversMouseOverDataviewsMenu() {
        $(ILocators.DATAVIEWS_MAIN_MENU).waitUntilClickable();

        WebElement dataviews_Main_Menu=$(ILocators.DATAVIEWS_MAIN_MENU).findBy(By.xpath(ILocators.DATAVIEWS_MAIN_MENU));
        Actions builder = new Actions(getDriver());
        builder.moveToElement(dataviews_Main_Menu).build().perform();
    }

    public boolean userShouldSeeConnectionSettingsCog() {
        return $(ILocators.CONNECTION_SETTINGS_COG).isVisible();
    }

    public void userHoversMouseOverConnectionSettingsCog() {
        WebElement connection_Settings_Cog=$(ILocators.CONNECTION_SETTINGS_COG).find(By.xpath(ILocators.CONNECTION_SETTINGS_COG));
        Actions builder=new Actions(getDriver());
        builder.moveToElement(connection_Settings_Cog).build().perform();
    }


    public boolean userShouldSeeDeleteMenuOption() {
        $(ILocators.CONNECTION_SETTINGS_DELETE_OPTION).waitUntilVisible();
        return $(ILocators.CONNECTION_SETTINGS_DELETE_OPTION).isVisible();
    }

    public void userClickDeleteMenuOption() {
        $(ILocators.CONNECTION_SETTINGS_DELETE_OPTION).waitUntilClickable();
        $(ILocators.CONNECTION_SETTINGS_DELETE_OPTION).click();
    }

    public boolean userShouldSeeConfirmDeleteDialog() {
        $(ILocators.CONFIRM_DELETE_DIALOG).waitUntilVisible();
        return $(ILocators.CONFIRM_DELETE_DIALOG).isVisible();
    }

    public boolean userShouldSeeDeleteButton() {
        $(ILocators.DELETE_BUTTON).waitUntilVisible();
        return $(ILocators.DELETE_BUTTON).isVisible();
    }

    public void userClicksDeleteButton() {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(ILocators.DELETE_BUTTON))).
                clickOn($(ILocators.DELETE_BUTTON));

    }

    public boolean connectionShouldBeRemoved() {
        $(ILocators.DELETE_BUTTON).waitUntilNotVisible();
        return $(ILocators.CREATED_CONNECTION_TITLE).isVisible();
    }

    public boolean userShouldSeeCreateANewDataviewOption() {
        return $(ILocators.CREATE_A_NEW_DATAVIEW_OPTION).isVisible();
    }

    public void userClicksCreateANewDataviewOption() {
        $(ILocators.CREATE_A_NEW_DATAVIEW_OPTION).click();
    }


}


