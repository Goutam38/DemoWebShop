package com.cg.pom.beans.DemoWebProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OnePageCheckOutPage {
	
	WebDriver driver;
	//1. billing Address
	Select billingAddressOption;
	
	Select expirationDropDown;
	
	//3. 
	Select creditCard;
	Select countryDropDown;
	
	//2. Shipping Address
    Select shippingAddress;
    
	@FindBy(xpath="//select[@name='billing_address_id']")
	private WebElement billingAdress;
	
	@FindBy(xpath="//input[@class='button-1 new-address-next-step-button']")
	private WebElement continueButton;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueButton2;
	
	@FindBy(id="shippingoption_0")
	private WebElement shippingMethodOption;
	
	@FindBy(xpath="//label[@for='paymentmethod_2']")
	private WebElement paymentMethod;
	
	@FindBy(xpath="//select[@class='dropdownlists valid']")
	private WebElement creditCardType;
	
	@FindBy(id="CardholderName")
	private WebElement cardHolderName;
	
	@FindBy(id="CardNumber")
	private WebElement cardNumber;
	
	@FindBy(id="ExpireMonth")
	private WebElement expirationMonth;
	
	@FindBy(id="ExpireYear")
	private WebElement expirationYear;
	
	@FindBy(id="CardCode")
	private WebElement cardCode;
	
	@FindBy(id="BillingNewAddress_CountryId")
	private WebElement country;
	
	@FindBy(id="BillingNewAddress_City")
	private WebElement city;
	
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement address1;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	private WebElement zipcode;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	private WebElement phoneNumber;
	
	@FindBy(xpath="//input[@class='button-1 confirm-order-next-step-button']")
	private WebElement confirm;

	public String getCountry() {
		return this.country.getText();
	}

	public void setCountry(String country_Name) {
		countryDropDown = new Select(country);
		countryDropDown.selectByVisibleText(country_Name);
	}

	public String getCity() {
		return this.city.getText();
	}

	public void setCity(String city) {
		this.city.sendKeys(city);
	}

	public String getAddress1() {
		return this.address1.getText();
	}

	public void setAddress1(String address1) {
		this.address1.sendKeys(address1);
	}

	public String getZipcode() {
		return this.zipcode.getText();
	}

	public void setZipcode(String zipcode) {
		this.zipcode.sendKeys(zipcode);;
	}

	public String getPhoneNumber() {
		return this.phoneNumber.getText();
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber.sendKeys(phoneNumber);
	}

	
	public OnePageCheckOutPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void selectBillingAddress(String billingAddress)
	{
		billingAddressOption = new Select(billingAdress);
		billingAddressOption.selectByVisibleText(billingAddress);
	}
	public void selectShippingMethodOption()
	{
		this.shippingMethodOption.click();
	}
	
	public void clickContinueButton()
	{
		continueButton.click();
	}
	
	public void clickContinueButton2()
	{
		continueButton2.click();
	}
	
	public void clickPaymentMethod()
	{
		paymentMethod.click();
	}
	public void enterPaymentInformation(String creditCard_Type,String cardHolderName,String cardNumber,String expiration_Month,String expiration_Year,String cardCode)
	{
		setCreditCardType(creditCard_Type);
		setCardHolderName(cardHolderName);
		setCardNumber(cardNumber);
		setExpirationMonth(expiration_Month);
		setExpirationYear(expiration_Year);
		setCardCode(cardCode);
	}
	
	public String getCreditCardType() {
		return this.creditCardType.getText();
	}

	public void setCreditCardType(String creditCard_Type) {
		creditCard = new Select(creditCardType);
		creditCard.selectByVisibleText(creditCard_Type);
	}

	public String getCardHolderName() {
		return this.cardHolderName.getText();
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName.sendKeys(cardHolderName);;
	}

	public String getCardNumber() {
		return this.cardNumber.getText();
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber.sendKeys(cardNumber);;
	}

	public String getExpirationMonth() {
		return this.expirationMonth.getText();
	}

	public void setExpirationMonth(String expiration_Month) {
		expirationDropDown = new Select(expirationMonth);
		expirationDropDown.selectByVisibleText(expiration_Month);
	}
	public String getExpirationYear() {
		return this.expirationYear.getText();
	}

	public void setExpirationYear(String expiration_Year) {
		expirationDropDown = new Select(expirationYear);
		expirationDropDown.selectByVisibleText(expiration_Year);
	}

	public String getCardCode() {
		return this.cardCode.getText();
	}

	public void setCardCode(String cardCode) {
		this.cardCode.sendKeys(cardCode);;
	}

	public void clickConfirmButton()
	{
		confirm.click();
	}
	
}
