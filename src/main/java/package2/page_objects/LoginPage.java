package package2.page_objects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import package2.BasePage;

public class LoginPage extends BasePage {

    @FindBy(id = "inputEmail")
    private WebElement emailInput;

    @FindBy(id = "inputPassword")
    private WebElement passwordInput;

    @FindBy(css = ".login-body")
    private WebElement loginBody;

    @FindBy(css = ".iCheck-helper")
    private WebElement iCheckHelper;

    @FindBy(css = ".recaptcha-checkbox-border")
    private WebElement captchaCheckbox;

    @FindBy(id = "login")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}


