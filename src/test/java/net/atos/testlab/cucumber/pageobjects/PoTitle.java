package net.atos.testlab.cucumber.pageobjects;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.WebDriver;

/**
 * TODO - DESCRIBE ME
 */
public class PoTitle extends PoParent {
    public PoTitle(WebDriver driver, String name) {
        super(driver);
        this.element = this.webDriver.findElement(xpath("//h1[contains(.,'" + name + "')]"));
    }
}
