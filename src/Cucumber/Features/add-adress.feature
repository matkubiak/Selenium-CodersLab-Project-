Feature: Adding an address to a user account after logging in


  Scenario: Add the address to the user account

    Given User is logged in to CodersLab shop

    When User goes to the page with the shipping addresses

    And User goes to the page with the form using the "Create new address" button

    And User correctly enters keywords the required fields <alias> <address> <city> <zip/postal code> <country> <phone>

    And User saves the data with the "Save" button

    Then User receives information about the correct entry of the address

    And close browser


    Examples:

      | alias | address | city | zip/postal code | country | phone |
      | XXX | Prosta 37 | Poznań | 60-814 | Polska | 781781781 |
