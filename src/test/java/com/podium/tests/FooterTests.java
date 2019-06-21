package com.podium.tests;

import com.podium.base.Pages;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FooterTests extends BaseTest {
    @BeforeMethod
    public void navigateToHomePage(){
        Pages.Home.goTo();
    }

    // region Products Navigation Tests
    @Test
    public void canNavigateToInteractionPlatformPage(){
        Pages.InteractionPlatform.goToViaFooter();
        Assert.assertTrue(Pages.InteractionPlatform.isAt());
    }

    @Test
    public void canNavigateToReviewsPage(){
        Pages.Reviews.goToViaFooter();
        Assert.assertTrue(Pages.Reviews.isAt());
    }

    @Test
    public void canNavigateToTeamchatPage(){
        Pages.Teamchat.goToViaFooter();
        Assert.assertTrue(Pages.Teamchat.isAt());
    }

    @Test
    public void canNavigateToWebchatPage(){
        Pages.Webchat.goToViaFooter();
        Assert.assertTrue(Pages.Webchat.isAt());
    }

    @Test
    public void canNavigateToFeedbackPage(){
        Pages.Feedback.goToViaFooter();
        Assert.assertTrue(Pages.Feedback.isAt());
    }

    @Test
    public void canNavigateToCustomPricingPage(){
        Pages.CustomPricing.goTo();
        Assert.assertTrue(Pages.CustomPricing.isAt());
    }
    // endregion

    // region Resources Navigation Tests
    @Test
    public void canNavigateToResourcesPage(){
        Pages.Resources.goTo();
        Assert.assertTrue(Pages.Resources.isAt());
    }

    @Test
    public void canNavigateToBlogPage(){
        Pages.Blog.goTo();
        Assert.assertTrue(Pages.Blog.isAt());
    }

    @Test
    public void canNavigateToGoogleReviewsPage(){
        Pages.GoogleReviews.goTo();
        Assert.assertTrue(Pages.GoogleReviews.isAt());
    }

    @Test
    public void canNavigateToOnlineReviewsGuidePage(){
        Pages.OnlineReviewsGuide.goTo();
        Assert.assertTrue(Pages.OnlineReviewsGuide.isAt());
    }

    @Test
    public void canNavigateToMessagingPlatformPage(){
        Pages.MessagingPlatform.goTo();
        Assert.assertTrue(Pages.MessagingPlatform.isAt());
    }

    @Test
    public void canNavigateToBusinessTextMessagingPage(){
        Pages.BusinessTextMessaging.goTo();
        Assert.assertTrue(Pages.BusinessTextMessaging.isAt());
    }

    @Test
    public void canNavigateToReviewManagementSoftwarePage(){
        Pages.ReviewManagementSoftware.goTo();
        Assert.assertTrue(Pages.ReviewManagementSoftware.isAt());
    }

    @Test
    public void canNavigateToInstallPage(){
        Pages.Install.goTo();
        Assert.assertTrue(Pages.Install.isAt());
    }
    // endregion

    // region Company Navigation Tests
    @Test
    public void canNavigateToAboutUsPage(){
        Pages.AboutUs.goTo();
        Assert.assertTrue(Pages.AboutUs.isAt());
    }

    @Test
    public void canNavigateToContactUsPage(){
        Pages.ContactUs.goTo();
        Assert.assertTrue(Pages.ContactUs.isAt());
    }

    @Test
    public void canNavigateToCareersPage(){
        Pages.Careers.goTo();
        Assert.assertTrue(Pages.Careers.isAt());
    }

    @Test
    public void canNavigateToPressPage(){
        Pages.Press.goTo();
        Assert.assertTrue(Pages.Press.isAt());
    }

    @Test
    public void canNavigateToPartnersPage(){
        Pages.Partners.goTo();
        Assert.assertTrue(Pages.Partners.isAt());
    }

    @Test
    public void canNavigateToWatchPage(){
        Pages.Watch.goToViaFooter();
        Assert.assertTrue(Pages.Watch.isAt());
    }
    // endregion

    // region Social Media Navigation Tests
    @Test
    public void canOpenFacebookPage(){
        driver.findElement(By.cssSelector("a[href='https://www.facebook.com/PodiumHQ/']")).click();
        driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/PodiumHQ/");
    }

    @Test
    public void canOpenTwitterPage(){
        driver.findElement(By.cssSelector("a[href='https://twitter.com/podiumhq']")).click();
        driver.getCurrentUrl().equalsIgnoreCase("https://twitter.com/podiumhq");
    }

    @Test
    public void canOpenLinkedInPage(){
        driver.findElement(By.cssSelector("a[href='https://www.linkedin.com/company/podiumhq/']")).click();
        driver.getCurrentUrl().equalsIgnoreCase("https://www.linkedin.com/company/podiumhq/");
    }

    @Test
    public void canOpenGlassdoorPage(){
        driver.findElement(By.cssSelector("a[href='https://www.glassdoor.com/Overview/Working-at-Podium-EI_IE1010497.11,17.htm']")).click();
        driver.getCurrentUrl().equalsIgnoreCase("https://www.glassdoor.com/Overview/Working-at-Podium-EI_IE1010497.11,17.htm");
    }
    // endregion
}
