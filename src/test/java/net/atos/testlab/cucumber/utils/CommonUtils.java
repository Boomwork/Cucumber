package net.atos.testlab.cucumber.utils;

import org.openqa.selenium.WebDriver;

public final class CommonUtils {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        CommonUtils.driver = driver;
    }

    public static void killDriver() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
        driver = null;
    }
}


