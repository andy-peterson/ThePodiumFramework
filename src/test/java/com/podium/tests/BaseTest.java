package com.podium.tests;

import com.podium.base.Base;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest extends Base {
    @BeforeSuite
    public void setUp(){
        initializeDriver();
    }

    @AfterSuite
    public void tearDown() {
        if (null != driver) {
            driver.close();
            driver.quit();
        }
    }
}
