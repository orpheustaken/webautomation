package webautomation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/webautomation",
    glue = "webautomation/StepDefinitions",
    strict = true, 
    plugin = {"pretty", "html:target/reports/html", "json:target/reports/json"}
    )
public class TestRunner {
    
}