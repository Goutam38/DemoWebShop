package com.cg.pom.beans.DemoWebProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
   WebDriver driver;
	
	@FindBy(linkText="Log in")
	private WebElement LoginLink;
	
	@FindBy(xpath="//input[@class='email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@class='password']")
	private WebElement password;
	
	@FindBy(id="RememberMe")
	private WebElement rememberCheckBox;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	private WebElement LoginButton;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")
	private WebElement Books;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")
	private WebElement Computers;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a")
	private WebElement Electronics;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a")
	private WebElement ApparelAndShoes;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[5]/a")
	private WebElement digitalDownloads;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a")
	private WebElement jewellery;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[7]/a")
	private WebElement giftCards;
	
	@FindBy(xpath="//a[@class='ico-logout']")
	private WebElement LogOut;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}

	public void clickLoginLink() {
		LoginLink.click();
	}

	public WebElement getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email.sendKeys(email);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);;
	}
	public void clickRememberMeCheckBox()
	{
		rememberCheckBox.click();
	}

   public void clickLoginButton() {
		this.LoginButton.click();
	}
   
    public void clickBooksLink()
    {
    	Books.click();
    }
    
    public void clickComputersLink()
    {
    	Computers.click();
    }
    
    public void clickElectronicsLink()
    {
    	Electronics.click();
    }
    public void clickApparelAndShoesLink()
    {
    	ApparelAndShoes.click();
    }
    public void clickDigitalDownloadsLink()
    {
    	digitalDownloads.click();
    }
    public void clickJewelleryLink()
    {
    	jewellery.click();
    }
    public void clickGiftCardsLink()
    {
    	giftCards.click();
    } 
    public void clickLogout()
    {
	   this.LogOut.click();
    }

	
}
