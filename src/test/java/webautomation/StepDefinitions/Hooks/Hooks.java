package webautomation.StepDefinitions.Hooks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import webautomation.Browser.DriverFactory;

public class Hooks {
    WebDriver driver;

    @Before
    public void before() {
        PageFactory.initElements(driver, DriverFactory.getDriver());
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    
    @After
    public void tearDown(Scenario scenario) throws IOException {
        TakesScreenshot SS = (TakesScreenshot) DriverFactory.getDriver();
        File file = SS.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("target" + File.separator + "screenshot" + File.separator + scenario.getName() + ".png"));
            
        DriverFactory.killDriver();
    }
}