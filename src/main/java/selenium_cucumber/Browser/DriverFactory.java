package selenium_cucumber.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static WebDriver driver;
    private DriverFactory() {}
    
    public static WebDriver getDriver() {
        String projectPath = System.getProperty("user.dir");
        if(driver == null) {
            switch (Properties.browser) {
                case FIREFOX: System.setProperty("webdriver.gecko.driver", projectPath + "/src/main/java/selenium_cucumber/Browser/Drivers/geckodriver.exe");
                driver = new FirefoxDriver();break;
                case CHROME: System.setProperty("webdriver.chrome.driver", projectPath + "/src/main/java/selenium_cucumber/Browser/Drivers/chromedriver.exe");
                driver = new ChromeDriver();break;
            }
         }
         driver.manage().window().maximize();
         return driver;
    }
    public static void killDriver() {
        if(Properties.CLOSE_BROWSER) {
            if(driver != null) {
                driver.quit();
                driver = null;
            }
        }
    }
}