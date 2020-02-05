Feature: Buy

  Scenario : Successful buy product
    Given I open chrome browser
    When I navigate to login.html page
    And I provide username and password
    And I click on login button
    And I click on logo
    And I click on product "Hummingbird printed sweater"
    And I select size "M"
    And I select quantity
    And I click add to cart
    And I click checkout
    And I click checkout
    And And I provide address as "Address" and zip "00-000" and city "City" and country "United Kingdom"
    And I click on continue address button
    And I click on continue shipping button
    And I click on pay by check
    And I agree on term
    And I click on order button
    Then Take screenshot
    And close browser

