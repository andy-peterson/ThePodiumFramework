package com.podium.pages;

import com.podium.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class ReviewsPage extends Base {
    public ReviewsPage(){
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.linkText("Leads"));
        action.moveToElement(element).perform();
        driver.findElement(By.linkText("Get Found with Reviews")).click();
    }

    public void goToViaFooter(){
        driver.findElement(By.linkText("Reviews")).click();
    }

    public boolean isAt(){
        return driver.getCurrentUrl().equalsIgnoreCase("https://www.podium.com/reviews/");
    }
}
