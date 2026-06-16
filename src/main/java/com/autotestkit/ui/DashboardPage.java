package com.autotestkit.ui;

import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
