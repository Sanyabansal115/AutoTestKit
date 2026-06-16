package com.autotestkit.steps;

import com.autotestkit.tests.BaseTest;
import com.autotestkit.ui.DashboardPage;
import com.autotestkit.ui.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LoginSteps extends BaseTest {

    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage = new LoginPage(driver);
    }

    @When("I login with {string} and {string}")
    public void iLoginWith(String username, String password) {
        dashboardPage = loginPage.login(username, password);
    }

    @Then("I should be redirected to the dashboard")
    public void iShouldBeRedirectedToTheDashboard() {
        assertNotNull(dashboardPage);
    }
}
