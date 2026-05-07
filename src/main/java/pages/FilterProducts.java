package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class FilterProducts {
	private Page page;

	public FilterProducts(Page page) {
		this.page = page;
	}

	String container = ".product_sort_container";

	public void filter() {
		page.locator(".product_sort_container").click();
		page.locator(".product_sort_container").selectOption("az");

	}

}
