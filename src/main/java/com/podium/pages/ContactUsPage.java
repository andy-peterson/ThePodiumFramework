package com.podium.pages;

import com.podium.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends Base {
    public ContactUsPage(){
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        driver.findElement(By.linkText("Contact")).click();
    }

    public boolean isAt(){
        return driver.getCurrentUrl().equalsIgnoreCase("https://www.podium.com/contact-us/");
    }
}
