package jp.co.techmatrix.servlet;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import jp.co.techmatrix.servlet.page.CartPage;
import jp.co.techmatrix.servlet.page.DetailPage;
import jp.co.techmatrix.servlet.page.IndexPage;
import jp.co.techmatrix.servlet.page.LoginPage;
import jp.co.techmatrix.servlet.page.RegisterPage;
import jp.co.techmatrix.servlet.page.ResultPage;

public class AppTest {

	private WebDriver driver;
	private ScreenshotUtil ss;

	@Before
	public void setUp() throws Exception {
		ss = new ScreenshotUtil("AppTest");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		// サイトを開く
		driver.get("http://localhost:8080/store-front/");
		driver.manage().deleteAllCookies();
		IndexPage indexPage = PageFactory.initElements(driver, IndexPage.class);
		ss.take(driver);

		// キーワードを入力
		indexPage = indexPage.search("java");
		ss.take(driver);

		// 検索結果の件数を確認
		assertThat(indexPage.getSearchResults().size(), is(3));

		// 先頭の検索結果をカートに入れる
		ResultPage resultPage = indexPage.addToCart(0);
		ss.take(driver);

		// 10冊カートに入れる
		resultPage.setQuantity(10);
		DetailPage detailPage = resultPage.add();
		ss.take(driver);

		// 購入手続きを進める
		CartPage cartPage = detailPage.goPurchase();
		ss.take(driver);

		// サインイン
		LoginPage loginPage = cartPage.signIn("sakai", "toshiharu");
		ss.take(driver);

		// 商品を確認
		List<LoginPage.Item> items = loginPage.getItems(); 
		assertThat(items.size(), is(1));
		LoginPage.Item item = items.get(0);
		assertThat(item.imageSrc, startsWith("http://localhost:8080/store-front/faces/javax.faces.resource/1.jpg"));
		assertThat(item.title, is("Java EE 7徹底入門 標準Javaフレームワークによる高信頼性Webシステムの構築"));
		assertThat(item.quantity, is("10冊"));

		// 購入する
		RegisterPage registerPage = loginPage.purchase();
		ss.take(driver);

		// メッセージを確認
		assertThat(registerPage.getMessage(), is("ご利用ありがとうございました。"));
	}

}
