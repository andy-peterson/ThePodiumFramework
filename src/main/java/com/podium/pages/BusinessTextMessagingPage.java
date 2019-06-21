package com.podium.pages;

import com.podium.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class BusinessTextMessagingPage extends Base {
    public BusinessTextMessagingPage(){
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        driver.findElement(By.linkText("Business Text Messaging")).click();
    }

    public boolean isAt(){
        return driver.getCurrentUrl().equalsIgnoreCase("https://www.podium.com/business-text-messaging/");
    }
}
