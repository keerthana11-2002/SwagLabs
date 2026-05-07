package pages;

import com.microsoft.playwright.Page;

public class InvalidLoginPage {
	private Page page;

	public InvalidLoginPage(Page page) {
		this.page = page;
	}

 
	String usernameInput = "#user-name";
	String passwordInput = "#password";
	String loginBtn = "#login-button";

	 

	public void login(String username, String password) {
		page.locator(usernameInput).fill(username);
		page.locator(passwordInput).fill(password);
		page.locator(loginBtn).click();

	}

	public String getErrorMessage() {
		return page.locator("h3[data-test='error']").textContent();
	}

}
