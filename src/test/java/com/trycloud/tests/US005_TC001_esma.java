package com.trycloud.tests;

import com.trycloud.Pages.ContactPagePOM;
import com.trycloud.Pages.LogInPagePOM;
import com.trycloud.Pages.MenuBarPOM;
import com.trycloud.Pages.TalkPagePOM;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US005_TC001_esma extends TestBase {

    @BeforeMethod
    public void setUpClass() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        LogInPagePOM log = new LogInPagePOM();
        PageFactory.initElements(Driver.getDriver(), log);
        log.login(ConfigurationReader.getProperty("username53"), ConfigurationReader.getProperty("password"));
        BrowserUtils.sleep(3);
    }

    @Test
    public void t1() {
        ContactPagePOM contactPagePOM=new ContactPagePOM();
        contactPagePOM.clickingToUsersInContact(0);
        contactPagePOM.clickingToUsersInContact(1);
        contactPagePOM.clickingToUsersInContact(23);
        contactPagePOM.clickingToUsersInContact(24);
        //change
    }

    @AfterMethod
    public void teardown() {
        Driver.closeDriver();
    }
}


