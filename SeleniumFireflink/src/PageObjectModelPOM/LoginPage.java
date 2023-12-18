package PageObjectModelPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);   //initializing
	}
	@FindBy(id="Email")
	private WebElement emailTextField;
    
	@FindBy(id="Password")
	private WebElement passwordTextfield;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement LoginButton;

	public WebElement getEmailTextField() {       //provide getters 
		return emailTextField;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
}
