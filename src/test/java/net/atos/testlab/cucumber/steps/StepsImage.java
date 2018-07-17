package net.atos.testlab.cucumber.steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import net.atos.testlab.cucumber.pageobjects.PoImage;
import net.atos.testlab.cucumber.utils.CommonUtils;


public class StepsImage {
    private final WebDriver webDriver = CommonUtils.getDriver();

    @Then("^the image \"([^\"]*)\" is shown$")
    public void theImageIsShown(final String imgName) {
        new PoImage(webDriver, imgName).isDisplayed();
    }

}
