package net.atos.testlab.cucumber.pageobjects;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.WebDriver;

/**
 * TODO - DESCRIBE ME
 */
public class PoTextlink extends PoParent {

    public PoTextlink(WebDriver driver, String name) {
        super(driver);
        this.element = this.webDriver.findElement(xpath("//a[contains(.,'" + name + "')or contains(@id,'" + name.replaceAll("\\s+", "") + "')]"));
    }


    public boolean isDisplayed() {

        return this.element.isDisplayed();
    }

    public void click() {
        this.element.click();
    }
}
