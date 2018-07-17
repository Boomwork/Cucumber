package net.atos.testlab.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * TODO - DESCRIBE ME
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:results/html"},
        features = {"src/test/resources/features"},
        tags = {"@Pega"},
        glue = {"net.atos.testlab.cucumber"})

public class Runner {
}
