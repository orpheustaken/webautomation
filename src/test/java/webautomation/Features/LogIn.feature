Feature: Login
@LogIn @End2End

    Scenario Outline: From SignIn Page, Login Into Account

        Given I am on login page

        When I enter "<email>" and "<password>"
        Then I should be able to login successfully

        Examples:
            |  email                     | password |
            |  businesscall@doe.com      | 12345    |