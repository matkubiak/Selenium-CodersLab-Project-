Feature: Adding an address to a user account after logging in


  Scenario Outline: Add the address to the user account

    Given User is logged in to CodersLab shop

    When User goes to the page with the shipping addresses

    And User goes to the page with the form using the "Create new address" button

    And User correctly enters <keywords> the required fields

    And User saves the data with the "Save" button

    Then User receives information about the correct entry of the address, and close browser

    Examples:

      | alias | address   | city   | zip/postal code | country | phone     |
      | Mati  | Prosta 37 | Poznan | 60-814          | Polska  | 781781781 |