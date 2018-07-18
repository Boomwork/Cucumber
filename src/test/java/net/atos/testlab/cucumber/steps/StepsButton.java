package net.atos.testlab.cucumber.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;
import net.atos.testlab.cucumber.pageobjects.PoButton;
import net.atos.testlab.cucumber.utils.CommonUtils;
import net.atos.testlab.cucumber.utils.DynamicWebWaiter;

/**
 * TODO - DESCRIBE ME
 */
public class StepsButton {
    private final WebDriver webDriver = CommonUtils.getDriver();

    @When("^user clicks on the button \"([^\"]*)\"$")
    public void userClicksOnTheButton(String buttonName) {
        DynamicWebWaiter.waitForPageReady(this.webDriver);
        new PoButton(webDriver, buttonName).click();
    }
}
