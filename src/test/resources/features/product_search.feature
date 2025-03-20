@productSearch
Feature: Amazon Product Search
  As a user of Amazon
  I want to be able to search for products
  So that I can find items I am interested in purchasing

  Background:
    Given I am on the Amazon homepage

  @searchValidProduct
  Scenario: Search for a product by name
    When I enter "wireless headphones" into the search bar
    And I click the search button
    Then I should see a list of products related to "wireless headphones"

  @searchNoResults
  Scenario: Search with no results
    When I enter "xyz123nonexistentproduct" into the search bar
    And I click the search button
    Then I should see a message indicating no results were found

  Scenario: Use filters to refine product search
    Given I have searched for "4K television"
    When I apply a filter for brand "Samsung"
    And I apply a filter for price range "$500-$1000"
    Then I should see a list of "Samsung" 4K televisions within "$500-$1000" price range

  Scenario: Product search with pagination
    When I enter "coffee maker" into the search bar
    And I click the search button
    And I navigate to the second page of search results
    Then I should see additional products related to "coffee maker"
