@wip
Feature: As a user, I should be able to send messages by clicking on
  Message tab under Active Stream.

  Users :
  helpdesk1@cybertekschool.com
  marketing1@cybertekschool.com
  hr1@cybertekschool.com

  @tc1
  Scenario Outline: Use logs in and is able to see the send message box inside message tab
    Given the user logs in as a "<userType>"
    When the use clicks on message tab on the dashboard page
    Then the user sees send message box

  Scenario Outline: User types the message in the message draft box
    Given the user is inside the message draft box
    When the user types a message inside the message draft box
    Then the user sees "All employees" in the message box

  Scenario Outline:User is able to add recipients and send the message
    Given the user has finished typing message
    When the user clicks on add more to add recipients
    And the user selects the recipients from recent
    And the user selects the recipients from my groups
    And the user selects the recipients from employees and departments
    Then the user clicks on send and sends the message




    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

