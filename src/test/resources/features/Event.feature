@Event
Feature:As a user, I should be able to create events by clicking on Event tab under Activity Stream.

  @NEXTBASE-1495
  Scenario Outline: 1- User should be able to add Event start and ending date and time, select "All day" and specify the time zone.

    Given the user logs in as a "<userType>"
    When user clicks to the event box
    Then user should enter a event name "Meeting"
    And user should start a event
    And user should end the event
    Then user should select All day
    And user should select Time Zone
    Then user should be able send event

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

    @smoke
  Scenario Outline: 2-  User should be able to set reminder.

    Given the user logs in as a "<userType>"
    When user clicks to the event box
    Then user should enter a event name "Meeting"
    And user should start a event
    And user should end the event
    Then user should select All day
    Then user should be able to set a reminder
    Then user should be able send event

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  Scenario Outline: 3-User should be able to select the event location from the dropdown.

    Given the user logs in as a "<userType>"
    When user clicks to the event box
    Then user should enter a event name "Meeting"
    And user should start a event
    And user should end the event
    Then user should select All day
    And user should be able to select event location
    Then user should be able send event

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |
@people
  Scenario Outline: 4- User should be able to add members
  by selecting contacts individually or adding groups and departments.

    Given the user logs in as a "<userType>"
    When user clicks to the event box
    Then user should enter a event name "Meeting"
    Then user should be able to select individuals, groups and departments
     Then user should be able send event

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  @mandatory
  Scenario Outline: 5- User should be able to send event by filling the mandatory fields.

    Given the user logs in as a "<userType>"
    When user clicks to the event box
    Then user should enter a event name "Meeting"
    Then user should be able send event

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  Scenario Outline: 6- User should be able to cancel sending event at any time before sending.

    Given the user logs in as a "<userType>"
    When user clicks to the event box
    Then user should enter a event name "Meeting"
    Then the user should be able to click cancel button before sending event any time

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |





