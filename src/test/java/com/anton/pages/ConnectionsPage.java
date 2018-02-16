package com.anton.pages;

import net.thucydides.core.pages.PageObject;
import com.anton.ILocators;


public class ConnectionsPage extends PageObject {
    public boolean userShouldSeeSourcesButton() {
        return $(ILocators.SOURCES_BUTTON).isPresent();
    }

    public void userClicksOnSourcesButton() {
        $(ILocators.SOURCES_BUTTON).click();
      //  waitABit(3000);
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
}


