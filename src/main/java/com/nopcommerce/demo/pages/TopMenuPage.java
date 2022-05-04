package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {
    public void selectMenu(String menu){
        clickOnElement(By.linkText(menu));
    }
}
