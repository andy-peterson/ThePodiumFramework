package com.podium.pages;

import com.podium.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class WatchPage extends Base {
    public WatchPage(){
        PageFactory.initElements(driver, this);
    }

    public void goTo() {
        driver.findElement(By.cssSelector("#site-navigation > div.desktop-menu > div.right-menu > div.demo-header > div > a")).click();
    }

    public void goToViaFooter() {
        driver.findElement(By.linkText("Request Demo")).click();
    }

    public boolean isAt(){
        return driver.getCurrentUrl().equals("https://learn.podium.com/watch");
    }
}
