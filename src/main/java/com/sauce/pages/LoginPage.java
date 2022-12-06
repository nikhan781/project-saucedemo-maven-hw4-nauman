package com.sauce.pages;

import com.sauce.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    //Declaring By type variables
    By usernameField = By.id("user-name");

    By passwordField = By.name("password");

    By loginButton = By.id("login-button");

    //This method will send text to user field
    public void enterUserName(String userName) {
        sendTextToElement(usernameField, userName);
    }

    //This method will send text to password field
    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    //This method will click on log in button
    public void clickOnLogInButton() {
        clickOnElement(loginButton);
    }

}
