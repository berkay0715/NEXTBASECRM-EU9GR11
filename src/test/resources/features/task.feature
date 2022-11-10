
Feature: Task creation
  User Story:As a user, HR should be able to assign task creation

  Scenario Outline: Verify that User should be able to see "high priority" will be selected
    Given the user logs in as a "<userType>"

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |