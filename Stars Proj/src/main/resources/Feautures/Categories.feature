Feature: Categories / User add new category
  Scenario: user add category
    Given user enter credentials to login - "admin@email.com"&"123123"
    And User click on sign in button
    Given user go to categories page
    And user click on Add button
    When user enter Name Ar
    And user enter Name En
    And user select Role
    And user click save button
    Then category added successfully

    Scenario: user edit category
      Given user enter credentials to login - "admin@email.com"&"123123"
      And User click on sign in button
      Given user go to categories page
      And user click on edit btn
      And user delete old data
      And User edit in NameAr input field
      And click save btn

