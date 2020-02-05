Feature: Address

  Scenario Outline: Successful setup new address
    Given I open chrome browser
    When I navigate to login.html page
    And I provide username and password
    And I click on login button
    And I click on addreess button
    And I provide <alias> and <address> and <city> and <zip> and <country> and <phone>
    Then I click on save addreess button
    And close browser

    Examples:

      | alias | address | city | zip | country | phone |
      | XXX | Prosta 37 | Poznan | 60-814 | Polska | 781781781 |