package com.cg.pom.beans.DemoWebProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelAndShoesPage {
	
	WebDriver driver;

	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a")
	private WebElement ApparelAndShoesLink;
	
	@FindBy(linkText="Blue Jeans")
	private WebElement BlueJeansLink;
	
	@FindBy(xpath="//input[@value='Add to cart']")
	private WebElement AddToCartButton;
	
	@FindBy(xpath="//div[@class='bar-notification success']")
	private WebElement successMessage;
	
	@FindBy(linkText="Shopping cart")
	private WebElement shoppingCart;
	
	public ApparelAndShoesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickApparelAndShoesLink()
	{
		this.ApparelAndShoesLink.click();
	}
	
	public void clickBlueJeansLink()
	{
	   this.BlueJeansLink.click();  	
	}
	
	public void clickAddToCartButton()
	{
		AddToCartButton.click();
	}

	public String getSuccessMessage() {
		return this.successMessage.getText();
	}

	public void setSuccessMessage(String successMessage) {
		System.out.println(successMessage);
	}
	
	public void clickShoppingCart()
	{
		this.shoppingCart.click();
	}
	
	
	
}
