package jp.co.techmatrix.servlet.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

	WebDriver driver;
	
	@FindBy(id="search:keyword")
	WebElement searchBox;
	@FindBy(id="search:j_idt14")
	WebElement searchButton;
	@FindBy(id="search:imageBtn")
	WebElement cartButton;
	@FindBy(id="search:j_idt37")
	WebElement signInButton;
	@FindBy(how=How.CLASS_NAME, using="ui-panel")
	List<WebElement> searchResults;

	public IndexPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public IndexPage search(String keyword) {
		searchBox.sendKeys(keyword);
		searchButton.click();
		return PageFactory.initElements(driver, IndexPage.class);
	}

	public List<WebElement> getSearchResults() {
		return searchResults;
	}
	
	public ResultPage addToCart(int index) {
		WebElement item = searchResults.get(index);
		item.findElement(By.tagName("button")).click();
		return PageFactory.initElements(driver, ResultPage.class);
	}
}
