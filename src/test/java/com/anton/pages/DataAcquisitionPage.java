package com.anton.pages;

import net.serenitybdd.core.pages.PageObjects;
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

public class DataAcquisitionPage extends PageObject {

    public boolean userShouldSeeCreateFromSourceButton() {
        $(ILocators.CREATE_DATAVIEW_FROM_SOURCE_BUTTON).waitUntilVisible();
        return $(ILocators.CREATE_DATAVIEW_FROM_SOURCE_BUTTON).isVisible();
    }

    public void userClickCreateFromSourceButton() {
        $(ILocators.CREATE_DATAVIEW_FROM_SOURCE_BUTTON).click();
    }

    public boolean userShouldSeeConnectionName(String arg0) {
        $(ILocators.CREATED_CONNECTION_TITLE.replace("$1",arg0)).waitUntilVisible();
        return $(ILocators.CREATED_CONNECTION_TITLE.replace("$1",arg0)).isVisible();
    }

//    public void userClicksOnConnectionName() {
//        $(ILocators.CREATED_CONNECTION_TITLE).click();
//    }

    public boolean userShouldSeeConnectionObjects() {
        $(ILocators.CONNECTION_OBJECTS_TITLE).waitUntilVisible();
        $(ILocators.WIDGET_OVERLAY_LOADING).waitUntilPresent();
        return $(ILocators.CONNECTION_OBJECTS_TITLE).isVisible();
    }

    public void userEntersTableNameIsSearchField(String arg0) {


        $(ILocators.SEARCH_TABLE_BY_NAME_FIELD).click();
        $(ILocators.SEARCH_TABLE_BY_NAME_FIELD).sendKeys(arg0);

    }

    public boolean userShouldSeeOrdersTableInFilterResults() {
        return $(ILocators.FIRST_TABLE_NAME_IN_SEARCH_RESULTS).isVisible();
    }

    public void userSelectsTableInFilterResults() {
        $(ILocators.FIRST_TABLE_NAME_IN_SEARCH_RESULTS).click();
    }

    public boolean userShouldSeeThatTheTableIsSelected() {
        return $(ILocators.SELECTED_TABLE_IN_SEARCH_RESULT).isVisible();
    }

    public void userSelectsAllColumns() {
        $(ILocators.SELECT_ALL_COLUMNS_BUTTON).click();
    }

    public void userClicksOnConnectionName(String arg0) {
        $(ILocators.CREATED_CONNECTION_TITLE.replace("$1",arg0)).click();
    }
}
