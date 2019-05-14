#Author: sai-goutam.koppula@Capgemini.com
Feature: Demo Web Shop Project

  @execute
  Scenario: Check Links are working Properly or not
    Given User is on Home Page
    When User Clicks Login Link
    Then Login Page should be displayed
    When User Enters valid Email and Password and Clicks on Remember me check box
    When clicks Login button
    Then Page with user name is displayed
    When User clicks Books Link
    Then Page related to Books items should be displayed
    When User clicks Computers Link
    Then Page related to Computers items should be displayed
    When User clicks Electronics Link
    Then Page related to Electronics items should be displayed
    When User clicks Apparel and Shoes Link
    Then Page related to Apparel and Shoes items should be displayed
    When User clicks Digital Downloads Link
    Then Page related to Digital Downloads should be displayed
    When User clicks Jewellery Link
    Then Page related to Jewellery items should be displayed
    When User clicks Gift Cards Link
    Then Page related to Gift Cards items should be displayed
