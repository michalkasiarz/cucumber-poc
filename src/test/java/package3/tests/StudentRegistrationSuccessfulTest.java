package package3.tests;

import org.junit.jupiter.api.Test;
import package3.BaseTest;

public class StudentRegistrationSuccessfulTest extends BaseTest {

    @Test
    public void loginTest() {
        studentRegistrationFormPage.logIntoTheApp("xagenek725@upsdom.com", "TAKgr4CTO4Q5");
    }
}
