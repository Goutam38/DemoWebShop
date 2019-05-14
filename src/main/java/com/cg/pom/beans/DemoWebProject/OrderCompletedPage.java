package com.cg.pom.beans.DemoWebProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderCompletedPage {

	WebDriver driver;
	@FindBy(xpath="//div[@class='title']")
	private WebElement successOrderMsg;
	
	@FindBy(xpath="//input[@class='button-2 order-completed-continue-button']")
	private WebElement continueButton;
	
	public OrderCompletedPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public String getSuccessOrderMsg()
	{
		return successOrderMsg.getText();
	}
	public void clickContinueButton()
	{
		continueButton.click();
	}
}
