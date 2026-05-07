package pages;

import com.microsoft.playwright.Page;

public class LoginPage {

	private Page page;

	public LoginPage(Page page) {
		this.page = page;
	}

	 
	String usernameInput = "#user-name";
	String passwordInput = "#password";
	String loginBtn = "#login-button";
	String errorMsg = "[data-test='error']";

	 

	public void login(String username, String password) {
		page.locator(usernameInput).fill(username);
		page.locator(passwordInput).fill(password);
		page.locator(loginBtn).click();

	}

	public String getErrorMessage() {
		return page.locator(errorMsg).textContent();
	}

}
