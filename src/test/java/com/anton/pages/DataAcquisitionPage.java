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

public class DataAcquisitionPage extends PageObject{

    public boolean userShouldSeeCreateFromSourceButton() {
        $(ILocators.CREATE_DATAVIEW_FROM_SOURCE_BUTTON).waitUntilVisible();
        return $(ILocators.CREATE_DATAVIEW_FROM_SOURCE_BUTTON).isVisible();
    }

    public void userClickCreateFromSourceButton() {
        $(ILocators.CREATE_DATAVIEW_FROM_SOURCE_BUTTON).click();
    }

    public boolean userShouldSeeConnectionName() {
        $(ILocators.CREATED_CONNECTION_TITLE).waitUntilVisible();
        return $(ILocators.CREATED_CONNECTION_TITLE).isVisible();
    }
}
