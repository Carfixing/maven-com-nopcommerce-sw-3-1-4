package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    By verifyShoppingCartMsg = By.xpath("//div[@class='page-title']//h1");
    By changequantityField  = By.xpath("//input[starts-with(@id,'itemquantity')]");
    By updateShoppingCart = By.xpath("//button[@id='updatecart']");
    By verifyTotalPrice = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By clickCheckBox = By.xpath("//input[@id='termsofservice']");
    By clickcheckOut = By.xpath("//button[@id='checkout']");
    By verifywelCome = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By clickcheckOutGest = By.xpath("//button[contains(text(),'Checkout as Guest')]");


    public String verifyShoppingCartMessage(){
        return getTextFromElement(verifyShoppingCartMsg);
    }
    public void changequantityField2(){
        clickOnElement(changequantityField);
        clearElement(changequantityField);
        sendTextToElement(changequantityField,"2");
    }
    public void updateShoppingCartWith2(){
        clickOnElement(updateShoppingCart);
    }
    public String verifyTotalPrice(){
        return getTextFromElement(verifyTotalPrice);
    }
    public void clickOnCheckBox(){
        setCheckBoxElement(clickCheckBox);
    }
    public void clickOnCheckOut(){
        clickOnElement(clickcheckOut);
    }
    public String verifyWelcomeText(){
        return getTextFromElement(verifywelCome);
    }
    public void setCheckOutGest(){
        clickOnElement(clickcheckOutGest);
    }

}
