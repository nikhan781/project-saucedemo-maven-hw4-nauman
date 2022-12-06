package com.sauce.testsuite;

import com.sauce.pages.InventoryPage;
import com.sauce.pages.LoginPage;
import com.sauce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryPageTest extends BaseTest {

    //Creating objects of 2 pages classes
    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        //Invoking method from Login Page class to enter username
        loginPage.enterUserName("standard_user");
        //Invoking method from Login Page class to enter password
        loginPage.enterPassword("secret_sauce");
        //Invoking method from Login Page class to click on login button
        loginPage.clickOnLogInButton();
        // Initializing int type variable
        int expectedSize = 6;
        //Invoking method from inventory page to verify number of products
        Assert.assertEquals(inventoryPage.getNumberOfProductOnThePage(), expectedSize, "Number of Product doesn't match requirement");
    }
}
