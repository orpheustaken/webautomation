package selenium_cucumber.Page;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeToLoginPage {

    @FindBy(xpath = "//h1[contains(.,'Automation Practice Website')]")
    WebElement header;
    @FindBy(xpath = "//a[@class='login'][contains(.,'Sign in')]")
    WebElement signIn;
    @FindBy(xpath = "//h3[@class='page-subheading'][contains(.,'Already registered?')]")
    WebElement header2;

    public HomeToLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    
    public void veryHeader() {
        String getheadertext = header.getText();
        assertEquals("Automation Practice Website", getheadertext);
    }
    public void clickOnSignIn() {
        signIn.click();
    }
    public void veryHeader2() {
        String getheader2text = header2.getText().toLowerCase();
        assertEquals("already registered?", getheader2text);
    }
}