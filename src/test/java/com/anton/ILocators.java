package com.anton;

public interface ILocators {
    String LOGIN_BUTTON = "//button[@class='button brand-btn']";
    String USERNAME_FIELD="//input[@id='UserName']";
    String PASSWORD_FIELD="//input[@id='Password']";
    String HOME_LOGO="//span[@class='logi-font icon-datahub']";
    String SOURCES_BUTTON="//span[@data-bind=\"text:i18n('sources.label')\"]";
    String SOURCES_ICON="//span[@class=\"logi-font icon-sources\"]";
    String CREATE_NEW_SOURCE_BUTTON="//span[@data-bind=\"text: i18nTitle('connections.home.createNewConnectionLabel')\"]";
    String ADD_SOURCE_WINDOW="//span[contains(text(),'Add Source')]";
    String DATA_PROVIDER_DROPDOWN="//select[@id='selectDataProvider']";
    String SQL_SERVER_OPTION="//option[@value='SQLServer']";
    String SQL_SERVER_SELECTED_OPTION=".//*[@id='selectDataProvider']/option[@value='SQLServer']";
    String NEW_CONNECTION_SOURCE_NAME_FIELD ="//input[contains(@data-bind,'ConnectionName')]";
    String NEW_CONNECTION_SERVER_NAME_FIELD ="//input[contains(@data-bind,'server')]";
    String NEW_CONNETION_USER_NAME_FIELD="//input[contains(@data-bind,'user')]";
    String NEW_CONNECTION_PASSWORD_FIELD="//input[contains(@data-bind,'password')]";
    String NEW_CONNECTION_GET_DATABASES_BUTTON="//button[contains(@data-bind,'getDatabases')]";
    String NEW_CONNECTION_DATABASE_NAME_SELECTOR="//select[contains(@data-bind,'options: selectedDataProvider().databases')]";
    String NEW_CONNECTION_DATABASE_SELECTOR_NGP_OPTION="//option[@value=\"NGP\"]";
    String NEW_CONNECTION_PORT_NUMBER_FIELD="//input[contains(@data-bind,'PortNumber')]";
    String NEW_CONNECTION_TEST_SOURCE_BUTTON="//button/span[contains(text(),'Test Source')]";
    String NEW_CONNECTION_SUCCESSFUL_TEST_ALERT_MESSAGE="//div[@class='alert success-message']";
    String NEW_CONNECTION_SAVE_BUTTON="//button/span[contains(text(),'Save')]";
    String CREATED_CONNECTION_TITLE="//h3[contains(text(),'QASQL2K8')]";
}
