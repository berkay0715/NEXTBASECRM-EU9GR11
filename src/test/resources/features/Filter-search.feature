@wip
Feature: As a user, I should be able to use "Filter and search" functionality on Active Stream.

  Users :
  helpdesk1@cybertekschool.com
  marketing1@cybertekschool.com
  hr1@cybertekschool.com

  @tc1
  Scenario Outline: Verify that User should be able to see default filters as "my activity, work, favorite, announcements, and workflows".
    Given the user logs in as a "<userType>"

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |