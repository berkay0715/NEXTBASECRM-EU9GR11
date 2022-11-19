@NEXTBASE-1531
Feature: As a user, I should be able to send appreciation by clicking on Appreciation tab from Quick Navigate Menu

  Users :
  helpdesk1@cybertekschool.com
  marketing1@cybertekschool.com
  hr1@cybertekschool.com

  @NEXTBASE-1526 @smoke
  Scenario Outline: Verify that users can send a appreciation by filling the mandatory fields.
    Given the user logs in as a "<userType>"
    When the user clicks more tab on portal homepage
    Then the user should be able to see appreciation on menu popup
    When the user clicks appreciation item
    And  the user writes appreciation message title
    Then the user should be able to see recipient as All employees by default
    When the user clicks send button
    Then the user should be able to see the appreciation message on activity stream

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  @NEXTBASE-1527
  Scenario Outline: Verifying Error messages for mandatory fields
    Given the user logs in as a "<userType>"
    When the user clicks more tab on portal homepage
    And  the user clicks appreciation item
    And  the user clicks send button
    Then --The message title is not specified-- error message should be displayed
    And  the user writes appreciation message title
    And  the user deletes all recipients
    And  the user clicks send button
    Then --Please specify at least one person-- error message should be displayed

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  @NEXTBASE-1528
  Scenario Outline: The message delivery should be to 'All employees' by default and should be changeable.
    Given the user logs in as a "<userType>"
    When the user clicks more tab on portal homepage
    And  the user clicks appreciation item
    And  the user writes appreciation message title
    Then the user should be able to see recipient as All employees by default
    When the user deletes all recipients
    And  the user clicks add persons link text
    Then the user should be able to select different recipients from the list

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  @NEXTBASE-1529
  Scenario Outline: Verify Cancel Button
    Given the user logs in as a "<userType>"
    When the user clicks more tab on portal homepage
    And  the user clicks appreciation item
    Then the user should be able to click cancel button

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  @NEXTBASE-1530
  Scenario Outline: Verify Appreciation Icons
    Given the user logs in as a "<userType>"
    When the user clicks more tab on portal homepage
    And  the user clicks appreciation item
    And the user writes appreciation message title
    Then the user should be able to select different grat icons
    And the user selects a recipient
    And the user clicks send button

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

