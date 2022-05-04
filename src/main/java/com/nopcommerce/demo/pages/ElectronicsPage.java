package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By mousehoverelectronicTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By mouseHousecellPhone = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    By verifycellphone = By.xpath("//h1[contains(text(),'Cell phones')]");
    By clicklistView = By.xpath("//a[contains(text(),'List')]");
    By clicknokiaLumia = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    By verifynokiaLumia = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By verifyprice = By.xpath("//span[@id='price-value-20']");
    By changeQuntity2 = By.xpath("//input[@id='product_enteredQuantity_20']");
    By clickaddTocart = By.xpath("//button[@id='add-to-cart-button-20']");
    By verifyproduct = By.xpath("//p[@class='content']");
    By clickclose = By.xpath("//span[@title='Close']");
    By mousehovershoppingCart = By.xpath("//span[@class='cart-label']");
    By clickgoToCart = By.xpath("//button[normalize-space()='Go to cart']");
    By verifyShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");

    By verifyquntity2 = By.xpath("//input[@id='itemquantity11216']");

    By verifytotal = By.xpath("//span[@class='product-subtotal']");
    By clickterms = By.xpath("//input[@id='termsofservice']");
    By checkOut = By.xpath("//button[@id='checkout']");
    By verifywelCome = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By register = By.xpath("//button[contains(text(),'Register')]");
    By regi = By.xpath("//h1[contains(text(),'Register')]");
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By emailId = By.xpath("//input[@id='Email']");
    By passWord = By.xpath("//input[@id='Password']");
    By confirmPass = By.xpath("//input[@id='ConfirmPassword']");
    By regiButton = By.xpath("//button[@id='register-button']");
    By message = By.xpath("//div[contains(text(),'Your registration completed')]");
    By contiBut = By.xpath("//a[contains(text(),'Continue')]");
    By shocar  = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By agree = By.xpath("//input[@id='termsofservice']");
    By chOut = By.xpath("//button[@id='checkout']");
    By asGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By firName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lasName = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By email = By.xpath("//input[@id='BillingNewAddress_Email']");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By zipCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By celPhone = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By con = By.xpath("button[onclick='Billing.save()']");
    By radioDel = By.xpath("//input[@id='shippingoption_2']");
    By coBut = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By creditCard = By.xpath("//input[@id='paymentmethod_1']");
    By creditConti = By.xpath("button[class='button-1 payment-method-next-step-button']");
    By visa =By.xpath("//select[@id='CreditCardType']");
    By cardHolder = By.xpath("//input[@id='CardholderName']");
    By cardNo = By.xpath("//input[@id='CardNumber']");
    By month = By.xpath("//select[@id='ExpireMonth']");
    By year = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By conChe = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By payMent = By.xpath("//span[contains(text(),'Payment Method:')]");
    By shippMethod = By.xpath("//span[contains(text(),'Shipping Method:')]");
    By toalCost = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");
    By confirm = By.xpath("//button[normalize-space()='Confirm']");
    By thankYou = By.xpath("//h1[normalize-space()='Thank you']");
    By success = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By conSucc = By.xpath("//button[normalize-space()='Continue']");
    By welComeStore = By.xpath("//h2[normalize-space()='Welcome to our store']");
    By logOut =By.xpath("//a[normalize-space()='Log in']");

    public void mouseHoverElectronicTab() {
        mouseHoverToElement(mousehoverelectronicTab);
    }
    public void mouseHoverOnCellPhone() {
        clickOnElement(mouseHousecellPhone);
    }
    public String verifyTextCellPhone() {
        return getTextFromElement(verifycellphone);
    }
    public void clickonListView() {
        clickOnElement(clicklistView);
    }
    public void clickonNokiaLumia() {
        clickOnElement(clicknokiaLumia);
    }
    public String verifyTextNokiaLumia() {
        return getTextFromElement(verifynokiaLumia);
    }
    public String verifyPrice() {
        return getTextFromElement(verifyprice);
    }
    public void changeQuntity2onelectonicsPage(String no) {
        clearElement(changeQuntity2);
        sendTextToElement(changeQuntity2, no);
    }
    public void clickOnAddTocart() {
        clickOnElement(clickaddTocart);
    }
    public String verifyProduct() {
        return getTextFromElement(verifyproduct);
    }
    public void clickonClose() {
        clickOnElement(clickclose);
    }
    public void mousehoveronShoppingCart() {
        mouseHoverToElement(mousehovershoppingCart);
    }
    public void clickOnGoToCart() {
        clickOnElement(clickgoToCart);
    }
    public String verifyTextShoppingCart() {
        return getTextFromElement(verifyShoppingCart);
    }
    public String verifyQuntityTwo() {
        return getTextFromElement(verifyquntity2);
    }
    public String verifyTotal() {
        return getTextFromElement(verifytotal);
    }
    public void clickOnTerms() {
        clickOnElement(clickterms);
    }
    public void setCheckOut() {
        clickOnElement(checkOut);
    }
    public String setWelCome(){
        return getTextFromElement(verifywelCome);
    }
    public void setRegister(){
        clickOnElement(register);
    }
    public String verifyRegister(){
        return getTextFromElement(regi);
    }
    public void setFirstName(String name){
        sendTextToElement(firstName,name);
    }
    public void setLastName(String last){
        sendTextToElement(lastName,last);
    }
    public void setEmailId(String email){
        sendTextToElement(emailId,email);
    }
    public void setPassWord(String pass){
        sendTextToElement(passWord,pass);
    }
    public void setConfirmPass(String confirm){
        sendTextToElement(confirmPass,confirm);
    }
    public void setRegiButton(){
        clickOnElement(regiButton);
    }
    public String verifyRegistration(){
        return getTextFromElement(message);
    }
    public void cliContinue(){
        clickOnElement(contiBut);
    }
    public String verifyShop(){
        return getTextFromElement(shocar);
    }
    public void setAgree(){
        clickOnElement(agree);
    }
    public void setChekOt(){
        clickOnElement(chOut);
    }
    public void setAsGuest(){
        clickOnElement(asGuest);
    }
    public void setFirName(String name){
        sendTextToElement(firName,name);
    }
    public void setLasName(String las){
        sendTextToElement(lasName,las);
    }
    public void setEmailTab(String mail){
        sendTextToElement(email,mail);
    }
    public void setCountry(String cuntry){
        sendTextToElement(country,cuntry);
    }
    public void setCity(String cit){
        sendTextToElement(city,cit);
    }
    public void setAddress(String add){
        sendTextToElement(address,add);
    }
    public void setZip(String zip){
        sendTextToElement(zipCode,zip);
    }
    public void setCellPhone(String phone){
        sendTextToElement(celPhone,phone);
    }
    public void clicon(){
        clickOnElement(con);
    }
    public void clickRadio(){
        setRadioElement(radioDel);
    }
    public void setCoBut(){
        clickOnElement(coBut);
    }
    public void setCreditCard(){
        setRadioElement(creditCard);
    }
    public void contiAfter(){
        clickOnElement(creditConti);
    }
    public void setVisa(){
        selectByVisibleText(visa);
    }
    public void setCardHolder(String card){
        sendTextToElement(cardHolder,card);
    }
    public void setCarNo(String no){
        sendTextToElement(cardNo,no);
    }
    public void setMonth(String mon){
        selectByVisibleTextFromDropDown(month,mon);
    }
    public void setYear(String yer){
        selectByVisibleTextFromDropDown(year,yer);
    }
    public void setCardCode(String code){
        sendTextToElement(cardCode,code);
    }
    public void setConCheck(){
        clickOnElement(conChe);
    }
    public String verifyPayMent(){
        return getTextFromElement(payMent);
    }
    public String verifyShippping(){
        return getTextFromElement(shippMethod);
    }
    public String verifyTotalCost(){
        return getTextFromElement(toalCost);
    }
    public void setConfirm(){
        clickOnElement(confirm);
    }
    public String verifyThanks(){
        return getTextFromElement(thankYou);
    }
    public String verifySuccessfull(){
        return getTextFromElement(success);
    }
    public void cliconti(){
        clickOnElement(conSucc);
    }
    public String verifyStore(){
        return getTextFromElement(welComeStore);
    }
    public void clickLogOut(){
        clickOnElement(logOut);
    }
}
