@NEXTBASE-1496
Feature:As a user, I should be able to use functions on Company Structure under Employee menu.

  Users :
  helpdesk1@cybertekschool.com
  marketing1@cybertekschool.com
  hr1@cybertekschool.com



#@1
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


 # @2
  Scenario: Verify that  Hr user should be able to add a department from the company structure.
    Given the user logs in as a "Human Resource"
    When user clicks the employees link
    And user clicks the add department button
    And user types "New head office" in the department name
    And user clicks the Add  button
    Then user should see default parent department title



  #@3
  Scenario: Verify that  Hr user should be able to select a parent department from the department dropdown.
    Given the user logs in as a "Human Resource"
    When user clicks the employees link
    And user clicks the add department button
    And user select a parent department from the department dropdown
    Then user should see default parent department title



  #@4
  Scenario: Verify that   Hr user should be able to select a supervisor from "recent", "company" and "search"
    Given the user logs in as a "Human Resource"
    When user clicks the employees link
    And user clicks the add department button
    And user clicks select from structure
    And  user clicks the recent box
    And user clicks a supervisor from recent box
    Then user should be able to see structure department head delete cross


  #@4
  Scenario: Verify that   Hr user should be able to select a supervisor from "recent", "company" and "search"
    Given the user logs in as a "Human Resource"
    When user clicks the employees link
    And user clicks the add department button
    And user clicks select from structure
    And user clicks the company box
    And user clicks the Cyber Vet
    And user clicks a supervisor from company box
    Then user should be able to see structure department head delete cross

  #@4
  Scenario: Verify that   Hr user should be able to select a supervisor from "recent", "company" and "search"
    Given the user logs in as a "Human Resource"
    When user clicks the employees link
    And user clicks the add department button
    And user clicks select from structure
    And user clicks the search box
    And user types in the search input "Guljannat"
    And user clicks the Guljannat
    Then user should be able to see structure department head delete cross



  #@5
  Scenario:Verify that Hr user should be able to close add department pop-up at any time before sending.
    Given the user logs in as a "Human Resource"
    When user clicks the employees link
    And user clicks the add department button
    And user types "New head office" in the department name
    And user clicks the close department pop up
    Then user should be able to see add department button


  #@6
  Scenario:Verify that 6. Hr user should be able to edit departments, add child departments, and delete departments after adding the department.
    Given the user logs in as a "Human Resource"



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


