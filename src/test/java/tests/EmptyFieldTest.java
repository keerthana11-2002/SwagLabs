package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.EmptyField;

public class EmptyFieldTest extends BaseTest {

	@Test
	public void emptyFieldData() {
		EmptyField empty = new EmptyField(page);
		empty.EmptyData();
		String actualMessage = empty.getErrorMessage();
		Assert.assertTrue(actualMessage.contains("Username is required"), "Error message not displayed");
	}

}
