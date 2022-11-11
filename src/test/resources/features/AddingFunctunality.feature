Feature:As a user, I should be able to add link, insert video, mention, quote, add tag in message.

  Users :
  helpdesk1@cybertekschool.com
  marketing1@cybertekschool.com
  hr1@cybertekschool.com




  Scenario Outline: User should be able to add mentions about only department employees.
    Given the user logs in as a "<userType>"
    When user clicks the "Message" button.
    And user enters any message.
    And user clicks the "Add Mention" button.
    And user clicks the "EmpAndDep" button.
    Then verify that user should be able to see list of employees.
    When user clicks one of the "Employee's Mail".
    Then verify that user should be able to mention the employee successfully.
    When user clicks "Send" button.
    Then verify that user should be able to send the mentioned message successfully.



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