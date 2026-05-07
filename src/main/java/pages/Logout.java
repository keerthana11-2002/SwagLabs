package pages;

import com.microsoft.playwright.Page;

public class Logout {
	private Page page;

	public Logout(Page page) {
		this.page = page;
	}

	String btn = "#react-burger-menu-btn";
	String logoutbtn = "#logout_sidebar_link";

	public void burgerBtn() {
		page.locator(btn).click();
		page.locator(logoutbtn).click();
	}

}
