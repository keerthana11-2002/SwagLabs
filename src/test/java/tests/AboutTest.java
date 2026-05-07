package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AboutPage;
import pages.LoginPage;
import pages.Logout;

public class AboutTest extends BaseTest {

	@Test
	public void aboutTest() {
		LoginPage loginPage = new LoginPage(page);
		loginPage.login("error_user", "secret_sauce");
		
		AboutPage about = new AboutPage(page);
		about.burgerBtn();
		about.aboutPage();
		Assert.assertTrue(page.url().contains("inventory"),"User is not navigated back to inventory page");
		 
		
	}}
