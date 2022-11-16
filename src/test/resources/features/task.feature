
Feature: Task creation
  User Story:As a user, HR should be able to assign task creation

  Background: User should be on the users homepage
    Given user is on the login page

  Scenario Outline: 1 - Selecting High Priority for task creation
    When user enters "<username>","<password>"and click the login button
    And user clicks on the -Task-type the task name
    And user clicks to the -High Priority
    Then user should see the High Priority Selectable
    Examples: employees credentials
      | username                      | password |
      | hr4@cybertekschool.com        | UserUser |


