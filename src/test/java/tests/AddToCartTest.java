package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AddToCartPage;
import pages.LoginPage;

public class AddToCartTest extends BaseTest {

	@Test
	public void AddToCart() throws InterruptedException {

		LoginPage loginPage = new LoginPage(page);
		loginPage.login("standard_user", "secret_sauce");
		 
		AddToCartPage cart = new AddToCartPage(page);
		cart.addCart(); 
		 
		Assert.assertTrue(cart.isProductDisplayed(), "Product not added to cart");
	}

}
