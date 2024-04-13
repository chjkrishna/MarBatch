Feature: Search feature

  Scenario Outline: Validate search behaviour

    Given I am on the next home page
    When I enter "<productType>" as a product type
    And I click on search button
    Then I should be able to see result title as '"<resultTitle>"'

  Examples: test data
    |productType| resultTitle|
    |   Jeans   |   Jeans    |
    |   Bag     |  Bag       |
    |Shoe       |Shoe        |

