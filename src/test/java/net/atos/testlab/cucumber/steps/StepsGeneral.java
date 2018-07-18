package net.atos.testlab.cucumber.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.atos.testlab.cucumber.utils.CommonUtils;
import net.atos.testlab.cucumber.utils.DynamicWebWaiter;

/**
 * TODO - DESCRIBE ME
 */
public class StepsGeneral {

    private final WebDriver webDriver = CommonUtils.getDriver();



    @Given("^user navigates to \"([^\"]*)\"$")
    public void userNavigateTo(String url){
        DynamicWebWaiter.waitForPageReady(this.webDriver);
        this.webDriver.navigate().to(url);
    }

    @Then("^the title \"([^\"]*)\" shown$")
    public void theTitleShown(String title){
        DynamicWebWaiter.waitForPageReady(this.webDriver);
        this.webDriver.getTitle().contains(title);
    }







}
