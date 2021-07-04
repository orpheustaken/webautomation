Feature: Add A New Address And Delete Old One

    Scenario Outline: From My Account, Add A New Address and Delete Old One

        Given I am on SignIn Page
        And I Login with "<email>" and "<password>"

        When I click on My Addresses Button 
        And I click on Add A New Address
        And I set "<address1>" into Address field
        And I set "<address2>" into Address Line 2 field
        And I set "<cityName>" into City field
        And I enter "<stateName>" into State form
        And I set "<zipCode>" into Postal Code field
        And I enter "<country>" on Country form
        And I set "<homePhone>" into Home Phone field
        And I set "<mobilePhone>" into Mobile Phone field
        And I set "<addInfo>" into Additional Information on text area
        And I set "<addressAlias>" into Address Alias field and save changes
        And I delete my Old Address

        Then My New Address should be successfully set up

        Examples:
            | email            | password | address1   | address2 | cityName   | stateName  | zipCode | country       | homePhone | mobilePhone | addInfo | addressAlias   |
            | business@doe.com | 12345    | Downtown   | Vinewood | Los Santos | California | 12345   | United States | 555 4321  | 555 1234    | Blank   | Paradise       |
            | business@doe.com | 12345    | 5th Avenue | Broadway | New York   | New York   | 54321   | United States | 555 1234  | 555 4321    | Empty   | Silicon Valley |