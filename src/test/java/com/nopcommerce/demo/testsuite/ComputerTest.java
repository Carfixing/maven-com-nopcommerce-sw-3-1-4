package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BillingRegisterPage;
import com.nopcommerce.demo.pages.CheckoutPage;
import com.nopcommerce.demo.pages.ProductPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ComputerTest extends TestBase {
    TopMenuPage topMenuPage = new TopMenuPage();
    ProductPage productPage = new ProductPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    BillingRegisterPage billingRegisterPage = new BillingRegisterPage();

    @Test
    public void verifyPageNavigation() {
        ArrayList<String> menuList = new ArrayList<>();
        menuList.add("Computers");
        menuList.add("Electronics");
        menuList.add("Apparel");
        menuList.add("Digital downloads");
        menuList.add("Books");
        menuList.add("Jewelry");
        menuList.add("Gift Cards");
        for (String menu : menuList) {
            topMenuPage.selectMenu(menu);
        }
    }

    @Test
    public void clickOnComputerMenu() {
        productPage.clickOnMenu("Computers");
        productPage.clickOnMenu("Desktops");
        productPage.sortOrder("Name: Z to A");
        productPage.orderBy();
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        // 2.1 Click on Computer Menu.
        productPage.clickOnMenu("Computers");
        //	2.2 Click on Desktop
        productPage.clickOnMenu("Desktops");
        //	2.3 Select Sort By position "Name: A to Z"
        productPage.sortOrder("Name: A to Z");
        //	2.4 Click on "Add To Cart"
        Thread.sleep(2000);
        productPage.addToCart();
        //click on Build your Own
        productPage.builYourOwnComp();
        //	2.5 Verify the Text "Build your own computer"
        String expectedPro = "Build your own computer";
        String actualPro = productPage.verfityPro();
        Assert.assertEquals(actualPro, expectedPro, "incorrect text");
        //	2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        productPage.selectProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        //	2.7.Select "8GB [+$60.00]" using Select class.
        productPage.selectRam("8GB [+$60.00]");
        //2.8 Select HDD radio "400 GB [+$100.00]"
        productPage.selectHDD();
        //	2.9 Select OS radio "Vista Premium [+$60.00]"
        productPage.vistaPremium();
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        productPage.checktotalcommander();
        // 2.11 Verify the price "$1,475.00"
        Thread.sleep(2000);
       // Assert.assertEquals(productPage.selectPrice(), "$1,475.00", "price not mathched");
        //	2.12 Click on "ADD TO CARD" Button.
        productPage.clickAddToCard();
        //	2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        productPage.verifyMsgProductAddedToYourCart();
        //  2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        productPage.mouseHoverOnShoppingCart();
        Thread.sleep(2000);
        productPage.clickGoTocartInProductPage();
        //2.15 Verify the message "Shopping cart"
        checkoutPage.verifyShoppingCartMessage();
        //	2.16 Change the Qty to "2" and Click on "Update shopping cart"
        checkoutPage.changequantityField2();
        checkoutPage.updateShoppingCartWith2();
        Thread.sleep(2000);
        //	2.17 Verify the Total"$2,950.00"
        Assert.assertEquals(checkoutPage.verifyTotalPrice(),"$2,950.00","Price not matched");
       //2.18 click on checkbox “I agree with the terms of service”
        checkoutPage.clickOnCheckBox();
        //2.19 Click on “CHECKOUT”
        checkoutPage.clickOnCheckOut();
        // 2.20 Verify the Text “Welcome, Please Sign In!”
        Assert.assertEquals(checkoutPage.verifyWelcomeText(),"Welcome, Please Sign In!","Incorrect Text");
        //2.21 Click on “CHECKOUT AS GUEST” Tab
        checkoutPage.setCheckOutGest();
        //  2.22 Fill the all mandatory field
        billingRegisterPage.enterFirstName("John");
        billingRegisterPage.enterLastName("Jain");
        billingRegisterPage.enterEmailId("Jain123@Yahoo.com");
        billingRegisterPage.enterCountry("United Kingdom");
        billingRegisterPage.enterCity("Wembly");
        billingRegisterPage.enterAddress("98,Alendeal Road");
        billingRegisterPage.enterZipCode("UB6 0RS");
        billingRegisterPage.enterPhone("07404567456");
        //	2.23 Click on “CONTINUE”
        billingRegisterPage.clickOnContinue();
        //	2.24 Click on Radio Button “Next Day Air($0.00)”
        billingRegisterPage.setRadio();
        // 2.25 Click on “CONTINUE”
         billingRegisterPage.clickOnCountinueButton();
        //2.26 Select Radio Button “Credit Card”
        billingRegisterPage.selectRadioCreaditCard();
        //click on "CONTINUE"
        billingRegisterPage.clickCountinue();
        //2.27 Select “Master card” From Select credit card dropdown
        billingRegisterPage.MasterCard("Master card");
        billingRegisterPage.CardHolder("Jackson");
        billingRegisterPage.CardNo("5396636848089175");
        billingRegisterPage.Month("12");
        billingRegisterPage.Year("2036");
        billingRegisterPage.CarCode("456");
        // 2.29 Click on “CONTINUE”
        billingRegisterPage.setCountiButton();
        //2.30 Verify “Payment Method” is “Credit Card”
        Assert.assertEquals(billingRegisterPage.paymentMethod(),"Payment Method” is “Credit Card","Incorrect text");
//2.32 Verify “Shipping Method” is “Next Day Air”
        Assert.assertEquals(billingRegisterPage.shippingMethod(),"Shipping Method” is “Next Day Air","incorrect text");
        //	2.33 Verify Total is “$2,950.00”
        Assert.assertEquals(billingRegisterPage.verifyTotal(),"$2,950.00","Wrong calculation");
        //	2.34 Click on “CONFIRM”
        billingRegisterPage.clickCofirm();
        //	2.35 Verify the Text “Thank You”
        Assert.assertEquals(billingRegisterPage.verifyThankYou(),"Thank You","Wrong message");
        //	2.36 Verify the message “Your order has been successfully processed!”
        Assert.assertEquals(billingRegisterPage.verifySuccess(),"Your order has been successfully processed!","Wrong Text");
        //	2.37 Click on “CONTINUE”
        billingRegisterPage.setCoonBut();
        //2.37 Verify the text “Welcome to our store”
        Assert.assertEquals(billingRegisterPage.setWelcome(),"Welcome to our store","Incorrect text");





    }
}
