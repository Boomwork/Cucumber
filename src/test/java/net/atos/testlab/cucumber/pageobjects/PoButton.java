package net.atos.testlab.cucumber.pageobjects;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.WebDriver;

import net.atos.testlab.cucumber.utils.DynamicWebWaiter;

/**
 * TODO - DESCRIBE ME
 */
public class PoButton extends PoParent {

    public PoButton(WebDriver driver, String name) {
        super(driver);
        element = this.webDriver.findElement(
                xpath("//*[self::input or self::button][contains(@id,'" + name + "') or contains(@name,'" + name + "') or contains (@value,'" + name + "')]"));
    }

    public void isDisplayed() {
        DynamicWebWaiter.waitForPageReady(this.webDriver);
        this.element.click();
    }

    public void click() {
        DynamicWebWaiter.waitForPageReady(this.webDriver);
        this.element.click();
    }
}