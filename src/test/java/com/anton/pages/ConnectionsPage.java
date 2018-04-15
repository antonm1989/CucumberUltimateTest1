package com.anton.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import com.anton.ILocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


public class ConnectionsPage extends PageObject {

    public void waitForLoader(String methodName) {
        try {
            withTimeoutOf(60, TimeUnit.SECONDS).waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(ILocators.WIDGET_OVERLAY_LOADING)));
            waitABit(300);
        } catch (Exception e) {
            System.out.println(methodName + " - Wait for loader failed\n");
        }
    }

    public boolean userShouldSeeSourcesButton() {
        waitForLoader("userShouldSeeSourcesButton");
        return $(ILocators.SOURCES_BUTTON).isVisible();
    }

    public void userClicksOnSourcesButton() {

        $(ILocators.SOURCES_BUTTON).click();
        waitForLoader("userClicksOnSourcesButton");
    }

    public boolean userShouldSeeCreateNewSourceButton() {
        return $(ILocators.CREATE_NEW_SOURCE_BUTTON).isVisible();
    }

    public void userClicksCreateNewSourceButton() {
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

    public boolean userShouldSeeOption(String arg0) {
        return $(ILocators.DATA_PROVIDER_OPTION.replace("$1", arg0)).isVisible();
    }

    public void userClicksOnOption(String arg0) {
        List<WebElementFacade> dataProviderOptions = findAll(ILocators.DATA_PROVIDER_OPTIONS);
        for (WebElementFacade elementFacade : dataProviderOptions) {
            if (elementFacade.getText().equalsIgnoreCase(arg0)) {
                elementFacade.click();
                return;
            }
        }
        throw new NoSuchElementException("Option " + arg0 + " is not found");
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
        waitForLoader("userClickGetDatabasesButton");
    }

    public boolean userShouldSeeDatabaseNameSelector() {
        waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(ILocators.NEW_CONNECTION_DATABASE_NAME_SELECTOR)));
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
        waitForLoader("userClickTestSourceButton");

    }

    public boolean userShouldSeeSuccessfulTestConfirmationMessage() {

        $(ILocators.NEW_CONNECTION_SUCCESSFUL_TEST_ALERT_MESSAGE).waitUntilVisible();
        return $(ILocators.NEW_CONNECTION_SUCCESSFUL_TEST_ALERT_MESSAGE).isVisible();
    }

    public void userClicksOnSaveButton() {
        $(ILocators.NEW_CONNECTION_SAVE_BUTTON).waitUntilClickable();
        $(ILocators.NEW_CONNECTION_SAVE_BUTTON).click();
        waitForLoader("userClicksOnSaveButton");
    }

    public boolean userShouldSeeCreatedConnection(String arg0) {

        return $(ILocators.CREATED_CONNECTION_TITLE.replace("$1", arg0)).isVisible();
    }


    public void userHoversMouseOverDataviewsMenu() {
        $(ILocators.DATAVIEWS_MAIN_MENU).waitUntilClickable();

        WebElement dataviews_Main_Menu = $(ILocators.DATAVIEWS_MAIN_MENU).findBy(By.xpath(ILocators.DATAVIEWS_MAIN_MENU));
        Actions builder = new Actions(getDriver());
        builder.moveToElement(dataviews_Main_Menu).build().perform();
    }

    public boolean userShouldSeeConnectionSettingsCog() {
        return $(ILocators.CONNECTION_SETTINGS_COG).isVisible();
    }

    public void userHoversMouseOverConnectionSettingsCog() {
        WebElement connection_Settings_Cog = $(ILocators.CONNECTION_SETTINGS_COG).find(By.xpath(ILocators.CONNECTION_SETTINGS_COG));
        Actions builder = new Actions(getDriver());
        builder.moveToElement(connection_Settings_Cog).build().perform();
    }


    public boolean userShouldSeeDeleteMenuOption() {
        $(ILocators.CONNECTION_SETTINGS_DELETE_OPTION).waitUntilVisible();
        return $(ILocators.CONNECTION_SETTINGS_DELETE_OPTION).isVisible();
    }

    public void userClickDeleteMenuOption() {
        $(ILocators.CONNECTION_SETTINGS_DELETE_OPTION).waitUntilClickable();
        $(ILocators.CONNECTION_SETTINGS_DELETE_OPTION).click();
        waitForLoader("userClickDeleteMenuOption");
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
        waitForLoader("userClicksDeleteButton");

    }

    public boolean connectionShouldBeRemoved() {
        return $(ILocators.CREATED_CONNECTION_TITLE).isVisible();
    }

    public boolean userShouldSeeCreateANewDataviewOption() {
        return $(ILocators.CREATE_A_NEW_DATAVIEW_OPTION).isVisible();
    }

    public void userClicksCreateANewDataviewOption() {
        $(ILocators.CREATE_A_NEW_DATAVIEW_OPTION).click();
    }


}


