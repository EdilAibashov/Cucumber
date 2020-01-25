@adminPage
Feature: Test Admin Page
  Scenario: Verify title is PHPTRAVELS | Travel Technology Partner
    Given User opens admin page
    When User sign in admin page
    When User verifies admin page title is Dashboard
