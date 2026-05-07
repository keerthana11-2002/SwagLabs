package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AddToCartPage;
import pages.LoginPage;
import pages.RemoveFromCart;

public class RemoveFromCartTest extends BaseTest {
	@Test
	public void removeItemFromCart() {
		LoginPage loginPage = new LoginPage(page);
		loginPage.login("error_user", "secret_sauce");

		AddToCartPage cart = new AddToCartPage(page);
		cart.addCart();

		RemoveFromCart removeitem = new RemoveFromCart(page);
		removeitem.removecart();

		Assert.assertTrue(removeitem.isCartEmpty(), "Product not removed");

	}

}
