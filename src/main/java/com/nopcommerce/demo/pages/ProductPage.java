package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {
    By sortBy = By.xpath("//select[@id='products-orderby']");
    By orderText = By.xpath("//select[@id='products-orderby']");
    By buildYourCom = By.xpath("//h2[@class='product-title']//a[normalize-space()='Build your own computer']");
    By addCart =By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]");
    By productName =By.xpath("//div[@class='product-name']//h1");
    By selectprocessEle = By.xpath("//select[@id='product_attribute_1']");
    By selectramEle = By.xpath("//select[@id='product_attribute_2']");
    By selectHDD = By.xpath("//input[@id='product_attribute_3_7']");
    By vistaPremium = By.xpath("//input[@id='product_attribute_4_9']");
    By checktotalCommander = By.xpath("//input[@id='product_attribute_5_12']");
    By verifyPrice = By.xpath("//span[@id='price-value-1']");
    By clickaddToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By verifyProductAddToYourCart = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By closeBar = By.xpath("//span[@class='close']");
    By mouseHoverShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickgoTocart =By.xpath("//span[contains(text(),'Shopping cart')]");


    public void clickOnMenu(String menu){
        clickOnElement(By.linkText(menu));
    }
    public void sortOrder(String order){
        selectByVisibleTextFromDropDown(sortBy,order);
    }
    public void orderBy(){
        System.out.println(getTextFromElement(orderText));
    }
    public void addToCart(){
        clickOnElement(addCart);
    }
    public String verfityPro(){
        return getTextFromElement(productName);
    }
    public void builYourOwnComp(){
        clickOnElement(buildYourCom);
    }
    public void selectProcessor(String processor){
        selectByVisibleTextFromDropDown(selectprocessEle,processor);
    }
    public void selectRam(String ram){
        selectByVisibleTextFromDropDown(selectramEle,ram);
    }
    public void selectHDD(){
        setRadioElement(selectHDD);
    }
    public void vistaPremium(){
        setRadioElement(vistaPremium);
    }
    public void checktotalcommander(){
        clickOnElement(checktotalCommander);
    }
    public String selectPrice(){
        return getTextFromElement(verifyPrice);
    }
    public void clickAddToCard(){
        clickOnElement(clickaddToCart);
    }
    public String verifyMsgProductAddedToYourCart(){
        return getTextFromElement(verifyProductAddToYourCart);
    }
    public void closeCrossButton(){
        clickOnElement(closeBar);
    }
    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(mouseHoverShoppingCart);
    }
    public void clickGoTocartInProductPage(){
        clickOnElement(clickgoTocart);
    }

}
