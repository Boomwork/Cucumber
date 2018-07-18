package net.atos.testlab.cucumber.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import net.atos.testlab.cucumber.pageobjects.PoHeader;
import net.atos.testlab.cucumber.utils.CommonUtils;
import net.atos.testlab.cucumber.utils.DynamicWebWaiter;


public class StepsHeader {
    private final WebDriver webDriver = CommonUtils.getDriver();


    @Then("^the header \"([^\"]*)\" is shown$")
    public void theHeaderIsShown(String headerName) {
        DynamicWebWaiter.waitForPageReady(this.webDriver);
        new PoHeader(webDriver, headerName).getElement().isDisplayed();

    }
}
