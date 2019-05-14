package snippet;

public class Snippet {
	Feature: Demo Web Shop Project
	 Scenario: Order Blue Jeans from Demo Web Shop Ecommerce Website
	     When User opens chrome browser 
	     And Enters the url as demowebshop.tricentis.com
	     Then Home Page of the Demo Web Shop will be displayed
	     When User clicks the Log in link   
	     Then Login Page will be displayed  
	     When User enters email and password
	      And clicks the login button
	     When User clicks the Apparel and Shoes Link
	      Then Apparel and Shoes Page will be opened
	      When User clicks the Blue Jeans link 
	      Then  Blue Jeans image is displayed with the cost details
	      When User clicks the Add to Cart Button 
	       Then Product added in the Shopping cart message will be displayed
	       When User clicks the Shopping cart link 
	       Then Cart Page will be redirected
	       When User enters country as India and Zipcode
	       And clicks the terms of service checkbox button and check out button
	       Then User Redirects to One Page Check Out Page
	       When User clicks the continue button for Billing Address
	       Then Shipping Address Tab is displayed 
	       When User clicks the continue button for Shipping Address
	       Then Shipping Method will be displayed
	       When User selects the option for Shipping Address and clicks continue button
	       Then Payment Method tab will be displayed
	       When User selects the option for Payment Method and clicks the continue button
	       Then Then Payment Information will be displayed
	       When User Enters the credit card 
	        And Enters cardHolderName 
	        And Enters card Number
	        And Enters Expiration Month
	        And Enters Expiration Year
	        And clicks the continue button
	        Then Confirm Order Tab will be displayed
	        When User clicks the confirm button
	        Then CheckOut Completed Page will be displayed
	        And Successfully Order Message will be displayed
	        When User clicks the continue button
	         Then User returns to Home Page
	         When User clicks the Log out link 
	         Then User is logged out
	     
	       
	       
	      
	      
}

