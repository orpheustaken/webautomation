package selenium_cucumber.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import selenium_cucumber.Browser.DriverFactory;
import selenium_cucumber.Page.HomeToLoginPage;

public class HomeToLogin {
    HomeToLoginPage objHomeToLoginPage;
    
    @Given("^I am on HomePage$")
    public void i_am_on_homepage() {
        DriverFactory.getDriver().get("http://automationpractice.com/index.php");
        objHomeToLoginPage = new HomeToLoginPage(DriverFactory.getDriver());
        objHomeToLoginPage.veryHeader();
    }

    @When("^I click on SignIn$")
    public void i_click_on_signin() {
        objHomeToLoginPage.clickOnSignIn();
    }
    
    @Then("^I should go to LoginPage$")
    public void i_should_go_to_loginpage() {
        objHomeToLoginPage.veryHeader2();
    }
}