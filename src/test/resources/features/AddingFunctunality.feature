Feature:As a user, I should be able to add link, insert video, mention, quote, add tag in message.

  Users :
  helpdesk1@cybertekschool.com
  marketing1@cybertekschool.com
  hr1@cybertekschool.com




  Scenario Outline: User should be able to add mentions about only department employees.
    Given the user logs in as a "<userType>"


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |




  Scenario Outline: User should be able to attach a link to the specified text.
    Given the user logs in as a "<userType>"


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |




  Scenario Outline: User should be able to insert YouTube and Vimeo videos.
    Given the user logs in as a "<userType>"


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |




  Scenario Outline: User should be able to cancel links and videos before sending the message.
    Given the user logs in as a "<userType>"


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |




  Scenario Outline: User should be able to add quotes.
    Given the user logs in as a "<userType>"


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |




  Scenario Outline: User should be able to add tags to messages.
    Given the user logs in as a "<userType>"


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |





  Scenario Outline: User should be able to remove tags before sending the message.
    Given the user logs in as a "<userType>"


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |