package net.atos.testlab.cucumber.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;
import net.atos.testlab.cucumber.pageobjects.PoCheckbox;
import net.atos.testlab.cucumber.utils.CommonUtils;
import net.atos.testlab.cucumber.utils.DynamicWebWaiter;


public class StepsCheckbox {

    private final WebDriver webDriver = CommonUtils.getDriver();

    @When("^user clicks on the checkbox \"([^\"]*)\"$")
    public void userClicksOnTheCheckbox(String checkboxName){
        DynamicWebWaiter.waitForPageReady(this.webDriver);
        new PoCheckbox(webDriver, checkboxName).click();
    }

}
