package net.atos.testlab.cucumber.pageobjects;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.WebDriver;

/**
 * TODO - DESCRIBE ME
 */
public class PoTextbox extends PoParent {


    public PoTextbox(WebDriver driver, String name) {
        super(driver);
        element = this.webDriver.findElement(xpath("//input[contains(@id,'"+ name.replaceAll("\\s+", "") +"') or [contains(@name,']"));
    }


    public boolean isEnabled() {
        return this.element.isEnabled();
    }

    public void setText(String text) {
        //DynamicWebWaiter.waitForPageReady(this.webDriver);
        this.element.clear();
        this.element.sendKeys(text);
    }
}