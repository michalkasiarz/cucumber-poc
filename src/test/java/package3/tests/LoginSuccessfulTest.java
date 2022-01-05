package package3.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import package3.BaseTest;

public class LoginSuccessfulTest extends BaseTest {

    @Test
    public void loginTest() {
        driver.findElement(By.id("inputEmail")).sendKeys("xagenek725@upsdom.com");
        driver.findElement(By.id("inputPassword")).sendKeys("TAKgr4CTO4Q5");

    }
}
