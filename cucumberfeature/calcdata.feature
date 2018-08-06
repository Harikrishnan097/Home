@Tag
Feature: Calculator

  Scenario Outline: Add two numbers
    Given I have a calculator
    When adding <a> and <b>
    Then result should be <c>

    Examples: 
      | a | b | c |
      | 2 | 3 | 5 |
      | 3 | 5 | 9 |
