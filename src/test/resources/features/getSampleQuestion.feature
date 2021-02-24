Feature: Get a sample question

  Scenario: John wants to get a sample question
    Given The system shows try first button
    When John clicks the try first button
    Then The system shows a sample question
    And the try first button changes to the close button