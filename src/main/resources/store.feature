Feature: Buy item

  Scenario: Buy a phone in the store
    Given the user opens the application
    When the user chooses an item
    And item is present in inventory page
    And the user clicks to add item to cart
    And the user navigates to the cart
    And the item should be in the cart
    And the user places the order
    And the user fills in their data
    And the user clicks on purchase
    Then the purchase is confirmed