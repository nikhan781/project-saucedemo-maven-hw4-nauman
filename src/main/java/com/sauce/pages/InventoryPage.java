package com.sauce.pages;

import com.sauce.utility.Utility;
import org.openqa.selenium.By;

public class InventoryPage extends Utility {

    //Declaring By type variables
    By productsText =By.xpath("//span[contains(text(),'Products')]");

    By numberOfProducts = By.xpath("//div[@class='inventory_item']");

    //This method will get Products text after successful login
    public String getProductsTextAfterLogin(){
        return getTextFromElement(productsText);
    }

    //This method will get the number of product on the page
    public int getNumberOfProductOnThePage(){
       return getSizeOfList(numberOfProducts);
    }
}
