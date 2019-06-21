package com.podium.tests;

import com.podium.base.Pages;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests extends BaseTest {
    @BeforeMethod
    public void navigateToHomePage(){
        Pages.Home.goTo();
    }

    @Test
    public void canClickWatchDemo(){
        Pages.Home.clickWatchDemo();
        Assert.assertTrue(Pages.Watch.isAt());
    }

    @Test
    public void canSubmitWatchForm(){
        Pages.Home.submitWatchDemoForm("Andy","Peterson","andytuss@msn.com","Podium","801-698-5896");
        Assert.assertTrue(Pages.Thanks.isAt());
    }

    @Test
    public void canClickLeadsLearnMoreButton(){
        Pages.Home.clickLeadsLearnMoreButton();
        Assert.assertTrue(Pages.Leads.isAt());
    }


    @Test
    public void canClickCustomersLearnMoreButton(){
        Pages.Home.clickCustomersLearnMoreButton();
        Assert.assertTrue(Pages.Customers.isAt());
    }

    @Test
    public void canClickTeamsLearnMoreButton(){
        Pages.Home.clickTeamsLearnMoreButton();
        Assert.assertTrue(Pages.Teams.isAt());
    }
}
