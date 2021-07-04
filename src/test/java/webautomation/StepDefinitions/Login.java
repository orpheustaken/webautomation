package webautomation.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webautomation.Browser.DriverFactory;
import webautomation.Page.LoginPage;

public class Login {
    LoginPage objLoginPage;
    
    @Given("^I am on login page$")
    public void i_am_on_login_page() {
        DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        objLoginPage = new LoginPage(DriverFactory.getDriver());
        objLoginPage.veryHeader();
    }

    @When("^I enter \"(.*)\" and \"(.*)\"$")
    public void i_enter_email_and_password(String email, String password) {
        objLoginPage.enterEmail(email);
        objLoginPage.enterPassword(password);
    }
    
    @Then("^I should be able to login successfully$")
    public void i_should_be_able_to_login_successfully() {
        objLoginPage.clickOnSignIn();
        //objLoginPage.logOut();
    }
}