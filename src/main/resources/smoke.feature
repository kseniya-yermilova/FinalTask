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

  Scenario Outline: Check add product to cart
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User clicks first product of search results
    And User clicks add to bag button on product
    And User checks that add to bag popup visible
    Then User clicks main page button
    And User checks that amount of products in shopping bag are '<amountOfProducts>'

    Examples:
      | homePage              | keyword |amountOfProducts|
      | https://www.asos.com/ | hat     |1               |

  Scenario Outline: Check correct of product names
    Given User opens '<homePage>' page
    And User clicks Women button
    And User moves to Clothing button
    And User checks Clothing pop up visibility
    When User clicks Tall button
    Then User checks that names of product contains word '<keyword>'

    Examples:
      | homePage              |keyword|
      | https://www.asos.com/ |tall   |

  Scenario Outline: Check sale products
    Given User opens '<homePage>' page
    And User clicks Men button
    And User moves to Sale button
    And User checks Sale pop up visibility
    When User clicks Sale sunglasses button
    Then User checks sale products have saleIcon

    Examples:
      | homePage              |
      | https://www.asos.com/ |