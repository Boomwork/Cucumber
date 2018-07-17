package net.atos.testlab.cucumber.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public final class DynamicWebWaiter {

    private DynamicWebWaiter() {}

    //Wait for JQuery Load
    private static void waitForJQueryLoad(WebDriver webDriver) {
        //Wait for jQuery to load
        final WebDriverWait webDriverWait = new WebDriverWait(webDriver, 10);
        final ExpectedCondition<Boolean> jQueryLoad = driver ->
                ((Long) ((JavascriptExecutor) webDriver)
                        .executeScript("return jQuery.active") == 0);
        //Get JQuery is Ready
        final boolean jqueryReady = (Boolean) ((JavascriptExecutor) webDriver)
                .executeScript("return jQuery.active==0");
        //Wait JQuery until it is Ready!
        if (!jqueryReady) {
            //Wait for jQuery to load
            webDriverWait.until(jQueryLoad);
        }
    }

    //Wait for Angular Load
    private static void waitForAngularLoad(final WebDriver webDriver) {
        final WebDriverWait wait = new WebDriverWait(webDriver, 15);
        final String angularReadyScript = "return angular.element(document).injector().get('$http').pendingRequests.length === 0";
        //Wait for ANGULAR to load
        final ExpectedCondition<Boolean> angularLoad = driver -> Boolean.valueOf(
                ((JavascriptExecutor) driver)
                        .executeScript(angularReadyScript).toString());
        //Get Angular is Ready
        final boolean angularReady = Boolean.valueOf(((JavascriptExecutor) webDriver)
                                                             .executeScript(angularReadyScript).toString());
        //Wait ANGULAR until it is Ready!
        if (!angularReady) {
            //Wait for Angular to load
            wait.until(angularLoad);
        }
    }

    //Wait Until JS Ready
    private static void waitUntilJSReady(WebDriver webDriver) {
        final WebDriverWait wait = new WebDriverWait(webDriver, 15);
        //Wait for Javascript to load
        final ExpectedCondition<Boolean> jsLoad = driver ->
                ("complete".equals(((JavascriptExecutor) webDriver)
                                           .executeScript("return document.readyState")
                                           .toString()));
        //Get JS is Ready
        final boolean jsReady = ("complete".equals(((JavascriptExecutor) webDriver)
                                                           .executeScript("return document.readyState")
                                                           .toString()));
        //Wait Javascript until it is Ready!
        if (!jsReady) {
            //Wait for Javascript to load
            wait.until(jsLoad);
        }
    }

    //Wait Until JQuery and JS Ready
    private static void waitUntilJQueryReady(WebDriver webDriver) {
        //First check that JQuery is defined on the page. If it is, then wait AJAX
        final Boolean jQueryDefined =
                (Boolean) ((JavascriptExecutor) webDriver)
                        .executeScript("return typeof jQuery != 'undefined'");
        if (jQueryDefined) {
            //Wait JQuery Load
            waitForJQueryLoad(webDriver);
            //Wait JS Load
            waitUntilJSReady(webDriver);
        }
    }

    //Wait Until Angular and JS Ready
    private static void waitUntilAngularReady(WebDriver webDriver) {
        //First check that ANGULAR is defined on the page. If it is, then wait ANGULAR
        final Boolean angularUnDefined =
                (Boolean) ((JavascriptExecutor) webDriver)
                        .executeScript("return window.angular === undefined");
        if (!angularUnDefined) {
            final Boolean angularInjectorUnDefined =
                    (Boolean) ((JavascriptExecutor) webDriver)
                            .executeScript("return angular.element(document).injector() === undefined");
            if (!angularInjectorUnDefined) {
                //Wait Angular Load
                waitForAngularLoad(webDriver);
                //Wait JS Load
                waitUntilJSReady(webDriver);
            }
        }
    }

    //Wait Until JQuery Angular and JS is ready
    public static void waitForPageReady(WebDriver webDriver) {
        waitUntilJQueryReady(webDriver);
        waitUntilAngularReady(webDriver);
    }
}
