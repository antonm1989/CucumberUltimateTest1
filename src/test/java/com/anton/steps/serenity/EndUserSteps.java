package com.anton.steps.serenity;

import com.anton.pages.ConnectionsPage;
import com.anton.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    HomePage homePage;
    ConnectionsPage connectionsPage;


    @Step
    public void theUserIsOnTheHomePage(String arg0) {
        homePage.getDriver().get(arg0);
    }
    @Step
    public void userShouldSeeTheHomePage(String arg0) {
        Assert.assertEquals("this is not the home page", homePage.getDriver().getCurrentUrl(),arg0);
    }
    @Step
    public void userShouldSeeLoginButton() {
        Assert.assertTrue("Login button is not present",homePage.userShouldSeeLoginButton());
    }
    @Step
    public void userPerformLoginWithAnd(String arg0, String arg1) {
        homePage.userPerformLoginWithAnd(arg0,arg1);
    }
    @Step
    public void userShouldSeeHomeLogo() {
        Assert.assertTrue("Home logo is not present",homePage.userShouldSeeHomeLogo());
    }


    @Step
    public void userShouldSeeSourcesButton() {
        Assert.assertTrue("Sources button is not present", connectionsPage.userShouldSeeSourcesButton());
    }

    @Step
    public void userClicksOnSourcesButton() {
        connectionsPage.userClicksOnSourcesButton();
    }
    @Step
    public void userShouldSeeConnectionsPage(String arg0) {
        connectionsPage.getDriver().get(arg0);
    }
    @Step
    public void userShouldSeeCreateNewSourceButton() {
        Assert.assertTrue("Create New Source button is not present", connectionsPage.userShouldSeeCreateNewSourceButton());
    }
    @Step
    public void userClicksCreateNewSourceButton() {
        connectionsPage.userClicksCreateNewSourceButton();
    }
    @Step
    public void userShouldSeeAddSourceWindow() {
        Assert.assertTrue("Add Source window is not present", connectionsPage.userShouldSeeAddSourceWindow());
    }
}