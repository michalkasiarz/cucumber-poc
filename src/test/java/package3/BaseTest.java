package package3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import package2.page_objects.StudentRegistrationFormPage;

public abstract class BaseTest {

    protected WebDriver driver;

    protected StudentRegistrationFormPage studentRegistrationFormPage;

    @BeforeAll
    public static void setupWebDriverManager() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
     //   options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        studentRegistrationFormPage = new StudentRegistrationFormPage(driver);
        driver.get("https://demoqa.com/automation-practice-form");


    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}