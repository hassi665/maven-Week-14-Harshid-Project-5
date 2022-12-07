package com.ultimateqa.pages;


import com.ultimateqa.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By signInLink = By.xpath("//a[contains(text(),'Sign In')]");

    public void clickOnLoginLink(){
        clickOnElement(signInLink);
    }

}
