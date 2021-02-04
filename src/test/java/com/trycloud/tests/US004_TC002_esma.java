package com.trycloud.tests;

import com.trycloud.Pages.MenuBarPOM;
import com.trycloud.Pages.TalkPagePOM;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.List;

public class US004_TC002_esma extends TestBase {


    @Test(description = "Validation of sending message by searching user")
    public void t1() {
        TalkPagePOM talkPagePOM = new TalkPagePOM();
        talkPagePOM.sendingMessageThroughTalk("User50");
        Assert.assertEquals(talkPagePOM.messageClouds.get(talkPagePOM.messageClouds.size() - 2).getText(), talkPagePOM.message, "The message is not sent and displayed!!");

    }

    @AfterClass
    public void close() {
        Driver.closeDriver();
    }
}
