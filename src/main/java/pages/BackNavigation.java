package pages;

import com.microsoft.playwright.Page;

public class BackNavigation  {
	private Page page;

    public BackNavigation(Page page) {
        this.page = page;
    }
	
	public void clickBackButton() {
	     page.goBack();
	}

}
