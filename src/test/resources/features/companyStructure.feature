
Feature:

  Users :
  helpdesk1@cybertekschool.com
  marketing1@cybertekschool.com
  hr1@cybertekschool.com


  Scenario Outline: Verify that users can send a appreciation by filling the mandatory fields.

    Given the user logs in as a "<userType>"



    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

