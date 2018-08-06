Feature: Calculator

  Scenario: Add two numbers 2 & 3
    Given I have a calculator
    When adding 2 and 3
    Then result should be 5

  @tag2
  Scenario: Add two numbers -2 &-3
    Given I have a calculator
    When adding -2 and -3
    Then result should -5

  @tag3
  Scenario: Add two numbers -2 & 3
    Given I have a calculator
    When adding -2 and 3
    Then result should 1

  @tag4
  Scenario: Add two numbers 2 & -3
    Given I have a calculator
    When adding 2 and -3
    Then result should -1
