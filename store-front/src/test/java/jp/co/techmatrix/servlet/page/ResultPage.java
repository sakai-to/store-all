package jp.co.techmatrix.servlet.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {

	WebDriver driver;
	
	@FindBy(how=How.CSS, using="td.ui-widget-header")
	WebElement titleElement;
	@FindBy(id="detail:j_idt56_input")
	WebElement quantityInput;
	@FindBy(id="detail:j_idt57")
	WebElement addToCartButton;

	public ResultPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		return titleElement.getText();
	}

	public void setQuantity(int q) {
		quantityInput.sendKeys(Integer.toString(q));
	}
	
	public DetailPage add() {
		addToCartButton.click();
		return PageFactory.initElements(driver, DetailPage.class);
	}
}
