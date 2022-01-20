package pages.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class LandingPage extends BasePage {

    @FindBy(xpath = "//button[@data-testid='submit-button']")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[1]/div/h3")
    private WebElement errorMessageHeading;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void clickSearchButton() {
        submitButton.click();
    }

    public String getErrorMessage() {
        return errorMessageHeading.getText();
    }
}


