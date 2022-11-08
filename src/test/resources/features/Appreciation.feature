@wip
Feature: As a user, I should be able to send appreciation by clicking on Appreciation tab from Quick Navigate Menu

  Users :
  helpdesk1@cybertekschool.com
  marketing1@cybertekschool.com
  hr1@cybertekschool.com

  @tc1
  Scenario Outline: Verify that users can send a appreciation by filling the mandatory fields.

    Given the user logs in as a "<userType>"
    When  the user clicks more tab on portal homepage
    Then the user should be able to see appreciation on menu popup
    When the user clicks appreciation item
    And the user writes appreciation message title
    Then the user should be able to see recipient as All employees by default
    When the user clicks send button
    Then the user should be able to see the appreciation message on activity stream


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |


  #1. User should be able to send a appreciation by filling the mandatory fields.
  #2. The message delivery should be to 'All employees' by default and should be changeable.
  #3. User should be able to cancel sending appreciation at any time before sending.
  #4. User should be select an icon

  #Mandatory fields: 'Message Title' & 'Recipient'.
  #Error messages for mandatory fields:
      #"The message title is not specified."
      #"Please specify at least one person."
  #Recipients should be selectable from "Recent", "My Groups", "Employees and departments"
  #Recipients can be added more than one and are deletable.