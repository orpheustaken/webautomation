package webautomation.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webautomation.Browser.DriverFactory;
import webautomation.Page.ChangePasswordnNamePage;

public class ChangePasswordnName {
    ChangePasswordnNamePage objChangePasswordnNamePage;

    @Given("^I am on SignIn page$")
    public void i_am_on_signin_page() {
        DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        objChangePasswordnNamePage = new ChangePasswordnNamePage(DriverFactory.getDriver());
        objChangePasswordnNamePage.veryHeader();
    }

    @And("^I login with \"(.*)\" and \"(.*)\"$")
    public void i_login_with_email_and_oldPassword(String email, String oldPassword) {
        objChangePasswordnNamePage.enterEmail(email);
        objChangePasswordnNamePage.enterPassword(oldPassword);
        objChangePasswordnNamePage.clickOnSignIn();
    }

    @When("^I click on Personal Info$")
    public void i_click_on_personal_info() {
        objChangePasswordnNamePage.clickOnPersonalInfo();
    }

    @And("^I set my \"(.*)\" on First Name field$")
    public void i_set_my_newfirstname_on_first_name_field(String newFirstName) {
        objChangePasswordnNamePage.setNewFirstName(newFirstName);
    }

    @And("^I set my \"(.*)\" on Last Name field$")
    public void i_set_my_newlastname_on_last_name_field(String newLastName) {
        objChangePasswordnNamePage.setLastName(newLastName);
    }

    @And("^I enter my \"(.*)\" on Current Password field$")
    public void i_enter_my_oldpassword_on_current_password_field(String oldPassword) {
        objChangePasswordnNamePage.enterOldPassword(oldPassword);
    }

    @And("^I set my \"(.*)\" on New Password field$")
    public void i_set_my_newpassword_on_new_password_field(String newPassword) {
        objChangePasswordnNamePage.setNewPassword(newPassword);
    }

    @And("^I confirm my \"(.*)\" Confirmation field$")
    public void i_confirm_my_newpassword_confirmation_field(String newPassword) {
        objChangePasswordnNamePage.confirmNewPassword(newPassword);
    }

    @Then("^My name and password should be successfully changed$")
    public void my_name_and_password_should_be_successfully_changed() {
        objChangePasswordnNamePage.clickSave();
        //objChangePasswordnNamePage.logOut();
    }
}