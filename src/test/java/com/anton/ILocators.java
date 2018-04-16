package com.anton;

import org.yecht.Data;

public interface ILocators {
    String LOGIN_BUTTON = "//button[@class='button brand-btn']";
    String USERNAME_FIELD = "//input[@id='UserName']";
    String PASSWORD_FIELD = "//input[@id='Password']";

    String HOME_LOGO = "//span[@class='logi-font icon-datahub']";

    String SOURCES_BUTTON = "//span[contains(text(),'Sources')]";
    String CREATE_NEW_SOURCE_BUTTON = "//span[contains(text(),'Create New Source')]";

    String ADD_SOURCE_WINDOW = "//span[contains(text(),'Add Source')]";

    String DATA_PROVIDER_DROPDOWN = "//select[@id='selectDataProvider']";
    String DATA_PROVIDER_OPTION = "//option[@value='$1']";
    String DATA_PROVIDER_OPTIONS = "//select[@id='selectDataProvider']/option";

    String NEW_CONNECTION_SOURCE_NAME_FIELD = "//input[contains(@data-bind,'ConnectionName')]";
    String NEW_CONNECTION_SERVER_NAME_FIELD = "//input[contains(@data-bind,'server')]";
    String NEW_CONNETION_USER_NAME_FIELD = "//input[contains(@data-bind,'user')]";
    String NEW_CONNECTION_PASSWORD_FIELD = "//input[contains(@data-bind,'password')]";
    String NEW_CONNECTION_GET_DATABASES_BUTTON = "//button[contains(@data-bind,'getDatabases')]";
    String NEW_CONNECTION_DATABASE_NAME_SELECTOR = "//select[contains(@data-bind,'options: selectedDataProvider().databases')]";
    String NEW_CONNECTION_DATABASE_SELECTOR_NGP_OPTION = "//option[@value='NGP']";
    String NEW_CONNECTION_PORT_NUMBER_FIELD = "//input[contains(@data-bind,'PortNumber')]";
    String NEW_CONNECTION_TEST_SOURCE_BUTTON = "//button/span[contains(text(),'Test Source')]";
    String NEW_CONNECTION_SUCCESSFUL_TEST_ALERT_MESSAGE = "//div[@class='alert success-message']";
    String NEW_CONNECTION_SAVE_BUTTON = "//button/span[contains(text(),'Save')]";

    String CREATED_CONNECTION_TITLE = "//h3[contains(text(),'$1')]";

    String DATAVIEWS_MAIN_MENU = "//span[contains(text(),'Dataviews')]";
    String CONNECTION_SETTINGS_COG = "//div[@class='cardbox connections']/div/ul/li";
    String CONNECTION_SETTINGS_DELETE_OPTION = "//span[contains(text(),'Delete')]";
    String CONFIRM_DELETE_DIALOG = "//span[contains(text(),'Confirm Delete')]";
    String DELETE_BUTTON = "//button/span[contains(text(),'Delete')]";
    String CREATE_A_NEW_DATAVIEW_OPTION = "//b[contains(text(),'Create a New Dataview')]";
    String CREATE_DATAVIEW_FROM_SOURCE_BUTTON = "//span[contains(text(),'From Source')]";
    String CONNECTION_OBJECTS_TITLE = "//span[contains(text(),'Objects in QASQL2K8')]";

    String WIDGET_OVERLAY_LOADING = "//div[@class='ui-widget-overlay loading']";

    String SEARCH_TABLE_BY_NAME_FIELD = "//li[@class='flex-1 margin-right-small']/div[@class='box with-header']/div[@class='filter-inputs']/input[@class='string-filter-input']";

    String FIRST_TABLE_NAME_IN_SEARCH_RESULTS = "//li[@class='data-source-table-section-label']/following-sibling::li[1]//span[@title='$1']";
    String SELECTED_TABLE_IN_SEARCH_RESULT = "//li[@class='data-source-table-section-label']/following-sibling::li[1]/div[@class='data-source-table-pill selected']";
    String SELECT_ALL_COLUMNS_BUTTON = "//a[@data-bind='click: function () { onSelectOrDeselectAllColumns(true); }'][contains(text(),'All')]";

    String FIRST_SELECTED_COLUMN="//ul[@id='dataSourceTableColumnsList']//div[@class='data-source-table-column-pill layout-flex used']";

}
