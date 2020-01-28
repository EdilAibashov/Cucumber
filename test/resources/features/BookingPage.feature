@BookingPage
Feature: Test User Page
  Scenario: Booking and Reserve Tour
    Given User opens home page
    When Verifies title is PHPTRAVELS | Travel Technology Partner
    And Opens "Last" featured tour
#    Then Click Book Now
#    And In Coupon Code field input created coupon code
    Then Verifies In Coupon Code field input created coupon code
    And I select last tour package option from the list
    Then I should see pop up window
    When I fill out the form and click submit
    Then I should see message "Your booking status is Unpaid"
    And I click on "Pay on arrival"
    Then I should see pop up window to confirm
    When I accept the pop up window
    Then I should see message2 "Your booking status is Reserved"