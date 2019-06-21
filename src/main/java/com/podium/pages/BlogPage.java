package com.podium.pages;

import com.podium.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class BlogPage extends Base {
    public BlogPage(){
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        driver.findElement(By.linkText("Blog")).click();
    }

    public boolean isAt(){
        return driver.getCurrentUrl().equalsIgnoreCase("https://blog.podium.com/");
    }

}
