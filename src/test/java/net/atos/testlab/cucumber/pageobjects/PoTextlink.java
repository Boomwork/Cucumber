package net.atos.testlab.cucumber.pageobjects;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.WebDriver;

import net.atos.testlab.cucumber.utils.DynamicWebWaiter;


public class PoTextlink extends PoParent {

    public PoTextlink(WebDriver driver, String name) {
        super(driver);
        this.element = this.webDriver.findElement(xpath("//a[contains(.,'" + name + "')or contains(@id,'" + name.replaceAll("\\s+", "") + "')]"));
    }


    public boolean isDisplayed() {
        DynamicWebWaiter.waitForPageReady(this.webDriver);
        return this.element.isDisplayed();
    }

    public void click() {
        DynamicWebWaiter.waitForPageReady(this.webDriver);
        this.element.click();
    }
}
