package net.atos.testlab.cucumber.utils;

import org.openqa.selenium.WebDriver;

/**
 * TODO - DESCRIBE ME
 */
public class CommonUtils {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        CommonUtils.driver = driver;
    }

    public static void killDriver() {
        driver.quit();
        driver = null;
    }
}


