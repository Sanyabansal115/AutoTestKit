package com.autotestkit.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    // Locators
    private final By usernameInput = By.id("username");
    private final By passwordInput = By.id("password");
    private final By loginButton   = By.cssSelector(".btn-login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Actions — fluent: returns next page after successful login
    public DashboardPage login(String username, String password) {
        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
        return new DashboardPage(driver);
    }
}
