package net.atos.testlab.cucumber.mfkeywords;

import org.openqa.selenium.WebDriver;

import net.atos.testlab.cucumber.utils.CommonUtils;


public class StepsTextbox {

    private final WebDriver webDriver = CommonUtils.getDriver();

/*    @When("^gebruiker \"([^\"]*)\" invuld in het tekstveld \"([^\"]*)\"$")
    public void gebruikerInvuldInHetTekstveld( String text, final String textboxName) {
        DynamicWebWaiter.waitForPageReady(this.webDriver);
        new PoTextbox(webDriver, textboxName, PoTextbox.ETextbox.NORMAL).getKeyword().getText();
    }*/
}