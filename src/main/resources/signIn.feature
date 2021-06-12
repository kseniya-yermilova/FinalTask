Feature: Sign In
  As a user
  I want to test all main sign in form functionality
  So that I can be sure that sign in form works correctly

  Scenario Outline: Check that impossible to sign in with wrong email
    Given User opens '<homePage>' page
    And User clicks 'Sign In' button
    And User checks sign in popup visibility
    And User clicks 'Sign In' button at sign in popup
    And User checks email and password fields visibility
    When User enter '<wrongEmail>'
    And User clicks 'Sign In' button at sign in page
    Then User checks that email error is visible

    Examples:
      | homePage              | wrongEmail |
      | https://www.asos.com/ | lalala     |

  Scenario Outline: Check that impossible to sign in without password
    Given User opens '<homePage>' page
    And User clicks 'Sign In' button
    And User clicks 'Sign In' button at sign in popup
    When User enter '<correctEmail>'
    And User clicks 'Sign In' button at sign in page
    Then User checks that password error is visible

    Examples:
      | homePage              | correctEmail     |
      | https://www.asos.com/ | lalala@gmail.com |

  Scenario Outline: Check that it is possible to reset the password
    Given User opens '<homePage>' page
    And User clicks 'Sign In' button
    And User clicks 'Sign In' button at sign in popup
    And User checks 'forgot password' button visibility
    When User clicks 'Forgot password'
    Then User checks email field visibility
    And User checks 'reset password' button visibility

    Examples:
      | homePage              |
      | https://www.asos.com/ |