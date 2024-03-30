Feature: Search and Place the order for Products
@PlaceOrder
  Scenario Outline: Search Experience for product search in both home and offer page
    Given User in on GreenCart Landing page
    When User searched with Shortname <Name> and extracted actual name of product
    And Added "3" items of the selected product to cart
    Then User proceeds to Checkout and validate the <Name> items in checkout page
    And verify user has ability to enter promo code and place the order

    Examples:
    | Name |
    | TOM  |