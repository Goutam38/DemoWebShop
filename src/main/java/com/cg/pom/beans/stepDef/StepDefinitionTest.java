package com.cg.pom.beans.stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.cg.pom.beans.DemoWebProject.LoginPage;

import cucumber.api.java.en.*;

public class StepDefinitionTest {

	WebDriver driver;
	LoginPage lp;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	   System.setProperty("webdriver.chrome.driver","F:\\ChromeDriver.exe");
	   driver = new ChromeDriver();
	   driver.get("http://demowebshop.tricentis.com");
	   driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
	    
	}

	@When("^User Clicks Login Link$")
	public void user_Clicks_Login_Link() throws Throwable {
	   lp = new LoginPage(driver);
	   lp.clickLoginLink();
	   
	}

	@Then("^Login Page should be displayed$")
	public void login_Page_should_be_displayed() throws Throwable {
	   
	}

	@When("^User Enters valid Email and Password and Clicks on Remember me check box$")
	public void user_Enters_valid_Email_and_Password_and_Clicks_on_Remember_me_check_box() throws Throwable {
	    lp.setEmail("goutam@gmail.com");
	    lp.setPassword("123456");
	    lp.clickRememberMeCheckBox();
	   
	}

	@When("^clicks Login button$")
	public void clicks_Login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   lp.clickLoginButton();
	}

	@Then("^Page with user name should be displayed$")
	public void page_with_user_name_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User Clicks Log out link$")
	public void user_Clicks_Log_out_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   lp.clickLogout();
	   driver.close();
	}

	@Then("^Page without user name should be displayed$")
	public void page_without_user_name_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
