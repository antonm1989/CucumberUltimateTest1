package com.anton;

public interface ILocators {
    String LOGIN_BUTTON = "//button[@class='button brand-btn']";
    String USERNAME_FIELD="//input[@id='UserName']";
    String PASSWORD_FIELD="//input[@id='Password']";
    String HOME_LOGO="//span[@class='logi-font icon-datahub']";
    String SOURCES_BUTTON="//span[@data-bind=\"text:i18n('sources.label')\"]";
    String CREATE_NEW_SOURCE_BUTTON="//span[@data-bind=\"text: i18nTitle('connections.home.createNewConnectionLabel')\"]";

}
