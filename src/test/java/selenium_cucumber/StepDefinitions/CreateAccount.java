package selenium_cucumber.StepDefinitions;

import java.util.Random;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import selenium_cucumber.Browser.DriverFactory;
import selenium_cucumber.Page.CreateAccountPage;

public class CreateAccount {
    CreateAccountPage objCreateAccountPage;

    // method to randomly generate string to be applied on email addresses
    protected String getSaltString() {
        String SALTCHARS = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    @Given("^I am on SignUp Page$")
    public void i_am_on_signup_page() {
        DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        objCreateAccountPage = new CreateAccountPage(DriverFactory.getDriver());
        objCreateAccountPage.veryFirstHeader();
    }
    
    @When("^I Enter email and click on Create an Account button$")
    public void i_enter_email_and_click_on_create_an_account_button() {
        objCreateAccountPage.setRandomEmail(getSaltString() + "@mail.com");
        objCreateAccountPage.clickOnCreateAccount();
        objCreateAccountPage.verySecondHeader();
    }

    @And("^I select \"(.*)\" option on Title radio button$")
    public void i_select_gender_option_on_title_radio_button(String gender) {
        if(gender.equals("Male")) {
            objCreateAccountPage.setGenderMale();
        }
        if(gender.equals("Female")) {
            objCreateAccountPage.setGenderFemale();
        }
    }

    @And("^I enter \"(.*)\" into First Name field$")
    public void i_enter_firstName_into_first_name_field(String firstName) {
        objCreateAccountPage.setCustomerFirstName(firstName);
    }

    @And("^I enter \"(.*)\" into Last Name field$")
    public void i_enter_lastName_into_last_name_field(String lastName) {
        objCreateAccountPage.setCustomerLastName(lastName);
    }

    @And("^I enter \"(.*)\" into Password field$")
    public void i_enter_password_into_password_field(String password) {
        objCreateAccountPage.setPassword(password);
    }

    @And("^I set \"(.*)\" on Date of Birth day form$")
    public void i_set_birthday_on_date_of_birth_day_form(String birthDay) {
        objCreateAccountPage.setBirthDay(birthDay);
    }

    @And("^I set \"(.*)\" on Date of Birth month form$")
    public void i_set_birthmonth_on_date_of_birth_month_form(String birthMonth) {
        objCreateAccountPage.setBirthMonth(birthMonth);
    }

    @And("^I set \"(.*)\" on Date of Birth year form$")
    public void i_set_birthyear_on_date_of_birth_year_form(String birthYear) {
        objCreateAccountPage.setBirthYear(birthYear);
    }

    @And("^I choose to join \"(.*)\" on Newsletter checkbox$")
    public void i_choose_to_join_newsletter_on_newsletter_checkbox(Boolean newsLetter) {
        objCreateAccountPage.joinNewsletter(newsLetter);
    }

    @And("^I choose not to receive \"(.*)\" on Special Offers checkbox$")
    public void i_choose_not_to_receive_specialoffers_on_special_offers_checkbox(Boolean specialOffers) {
        objCreateAccountPage.receiveSpecialOffers(specialOffers);
    }

    @And("^I enter \"(.*)\" into Company field$")
    public void i_enter_companyname_into_company_field(String companyName) {
        objCreateAccountPage.setCompany(companyName);
    }

    @And("^I enter \"(.*)\" into Address field$")
    public void i_enter_address1_into_address_field(String address1) {
        objCreateAccountPage.setaddress1(address1);
    }

    @And("^I enter \"(.*)\" into Address Line 2 field$")
    public void i_enter_address2_into_address_line_2_field(String address2) {
        objCreateAccountPage.setaddress2(address2);
    }

    @And("^I enter \"(.*)\" into City field$")
    public void i_enter_cityname_into_city_field(String cityName) {
        objCreateAccountPage.setCity(cityName);
    }
    
    @And("^I set \"(.*)\" into State form$")
    public void i_set_statename_into_state_form(String stateName) {
        objCreateAccountPage.setState(stateName);
    }

    @And("^I enter \"(.*)\" into Postal Code field$")
    public void i_enter_zipcode_into_postal_code_field(String zipCode) {
        objCreateAccountPage.setPostalCode(zipCode);
    }

    @And("^I set \"(.*)\" on Country form$")
    public void i_set_country_on_country_form(String country) {
        objCreateAccountPage.setCountry(country);
    }

    @And("^I enter \"(.*)\" into Additional Information on text area$")
    public void i_enter_addinfo_into_additional_information_on_text_area(String addInfo) {
        objCreateAccountPage.addAdittionalInformation(addInfo);
    }

    @And("^I enter \"(.*)\" into Home Phone field$")
    public void i_enter_homePhone_into_home_phone_field(String homePhone) {
        objCreateAccountPage.setHomePhone(homePhone);
    }

    @And("^I enter \"(.*)\" into Mobile Phone field$")
    public void i_enter_mobilephone_into_mobile_phone_field(String mobilePhone) {
        objCreateAccountPage.setMobilePhone(mobilePhone);
    }

    @And("^I enter \"(.*)\" into Address Alias field$")
    public void i_enter_addressalias_into_address_alias_field(String addressAlias) {
        objCreateAccountPage.setAliasAddress(addressAlias);
    }

    @Then("^I should be successfully registered$")
    public void i_should_be_successfully_registered() {
        objCreateAccountPage.clickOnRegister();
        //objCreateAccountPage.logOut();
    }
}