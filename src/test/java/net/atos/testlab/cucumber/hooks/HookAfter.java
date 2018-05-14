package net.atos.testlab.cucumber.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import net.atos.testlab.cucumber.utils.CommonUtils;

/**
 * TODO - DESCRIBE ME
 */
public class HookAfter {

    @After
    public void afterHook(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) CommonUtils.getDriver())
                        .getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            }
            catch (WebDriverException wde) {
                System.err.println(wde.getMessage());
            }
            catch (ClassCastException cce) {
                cce.printStackTrace();
            }
        }

        CommonUtils.killDriver();
    }
}

