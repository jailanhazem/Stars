Feature: Services
  Scenario: user add service
    Given user enter credentials to login - "admin@email.com"&"123123"
    And User click on sign in button
    And user go to services page
    And user add new service
    And user NameAr and NameEn
    And user enter BriefAr and BriefEn
    And user select Category
    And user save service
