package net.atos.testlab.cucumber.pageobjects;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.WebDriver;

import net.atos.testlab.cucumber.utils.DynamicWebWaiter;

/**
 * TODO - DESCRIBE ME
 */
public class PoTextbox extends PoParent {


    public PoTextbox(final WebDriver driver, final String name, final ETextbox type) {
        super(driver);
        switch (type) {
            case NORMAL:
                element = this.webDriver.findElement(
                        xpath("//input[contains(@id,'" + name.replaceAll("\\s+", "") + "') or contains(@name,'" + name.replaceAll("\\s+", "") + "') or " +
                                      "contains(@placeholder,'" + name + "')]"));
                break;
            case LABEL:
                element = this.webDriver.findElement(xpath("//label[contains(.,'" + name + "')]//..//input"));
                break;
        }
    }

    public boolean isEnabled() {
        return this.element.isEnabled();
    }

    public void setText(String text) {
        DynamicWebWaiter.waitForPageReady(this.webDriver);
        this.element.clear();
        this.element.sendKeys(text);
    }

    public enum ETextbox {
        NORMAL,
        LABEL,
    }
}