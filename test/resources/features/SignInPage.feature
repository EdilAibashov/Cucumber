@signingPage
Feature: Sign in page Testing
  Scenario: Create new user account
    Given I Navigate to Sign In page
    When I Create new user
    Then I Verify new user is created by checking if first name
