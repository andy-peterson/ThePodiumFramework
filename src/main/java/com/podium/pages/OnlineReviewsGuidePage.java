package com.podium.pages;

import com.podium.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class OnlineReviewsGuidePage extends Base {
    public OnlineReviewsGuidePage(){
        PageFactory.initElements(driver,this);
    }

    public void goTo(){
        driver.findElement(By.linkText("Online Reviews")).click();
    }

    public boolean isAt(){
        return driver.getCurrentUrl().equalsIgnoreCase("https://www.podium.com/online-reviews/online-reviews-guide/");
    }
}
