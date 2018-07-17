package net.atos.testlab.cucumber.pageobjects;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.WebDriver;

import net.atos.testlab.cucumber.utils.DynamicWebWaiter;


public class PoImage extends PoParent {


    public PoImage(WebDriver driver, String name) {
        super(driver);
        element = this.webDriver.findElement(xpath("//img[contains(@alt,'" + name + "')]"));
    }

    public void isDisplayed() {
        DynamicWebWaiter.waitForPageReady(this.webDriver);
        this.element.click();
    }
}

