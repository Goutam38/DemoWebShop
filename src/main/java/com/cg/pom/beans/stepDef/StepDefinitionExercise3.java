package com.cg.pom.beans.stepDef;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import com.cg.pom.beans.DemoWebProject.ApparelAndShoesPage;
import com.cg.pom.beans.DemoWebProject.CartPage;
import com.cg.pom.beans.DemoWebProject.LoginPage;
import com.cg.pom.beans.DemoWebProject.OnePageCheckOutPage;
import com.cg.pom.beans.DemoWebProject.OrderCompletedPage;

import cucumber.api.java.en.*;

public class StepDefinitionExercise3{

	WebDriver driver;
	LoginPage lp;
	ApparelAndShoesPage ap;
	CartPage cp;
	OnePageCheckOutPage pcp;
	OrderCompletedPage ocp;
    
	@When("^User clicks Apparel and Shoes link$")
	public void user_clicks_Apparel_and_Shoes_link() throws Throwable {
		System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		lp = new LoginPage(driver);
		lp.clickLoginLink();
		lp.setEmail("goutam@gmail.com");
		lp.setPassword("123456");
		lp.clickRememberMeCheckBox();
		lp.clickLoginButton();  
		ap=new ApparelAndShoesPage(driver);
	    ap.clickApparelAndShoesLink();
	}

	@When("^User selects blue jeans link on the Apparel and Shoes Web Page$")
	public void user_selects_blue_jeans_link_on_the_Apparel_and_Shoes_Web_Page() throws Throwable {
	    ap.clickBlueJeansLink();
	    
	}

	@When("^clicks Add to Cart button$")
	public void clicks_Add_to_Cart_button() throws Throwable {
	   ap.clickAddToCartButton(); 
	}

	@Then("^Confirmation message should be displayed that the Product is added in the cart$")
	public void confirmation_message_should_be_displayed_that_the_Product_is_added_in_the_cart() throws Throwable {
	 ap.setSuccessMessage("The product has been added to your Add Cart");
	    
	}

	@When("^User clicks the Shopping Cart Link$")
	public void user_clicks_the_Shopping_Cart_Link() throws Throwable {
	  ap.clickShoppingCart();
	}

	@Then("^Shopping Cart is displayed$")
	public void shopping_Cart_is_displayed() throws Throwable {
	   
	}

	@When("^User Selects Country as India selects Zip code of any state checks the terms and conditions and clicks checkout button$")
	public void user_Selects_Country_as_India_selects_Zip_code_of_any_state_checks_the_terms_and_conditions_and_clicks_checkout_button() throws Throwable {
	    cp= new CartPage(driver);
		cp.setCountry("India");
	    cp.setZipCode("756056");
	    cp.clickTermsAndConditions();
	    cp.clickCheckOutButton();
	}

	@Then("^One Page Check Out is displayed$")
	public void one_Page_Check_Out_is_displayed() throws Throwable {
		pcp= new OnePageCheckOutPage(driver);
		pcp.clickContinueButton();
		Thread.sleep(5000);
	
	}

	@When("^User enters Shipping Address$")
	public void user_enters_Shipping_Address() throws Throwable {
	   pcp.clickContinueButton2();
	}

	@When("^User clicks Continue button in Shipping Method$")
	public void user_clicks_Continue_button_in_Shipping_Method() throws Throwable {
	  pcp.clickContinueButton();
	  
	 
	}

	@When("^User selects checkbox in Payment Method and clicks continue button$")
	public void user_selects_checkbox_in_Payment_Method_and_clicks_continue_button() throws Throwable {
		pcp.selectShippingMethodOption();
		pcp.clickContinueButton();
		pcp.clickPaymentMethod();
		pcp.clickContinueButton();
	   
	}

	@When("^User clicks Continue button in Payment Information$")
	public void user_clicks_Continue_button_in_Payment_Information() throws Throwable {
	   pcp.enterPaymentInformation("Visa","Barbara Gordon","4485564059489345","04","2020","123");
	   pcp.clickContinueButton();
	}

	@Then("^User checks the user and address information in confirm order tab$")
	public void user_checks_the_user_and_address_information_in_confirm_order_tab() throws Throwable {
	    
	    
	}

	@When("^User clicks the confirm button$")
	public void user_clicks_the_confirm_button() throws Throwable {
	  pcp.clickConfirmButton();
	}

	@Then("^Completed Page will be redirected$")
	public void completed_Page_will_be_redirected() throws Throwable {
      String successMessage = ocp.getSuccessOrderMsg();
      System.out.println(successMessage);
	}

	@Then("^User clicks Continue button$")
	public void user_clicks_Continue_button() throws Throwable {
	  ocp = new OrderCompletedPage(driver);
	  ocp.clickContinueButton();
	}


}
