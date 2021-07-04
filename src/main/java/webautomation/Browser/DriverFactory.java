package webautomation.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static WebDriver driver;
    private DriverFactory() {}

    public static final class osUtils {
        private static String OS = null;
        public static String getOsName() {
            if(OS == null) {
                OS = System.getProperty("os.name");
            }
            return OS;
        }
        public static boolean isWindows() {
            return getOsName().startsWith("Windows");
        }
        public static boolean isLinux() {
            return getOsName().startsWith("Linux");
        }
    }
    
    public static WebDriver getDriver() {
        String projectPath = System.getProperty("user.dir");
        if(driver == null) {
            if(osUtils.isWindows()) {
                switch (Properties.browser) {
                    case FIREFOX: System.setProperty("webdriver.gecko.driver", projectPath + "/src/main/java/webautomation/Browser/Drivers/geckodriver.exe");
                    driver = new FirefoxDriver();break;
                    case CHROME: System.setProperty("webdriver.chrome.driver", projectPath + "/src/main/java/webautomation/Browser/Drivers/chromedriver.exe");
                    driver = new ChromeDriver();break;
                }
            }
            if(osUtils.isLinux()) {
                switch (Properties.browser) {
                    case FIREFOX: System.setProperty("webdriver.gecko.driver", projectPath + "/src/main/java/webautomation/Browser/Drivers/geckodriver");
                    driver = new FirefoxDriver();break;
                    case CHROME: System.setProperty("webdriver.chrome.driver", projectPath + "/src/main/java/webautomation/Browser/Drivers/chromedriver");
                    driver = new ChromeDriver();break;
                }
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