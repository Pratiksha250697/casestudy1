@functionalTest
Feature: testing heroku

  @smokeTest
  Scenario: testing herkuapp
    Given user is on home page
    When user enters username and password
    Then user is logged in
