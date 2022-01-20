package stepImplementations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDErrorMessageTest {


    @Given("^user is on the landing page$")
    public void user_is_on_the_landing_page() {
        System.out.println("User is on the landing page");
    }
    @And("^the destination is not provided$")
    public void the_destination_is_not_provided() {
        System.out.println("The destination is not provided");
    }

    @When("^search button is clicked$")
    public void search_button_is_clicked() {
        System.out.println("Search button is clicked");
    }

    @Then("^the error message is displayed$")
    public void the_error_message_is_displayed() {
        System.out.println("The error message is displayed");
    }


}
