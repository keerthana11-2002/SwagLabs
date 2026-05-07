package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.InvalidLoginPage;

public class InvalidLoginTest extends BaseTest {

	@Test
	public void InvalidLogin() {
		InvalidLoginPage Invalidlogin = new InvalidLoginPage(page);
		Invalidlogin.login("hello", "secret");
		String errorMsg = Invalidlogin.getErrorMessage();

		Assert.assertTrue(errorMsg.contains("Username and password do match"), "Error message not displayed");
	}

}
