Feature: Change Password And Name

    Scenario Outline: From SignIn Page, Login Into Account And Change Password and Name

        Given I am on SignIn page
        And I login with "<email>" and "<oldPassword>"

        When I click on Personal Info
        And I set my "<newFirstName>" on First Name field
        And I set my "<newLastName>" on Last Name field
        And I enter my "<oldPassword>" on Current Password field
        And I set my "<newPassword>" on New Password field
        And I confirm my "<newPassword>" Confirmation field

        Then My name and password should be successfully changed
        
        Examples:
            | email            | oldPassword   | newFirstName | newLastName | newPassword |
            | business@doe.com | 12345         | Bruce        | Wayne       | 54321       |
            | business@doe.com | 54321         | John         | Doe         | 12345       |