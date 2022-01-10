package package2.page_objects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import package2.BasePage;

public class StudentRegistrationFormPage extends BasePage {

    @FindBy(id = "firstName")
    private WebElement firstNameTextInput;

    @FindBy(id = "lastName")
    private WebElement lastNameInput;

    @FindBy(id = "userEmail")
    private WebElement userEmailInput;

    @FindBy(xpath = "//input[@value='Male']")
    private WebElement genderMaleRadioButton;

    @FindBy(xpath = "//input[@value='Female'")
    private WebElement genderFemaleRadioButton;

    @FindBy(id = "userNumber")
    private WebElement userNumberInput;

    @FindBy(id = "submit")
    private WebElement submitButton;

    public StudentRegistrationFormPage(WebDriver driver) {
        super(driver);
    }

    public void fillStudentRegistrationForm(String firstName, String lastName, String gender, String userEmail, String userNumber) {
        firstNameTextInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        switch (gender) {
            case "Male" -> genderMaleRadioButton.click();
            case "Female" -> genderFemaleRadioButton.click();
        }
        userEmailInput.sendKeys(userEmail);
        userNumberInput.sendKeys(userNumber);
        submitButton.click();
    }
}


