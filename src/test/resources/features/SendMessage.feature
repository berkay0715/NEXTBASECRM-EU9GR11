@wip
Feature: As a user, I should be able to send messages by clicking on
  Message tab under Active Stream.

  Users :
  helpdesk1@cybertekschool.com
  marketing1@cybertekschool.com
  hr1@cybertekschool.com


  Scenario Outline: Use logs in and is able to see the send message box inside message tab
    Given the user logs in as a "<userType>"
    When the use clicks on message tab on the dashboard page
    Then the user sees send message box


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  Scenario Outline: User types the message in the message draft box
    Given the user logs in as a "<userType>"
    When the user is inside the message draft box
    And the user types a message inside the message draft box
    Then the user sees all employees in the message box

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  Scenario Outline:User is able to add recipients and send the message
    Given the user logs in as a "<userType>"
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




