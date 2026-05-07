package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void validLoginTest() {
		LoginPage loginPage = new LoginPage(page);
		loginPage.login("error_user", "secret_sauce");
		Assert.assertTrue(page.url().contains("inventory"), "Login Failed");

	}

}
