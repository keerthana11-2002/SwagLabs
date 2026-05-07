package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AddToCartPage;
import pages.CheckOutPage;
import pages.LoginPage;

public class CheckOutTest extends BaseTest {
	@Test
	public void AddToCart() throws InterruptedException {

		LoginPage loginPage = new LoginPage(page);
		loginPage.login("standard_user", "secret_sauce");

		CheckOutPage checkout = new CheckOutPage(page);
		checkout.addToCart();

		checkout.checkoutItem("kabil", "J", "123456");
		String message = checkout.getSuccessMessage();
		Assert.assertTrue(message.contains("Thank you for your order!"), "Checkout failed");

	}
}
