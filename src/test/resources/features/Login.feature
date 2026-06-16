Feature: Login

  Scenario: Successful Login
    Given I am on the login page
    When I login with "admin" and "password123"
    Then I should be redirected to the dashboard
