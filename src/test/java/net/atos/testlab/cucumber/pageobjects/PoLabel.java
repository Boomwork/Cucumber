package net.atos.testlab.cucumber.pageobjects;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.WebDriver;

/**
 * TODO - DESCRIBE ME
 */
public class PoLabel extends PoParent {

    public PoLabel(WebDriver driver, String name) {
        super(driver);
        element = this.webDriver.findElement(xpath("//label[contains(.,'" + name + "')]"));
    }

    public void click(){
        this.element.click();
    }
}
