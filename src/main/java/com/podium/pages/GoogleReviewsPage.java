package com.podium.pages;

import com.podium.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class GoogleReviewsPage extends Base {
    public GoogleReviewsPage(){
        PageFactory.initElements(driver,this);
    }

    public void goTo(){
        driver.findElement(By.linkText("Google Reviews")).click();
    }

    public boolean isAt(){
        return driver.getCurrentUrl().equalsIgnoreCase("https://www.podium.com/resources/google-reviews/");
    }
}
