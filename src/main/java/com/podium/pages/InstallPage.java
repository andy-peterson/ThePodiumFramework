package com.podium.pages;

import com.podium.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class InstallPage extends Base {
    public InstallPage(){
        PageFactory.initElements(driver,this);
    }

    public void goTo(){
        driver.findElement(By.linkText("Get the App")).click();
    }

    public boolean isAt(){
        return driver.getCurrentUrl().equalsIgnoreCase("https://www.podium.com/install/");
    }
}
