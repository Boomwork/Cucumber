package net.atos.testlab.cucumber.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;
import net.atos.testlab.cucumber.pageobjects.PoTextlink;
import net.atos.testlab.cucumber.utils.CommonUtils;

/**
 * TODO - DESCRIBE ME
 */
public class StepsTextlink {

    private final WebDriver webDriver = CommonUtils.getDriver();


    @When("^user clicks on the textlink \"([^\"]*)\"$")
    public void userClicksOnTheTextlink(String textlinkName) {
        new PoTextlink(webDriver, textlinkName).click();
    }
}
