package webautomation.Page;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewAddressPage {
    
    @FindBy (xpath = "//h1[@class='page-heading'][contains(.,'Authentication')]")
    WebElement header;
    @FindBy (xpath = "//input[@id='email']")
    WebElement email;
    @FindBy (xpath = "//input[contains(@type,'password')]")
    WebElement password;
    @FindBy (xpath = "//span[contains(.,'Sign in')]")
    WebElement signIn;
    @FindBy(xpath = "//span[contains(.,'My addresses')]")
    WebElement myAddressesButton;
    @FindBy(xpath = "//span[contains(.,'Add a new address')]")
    WebElement addNewAddressButton;
    @FindBy(xpath = "//input[contains(@name,'address1')]")
    WebElement address1;
    @FindBy(xpath = "//input[contains(@name,'address2')]")
    WebElement address2;
    @FindBy(xpath = "//input[contains(@name,'city')]")
    WebElement city;
    @FindBy(xpath = "//select[@name='id_state'][contains(@id,'state')]")
    WebElement addressState;
    @FindBy(xpath = "//input[contains(@name,'postcode')]")
    WebElement zipCode;
    @FindBy(xpath = "//select[contains(@name,'id_country')]")
    WebElement addressCountry;
    @FindBy(xpath = "//input[@name='phone']")
    WebElement homePhone;
    @FindBy(xpath = "//input[@class='validate form-control'][contains(@id,'mobile')]")
    WebElement mobilePhone;
    @FindBy(xpath = "//textarea[contains(@class,'validate form-control')]")
    WebElement addInfo;
    @FindBy(xpath = "//input[contains(@name,'alias')]")
    WebElement aliasAddress;
    @FindBy(xpath = "//span[contains(.,'Save')]")
    WebElement saveButton;
    @FindBy(xpath = "(//span[contains(.,'Delete')])[1]")
    WebElement deleteAddress;
    @FindBy(xpath = "//a[@class='logout'][contains(.,'Sign out')]")
    WebElement logOutButton;
    
    WebDriver driver;

    public AddNewAddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
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

    public void clickOnMyAddressButton() {
        myAddressesButton.click();
    }
    public void clickOnAddNewAddressButton() {
        addNewAddressButton.click();
    }
    public void addAddress1(String arg1) {
        address1.sendKeys(arg1);
    }
    public void addAddress2(String arg1) {
        address2.sendKeys(arg1);
    }
    public void setCity(String arg1) {
        city.sendKeys(arg1);
    }
    public void setState(String arg1) {
        Select state = new Select(addressState);
        state.selectByVisibleText(arg1);
    }
    public void setPostalCode(String arg1) {
        zipCode.sendKeys(arg1);
    }
    public void setCountry(String arg1) {
        Select country = new Select(addressCountry);
        country.selectByVisibleText(arg1);
    }
    public void setHomePhone(String arg1) {
        homePhone.sendKeys(arg1);
    }
    public void setMobilePhone(String arg1) {
        mobilePhone.sendKeys(arg1);
    }
    public void addAdittionalInformation(String arg1) {
        addInfo.sendKeys(arg1);
    }
    public void setAliasAddress(String arg1) {
        aliasAddress.clear();
        aliasAddress.sendKeys(arg1);
    }
    public void clickOnSave() {
        saveButton.click();
    }
    public void deleteOldAddress() {
        deleteAddress.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void logOut() {
        logOutButton.click();
    }
}