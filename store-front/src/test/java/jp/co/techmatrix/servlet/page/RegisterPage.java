package jp.co.techmatrix.servlet.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

	WebDriver driver;
	
	@FindBy(id="success")
	WebElement messageElement;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getMessage() {
		return messageElement.getText();
	}
}
