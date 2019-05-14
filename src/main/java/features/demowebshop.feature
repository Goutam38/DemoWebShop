Feature: Demo Web Shop Website

  @execute
  Scenario: Login Demo Web Shop
    Given User is on Home Page
    When User Clicks Login Link
    Then Login Page should be displayed
    When User Enters valid Email and Password and Clicks on Remember me check box
    When clicks Login button
    Then Page with user name should be displayed
    When User Clicks Log out link
    Then Page without user name should be displayed
