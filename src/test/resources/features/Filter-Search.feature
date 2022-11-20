  @ac
  @NEXTBASE-1500

  Feature: As a user, I should be able to use "Filter and search" functionality on Active Stream.

  @smoke @NEXTBASE-1503
  Scenario Outline: 1- Verify that user should be able to see default filters as "my activity, work, favorite, announcements, and workflows".

  Given the user logs in as a "<userType>"
  When user clicks to the -Filter and search- box
  Then user should see the default filters

  Examples:
    | userType       |
    | Helpdesk       |
    | Human Resource |
    | Marketing      |

  @NEXTBASE-1504
  Scenario Outline: 2- Verify that user should be able to add and remove fields.

  Given the user logs in as a "<userType>"
  When user clicks the add field link and clicks the check box
  Then user should see the fields added
  When user clicks the restore default fields link
  Then user should see the added fields are removed

  Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  @NEXTBASE-1505
  Scenario Outline: 3- Verify that user should be able to search by specifying the Date.

  Given the user logs in as a "<userType>"
  When user clicks to the -Filter and search- box
  And user clicks the any date in the date  drop inbox
  And user clicks the search button
  Then user should see the date type in the -Filter and search- box

  Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  @NEXTBASE-1506
  Scenario Outline: 4- Verify that user should be able to search by selecting single type.

  Given the user logs in as a "<userType>"
  When user clicks to the -Filter and search- box
  And user clicks any types in the type drop inbox and clicks the search button
  Then user should see the selected type in the -Filter and search- box

  Examples:
        | userType |
        | Helpdesk |
        | Human Resource |
        | Marketing      |

  @NEXTBASE-1507
  Scenario Outline: 5- Verify that user should be able to search by selecting multiple type.

  Given the user logs in as a "<userType>"
  When user clicks to the -Filter and search- box
  And user clicks the multiple types in the type drop inbox and clicks the search button
  Then user should see the selected multiple types in the -Filter and search- box

  Examples:
          | userType |
          | Helpdesk |
          | Human Resource |
          | Marketing      |

  @NEXTBASE-1508
  Scenario Outline: 6- Verify that user should be able to save the filter.
    Given the user logs in as a "<userType>"
    When user clicks to the -Filter and search- box
    And user clicks the -save filter link- and names the -new filter-
    And user clicks the -save button-
    Then user should see the new filter type under the default filters

    Examples:
      | userType |
      | Helpdesk |
      | Human Resource |
      | Marketing      |

  @NEXTBASE-1509
  Scenario Outline: 7- Verify that user should be able to restore the default field.
    Given the user logs in as a "<userType>"
    When user clicks to the -Filter and search- box
    And user clicks the -restore default fields link- after adding new fields
    Then user should see the default type fields

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  @ignore @NEXTBASE-1510
  Scenario Outline: 8- Verify that user should be able to reset filters to default.
    Given the user logs in as a "<userType>"
    When user clicks to the -Filter and search- box
    And user adds new filter and clicks the -reset filters to default- link
    Then user should not see the added filters after user resets the filters

    Examples:
      | userType |
      | Helpdesk |
      | Human Resource |
      | Marketing      |