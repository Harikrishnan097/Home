Feature: New Login Page

@execute
  Scenario: login in the page
    Given Login page with username and password
    When username and password equal
    Then Display capgemini page
