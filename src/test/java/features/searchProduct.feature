Feature: Search and Place the order for Products

  Scenario: Search Experience for product search in both home and offer page
    Given User in on GreenCart Landing page
    When User searched with Shortname "Tom" and extracted actual name of product
    Then User searched for "Tom" shortname in offers page
    And validate product name in offer page matches with Landing page