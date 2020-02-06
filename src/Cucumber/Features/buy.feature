Feature: Buy

  Scenario: Successful buy product
    Given I open chrome browser
    When I navigate to login.html page
    And I provide username and password
    And I click on login button
    And I search "Hummingbird printed sweater"
    And I click on product
    And I select size "M"
    And I select quantity
    And I click add to cart
    And I click checkout
    And I click proceed to checkout
    And I click on continue address button
    And I click on continue shipping button
    And I click on pay by check
    And I agree on term
    And I click on order button
    Then Take screenshot
    And close browser

