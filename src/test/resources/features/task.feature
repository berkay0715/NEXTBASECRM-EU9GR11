
Feature: Task creation
  User Story:As a user, HR should be able to assign task creation

   @tc1 @smoke
  Scenario: 1 - Selecting High Priority for task creation
    Given the user logs in as a "Human Resource"
    And user clicks on the -Task-type the task name
    And user clicks to the -High Priority
    Then user should see the High Priority Selectable


   @tc2
  Scenario: HR User should be able to assign a task to more than one user
    Given the user logs in as a "Human Resource"
    And user clicks on the -Task-type the task name
    And user clicks to the -High Priority
    And user clicks to the -Responsible Person- and select three person
    Then user should see there three responsible people


   @tc3
  Scenario: Scenario of checklist adding to the task
    Given the user logs in as a "Human Resource"
    And user clicks on the -Task-type the task name
    And user clicks to the -High Priority
    And user clicks to the -Responsible Person- and select three person
    And user clicks to the Checklist and type text
    #Then user should see the added Checklist on the task

   @tc4
  Scenario: Scenario of adding  Deadline on the task
    Given the user logs in as a "Human Resource"
    And user clicks on the -Task-type the task name
    And user clicks to the -High Priority
    And user clicks on the Deadline
    And user select the date
    #Then user should see the deadline of the task

   @tc5
  Scenario: Scenario of setting Time planning function for deadline.
    Given the user logs in as a "Human Resource"
    And user clicks on the -Task-type the task name
    And user clicks to the -High Priority
    And user clicks on the Time planning
    And user select the start and finish date
    #Then user should see the start and deadline of the task

    @tc6
  Scenario: Responsible people can see task on their homepage
    Given the user logs in as a "Human Resource"
    And user clicks on the -Task-type the task name
    And user clicks to the -High Priority
    And user clicks to the Checklist and type text
    And user clicks on the Time planning
    And user select the start and finish date
    #Then user should see on the count on the homepage under "MY TASKS"table



