package com.podium.tests;

import com.podium.base.Pages;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class HeaderTests extends BaseTest {
    @BeforeMethod
    public void navigateToHomePage(){
        Pages.Home.goTo();
    }

    @Test
    public void canNavigateToHomeViaBranding(){
        Pages.Leads.goTo();
        driver.findElement(By.className("site-branding")).click();
        Assert.assertTrue(Pages.Home.isAt());
    }

    // region Leads Navigation Tests
    @Test
    public void canNavigateToLeadsPageDirect(){
        driver.findElement(By.linkText("Leads")).click();
        Assert.assertTrue(Pages.Leads.isAt());
    }

    @Test
    public void canNavigateToLeadsPage() {
        Pages.Leads.goTo();
        Assert.assertTrue(Pages.Leads.isAt());
    }

    @Test
    public void canNavigateToInteractionPlatformPage(){
        Pages.InteractionPlatform.goTo();
        Assert.assertTrue(Pages.InteractionPlatform.isAt());
    }

    @Test
    public void canNavigateToReviewsPage() {
        Pages.Reviews.goTo();
        Assert.assertTrue(Pages.Reviews.isAt());
    }

    @Test
    public void canNavigateToWebchatPage(){
        Pages.Webchat.goTo();
        Assert.assertTrue(Pages.Webchat.isAt());
    }

    @Test
    public void canNavigateToTeamchatLeadsPage(){
        Pages.TeamchatLeads.goTo();
        Assert.assertTrue(Pages.TeamchatLeads.isAt());
    }
    // endregion

    // region Customers Navigation Tests
    @Test
    public void canNavigateToCustomersPageDirect(){
        driver.findElement(By.linkText("Customers")).click();
        Assert.assertTrue(Pages.Customers.isAt());
    }

    @Test
    public void canNavigateToCustomersPage(){
        Pages.Customers.goTo();
        Assert.assertTrue(Pages.Customers.isAt());
    }

    @Test
    public void canNavigateToInteractionPlatformCustomersPage(){
        Pages.InteractionPlatformCustomers.goTo();
        Assert.assertTrue(Pages.InteractionPlatformCustomers.isAt());
    }

    @Test
    public void canNavigateToFeedbackPage(){
        Pages.Feedback.goTo();
        Assert.assertTrue(Pages.Feedback.isAt());
    }

    @Test
    public void canNavigateToCollectReviewsPage(){
        Pages.CollectReviews.goTo();
        Assert.assertTrue(Pages.CollectReviews.isAt());
    }

    @Test
    public void canNavigateToTeamchatCustomersPage(){
        Pages.TeamchatCustomers.goTo();
        Assert.assertTrue(Pages.TeamchatCustomers.isAt());
    }
    // endregion

    // region Teams Navigation Tests
    @Test
    public void canNavigateToTeamsPageDirect(){
        driver.findElement(By.linkText("Teams")).click();
        Assert.assertTrue(Pages.Teams.isAt());
    }

    @Test
    public void canNavigateToTeamsPage(){
        Pages.Teams.goTo();
        Assert.assertTrue(Pages.Teams.isAt());
    }

    @Test
    public void canNavigateToInteractionPlatformTeamsPage(){
        Pages.InteractionPlatformTeams.goTo();
        Assert.assertTrue(Pages.InteractionPlatformTeams.isAt());
    }

    @Test
    public void canNavigateToTeamchatPage(){
        Pages.Teamchat.goTo();
        Assert.assertTrue(Pages.Teamchat.isAt());
    }
    // endregion

    // region Resources Navigation Tests
    @Test
    public void canNavigateToCustomerStoriesPage(){
        Pages.CustomerStories.goTo();
        Assert.assertTrue(Pages.CustomerStories.isAt());
    }

    @Test
    public void canNavigateToEbooksPage(){
        Pages.Ebooks.goTo();
        Assert.assertTrue(Pages.Ebooks.isAt());
    }
    // endregion

    @Test
    public void canNavigateToAccountsPage(){
        Pages.Accounts.goTo();
        Assert.assertTrue(Pages.Accounts.isAt());
    }

    @Test
    public void canClickWatchDemoButton(){
        Pages.Watch.goTo();
        Assert.assertTrue(Pages.Watch.isAt());
    }
}
