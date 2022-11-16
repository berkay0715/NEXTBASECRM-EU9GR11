
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

    @smoke
  Scenario Outline: 2- HR User should be able to assign a task to more than one user
    When user enters "<username>","<password>"and click the login button
    And user clicks on the -Task-type the task name
    And user clicks to the -High Priority
    And user clicks to the -Responsible Person-  and select 3 person
    Then user should see 3 the responsible people
    Examples: employees credentials
      | username                      | password |
      | hr4@cybertekschool.com        | UserUser |

  Scenario Outline: 3- Scenario of checklist adding to the task
    When user enters "<username>","<password>"and click the login button
    And user clicks on the -Task-type the task name
    And user clicks to the -High Priority
    And user clicks to the -Responsible Person-  and select 3 person
    And user clicks to the Checklist and type text
    Then user should see the added Checklist on the task
    Examples: employees credentials
      | username                      | password |
      | hr4@cybertekschool.com        | UserUser |
  Scenario Outline: 4- Scenario of adding  Deadline on the task
    When user enters "<username>","<password>"and click the login button
    And user clicks on the -Task-type the task name
    And user clicks to the -High Priority
    And user clicks on the Deadline
    And user select the date
    Then user should see the deadline of the task
    Examples: employees credentials
      | username                      | password |
      | hr4@cybertekschool.com        | UserUser |

  Scenario Outline: 5- Scenario of setting Time planning function for deadline.
    When user enters "<username>","<password>"and click the login button
    And user clicks on the -Task-type the task name
    And user clicks to the -High Priority
    And user clicks on the Time planning
    And user select the start and finish date
    Then user should see the start and deadline of the task
    Examples:
      | username                      | password |
      | hr4@cybertekschool.com        | UserUser |


  Scenario Outline:6- Responsible people can see task on their homepage
    When user enters "<username>","<password>"and click the login button
    And user clicks on the -Task-type the task name
    And user clicks to the -High Priority
    And user clicks to the Checklist and type text
    And user clicks on the Time planning
    And user select the start and finish date
    Then user should see on the count on the homepage under "MY TASKS"table
    Examples:
      | username                      | password |
      | hr4@cybertekschool.com        | UserUser |


