package selenium_cucumber.Page;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//h1[@class='page-heading'][contains(.,'Authentication')]")
    WebElement header;
    @FindBy(xpath = "//input[@id='email']")
    WebElement email;
    @FindBy(xpath = "//input[contains(@type,'password')]")
    WebElement password;
    @FindBy(xpath = "//span[contains(.,'Sign in')]")
    WebElement signIn;
    @FindBy(xpath = "//a[@class='logout'][contains(.,'Sign out')]")
    WebElement logOutButton;


    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    
    public void veryHeader() {
        String getheadertext = header.getText();
        assertEquals("authentication", getheadertext.toLowerCase());
    }
    public void enterEmail(String arg1) {
        email.sendKeys(arg1);
    }
    public void enterPassword(String arg1) {
        password.sendKeys(arg1);
    }
    public void clickOnSignIn() {
        signIn.click();
    }
    public void logOut() {
        logOutButton.click();
    }
}