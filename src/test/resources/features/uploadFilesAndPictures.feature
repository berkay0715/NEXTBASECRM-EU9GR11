@hicret
Feature: Upload files and pictures as messages
  User Story: As a user, I should be able to upload files and pictures as messages

  Users :
  helpdesk ,marketing, hr


  Scenario Outline: 1,2 - User should be able to upload multiple files in different formats at the same time(3 files).
    Given the user logs in as a "<userType>"
    When user clicks "messageTab" on the quick navigate menu
    And user clicks upload files icon
    And user uploads file
    When the user clicks send button for uploading
    Then verify the user sent the files successfully

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |



  Scenario Outline: 3,4 - User should be able to upload pictures and then display the picture in Activity Stream.
    Given the user logs in as a "<userType>"
    When user clicks "messageTab" on the quick navigate menu
    And user clicks upload files icon
    And user uploads picture
    When the user clicks send button for uploading
    Then verify the user sent the picture successfully

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |


  Scenario Outline: 5- User should be able to insert the files and images into the text.
    Given the user logs in as a "<userType>"
    When user clicks "messageTab" on the quick navigate menu
    And user clicks upload files icon
    And user uploads file and images then insert them into the text
    And the user clicks send button for uploading
    Then verify the user inserted the files into the text successfully

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |



  Scenario Outline: 6- User should be able to allow a recipient to edit documents.
    Given the user logs in as a "<userType>"
    When user clicks "messageTab" on the quick navigate menu
    And user clicks upload files icon
    And user uploads file
    And user allows a recipient to edit document
    And the user clicks send button for uploading
    Then verify the user allowed a recipient to edit file successfully

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |



  Scenario Outline: 7 User should be able to remove files and images at any time before sending.
    Given the user logs in as a "<userType>"
    When user clicks "messageTab" on the quick navigate menu
    And user clicks upload files icon
    And user uploads a file
    And user remove the file
    Then verify the file is removed successfully

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |


  Scenario Outline: 8- User should be able to RENAME the file before sending it.
    Given the user logs in as a "<userType>"
    When user clicks "messageTab" on the quick navigate menu
    And user clicks upload files icon
    And user uploads picture
    And user rename the file before sending it
    And the user clicks send button
    Then verify the file is renamed successfully

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |




















