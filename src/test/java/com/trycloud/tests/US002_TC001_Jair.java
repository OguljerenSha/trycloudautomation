package com.trycloud.tests;

import com.trycloud.Pages.MenuBarPOM;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US002_TC001_Jair extends TestBase {

    MenuBarPOM driverMenuBar = new MenuBarPOM();





    //UserStory #002 Test Case #001 - verify users access to the main modules
    /*  1-Check is the modules is display
        2-Get text from module
        3-Click on Module
        4-Verify function of the button if took to the action page  */

    //Verify the user see the modules File:
    @Test(priority = 1)
    public void testMainModulesFile() {
        login();
        PageFactory.initElements(Driver.getDriver(), driverMenuBar);
        //1-Check is the modules is display
        Assert.assertTrue(driverMenuBar.buttonFile.isDisplayed());
        BrowserUtils.sleep(1);

        // 2-Get text from module Expect Result "File"
        BrowserUtils.hoover(driverMenuBar.buttonFile);
        Assert.assertEquals(driverMenuBar.buttonFile.getText(), "Files");

        // 3-Click on Module
        driverMenuBar.buttonFile.click();

        //4-Verify function of the button if took to the actual page file
        String expectedFilePageTitle = "Files";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedFilePageTitle));

    }

    //Verify the user see the modules Galleries:
    @Test(priority = 2)
    public void testMainModulesGalleries() {
        //1-Check is the modules is display
        Assert.assertTrue(driverMenuBar.buttonGallery.isDisplayed());
        BrowserUtils.sleep(1);

        // 2-Get text from module Expect Result "Galleries"
        BrowserUtils.hoover(driverMenuBar.buttonGallery);
        Assert.assertEquals(driverMenuBar.buttonGallery.getText(), "Galleries");

        // 3-Click on Module
        driverMenuBar.buttonGallery.click();

        //4-Verify function of the button if took to the actual page Galleries
        String expectedFilePageTitle = "Galleries";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedFilePageTitle));
    }

    //Verify the user see the modules Activity:
    @Test(priority = 3)
    public void testMainModulesActivity() {
        //1-Check is the modules is display
        Assert.assertTrue(driverMenuBar.buttonActivity.isDisplayed());
        BrowserUtils.sleep(1);

        // 2-Get text from module Expect Result "Activity"
        BrowserUtils.hoover(driverMenuBar.buttonActivity);
        Assert.assertEquals(driverMenuBar.buttonActivity.getText(), "Activity");

        // 3-Click on Module
        driverMenuBar.buttonActivity.click();

        //4-Verify function of the button if took to the actual page Galleries
        String expectedFilePageTitle = "Activity";
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedFilePageTitle));

    }

    //Verify the user see the modules Talk:
    @Test(priority = 4)
    public void testMainModulesTalk() {
        testMainModulesButton(driverMenuBar.buttonTalk, "Talk");
    }

    @Test(priority = 4)
    public void testMainModulesContacts() {
        testMainModulesButton(driverMenuBar.buttonContactMenu, "Contact");
    }

    //Verify the user see the modules Calendar:
    @Test(priority = 6)
    public void testMainModulesCalendar() {
        testMainModulesButton(driverMenuBar.buttonCalendar, "Calendar");
    }

    //Verify the user see the modules notes:
    @Test(priority = 7)
    public void testMainModulesNotes() {
        testMainModulesButton(driverMenuBar.buttonDeck, "Note");
    }

    //Verify the other function on main modules
    @Test(priority = 8)
    public void testMainModules() {



       /* driverMenuBar.buttonFile.click();
        //BrowserUtils.sleep(3);

        driverMenuBar.buttonActivity.click();
        BrowserUtils.sleep(3);

        driverMenuBar.buttonGallery.click();
        BrowserUtils.sleep(3);

        driverMenuBar.buttonTalk.click();
        BrowserUtils.sleep(3);

        driverMenuBar.buttonCalendar.click();
        BrowserUtils.sleep(3);

        driverMenuBar.buttonDeck.click();
        BrowserUtils.sleep(3);

        driverMenuBar.buttonAnnouncement.click();
        BrowserUtils.sleep(3);

        driverMenuBar.buttonNotification.click();
        BrowserUtils.sleep(3);

        driverMenuBar.buttonContactMenu.click();
        BrowserUtils.sleep(3);

        driverMenuBar.buttonSettings.click();
        BrowserUtils.sleep(3);

        driverMenuBar.buttonHomeNextCloudLogo.click();*/


    }


    //Method to check all the functions of buttons
    public void testMainModulesButton(WebElement button, String buttonName) {
        //1-Check is the modules is display
        Assert.assertTrue(button.isDisplayed());
        BrowserUtils.sleep(1);

        // 2-Get text from module Expect Result "Activity"
        BrowserUtils.hoover(button);
        Assert.assertEquals(button.getText(), buttonName);

        // 3-Click on Module
        button.click();

        //4-Verify function of the button if took to the actual page Galleries
        Assert.assertTrue(Driver.getDriver().getTitle().contains(buttonName));

    }//


}
