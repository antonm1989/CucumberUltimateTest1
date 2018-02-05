package com.anton.steps.serenity;

import com.anton.pages.DictionaryPage;
import com.anton.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    //DictionaryPage dictionaryPage;
    HomePage homePage;

//    @Step
//    public void enters(String keyword) {
//        dictionaryPage.enter_keywords(keyword);
//    }
//
//    @Step
//    public void starts_search() {
//        dictionaryPage.lookup_terms();
//    }
//
//    @Step
//    public void should_see_definition(String definition) {
//        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
//    }
//
//    @Step
//    public void is_the_home_page() {
//        dictionaryPage.open();
//    }
//
//    @Step
//    public void looks_for(String term) {
//        enters(term);
//        starts_search();
//    }
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
}