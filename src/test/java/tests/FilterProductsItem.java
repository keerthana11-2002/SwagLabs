package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.FilterProducts;
import pages.LoginPage;

public class FilterProductsItem extends BaseTest {
	@Test
	public void filterItems() {
		LoginPage loginPage = new LoginPage(page);
		loginPage.login("error_user", "secret_sauce");
		
		FilterProducts items = new FilterProducts(page);
		items.filter();
		Assert.assertTrue(page.locator(".inventory_item_price").first().isVisible());
 		
	}
}
