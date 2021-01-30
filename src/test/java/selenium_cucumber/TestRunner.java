package selenium_cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/selenium_cucumber", glue = "selenium_cucumber/StepDefinitions", strict = true, 
plugin = {"pretty", "html:target/reports/html", "json:target/reports/json"})

public class TestRunner {
    
}