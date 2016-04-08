package jp.co.techmatrix.servlet.page;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(how = How.CSS, using = "#register\\:cartTable_data > tr")
	List<WebElement> items;
	@FindBy(id = "register:j_idt54")
	WebElement purchaseButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public List<Item> getItems() {
		return items.stream()
				.map(item -> {
					String image = item.findElement(By.xpath("./td[1]/img")).getAttribute("src");
					String title = item.findElement(By.xpath("./td[2]")).getText();
					String quantity = item.findElement(By.xpath("./td[3]")).getText();
					return new Item(image, title, quantity);
				})
				.collect(Collectors.toList());
	}

	public RegisterPage purchase() {
		purchaseButton.click();
		return PageFactory.initElements(driver, RegisterPage.class);
	}

	// 購入する商品の一覧
	public class Item {
		public String imageSrc;
		public String title;
		public String quantity;

		public Item(String imageSrc, String title, String quantity) {
			this.imageSrc = imageSrc;
			this.title = title;
			this.quantity = quantity;
		}
	}
}
