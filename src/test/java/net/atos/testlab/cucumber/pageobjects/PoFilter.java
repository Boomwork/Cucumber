package net.atos.testlab.cucumber.pageobjects;

import static org.openqa.selenium.By.xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * TODO - DESCRIBE ME
 */
public class PoFilter extends PoParent {

    public PoFilter(WebDriver driver, String name) {
        super(driver);
        element = this.webDriver.findElement(xpath("//input[contains(@name,'" + name + "') or contains(@id,'" + name + "']"));
    }

    public void selectInFilter(final String text) {
        final Select select = new Select(this.element);
        select.selectByVisibleText(text);
    }

}
