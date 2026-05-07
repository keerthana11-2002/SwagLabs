package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LockedUserTest extends BaseTest {

	@Test
	public void lockedUserLoginTest() {

		LoginPage loginPage = new LoginPage(page);

		loginPage.login("locked_out_user", "secret_sauce");

		String actualMessage = loginPage.getErrorMessage();

		Assert.assertTrue(actualMessage.contains("Sorry, this user has been locked out"),
				"Locked user error message not displayed");
	}
}
