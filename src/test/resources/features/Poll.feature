
Feature: As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.

  Users :
  helpdesk1@cybertekschool.com
  marketing1@cybertekschool.com
  hr1@cybertekschool.com

  @poll1
  Scenario Outline: Verify the user add users by selecting multiple contacts from Employees and Department's contact lists.

    Given the user logs in as a "<userType>"
    Then the user click on the poll button
    And the user click on the add more button in the recipient field
    And the user select the employees and department group
    And The user select the group ffff
    Then the user select the group of the all department and subdepartment employees


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |
@poll2
  Scenario Outline: Verify the user be able to add questions and multiple answers.

    Given the user logs in as a "<userType>"
    Then the user click on the poll button
    And the user write a question in to question field
    And the user write a answer into answer one field
    And the user write a answer into answer two field
    Then user enters something in the message field
    Then the user send to message


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  @poll3
  Scenario Outline: Verify the user be able to se""The message title is not specified" error message.

    Given the user logs in as a "<userType>"
    Then the user click on the poll button
    And the user write a question in to question field
    And the user write a answer into answer one field
    And the user write a answer into answer two field
    Then the user send to message
    Then the user se the message title error message


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

    @poll4
  Scenario Outline: Verify the user be able to se "Please specify at least one person."  error message.

    Given the user logs in as a "<userType>"
    Then the user click on the poll button
    And the user write a question in to question field
    And the user write a answer into answer one field
    And the user write a answer into answer two field
    Then user enters something in the message field
    Then the user deletes all recipients
    Then the user send to message
    Then the user se the att least one recipient error message


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |
  @poll5
  Scenario Outline: Verify the user be able to se "The question text is not specified."  error message.

    Given the user logs in as a "<userType>"
    Then the user click on the poll button
    And the user write a answer into answer one field
    And the user write a answer into answer two field
    Then user enters something in the message field
    Then the user send to message
    Then the user se the questions text error message


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |