package net.atos.testlab.cucumber.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * TODO - DESCRIBE ME
 */
public abstract class PoParent {

    final WebDriver webDriver;

    WebElement element;
    //MFkeywords keyword;

    PoParent(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement getElement() {
        return element;
    }

    //public  MFkeywords getKeyword(){return keyword;}
}
