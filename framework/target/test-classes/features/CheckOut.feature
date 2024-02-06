Feature: checkout page
@checkout
Scenario: verify checkout page functionality
Given user is on intial page
When user adds product to cart and proceed to checkout
Then Promo code and place order are displayed