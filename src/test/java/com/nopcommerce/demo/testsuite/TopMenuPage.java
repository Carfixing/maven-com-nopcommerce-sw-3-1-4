package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;

public class TopMenuPage extends TestBase {
    public void selectMenu(String menu){
        clickOnElement(By.linkText(menu));
    }


}


