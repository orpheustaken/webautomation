Feature: Create Account
@CreateAccount @End2End

    Scenario Outline: From MyAccount Page, Create A New One

        Given I am on SignUp Page

        When I Enter email and click on Create an Account button
        And I select "<gender>" option on Title radio button
        And I enter "<firstName>" into First Name field
        And I enter "<lastName>" into Last Name field
        And I enter "<password>" into Password field
        And I set "<birthDay>" on Date of Birth day form
        And I set "<birthMonth>" on Date of Birth month form
        And I set "<birthYear>" on Date of Birth year form
        And I choose to join "<newsLetter>" on Newsletter checkbox
        And I choose not to receive "<specialOffers>" on Special Offers checkbox
        And I enter "<companyName>" into Company field
        And I enter "<address1>" into Address field
        And I enter "<address2>" into Address Line 2 field
        And I enter "<cityName>" into City field
        And I set "<stateName>" into State form
        And I enter "<zipCode>" into Postal Code field
        And I set "<country>" on Country form
        And I enter "<addInfo>" into Additional Information on text area
        And I enter "<homePhone>" into Home Phone field
        And I enter "<mobilePhone>" into Mobile Phone field
        And I enter "<addressAlias>" into Address Alias field

        Then I should be successfully registered

        Examples:
            | gender   | firstName | lastName | password | birthDay | birthMonth | birthYear | newsLetter | specialOffers | companyName | address1   | address2 | cityName | stateName | zipCode | country       | addInfo | homePhone | mobilePhone | addressAlias   |
            | Female   | Jane      | Doe      | 12345    | 10       | 4          | 1950      | true       | false         | Amazon      | 5th Avenue | Broadway | New York | New York  | 54321   | United States | Empty   | 555 1234  | 555 4321    | Silicon Valley |