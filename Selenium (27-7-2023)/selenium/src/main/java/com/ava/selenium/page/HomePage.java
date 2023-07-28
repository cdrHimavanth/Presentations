package com.ava.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomePage {
    private final WebDriver driver;

    @FindBy(how = How.ID, using = "welcome-message")
    private WebElement welcomeMessage;

    @FindBy(how = How.ID, using = "logout-button")
    private WebElement logoutButton;

    @Autowired
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }

    public void logout() {
        clickLogoutButton();
    }
}
