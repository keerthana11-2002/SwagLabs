package pages;

import com.microsoft.playwright.Page;

public class AboutPage {
	
	private Page page;

	public AboutPage(Page page) {
		this.page = page;
	}
	
	String aboutString = "#about_sidebar_link";
	String btn = "#react-burger-menu-btn";
	 

	public void burgerBtn() {
		page.locator(btn).click();
	}
	
	public void aboutPage() {
		page.locator(aboutString).click();
		page.goBack();
	}

}
