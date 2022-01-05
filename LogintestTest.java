// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LogintestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void logintest() {
    driver.get("https://phptravels.org/login");
    driver.findElement(By.id("inputEmail")).sendKeys("xagenek725@upsdom.com");
    driver.findElement(By.id("inputPassword")).sendKeys("TAKgr4CTO4Q5");
    driver.findElement(By.id("inputEmail")).click();
    driver.findElement(By.id("inputPassword")).click();
    driver.findElement(By.id("inputPassword")).click();
    {
      WebElement element = driver.findElement(By.id("inputPassword"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.cssSelector(".login-body")).click();
    driver.findElement(By.cssSelector(".iCheck-helper")).click();
    driver.switchTo().frame(0);
    driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
    driver.switchTo().defaultContent();
    driver.findElement(By.id("login")).click();
  }
}
