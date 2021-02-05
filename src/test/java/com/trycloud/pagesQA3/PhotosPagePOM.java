package com.trycloud.pagesQA3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PhotosPagePOM {

    @FindBy(xpath = "//ul[@id='appmenu']/li[3]")
    public WebElement photosMainButton;
    @FindBy(xpath = "//a[@class='app-navigation-toggle']")
    public WebElement yourPhotosMain;
    @FindBy(xpath = "//div[@class='app-navigation-entry-icon icon-yourphotos']")
    public WebElement yourPhotosIcon;
    @FindBy(xpath = "//div[@class='app-navigation-entry-icon icon-video']")
    public WebElement yourVideosIcon;
    @FindBy(xpath = "//div[@class='app-navigation-entry-icon icon-favorite']")
    public WebElement favorites;
    @FindBy(xpath = "//div[@class='app-navigation-entry-icon icon-files-dark']")
    public WebElement yourFolders;
    @FindBy(xpath = "//div[@class='app-navigation-entry-icon icon-share']")
    public WebElement sharedWithYou;
    @FindBy(xpath = "//div[@class='app-navigation-entry-icon icon-tag']")
    public WebElement taggedPhotos;
    @FindBy(xpath = "//button[@class='settings-button']")
    public WebElement settingsButton;
    @FindBy(xpath = "//div[@class='section']/h2")
    public WebElement viewMessage;
    @FindBy(xpath = "//label[@for='enable-cropped-layout']//text()")
    public WebElement enableMessage;




}
