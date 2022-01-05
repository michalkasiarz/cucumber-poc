package package3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import package2.page_objects.LoginPage;

public abstract class BaseTest {

    protected WebDriver driver;

    protected LoginPage loginPage;

    @BeforeClass
    public static void setupWebDriverManager() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        driver.get("https://phptravels.org/login");


    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}