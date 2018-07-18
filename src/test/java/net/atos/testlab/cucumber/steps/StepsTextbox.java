package net.atos.testlab.cucumber.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;
import net.atos.testlab.cucumber.pageobjects.PoTextbox;
import net.atos.testlab.cucumber.utils.CommonUtils;
import net.atos.testlab.cucumber.utils.DynamicWebWaiter;

/**
 * TODO - DESCRIBE ME
 */
public class StepsTextbox {

    private final WebDriver webDriver = CommonUtils.getDriver();


    @When("^user enters \"([^\"]*)\" in the textbox \"([^\"]*)\"$")
    public void user_enters_in_the_textbox(String text, String textboxName) {
        DynamicWebWaiter.waitForPageReady(this.webDriver);
        new PoTextbox(webDriver, textboxName, PoTextbox.ETextbox.NORMAL).setText(text);
    }

    @When("^user enters \"([^\"]*)\" in the textbox after the label \"([^\"]*)\"$")
    public void userEntersInTheTextboxAfterTheLabel(String text, String labelName) {
        DynamicWebWaiter.waitForPageReady(this.webDriver);
        new PoTextbox(webDriver, labelName, PoTextbox.ETextbox.LABEL).setText(text);
    }
}
