package com.podium.pages;

import com.podium.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class PressPage extends Base {
    public PressPage(){
        PageFactory.initElements(driver,this);
    }

    public void goTo(){
        driver.findElement(By.linkText("Press")).click();
    }

    public boolean isAt(){
        return driver.getCurrentUrl().equalsIgnoreCase("https://www.podium.com/press/");
    }
}
