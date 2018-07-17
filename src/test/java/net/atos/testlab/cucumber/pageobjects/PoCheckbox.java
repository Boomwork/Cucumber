package net.atos.testlab.cucumber.pageobjects;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.WebDriver;

import net.atos.testlab.cucumber.utils.DynamicWebWaiter;


public class PoCheckbox extends PoParent {

    public PoCheckbox(WebDriver driver, String name) {
        super(driver);
        element = this.webDriver.findElement(xpath("//input[contains(@type,'checkbox') and contains(@name,'" + name + "') or contains(@id,'" + name + "')]"));
    }

    public void click() {
        DynamicWebWaiter.waitForPageReady(this.webDriver);
        this.element.click();
    }
}
