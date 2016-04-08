package jp.co.techmatrix.servlet.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DetailPage {

	WebDriver driver;
	
	@FindBy(how=How.CSS, using="td.ui-widget-header")
	WebElement titleElement;
	@FindBy(id="cart:j_idt65")
	WebElement shoppingButton;
	@FindBy(id="cart:j_idt66")
	WebElement purchaseButton;

	public DetailPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		return titleElement.getText();
	}

	public IndexPage shopping() {
		shoppingButton.click();
		return PageFactory.initElements(driver, IndexPage.class);
	}
	
	public CartPage goPurchase() {
		purchaseButton.click();
		return PageFactory.initElements(driver, CartPage.class);
	}
}
