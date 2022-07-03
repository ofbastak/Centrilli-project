package com.centrilli.step_definitions;

import com.centrilli.pages.LoginPage;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {
    LoginPage loginPage = new LoginPage();

    @When("User goes to centrilli login page")
    public void user_goes_to_centrilli_login_page() {
        Driver.callDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User enters username {string}")
    public void user_enters_username(String string) {
        loginPage.usernameInput.sendKeys(string);
    }

    @When("User enters password {string}")
    public void user_enters_password(String string) {
        loginPage.passwordInput.sendKeys(string);
    }

    @When("User clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.loginButton.click();
    }

    @Then("User should see the home page of app")
    public void user_should_see_the_home_page_of_app() {

        Assert.assertTrue(loginPage.salesUserPage.isDisplayed());
    }
}
