package pages;

import com.microsoft.playwright.Page;

public class RemoveFromCart {
	
protected Page page;
	
	public RemoveFromCart(Page p) {
		this.page = p;
	}
	
	String removeBtn = "#remove-sauce-labs-backpack";
	String cartBadge = ".shopping_cart_badge";
	
	public void removecart() {
		page.locator(removeBtn).click();
		
	}
	public boolean isCartEmpty() {
	    return page.locator(cartBadge).count() == 0;
	}

}
