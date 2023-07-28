package com.ava.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
public class LoginPage {
    private final WebDriver driver;

    @FindBy(how = How.NAME, using = "username")
    private WebElement usernameInput;

    @FindBy(how = How.NAME, using = "password")
    private WebElement passwordInput;

    @FindBy(how = How.NAME, using = "login-button")
    private WebElement loginButton;

    @Autowired
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.elementToBeClickable(usernameInput)).click();
    }

    public void login(String username, String password) {
        this.usernameInput.click();
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }
}
