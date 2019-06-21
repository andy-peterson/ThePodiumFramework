package com.podium.pages;

import com.podium.base.Base;
import org.openqa.selenium.support.PageFactory;

public class ThanksPage extends Base {
    public ThanksPage(){
        PageFactory.initElements(driver, this);
    }

    public boolean isAt(){
        return driver.getCurrentUrl().equalsIgnoreCase("https://learn.podium.com/thanks-8473.html");
    }
}
