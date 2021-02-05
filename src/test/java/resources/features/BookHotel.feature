Feature: Testing Book a hotel

  Background:
    And  user enter the url
    Then  user should land on the home page

  Scenario: Booking hotel
    And the button hotels should be visible
    Then user click on the hotels button
    And user should see the hotels page
    Then user select a Hotel or a location "Istanbul"
    And user select a checkin date
    Then user select checkout date
    And user select the number of adults
    Then user select the number of children
    Then user click on search button