package tests;

import base_page.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ErrorMessagesTests extends BaseTest {

    @Test
    public void NoDestinationInputErrorMessageTest() {
        landingPage.clickSearchButton();
        Assert.assertEquals(landingPage.getErrorMessage(), "To continue, please correct the error below.");
    }
}
