package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.Logout;

@Test
public class LogoutTest extends BaseTest {

	public void LogoutPage() {
		LoginPage loginPage = new LoginPage(page);
		loginPage.login("error_user", "secret_sauce");

		Logout logPage = new Logout(page);
		logPage.burgerBtn();
		Assert.assertTrue(page.url().contains("saucedemo.com"), "User is not logout");

	}
}
