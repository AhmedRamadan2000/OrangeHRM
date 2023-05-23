Feature: Add New User
  As a an admin
  I want to login to the system and add new user

  Scenario: Login with valid credentials
    Given user is on the login page
    When user enter a valid credentials
    Then user should be redirected to the dashboard page
    And scroll down
    And check the diagram appears

  Scenario: The admin add New user
    Given user is on the login page
    When user enter a valid credentials
    And user click on the admin tab
    Then the user should be redirected to the System Users page
    And click on the add new admin
    And select user role
    And add employee name
    And select the status
    And add username
    And add password
    And add confirm password
    And click on the save button
    Then the user should added

  Scenario: The admin delete the added user
    Given user is on the login page
    When user enter a valid credentials
    And user click on the admin tab
    Then the user should be redirected to the System Users page
    Then search for the added user by username
    And click on the delete user
    And click on the confirm

