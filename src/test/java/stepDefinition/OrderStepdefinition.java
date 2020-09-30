package stepDefinition;


import Pages.OrderPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.Map;

public class OrderStepdefinition extends OrderPageObject {

    @Given("^user navigates to the website \"(.*?)\"$")
    public void userNavigatesToTheWebsite(String url) {
        urlNavigation(url);
    }

    @Then("^I log into user \"(.*?)\" with password \"(.*?)\"$")
    public void logIntoUserWithPassword(String username, String password) {
        login(username, password);
    }

    @And("I select {string} from catagories")
    public void iSelectFromCatagories(String text) throws InterruptedException {
        chooseCategory(text);
    }

    @And("I select a book and click on \"Add to cart\"")
    public void iSelectABookByGivingFolloawingDetails() {
        choosebook();
    }

    @And("I Click on “shopping cart”")
    public void iClickOnShoppingCart() throws InterruptedException {
        gotoshoppingcart();
    }

    @Then("I Click on “Check-out”")
    public void iClickOnCheckOut() {
        checkout();
    }

    @And("I fill the following details")
    public void iFillTheFollowingDetails(Map<String, String> fields) throws InterruptedException {
        paymentDetails(fields);

    }

    @And("I Validate the message “You will pay by COD”")
    public void iValidateTheMessageYouWillPayByCOD() {
        validateModeOfPayment();
    }

    @And("I click on {string} order")
    public void iClickOnConfirmOrder(String txt) throws InterruptedException {
        clickOnConfirmbtn(txt);
    }

    @And("I click on {string} button")
    public void iClickOnButton(String txt) throws InterruptedException {
        clickOnVisibletext(txt);
    }

}
