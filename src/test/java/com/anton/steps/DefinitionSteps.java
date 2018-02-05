package com.anton.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.anton.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps steps;

//    @Given("the user is on the Wikionary home page")
//    public void givenTheUserIsOnTheWikionaryHomePage() {
//        steps.is_the_home_page();
//    }
//
//    @When("the user looks up the definition of the word '(.*)'")
//    public void whenTheUserLooksUpTheDefinitionOf(String word) {
//        steps.looks_for(word);
//    }
//
//    @Then("they should see the definition '(.*)'")
//    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
//        steps.should_see_definition(definition);
//    }

    @Given("^the user is on the home page \"([^\"]*)\"$")
    public void theUserIsOnTheHomePage(String arg0) throws Throwable {
        steps.theUserIsOnTheHomePage(arg0);
    }

    @Then("^user should see the home page \"([^\"]*)\"$")
    public void userShouldSeeTheHomePage(String arg0) throws Throwable {
        steps.userShouldSeeTheHomePage(arg0);
    }

    @And("^user should see login button$")
    public void userShouldSeeLoginButton() throws Throwable {
        steps.userShouldSeeLoginButton();
    }

    @Then("^user perform login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userPerformLoginWithAnd(String arg0, String arg1) throws Throwable {
       steps.userPerformLoginWithAnd(arg0, arg1);
    }

    @Then("^user should see home logo$")
    public void userShouldSeeHomeLogo() throws Throwable {
        steps.userShouldSeeHomeLogo();
    }
}
