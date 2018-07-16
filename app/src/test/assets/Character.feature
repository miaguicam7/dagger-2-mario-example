Feature: Character
  This test correspond to test diferent uses cases from characters

  Scenario: obtain a list of characters
    Given The characterRepository
    When I call the method getCharacters
    Then I obtain 4 characters