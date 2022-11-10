@NEXTBASE-1498
Feature: As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.

  Users :
  helpdesk1@cybertekschool.com
  marketing1@cybertekschool.com
  hr1@cybertekschool.com

  @poll1
  Scenario Outline: Verify

    Given the user logs in as a "<userType>"



    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

