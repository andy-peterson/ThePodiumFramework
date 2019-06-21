package com.podium.pages;

import com.podium.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class AccountsPage extends Base {
    public AccountsPage(){
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        driver.findElement(By.linkText("Login")).click();
    }

    public boolean isAt(){
        return driver.getCurrentUrl().equalsIgnoreCase("https://accounts.podium.com/");
    }
}
