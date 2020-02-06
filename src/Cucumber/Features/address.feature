Feature: Address

  Scenario Outline: Successful setup new address
    Given I open new chrome browser
    When I navigate to login page
    And I provide username and password on login page
    And I click login button
    And I click on addreess button
    And I add a new address
    And I provide a keyword "<alias>" , "<address>" , "<city>" , "<zip>" , "<country>" , "<phone>"
    Then I click on save address button
    And Delete address
    And Close browser

    Examples:

      | alias | address | city | zip | country | phone |
      | XXX | Prosta 37 | Poznan | 60-814 | United Kingdom | 781781781 |