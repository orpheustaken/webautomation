package webautomation.Page;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {
 
    @FindBy(xpath = "//h1[@class='page-heading'][contains(.,'Authentication')]")
    WebElement firstHeader;
    @FindBy(xpath = "//h1[@class='page-heading'][contains(.,'Create an account')]")
    WebElement secondHeader;
    @FindBy(xpath = "//input[contains(@name,'email_create')]")
    WebElement randomEmail;
    @FindBy(xpath = "//span[contains(.,'Create an account')]")
    WebElement createAccount;
    @FindBy(xpath = "//input[@type='radio'][contains(@id,'gender1')]")
    WebElement genderMale;
    @FindBy(xpath = "//input[@type='radio'][contains(@id,'gender2')]")
    WebElement genderFemale;
    @FindBy(xpath = "//input[contains(@name,'customer_firstname')]")
    WebElement customerFirstName;
    @FindBy(xpath = "//input[contains(@name,'customer_lastname')]")
    WebElement customerLastName;
    @FindBy(xpath = "//input[contains(@type,'password')]")
    WebElement password;
    @FindBy(xpath = "//select[contains(@name,'days')]")
    WebElement birthDay;
    @FindBy(xpath = "//select[contains(@name,'months')]")
    WebElement birthMonth;
    @FindBy(xpath = "//select[contains(@name,'years')]")
    WebElement birthYear;
    @FindBy(xpath = "//input[contains(@name,'newsletter')]")
    WebElement newsletter;
    @FindBy(xpath = "//input[contains(@name,'optin')]")
    WebElement specialOffers;
    @FindBy (xpath = "//input[contains(@name,'company')]")
    WebElement company;
    @FindBy (xpath = "//input[contains(@name,'address1')]")
    WebElement address1;
    @FindBy (xpath = "//input[contains(@name,'address2')]")
    WebElement address2;
    @FindBy (xpath = "//input[contains(@name,'city')]")
    WebElement city;
    @FindBy (xpath = "//select[@name='id_state'][contains(@id,'state')]")
    WebElement addressState;
    @FindBy (xpath = "//input[contains(@name,'postcode')]")
    WebElement postalCode;
    @FindBy (xpath = "//select[@name='id_country'][contains(@id,'country')]")
    WebElement addressCountry;
    @FindBy (xpath = "//textarea[contains(@class,'form-control')]")
    WebElement additionalInformation;
    @FindBy (xpath = "//input[@name='phone']")
    WebElement homePhone;
    @FindBy (xpath = "//input[@type='text'][contains(@id,'mobile')]")
    WebElement mobilePhone;
    @FindBy (xpath = "//input[contains(@name,'alias')]")
    WebElement aliasAddress;
    @FindBy (xpath = "//span[contains(.,'Register')]")
    WebElement registerButton;
    @FindBy (xpath = "//a[@class='logout'][contains(.,'Sign out')]")
    WebElement signOut;

    public CreateAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void veryFirstHeader() {
        String getfirstheadertext = firstHeader.getText();
        assertEquals("authentication", getfirstheadertext.toLowerCase());
    }
    public void setRandomEmail(String arg1) {
        randomEmail.sendKeys(arg1);
    }
    public void clickOnCreateAccount() {
        createAccount.click();
    }
    public void verySecondHeader() {
        String getsecondheadertext = secondHeader.getText();
        assertEquals("create an account", getsecondheadertext.toLowerCase());
    }
    public void setGenderMale() {
        genderMale.click();
    }
    public void setGenderFemale() {
        genderFemale.click();
    }
    public void setCustomerFirstName(String arg1) {
        customerFirstName.sendKeys(arg1);
    }
    public void setCustomerLastName(String arg1) {
        customerLastName.sendKeys(arg1);
    }
    public void setPassword(String arg1) {
        password.sendKeys(arg1);
    }
    public void setBirthDay(String arg1) {
        Select day = new Select(birthDay);
        day.selectByValue(arg1);
    }
    public void setBirthMonth(String arg1) {
        Select month = new Select(birthMonth);
        month.selectByValue(arg1);
    }
    public void setBirthYear(String arg1) {
        Select year = new Select(birthYear);
        year.selectByValue(arg1);
    }
    public void joinNewsletter(Boolean arg1) {
        if(arg1 == true) {
            newsletter.click();
        }
    }
    public void receiveSpecialOffers(Boolean arg1) {
        if(arg1 == true) {
            specialOffers.click();
        }
    }
    public void setCompany(String arg1) {
        company.sendKeys(arg1);
    }
    public void setaddress1(String arg1) {
        address1.sendKeys(arg1);
    }
    public void setaddress2(String arg1) {
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
        postalCode.sendKeys(arg1);
    }
    public void setCountry(String arg1) {
        Select country = new Select(addressCountry);
        country.selectByVisibleText(arg1);
    }
    public void addAdittionalInformation(String arg1) {
        additionalInformation.sendKeys(arg1);
    }
    public void setHomePhone(String arg1) {
        homePhone.sendKeys(arg1);
    }
    public void setMobilePhone(String arg1) {
        mobilePhone.sendKeys(arg1);
    }
    public void setAliasAddress(String arg1) {
        aliasAddress.clear();
        aliasAddress.sendKeys(arg1);
    }
    public void clickOnRegister() {
        registerButton.click();
    }
    public void logOut() {
        signOut.click();
    }
}