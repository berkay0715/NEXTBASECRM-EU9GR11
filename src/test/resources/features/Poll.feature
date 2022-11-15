
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
  Scenario Outline: Verify the user able to create a poll with mandatory fields (without message title) and se""The message title is not specified" error message.

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
  Scenario Outline: Verify the user able to create a poll with mandatory fields (without recipient) and se "Please specify at least one person."  error message.

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
  Scenario Outline: Verify the user able to create a poll with mandatory fields (without question) and se "The question text is not specified."  error message.

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

@poll6
  Scenario Outline: Verify the user able to create a poll with mandatory fields (without answers) and se "The question "........." has no answers." error message.

    Given the user logs in as a "<userType>"
    Then the user click on the poll button
    And the user write a question in to question field
    Then user enters something in the message field
    Then the user send to message
    Then the user se error message for ungiven answers


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  @poll7
  Scenario Outline:Verify the user able to create a poll with mandatory fields(with only one answer) and se "Please specify at least two answers."

    Given the user logs in as a "<userType>"
    Then the user click on the poll button
    And the user write a question in to question field
    Then user enters something in the message field
    And the user write a answer into answer one field
    Then the user send to message
    Then user should see Please specify at least two answers. Error message


    Examples:
      | userType |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  @poll8
  Scenario Outline: Verify delete questions and multiple answers input boxes
    Given the user logs in as a "<userType>"
    Then the user click on the poll button
    And  the user clicks the Add question link
    And  the user clicks the Add question link again
    Then the user deletes the questions and answers

    Examples:
      | userType |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  @poll9
  Scenario Outline: Verify the Allow multiple choice checkbox
    Given the user logs in as a "<userType>"
    Then the user click on the poll button
    And  the user clicks the Allow multiple choice input
    And the user should see The Allow multiple choice label
    Examples:
      | userType |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |