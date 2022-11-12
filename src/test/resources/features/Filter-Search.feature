@ac
Feature: As a user, I should be able to use "Filter and search" functionality on Active Stream.

  Scenario Outline: Verify that user should be able to see default filters as "my activity, work, favorite, announcements, and workflows".

    Given the user logs in as a "<userType>"
    When user clicks to the -Filter and search- box
    Then user should see the default filters

  Examples:
    | userType       |
    | Helpdesk       |
    | Human Resource |
    | Marketing      |


  Scenario Outline:Verify that user should be able to add and remove fields.
    Given the user logs in as a "<userType>"
    When user clicks the add field link and clicks the check box
    Then user should see the fields added
    When user clicks the restore default fields link
    Then user should see the added fields are removed

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |