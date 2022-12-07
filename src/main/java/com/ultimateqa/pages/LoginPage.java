package com.ultimateqa.pages;

import com.ultimateqa.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By signInButton = By.xpath("//a[contains(text(),'Sign In')]");
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome Back!')]");
    By emailField = By.id("user[email]");
    By passwordField = By.id("user[password]");
    By loginButton = By.xpath("//input[@class='button button-primary g-recaptcha']");
    By errorMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");



    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }
    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }

}
