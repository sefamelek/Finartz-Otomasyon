@RegresssionTest

Feature: Finartz Login Page Test

   Background:
      Given go to add a user page
      And input username "sefasefa"
      And input password "sefa"
      Then click save Button

   Scenario: Succesfull Login Scenerio
      And go to login page
      And check tab title
      And check header
      And check status message
      And check info message
      And input username "sefasefa"
      And input password "sefa"
      And click test login Button
      When check status message for succesfull login

   Scenario: Wrong Username Test
       And go to login page
       And check tab title
       And check header
       And check status message
       And check info message
       And input username "wronguser"
       And input password "sefa"
       And click test login Button
       When check status message for failed login

   Scenario: Wrong Password Test
      And go to login page
      And check tab title
      And check header
      And check status message
      And check info message
      And input username "sefasefa"
      And input password "wrong"
      And click test login Button
      When check status message for failed login

  Scenario: Wrong Username And Password Test
    And go to login page
    And check tab title
    And check header
    And check status message
    And check info message
    And input username "wrong"
    And input password "wrong"
    And click test login Button
    When check status message for failed login

  Scenario: No Username And Password Test
    And go to login page
    And check tab title
    And check header
    And check status message
    And check info message
    And click test login Button
    When check page message short username

  Scenario: Empty Username Test
    And go to login page
    And check tab title
    And check header
    And check status message
    And check info message
    And input password "sefa"
    And click test login Button
    When check page message short username

  Scenario: Empty Password Test
    And go to login page
    And check tab title
    And check header
    And check status message
    And check info message
    And input username "sefasefa"
    And click test login Button
    When check page message short password

  Scenario: Short Username Test
    And go to login page
    And check tab title
    And check header
    And check status message
    And check info message
    And input username "sef"
    And input password "sefa"
    And click test login Button
    When check page message short username

  Scenario: Short Password Test
    And go to login page
    And check tab title
    And check header
    And check status message
    And check info message
    And input username "sefasefa"
    And input password "sef"
    And click test login Button
    When check page message short password
    And close chrome

