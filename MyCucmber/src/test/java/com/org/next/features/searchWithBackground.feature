Feature: Search feature

  Background:
    Given I am on the next home page

  @SmokeTest
  Scenario: Validate search behaviour based on Jeans as a product
    When I enter "Jeans" as a product type
    And I click on search button
    Then I should be able to see result title as '"Jeans"'


  Scenario: Validate search behaviour based on Bag as a product
    When I enter "Bag" as a product type
    And I click on search button
    Then I should be able to see result title as '"Bag"'

  Scenario: Validate search behaviour based on Shoe as a product
    When I enter "Shoe" as a product type
    And I click on search button
    Then I should be able to see result title as '"Shoe"'

    @MyTest @SmokeTest
  Scenario: Validate search behaviour based on Nike as a Brand
    When I enter "Nike" as a brand
    And I click on search button
    Then I should be able to see result title as '"Nike"'

