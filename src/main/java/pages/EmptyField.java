package pages;

import com.microsoft.playwright.Page;

public class EmptyField {

	private Page page;

	public EmptyField(Page page) {
		this.page = page;
	}

	String loginBtn = "#login-button";
	String errorMsg = "[data-test='error']";

	public void EmptyData() {
		page.locator(loginBtn).click();

	}

	public String getErrorMessage() {
		return page.locator(errorMsg).textContent();
	}

}
