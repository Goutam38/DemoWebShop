package com.cg.pom.beans.stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.cg.pom.beans.DemoWebProject.LoginPage;

import cucumber.api.java.en.*;

public class StepDefinitionTest2 {

	WebDriver driver;
	LoginPage lp;
	@Then("^Page with user name is displayed$")
	public void page_with_user_name_is_displayed() throws Throwable {
		System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver.exe");
		   driver = new ChromeDriver();
		   driver.get("http://demowebshop.tricentis.com");
		   driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		    
	}

	@When("^User clicks Books Link$")
	public void user_clicks_Books_Link() throws Throwable {
	 lp= new LoginPage(driver);
	 lp.clickBooksLink();
	 lp.setEmail("goutam@gmail.com");
	 lp.setPassword("123456");
	 lp.clickRememberMeCheckBox();
	 lp.clickLoginButton();
	 
	}

	@Then("^Page related to Books items should be displayed$")
	public void page_related_to_Books_items_should_be_displayed() throws Throwable {
	  
	}

	@When("^User clicks Computers Link$")
	public void user_clicks_Computers_Link() throws Throwable {
	  lp.clickComputersLink(); 
	}

	@Then("^Page related to Computers items should be displayed$")
	public void page_related_to_Computers_items_should_be_displayed() throws Throwable {
	  
	}

	@When("^User clicks Electronics Link$")
	public void user_clicks_Electronics_Link() throws Throwable {
	    
	    lp.clickElectronicsLink();
	}

	@Then("^Page related to Electronics items should be displayed$")
	public void page_related_to_Electronics_items_should_be_displayed() throws Throwable {
	   
	}

	@When("^User clicks Apparel and Shoes Link$")
	public void user_clicks_Apparel_and_Shoes_Link() throws Throwable {
	    lp.clickApparelAndShoesLink();
	}

	@Then("^Page related to Apparel and Shoes items should be displayed$")
	public void page_related_to_Apparel_and_Shoes_items_should_be_displayed() throws Throwable {
	   
	}

	@When("^User clicks Digital Downloads Link$")
	public void user_clicks_Digital_Downloads_Link() throws Throwable {
	 lp.clickDigitalDownloadsLink();
	}

	@Then("^Page related to Digital Downloads should be displayed$")
	public void page_related_to_Digital_Downloads_should_be_displayed() throws Throwable {
	 
	}

	@When("^User clicks Jewellery Link$")
	public void user_clicks_Jewellery_Link() throws Throwable {
	 lp.clickJewelleryLink();
	}

	@Then("^Page related to Jewellery items should be displayed$")
	public void page_related_to_Jewellery_items_should_be_displayed() throws Throwable {
	
	}

	@When("^User clicks Gift Cards Link$")
	public void user_clicks_Gift_Cards_Link() throws Throwable {
      lp.clickGiftCardsLink();
	}

	@Then("^Page related to Gift Cards items should be displayed$")
	public void page_related_to_Gift_Cards_items_should_be_displayed() throws Throwable {
	    
	}


}
