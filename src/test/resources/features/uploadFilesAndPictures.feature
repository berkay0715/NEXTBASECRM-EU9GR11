Feature: Upload files and pictures as messages
  User Story: As a user, I should be able to upload files and pictures as messages

  Users :
  helpdesk1@cybertekschool.com
  marketing1@cybertekschool.com
  hr1@cybertekschool.com

  @wip
  Scenario Outline: User should be able to upload multiple files at the same time(3 files).
    Given the user logs in as a "<userType>"
    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |
    When user clicks "message" button on the quick navigate menu
    And user clicks upload files icon on the left corner below on the message field
    And user clicks 'Upload files and images' option and upload 3 files from his/her own computer
    When the user clicks send button
    Then verify the user sent the files successfully
