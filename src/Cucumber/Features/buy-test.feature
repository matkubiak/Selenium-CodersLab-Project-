Feature: Buying clothes after logging in.


  Scenario: Going through the clothes order path.

    Given User is logged in to CodersLab shop.

    When User goes to the page with Hummingbird Printed Sweater.

    And User he chooses size M and orders 5 pieces of this product.

    And User adds the order to the cart and goes to the page checkout.

    And User confirms the delivery address and selects PrestaShop "pick up in store".

    Then User selects the Pay by Check payment option and clicks "order with an obligation to pay".

    And Test takes a screenshot and close browser.