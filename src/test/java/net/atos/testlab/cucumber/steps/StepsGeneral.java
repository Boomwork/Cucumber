package net.atos.testlab.cucumber.steps;

import net.atos.testlab.cucumber.pageobjects.PoHeader;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.atos.testlab.cucumber.pageobjects.PoLabel;
import net.atos.testlab.cucumber.pageobjects.PoTextbox;
import net.atos.testlab.cucumber.pageobjects.PoTextlink;
import net.atos.testlab.cucumber.pageobjects.PoHeader;
import net.atos.testlab.cucumber.utils.CommonUtils;

/**
 * TODO - DESCRIBE ME
 */
public class StepsGeneral {

    private final WebDriver webDriver = CommonUtils.getDriver();



    @Given("^user navigates to \"([^\"]*)\"$")
    public void userNavigateTo(String url) throws Throwable {
        this.webDriver.navigate().to(url);
    }

    @Then("^the title \"([^\"]*)\" shown$")
    public void theTitleShown(String title) throws Throwable {
       this.webDriver.getTitle().contains(title);
    }


    @Then("^the header \"([^\"]*)\" is shown$")
    public void theHeaderIsShown(String titleName) throws Throwable {
        new PoHeader(webDriver, titleName).getElement().isDisplayed();
        Thread.sleep(500);
    }

    @When("^user clicks on the textlink \"([^\"]*)\"$")
    public void userClicksOnTheTextlink(String textlinkName) throws Throwable {

        new PoTextlink(webDriver, textlinkName).click();
    }

    @When("^user enters \"([^\"]*)\" in the textbox \"([^\"]*)\"$")
    public void user_enters_in_the_textbox(String text, String textboxName) throws Throwable {
        new PoTextbox(webDriver, textboxName).setText(text);
        //Thread.sleep(500);
    }

    @And("^user clicks on the label \"([^\"]*)\"$")
    public void userClicksOnTheLabel(String labelName) throws Throwable {
        new PoLabel(webDriver, labelName).click();
    }


}
