Feature: Create user in LUMA page

  Scenario: Create user Ricardo in LUMA page
    Given Ricardo is in LUMA page
    When he write "Prueba1234." in Password field
    Then All ok