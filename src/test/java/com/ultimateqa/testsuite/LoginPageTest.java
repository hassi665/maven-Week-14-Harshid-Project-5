package com.ultimateqa.testsuite;


import com.ultimateqa.pages.HomePage;
import com.ultimateqa.pages.LoginPage;
import com.ultimateqa.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        homePage.clickOnLoginLink();
        String expectedText = "Welcome Back!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(actualText, expectedText, "Login page not displayed");
    }


    @Test
    public void verifyThePasswordErrorMessage(){
        homePage.clickOnLoginLink();
        loginPage.enterEmail("Harshid123@gmail.com");
        loginPage.enterPassword("Prime@123");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Invalid email or password.";
        Assert.assertEquals(loginPage.getErrorMessage(),expectedMessage, "Error message not displayed");
    }


}
