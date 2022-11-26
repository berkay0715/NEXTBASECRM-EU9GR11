
#1. User should be able to make a comment, like, or unfollow other employees' posts.
#2. User should be able to like, or make comments on all other reviewers' comments.
#3. User should be able to like and replay his/her own comment.
#4. After making a comment user should be able to "view comment", "copy link", "edit", "delete" and "create task"
#by clicking more
#5. User should be able to see the reviewers' names and visit their profiles by clicking on reviewers' name
#6. User should be able to add others' posts to favorites by clicking on the Star icon.

Feature: As a user, I should be able to interact with employees on the posts

  Users :
  helpdesk1@cybertekschool.com
  marketing1@cybertekschool.com
  hr1@cybertekschool.com

@isa1
  Scenario Outline: Verify that user can make a comment, like or unfollow other employee's posts.
    Given the user logs in as a "<userType>"
    When user clicks the "Message Tab".
    And  the user writes a message
    And the user clicks send button
    When user clicks the comment button in the first post in the dashboard
    And user writes a comment to the first post in the dashboard
    And the user clicks the send comment button.
    Then user can see the comment under the post.

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  @isa2
  Scenario Outline: Verify that user is able to like other reviewers' comments
    Given the user logs in as a "<userType>"
    When user clicks the "Message Tab".
    And  the user writes a message
    And the user clicks send button
    When user clicks the comment button in the first post in the dashboard
    And user writes a comment to the first post in the dashboard
    And the user clicks the send comment button.
    Then user can see the comment under the post.
    And user clicks the like button.


    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

@isa3
  Scenario Outline: User should be able to like and replay his/her own comment.
    Given the user logs in as a "<userType>"
    When user clicks the "Message Tab".
    And  the user writes a message
    And the user clicks send button
    When user clicks the comment button in the first post in the dashboard
    And user writes a comment to the first post in the dashboard
    And the user clicks the send comment button.
    Then user can see the comment under the post.
    And user clicks the replay button.

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |

  Scenario Outline: After making a comment user should be able to "view comment", "copy link", "edit", "delete" and "create task"
by clicking more
    Given the user logs in as a "<userType>"
    When user clicks the "Message Tab".
    And  the user writes a message
    And the user clicks send button
    When user clicks the comment button in the first post in the dashboard
    And user writes a comment to the first post in the dashboard
    And the user clicks the send comment button.
    Then user can see the comment under the post.
    And user clicks the replay button.

    Examples:
      | userType       |
      | Helpdesk       |
      | Human Resource |
      | Marketing      |
