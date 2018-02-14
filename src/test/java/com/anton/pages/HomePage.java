package com.anton.pages;

import com.anton.ILocators;
import net.thucydides.core.pages.PageObject;

public class HomePage extends PageObject {
    public boolean userShouldSeeLoginButton() {
        return $(ILocators.LOGIN_BUTTON).isPresent();
    }

    public void userPerformLoginWithAnd(String arg0, String arg1) {
        $(ILocators.USERNAME_FIELD).clear();
        $(ILocators.USERNAME_FIELD).sendKeys(arg0);
        $(ILocators.PASSWORD_FIELD).clear();
        $(ILocators.PASSWORD_FIELD).sendKeys(arg1);
       // waitABit(3000);
        $(ILocators.LOGIN_BUTTON).click();
    }

    public boolean userShouldSeeHomeLogo() {
        return $(ILocators.HOME_LOGO).isPresent();
    }
}
