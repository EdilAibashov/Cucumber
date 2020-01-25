@couponPage
Feature: Test Coupon Page
  Scenario: Verify title is Dashboard
    Given User opens admin page
    When User sign in admin page
    When User navigates to featured tour page
    Then Verifies In Coupon Code field input created coupon code