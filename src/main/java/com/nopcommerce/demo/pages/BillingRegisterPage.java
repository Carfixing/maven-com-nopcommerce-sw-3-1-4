package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BillingRegisterPage  extends Utility {
    By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailId = By.xpath("//input[@id='BillingNewAddress_Email']");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNo = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By clickContinue = By.xpath("//button[@onclick='Billing.save()']");
    By clickOnradio = By.xpath("//input[@id='shippingoption_1']");
    By clickOnCountinue = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By selectRadiocreditCard = By.xpath("//input[@id='paymentmethod_1']");
    By clickOnContinueButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By masterCard = By.xpath("//select[@id='CreditCardType']");
    By cardHolder = By.xpath("//input[@id='CardholderName']");
    By cardNo = By.xpath("//input[@id='CardNumber']");
    By month = By.xpath("//select[@id='ExpireMonth']");
    By year = By.xpath("//select[@id='ExpireYear']");
    By carCode = By.xpath("//input[@id='CardCode']");
    By clickOnButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    By paymentMethod = By.xpath("//span[contains(text(),'Payment Method:')]");
    By shippIng = By.xpath("//span[contains(text(),'Shipping Method:')]");
    By total = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By confirm = By.xpath("//button[normalize-space()='Confirm']");
    By thankYou = By.xpath("//h1[contains(text(),'Thank you')]");
    By successMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By conBut = By.xpath("//button[contains(text(),'Continue')]");
    By welCome = By.xpath("//h2[contains(text(),'Welcome to our store')]");



    public void enterFirstName(String name){
        sendTextToElement(firstName,name);
    }
    public void enterLastName(String last){
        sendTextToElement(lastName,last);
    }
    public void enterEmailId(String email){
        sendTextToElement(emailId,email);
    }
    public void enterCountry(String count){
        sendTextToElement(country,count);
    }
    public void enterCity(String cityname){
        sendTextToElement(city,cityname);
    }
    public void enterAddress(String add){
        sendTextToElement(address,add);
    }
    public void enterZipCode(String zip){
        sendTextToElement(zipCode,zip);
    }
    public void enterPhone(String phone){
        sendTextToElement(phoneNo,phone);
    }
    public void clickOnContinue(){
        clickOnElement(clickContinue);
    }
    public void setRadio(){
        setRadioElement(clickOnradio);
    }
    public void clickOnCountinueButton(){
        clickOnElement(clickOnCountinue);
    }
    public void selectRadioCreaditCard(){
        setRadioElement(selectRadiocreditCard);
    }
    public void clickCountinue(){
        clickOnElement(clickOnContinueButton);
    }
    public void MasterCard(String master){
        selectByVisibleTextFromDropDown(masterCard,master);
    }

    public void CardHolder(String card){
        sendTextToElement(cardHolder,card);
    }
    public void CardNo(String number ){
        sendTextToElement(cardNo,number);
    }
    public void Month(String mon){
        selectByVisibleTextFromDropDown(month,mon);
    }
    public void Year(String year1){
        selectByVisibleTextFromDropDown(year,year1);
    }
    public void CarCode(String code){
        sendTextToElement(carCode,code);
    }
    public void setCountiButton(){
        clickOnElement(clickOnButton);
    }
    public String paymentMethod(){
        return getTextFromElement(paymentMethod);
    }
    public String shippingMethod(){
        return getTextFromElement(shippIng);
    }
    public String verifyTotal(){
        return getTextFromElement(total);
    }
    public void clickCofirm(){
        clickOnElement(confirm);
    }
    public String verifyThankYou(){
        return getTextFromElement(thankYou);
    }
    public String verifySuccess(){
        return getTextFromElement(successMessage);
    }
    public void setCoonBut(){
        clickOnElement(conBut);
    }
    public String setWelcome(){
        return getTextFromElement(welCome);
    }



}
