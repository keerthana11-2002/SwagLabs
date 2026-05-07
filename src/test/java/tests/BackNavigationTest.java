package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AddToCartPage;
import pages.BackNavigation;
import pages.CheckOutPage;
import pages.LoginPage;

public class BackNavigationTest extends BaseTest {

	@Test
	public void BackNavigation() {
		LoginPage loginPage = new LoginPage(page);
		loginPage.login("standard_user", "secret_sauce");

		AddToCartPage cart = new AddToCartPage(page);
		cart.addCart();

		BackNavigation back = new BackNavigation(page);
		back.clickBackButton();
		Assert.assertTrue(page.url().contains("inventory"), "User is not navigated back to inventory page");

	}

}
