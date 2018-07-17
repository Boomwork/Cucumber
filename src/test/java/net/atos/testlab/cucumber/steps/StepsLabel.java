package net.atos.testlab.cucumber.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import net.atos.testlab.cucumber.pageobjects.PoLabel;
import net.atos.testlab.cucumber.utils.CommonUtils;
import net.atos.testlab.cucumber.utils.DynamicWebWaiter;

/**
 * TODO - DESCRIBE ME
 */
public class StepsLabel {
    private final WebDriver webDriver = CommonUtils.getDriver();

    @And("^user clicks on the label \"([^\"]*)\"$")
    public void userClicksOnTheLabel(String labelName) {
        DynamicWebWaiter.waitForPageReady(this.webDriver);
        new PoLabel(webDriver, labelName).click();
    }


}
