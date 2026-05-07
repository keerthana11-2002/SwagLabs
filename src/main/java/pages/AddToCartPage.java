package pages;

import com.microsoft.playwright.Page;

public class AddToCartPage {
    private Page page;

    public AddToCartPage(Page page) {
        this.page = page;
    }

    // locators
    String addToCartBtn = "#add-to-cart-sauce-labs-backpack";
    String cartIcon = ".shopping_cart_link";
    String productName = ".inventory_item_name";

    // methods
    public void addCart() {
        page.locator(addToCartBtn).click();
        page.locator(cartIcon).click();
    }

    public boolean isProductDisplayed() {
        return page.locator(productName).isVisible();
    }
}