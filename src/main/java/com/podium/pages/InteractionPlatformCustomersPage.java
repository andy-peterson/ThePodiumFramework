package com.podium.pages;

import com.podium.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class InteractionPlatformCustomersPage extends Base {
    public InteractionPlatformCustomersPage(){
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.linkText("Customers"));
        action.moveToElement(element).perform();
        driver.findElement(By.linkText("Centralize Interactions")).click();
    }

    public boolean isAt(){
        return driver.getCurrentUrl().equalsIgnoreCase("https://www.podium.com/interaction-platform-customers/");
    }
}
