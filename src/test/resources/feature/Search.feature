Feature: Search functionality

  Scenario: Search an apple
    Given user in on the homepage
    When user enters "apple"
    Then user sees "apple" in the title