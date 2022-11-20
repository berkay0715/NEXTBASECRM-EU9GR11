@wip
Feature: As a user, I should be able to send messages by clicking on
  Message tab under Active Stream.

  Users :
  helpdesk1@cybertekschool.com
  marketing1@cybertekschool.com
  hr1@cybertekschool.com

  #1. User should be able to send a message by filling in the mandatory fields.
  @tc1maz @smoke
  Scenario Outline: User logs in and sends the message by filling in the mandatory fields
    Given the user logs in as a "<userType>"
    When user clicks "messageTab" on the quick navigate menu
    And  the user writes a message
    And the user clicks send button
    Then the user should be able to see the message on activity stream


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

    #2. The message delivery should be to 'All employees' by default and should be changeable.
  @tc1maz
  Scenario Outline: The message delivery should be to 'All employees' by default and should be changeable.
    Given the user logs in as a "<userType>"
    When user clicks "messageTab" on the quick navigate menu
    And  the user writes a message
    Then the user should be able to see recipient as All employees by default
    When the user deletes all recipients
    And  the user clicks add persons link text
    Then the user should be able to select different recipients from the list

    Examples:
      | userType       |
      | Helpdesk       |
      #| Human Resource |
      #| Marketing      |

    #3. User should be able to cancel sending messages at any time before sending.
  @tc1maz
  Scenario Outline:User is able to add recipients and send the message
    Given the user logs in as a "<userType>"
    When user clicks "messageTab" on the quick navigate menu
    And  the user writes a message
    And the user should be able to click cancel button

    Examples:
     | userType       |
     | Helpdesk       |
     #| Human Resource |
     #| Marketing      |


  #Mandatory fields:  'Message Title'(content) & 'Recipient'.
  #Error messages for mandatory fields:
    #"The message title is not specified."
    #"Please specify at least one person."

  Scenario Outline: Verifying Error messages for mandatory fields
    Given the user logs in as a "<userType>"
    When user clicks "messageTab" on the quick navigate menu
    And  the user clicks send button
    Then --The message title is not specified-- error message should be displayed
    When user clicks "messageTab" on the quick navigate menu
    And  the user writes a message
    And  the user deletes all recipients
    And  the user clicks send button
    Then --Please specify at least one person-- error message should be displayed

    Examples:
      | userType       |
      | Helpdesk       |
      #| Human Resource |
      #| Marketing      |

      #Recipients should be selectable from "Recent", "My Groups"(enable to see this type of Recipients you need to join at least one of the groups beforehand) and "Employees and departments."
      #Recipients can be added more than one and are deletable.
  @errormessage
  Scenario Outline: The message delivery should be to 'All employees' by default and should be changeable.
    Given the user logs in as a "<userType>"
    When user clicks "messageTab" on the quick navigate menu
    And  the user writes a message
    When the user deletes all recipients
    And  the user clicks add persons link text
    Then the user should be able to select different recipients from the list

    Examples:
      | userType       |
      | Helpdesk       |
      #| Human Resource |
      #| Marketing      |
