#@NEXTBASE-1496
Feature:As a user, I should be able to use functions on Company Structure under Employee menu.

  Users :
  helpdesk1@cybertekschool.com
  marketing1@cybertekschool.com
  hr1@cybertekschool.com



    @smoke
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



 @wip2
  Scenario: Verify that  Hr user should be able to add a department from the company structure.
    Given the user logs in as a "Human Resource"
    When user clicks the employees link
    And user clicks the add department button
    And user fills the department name
    And user clicks the Add  button
    Then user should be able to add a department



  @wip3
  Scenario: Verify that  Hr user should be able to select a parent department from the department dropdown.
    Given the user logs in as a "Human Resource"
    When user clicks the employees link
    And user clicks the add department button
    And user clicks parent department dropdown
    Then user should be able to select a parent department





  @wip4
  Scenario: Verify that   Hr user should be able to select a supervisor from "recent", "company" and "search"
    Given the user logs in as a "Human Resource"
    When user clicks the employees link
    And user clicks the add department button
    And user clicks select from structure
    And  user clicks the recent box
    Then user should be able to select a supervisor from recent box
    And user clicks the company box
    Then user should be able to select a supervisor from company box
    And user clicks the search box
    Then user should be able to select a supervisor from search box



  @wip5
  Scenario:Verify that Hr user should be able to close add department pop-up at any time before sending.
    Given the user logs in as a "Human Resource"
    When user clicks the employees link
    And user clicks the add department button
    Then user should be able to click to close at any time



  @wip6
  Scenario:Hr user should be able to edit departments, add child departments, and delete departments after adding the department.
    Given the user logs in as a "Human Resource"
    When user clicks the employees link
    And user clicks edit departments
    And user edits departments information
    And user clicks  add child departments
    And user adds a child department
    And user clicks delete icon of the new added department
    Then user should be able to delete departments





  @wip8
 Scenario Outline:Helpdesk and marketing users can not change company structure.
    Given the user logs in as a "<userType>"
    When user clicks the employees link
    Then user should not be able to see add department button

    Examples:
      | userType  |
      | Helpdesk  |
      | Marketing |












 #1. All user types should be able to display company structure.
   #2. Hr user should be able to add a department from the company structure.
   #3. Hr user should be able to select a parent department from the department dropdown.
   #4. Hr userr should be able to select a supervisor from "recent", "company" and "search"
   #5. Hr user should be able to close add department pop-up at any time before sending.
  # 6. Hr user should be able to edit departments, add child departments, and delete departments after adding the department.
   #7. Hr user should be able to drag and drop the existing department under another department as a subdepartment.
  # 8. Helpdesk and marketing users can not change company structure.

   #Description
  #Department name is mandatory.
  #Error message: "Section name is not specified."


