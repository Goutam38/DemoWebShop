#Author: sai-goutam.koppula@Capgemini.com
Feature: Demo Web Shop Website

  @execute
  Scenario: Order Blue Jeans from Demo Web Shop Website
    Given User is on Home Page
    When User Clicks Login Link
    Then Login Page should be displayed
    When User Enters valid Email and Password and Clicks on Remember me check box
    When clicks Login button
    Then Page with user name should be displayed
    When User clicks Apparel and Shoes link
    And User selects blue jeans link on the Apparel and Shoes Web Page
    And clicks Add to Cart button
    Then Confirmation message should be displayed that the Product is added in the cart
    When User clicks the Shopping Cart Link
    Then Shopping Cart is displayed
    When User Selects Country as India selects Zip code of any state checks the terms and conditions and clicks checkout button
    Then One Page Check Out is displayed
    When User enters Shipping Address
    When User clicks Continue button in Shipping Method
    And User selects checkbox in Payment Method and clicks continue button
    When User clicks Continue button in Payment Information
    Then User checks the user and address information in confirm order tab
    When User clicks the confirm button
    Then Completed Page will be redirected
    And User clicks Continue button
