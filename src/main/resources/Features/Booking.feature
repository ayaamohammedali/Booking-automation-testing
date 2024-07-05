@smoke
Feature:  Booking a seat

  Scenario: user could go to website and book a seat
    Given user choose route
    When user select a Bus
    And user search a seat
    And user find a seat
    And user Select BoardingDropping Points
    And user fill cusstomer details
    And user Fill Passenger Details
    And user Click Make Payment
    Then user confirm payment