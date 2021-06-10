Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Check site main functions
    Given User opens '<homePage>' page
    And User checks header visibility
    And User checks footer visibility
    And User checks search field visibility
    And User checks sign in button visibility
    And User checks shopping bag button visibility
    When User opens shopping bag
    Then User checks empty bag title visibility

    Examples:
      | homePage              |
      | https://www.asos.com/ |