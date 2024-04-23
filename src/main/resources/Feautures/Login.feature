Feature: Login / user try to login
Scenario: user can login
Given user enter loginEmail
And user enter password
And user select remember me
And user click on sign in button

  Scenario Outline: hshss
    Given user enter loginEmail as "<username>"
    And user enter password as "<password>"

    Examples:
      | username | password |
      | jailan   | wrong    |
      | wrong    | jailan   |
      | wrong    | wrong    |