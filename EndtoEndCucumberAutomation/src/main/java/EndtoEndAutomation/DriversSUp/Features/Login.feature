Feature: Login feature
  Scenario: Login with valid credentials

    Given User is on the homepage
    When User logs in with valid  "username" and "pasword" credentials
    Then Welcome page is presented
    And The should be able to see all the available login options