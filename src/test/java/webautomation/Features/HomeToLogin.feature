Feature: Home to Login

    Scenario: From HomePage, I Shall Go To LoginPage

        Given I am on HomePage

        When I click on SignIn
        Then I should go to LoginPage