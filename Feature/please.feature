Feature: creating profile Validation
@batch_1
Scenario: Verify creating profile in prudential
Given user is in the prudential profile creation page page
When user enters firstname as "anbu"
And user enters lastname as "nesan"
Then the user enters email address as "anbunesan1996@gmail.com"
And the user enters confirm email address as "anbunesan1996@gmail.com"
When user enters password as "N2482005"
And the user enters confirm password as "N2482005"
Then user should be navigated to page displaying thank you for creating profile