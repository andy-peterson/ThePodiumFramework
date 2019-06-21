package com.podium.pages;

import com.podium.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class ResourcesPage extends Base {
    public ResourcesPage(){
        PageFactory.initElements(driver,this);
    }

    public void goTo(){
        driver.findElement(By.cssSelector("#colophon > section > div.section-container > div.desktop-footer-wrapper.footer-content > div.resources > h4 > a")).click();
    }

    public boolean isAt(){
        return driver.getCurrentUrl().equalsIgnoreCase("https://www.podium.com/resources/");
    }
}
