package selenium_cucumber.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium_cucumber.Browser.DriverFactory;
import selenium_cucumber.Page.AddNewAddressPage;

public class AddNewAddress {
    AddNewAddressPage objAddNewAddressPage;

    @Given("^I am on SignIn Page$")
    public void i_am_on_signin_page() {
        DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        objAddNewAddressPage = new AddNewAddressPage(DriverFactory.getDriver());
        objAddNewAddressPage.veryHeader();
    }

    @And("^I Login with \"(.*)\" and \"(.*)\"$")
    public void i_login_with_email_and_oldPassword(String email, String password) {
        objAddNewAddressPage.enterEmail(email);
        objAddNewAddressPage.enterPassword(password);
        objAddNewAddressPage.clickOnSignIn();
    }

    @When("^I click on My Addresses Button$")
    public void i_click_on_my_addresses_button() {
        objAddNewAddressPage.clickOnMyAddressButton();
    }
    
    @And("^I click on Add A New Address$")
    public void i_click_on_add_a_new_address() {
        objAddNewAddressPage.clickOnAddNewAddressButton();
    }

    @And("^I set \"(.*)\" into Address field$")
    public void i_set_address1_into_address_field(String address1) {
        objAddNewAddressPage.addAddress1(address1);
    }

    @And("^I set \"(.*)\" into Address Line 2 field$")
    public void i_set_address2_into_address_line_2_field(String address2) {
        objAddNewAddressPage.addAddress2(address2);
    }

    @And("^I set \"(.*)\" into City field$")
    public void i_set_cityname_into_city_field(String cityName) {
        objAddNewAddressPage.setCity(cityName);
    }

    @And("^I enter \"(.*)\" into State form$")
    public void i_enter_statename_into_state_form(String stateName) {
        objAddNewAddressPage.setState(stateName);
    }

    @And("^I set \"(.*)\" into Postal Code field$")
    public void i_set_zipcode_into_postal_code_field(String zipCode) {
        objAddNewAddressPage.setPostalCode(zipCode);
    }

    @And("^I enter \"(.*)\" on Country form$")
    public void i_enter_country_on_country_form(String country) {
        objAddNewAddressPage.setCountry(country);
    }

    @And("^I set \"(.*)\" into Home Phone field$")
    public void i_set_homephone_into_home_phone_field(String homePhone) {
        objAddNewAddressPage.setHomePhone(homePhone);
    }

    @And("^I set \"(.*)\" into Mobile Phone field$")
    public void i_set_mobilephone_into_mobile_phone_field(String mobilePhone) {
        objAddNewAddressPage.setMobilePhone(mobilePhone);
    }

    @And("^I set \"(.*)\" into Additional Information on text area$")
    public void i_set_addinfo_into_additional_information_on_text_area(String addInfo) {
        objAddNewAddressPage.addAdittionalInformation(addInfo);
    }

    @And("^I set \"(.*)\" into Address Alias field and save changes$")
    public void i_set_addressalias_into_address_alias_field_and_save_changes(String addressAlias) {
        objAddNewAddressPage.setAliasAddress(addressAlias);
        objAddNewAddressPage.clickOnSave();
    }

    @And("^I delete my Old Address$")
    public void i_delete_my_old_address() {
        objAddNewAddressPage.deleteOldAddress();
    }

    @Then("^My New Address should be successfully set up$")
    public void my_new_address_should_be_successfully_set_up() {
        //objAddNewAddressPage.logOut();
    }
}