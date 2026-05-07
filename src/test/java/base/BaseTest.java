package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseTest {

	protected Playwright pw;
	protected Browser browser;
	protected Page page;

	@BeforeMethod

	public void setup() {
		pw = Playwright.create();
		browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
		  page = browser.newPage();
		page.navigate("https://www.saucedemo.com/");

	}

	@AfterMethod

	public void teardown() {
		page.close();
     browser.close();
		pw.close();

	}

}
