package jp.co.techmatrix.servlet.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver driver;
	
	@FindBy(id="login:j_idt44")
	WebElement userInput;
	@FindBy(id="login:j_idt47")
	WebElement passwordInput;
	@FindBy(id="login:j_idt50")
	WebElement signInButton;

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage signIn(String user, String password) {
		userInput.sendKeys(user);
		passwordInput.sendKeys(password);
		signInButton.click();
		return PageFactory.initElements(driver, LoginPage.class);
	}

}
