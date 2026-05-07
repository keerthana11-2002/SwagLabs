package pages;

import com.microsoft.playwright.Page;

public class CheckOutPage {

	private Page page;

	public CheckOutPage(Page page) {
		this.page = page;
	}
 
	String addToCartBtn = "#add-to-cart-sauce-labs-backpack";
	String cartIcon = ".shopping_cart_link";
	String checkout = "#checkout";
	String firstname = "#first-name";
	String lastname = "#last-name";
	String pincode = "#postal-code";
	String continueBtn = "#continue";
	String finishBtn = "#finish";
	String headerString = ".complete-header";
 
	public void addToCart() {
		page.locator(addToCartBtn).click();
		page.locator(cartIcon).click();
	}

	public boolean isProductDisplayed() {
		return page.locator(".inventory_item_name").isVisible();
	}

	public void checkoutItem(String fname, String lname, String code) {
		page.locator(checkout).click();
		page.locator(firstname).fill(fname);
		page.locator(lastname).fill(lname);
		page.locator(pincode).fill(code);
		page.locator(continueBtn).click();
		page.locator(finishBtn).click();
	}

 
	public String getSuccessMessage() {
		return page.locator(headerString).textContent();
	}
}