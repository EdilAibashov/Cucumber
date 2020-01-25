@userPage
Feature: Test User Page
  Scenario:
    Given User opens home page
    When Verifies title is PHPTRAVELS | Travel Technology Partner
    When Opens any featured tour
    When Click Book Now
    Then In Coupon Code field input created coupon code
    Then Verifies In Coupon Code field input created coupon code