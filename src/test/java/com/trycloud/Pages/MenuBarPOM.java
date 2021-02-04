package com.trycloud.Pages;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuBarPOM {



    @FindBy(xpath = "//ul[@id='appmenu']/li[1]")
    public WebElement buttonFile;
    @FindBy(xpath = "//ul[@id='appmenu']/li[2]")
    public WebElement buttonActivity;
    @FindBy(xpath = "//ul[@id='appmenu']/li[3]")
    public WebElement buttonGallery;
    @FindBy(xpath = "//ul[@id='appmenu']/li[4]")
    public WebElement buttonTalk;
    @FindBy(xpath = "//ul[@id='appmenu']/li[5]")
    public WebElement buttonCalendar;
    @FindBy(xpath = "//ul[@id='appmenu']/li[6]")
    public WebElement buttonDeck;
    @FindBy(xpath = "//ul[@id='appmenu']/li[7]")
    public WebElement buttonAnnouncement;
    @FindBy(xpath = "//div[@class='notifications-button menutoggle']")
    public WebElement buttonNotification;
    @FindBy(id = "contactsmenu")
    public WebElement buttonContactMenu;
    @FindBy(id = "settings")
    public WebElement buttonSettings;
    @FindBy(id = "nextcloud")
    public WebElement buttonHomeNextCloudLogo;

    public void buttonHomeNextCloudLogoClick() {
        buttonHomeNextCloudLogo.click();
    }

    public void buttonActivityClick() {
        buttonActivity.click();
    }

    public void buttonFileClick() {
        buttonFile.click();
    }

    public void buttonGalleryClick() {
        buttonGallery.click();
    }

    public void buttonTalkClick() {
        buttonTalk.click();
    }

    public void buttonCalendarClick() {
        buttonCalendar.click();
    }

    public void buttonDeckClick() {
        buttonDeck.click();
    }

    public void buttonAnnouncementClick() {
        buttonAnnouncement.click();
    }

    public void buttonNotificationClick() {
        buttonNotification.click();
    }

    public void buttonContactMenuClick() {
        buttonContactMenu.click();
    }

    public void buttonSettingsClick() {
        buttonSettings.click();
    }
}
