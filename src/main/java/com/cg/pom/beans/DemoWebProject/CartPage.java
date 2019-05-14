package com.cg.pom.beans.DemoWebProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage {

	WebDriver driver;
	Select countryDropDown;
	@FindBy(id="CountryId")
	private WebElement country;
	
	@FindBy(id="ZipPostalCode")
	private WebElement zipCode;
	
	@FindBy(xpath="//input[@id='termsofservice']")
	private WebElement termsAndConditions;
	
	@FindBy(xpath="//button[@class='button-1 checkout-button']")
	private WebElement checkOutButton;
	
	public CartPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}


	public String getCountry() {
		return this.country.getText();
	}

	public void setCountry(String countryName) {
		countryDropDown = new Select(country);
		countryDropDown.selectByVisibleText(countryName);
	}

	public String getZipCode() {
		return this.zipCode.getText();
	}

	public void setZipCode(String zipCode) {
		this.zipCode.clear();
		this.zipCode.sendKeys(zipCode);
	}


	public void clickTermsAndConditions() {
		termsAndConditions.click();
	}

    public void clickCheckOutButton() {
	   checkOutButton.click();
	}
	
}
