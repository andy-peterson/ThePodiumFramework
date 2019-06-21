package com.podium.pages;

import com.podium.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends Base {
    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="#slider > div > div.slider-content > div > div > div.primary-button.play-icon.desk-btn > a")
    WebElement WatchDemoBtn;

    @FindBy(css="#li div.btn-learn-more > a")
    WebElement LeadsLearnMore;

    @FindBy(css="#ci  div.btn-learn-more > a")
    WebElement CustomersLearnMore;

    @FindBy(css="#ti  div.btn-learn-more > a")
    WebElement TeamsLearnMore;

    @FindBy(id = "FirstName")
    WebElement FirstNameInput;

    @FindBy(id = "LastName")
    WebElement LastNameInput;

    @FindBy(id = "Email")
    WebElement EmailInput;

    @FindBy(id = "Company")
    WebElement CompanyInput;

    @FindBy(id = "MobilePhone")
    WebElement MobileInput;

    @FindBy(css="#mktoForm_2078 > div.mktoButtonRow > span > button")
    WebElement FormWatchDemoBtn;

    public void goTo() {
        driver.get("https://www.podium.com/");
    }

    public boolean isAt(){
        return driver.getCurrentUrl().equals("https://www.podium.com/");
    }

    public void clickWatchDemo(){
        WatchDemoBtn.click();
    }

    public void clickLeadsLearnMoreButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(LeadsLearnMore);
        actions.perform();
        LeadsLearnMore.click();
    }

    public void clickCustomersLearnMoreButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(CustomersLearnMore);
        actions.perform();
        CustomersLearnMore.click();
    }

    public void clickTeamsLearnMoreButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(TeamsLearnMore);
        actions.perform();
        TeamsLearnMore.click();
    }

    public void submitWatchDemoForm(String first, String last, String email, String company, String mobile){
        FirstNameInput.sendKeys(first);
        LastNameInput.sendKeys(last);
        EmailInput.sendKeys(email);
        CompanyInput.sendKeys(company);
        MobileInput.sendKeys(mobile);
        FormWatchDemoBtn.click();
        wait.until(ExpectedConditions.urlContains("https://learn.podium.com/thanks-8473.html"));
    }
}
