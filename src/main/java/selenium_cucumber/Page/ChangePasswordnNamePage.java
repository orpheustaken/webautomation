package selenium_cucumber.Page;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordnNamePage {
    
    @FindBy (xpath = "//h1[@class='page-heading'][contains(.,'Authentication')]")
    WebElement header;
    @FindBy (xpath = "//input[@id='email']")
    WebElement email;
    @FindBy (xpath = "//input[contains(@type,'password')]")
    WebElement password;
    @FindBy (xpath = "//span[contains(.,'Sign in')]")
    WebElement signIn;
    @FindBy (xpath = "//span[contains(.,'My personal information')]")
    WebElement personalInfo;
    @FindBy (xpath = "//input[contains(@name,'firstname')]")
    WebElement newFirstName;
    @FindBy(xpath = "//input[contains(@name,'lastname')]")
    WebElement newLastName;
    @FindBy (xpath = "//input[contains(@name,'old_passwd')]")
    WebElement oldPassword;
    @FindBy (xpath = "//input[@name='passwd']")
    WebElement newPassword;
    @FindBy (xpath = "//input[contains(@name,'confirmation')]")
    WebElement confirmPassword;
    @FindBy (xpath = "//span[contains(.,'Save')]")
    WebElement saveButton;
    @FindBy(xpath = "//a[@class='logout'][contains(.,'Sign out')]")
    WebElement logOutButton;

    public ChangePasswordnNamePage(WebDriver driver) {
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

    public void clickOnPersonalInfo() {
        personalInfo.click();
    }
    public void setNewFirstName(String arg1) {
        newFirstName.clear();
        newFirstName.sendKeys(arg1);
    }
    public void setLastName(String arg1){
        newLastName.clear();
        newLastName.sendKeys(arg1);
    }
    public void enterOldPassword(String arg1) {
        oldPassword.sendKeys(arg1);
    }
    public void setNewPassword(String arg1) {
        newPassword.sendKeys(arg1);
    }
    public void confirmNewPassword(String arg1) {
        confirmPassword.sendKeys(arg1);
    }
    public void clickSave() {
        saveButton.click();
    }
    public void logOut() {
        logOutButton.click();
    }
}