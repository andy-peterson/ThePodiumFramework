package com.podium.pages;

import com.podium.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class MessagingPlatformPage extends Base {
    public MessagingPlatformPage(){
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        driver.findElement(By.linkText("Messaging Platform")).click();
    }

    public boolean isAt(){
        return driver.getCurrentUrl().equalsIgnoreCase("https://www.podium.com/messaging-platform/");
    }
}
