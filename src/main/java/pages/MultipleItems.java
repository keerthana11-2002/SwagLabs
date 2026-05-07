package pages;

import com.microsoft.playwright.Page;

public class MultipleItems {

	private Page page;

	public MultipleItems(Page page) {
		this.page = page;
	}

	String cartIcon = ".shopping_cart_link";

	public void addProduct(String productName) {

		String addBtn = "//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button";

		page.locator(addBtn).click();
	}

	public void openCart() {
		page.locator(cartIcon).click();
	}
}
