package net.atos.testlab.cucumber.hooks;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.Before;
import net.atos.testlab.cucumber.utils.CommonUtils;


public class HookBefore {
    @Before
    public void beforeHook() {
        
        final WebDriver driver = createChromeDriver();
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        CommonUtils.setDriver(driver);
    }

    // Verschillende methodes voor verschillende drivers
    private WebDriver createChromeDriver() {
        if (Platform.LINUX.equals(Platform.getCurrent())) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        }
        else {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");
        }
        final DesiredCapabilities caps = DesiredCapabilities.chrome();
        final ChromeOptions options = new ChromeOptions();
       // options.addArguments("--start-maximized");
        options.addArguments("--disable-infobars");
        options.addArguments("--no-sandbox");
        final Map<String, Object> prefs = new HashMap<>();
        prefs.put("intl.accept_languages", "nl");
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);
        caps.setCapability(ChromeOptions.CAPABILITY, options);
        return new ChromeDriver(caps);
    }
}

