package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class LoginSteps {

    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals( actualMessage, expectedMessage,"Login page not displayed");
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId(email);

    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should login successfully")
    public void iShouldLoginSuccessfully() {
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String errorMessage) {
        Assert.assertEquals("Error message not displayed", errorMessage, new LoginPage().getErrorMessage());
    }

    @Given("User navigates to the facebook website")
    public void userNavigatesToTheFacebookWebsite() {
    }

    @When("user validates the homepage title")
    public void userValidatesTheHomepageTitle() {
    }

    @Then("user enters {string} username")
    public void userEntersUsername(String arg0) {
    }

    @And("user enters {string} password")
    public void userEntersPassword(String arg0) {
    }

    @And("user validates captcha image")
    public void userValidatesCaptchaImage() {
    }
    @And("user enters firstname and lastname")
    public void user_enters_firstname_and_lastname(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists();
        System.out.println("First name is " +data.get(0).get(0)+ " Lastname is " + data.get(0).get(1));
        System.out.println("First name is " +data.get(1).get(0)+ " Lastname is " + data.get(1).get(1));
    }

    @And("user clocks on the sign in button")
    public void userClocksOnTheSignInButton() {
    }
}