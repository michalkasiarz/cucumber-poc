Feature: Test the error messages display

  Scenario: the error pops up if the destination is not provided
    Given user is on the landing page
    And the destination is not provided
    And search button is clicked
    Then the error message is displayed