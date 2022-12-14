@c1
Feature:As a user, I should be able to add link, insert video, mention, quote, add tag in message.

  Users :
  helpdesk1@cybertekschool.com
  marketing1@cybertekschool.com
  hr1@cybertekschool.com




  @c1 @TC01 @smoke
  Scenario Outline: User should be able to add mentions about only department employees.
    Given the user logs in as a "<userType>"

    When user clicks the "Message Tab".
    And user enters any message.
    And user clicks the "Add Mention Button".
    And user clicks the "EmpAndDep Button".
    Then verify that user should be able to see list of employees.
    When user clicks the "On of the Employee's Mail".
    Then verify that user should be able to mention the employee successfully.
    When user clicks the "Send Button".
    Then verify that user should be able to send the mentioned message successfully.



    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |



  @c1 @TC02
  Scenario Outline: User should be able to attach a link to the specified text.
    Given the user logs in as a "<userType>"

    When user clicks the "Message Tab".
    And user enters any message.
    And user clicks the "Add Link Button".
    Then verify that user should be able to see Link page.
    When user enters the link text to the link text input box.
    And user enters the link url to the link url input box.
    And user clicks the "Save Button".
    Then verify that user should be able to add the link successfully.
    When user clicks the "Send Button".
    Then verify that user should be able to send the added link message successfully.

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |



  @c1 @TC03
  Scenario Outline: User should be able to insert YouTube and Vimeo videos.
    Given the user logs in as a "<userType>"

    When user clicks the "Message Tab".
    And user enters any message.
    And user clicks the "Insert Video Button".
    Then verify that user should be able to see video page.
    When user enter the URL from Vimeo to video source input box.
    Then verify that user should be able to add the video successfully.
    When user clicks the "Save Button".
    Then verify that user should be able to save the add video function successfully.
    When user clicks the "Send Button".
    Then verify that user should be able to send the video added from Vimeo message successfully.

    When user clicks the "Message Tab".
    And user enters any message.
    And user clicks the "Insert Video Button".
    Then verify that user should be able to see video page.
    When user enter the URL from Youtube to video source input box.
    Then verify that user should be able to add the video successfully.
    When user clicks the "Save Button".
    Then verify that user should be able to save the add video function successfully.
    When user clicks the "Send Button".
    Then verify that user should be able to send the video added from Vimeo message successfully.




    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |



  @c1 @TC04
  Scenario Outline: User should be able to cancel links and videos before sending the message.
    Given the user logs in as a "<userType>"

    When user clicks the "Message Tab".
    And user enters any message.
    And user clicks the "Add Link Button".
    Then verify that user should be able to see Link page.
    When user enters the link text to the link text input box.
    And user enters the link url to the link url input box.
    And user clicks the "Save Button".
    Then verify that user should be able to add the link successfully.

   # And user clicks the "Insert Video Button".
   # Then verify that user should be able to see video page.
  #  When user enter the URL from Vimeo to video source input box.
  # Then verify that user should be able to add the video successfully.
   # When user clicks the "Save Button".
   # Then verify that user should be able to save the add video function successfully.

  #  When user removes the "Video" from message box.
  # Then verify that user should be able to remove the video from message box.
    When user removes the "Link" from message box.
    Then verify that user should be able to remove the link from message box.

    When user clicks the "Send Button".





    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |



  @c1 @TC05
  Scenario Outline: User should be able to add quotes.
    Given the user logs in as a "<userType>"

    When user clicks the "Message Tab".
    And user enters any message.
    And user clicks the "Quote Text Button".
    Then verify that user should be able to see the block quote.
    When user types something.
    And user clicks the "Send Button".
    Then verify that user should be able to add the quote successfully.

    

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |



  @c1 @TC06
  Scenario Outline: User should be able to add tags to messages.
    Given the user logs in as a "<userType>"

    When user clicks the "Message Tab".
    And user enters any message.
    When user clicks the "Tag Button".
    Then verify that user should be able to see tag page.
    When user enters the tag name.
    And user clicks the "Add Button".
    Then verify that user should be able to add the tag successfully.
    When user clicks the "Send Button".
    Then verify that user should be able to send the tagged message successfully.



    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |





  Scenario Outline: User should be able to remove tags before sending the message.
    Given the user logs in as a "<userType>"

    When user clicks the "Message Tab".
    And user enters any message.

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |