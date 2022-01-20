package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import pages.pageObjects.LandingPage;

public abstract class BaseTest {

    protected WebDriver driver;

    protected LandingPage landingPage;

    @BeforeSuite
    public static void setupWebDriverManager() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
     //   options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        landingPage = new LandingPage(driver);
        driver.get("https://www.expedia.com/");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}