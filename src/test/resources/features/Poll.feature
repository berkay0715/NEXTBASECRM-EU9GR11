
Feature: As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.

  Users :
  helpdesk1@cybertekschool.com
  marketing1@cybertekschool.com
  hr1@cybertekschool.com

  @poll1
  Scenario Outline: Verify the user add users by selecting multiple contacts from Employees and Department's contact lists.

    Given the user logs in as a "<userType>"
    Then the user click on the poll button
    And the user click on the add more button in the recipient field
    And the user select the employees and department group
    And The user select the group ffff
    Then the user select the groupf of the all department and subdepartment employees


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

