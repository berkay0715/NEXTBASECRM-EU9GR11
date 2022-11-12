
Feature:As a user, I should be able to use functions on Company Structure under Employee menu.

  Users :
  helpdesk1@cybertekschool.com
  marketing1@cybertekschool.com
  hr1@cybertekschool.com




  Scenario Outline: Verify that  all user types should be able to display company structure.
    Given the user logs in as a "<userType>"
    When user clicks the employees link
    And user clicks company structure
    Then user should see star next to company structure

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |




  Scenario Outline: Verify that  Hr user should be able to add a department from the company structure.
    Given the user logs in as a "<userType>"
    When user clicks the employees link
    And user clicks the add department button
    And user types "New head office" in the department name
    And user clicks the Add  button
    Then user should see default parent department title

    Examples:
      | userType       |
      | Human Resource |


  Scenario Outline: Verify that  Hr user should be able to select a parent department from the department dropdown.
    Given the user logs in as a "<userType>"
    When user clicks the employees link
    And user clicks the add department button
    And user select a parent department from the department dropdown
    Then user should see default parent department title

    Examples:
      | userType       |
      | Human Resource |


  @NEXTBASE-1496
  Scenario Outline: Verify that   Hr user should be able to select a supervisor from "recent", "company" and "search"
    Given the user logs in as a "<userType>"
    When user clicks the employees link
    And user clicks the add department button
    And user clicks select from structure
    And  user clicks the recent box
    And user clicks a supervisor from recent box
    Then user should see default parent department title




    Examples:
      | userType       |
      | Human Resource |
