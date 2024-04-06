Feature: Search feature

  Scenario: Validate search behaviour based on Jeans as a product

    Given I am on the next home page
    When I enter Jeans as a product type
    And I click on search button
    Then I should be able to see result title as Jeans