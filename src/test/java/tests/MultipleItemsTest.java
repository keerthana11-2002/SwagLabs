package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.MultipleItems;

public class MultipleItemsTest extends BaseTest {

	@Test
	public void addMultipleItemsTest() {

		LoginPage login = new LoginPage(page);
		login.login("standard_user", "secret_sauce");

		MultipleItems inventory = new MultipleItems(page);

		String[] products = { "Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Bolt T-Shirt" };

		for (String product : products) {
			inventory.addProduct(product);
		}

		inventory.openCart();

		int cartItems = page.locator(".cart_item").count();

		Assert.assertEquals(cartItems, 3, "Products not added correctly");
	}
}
