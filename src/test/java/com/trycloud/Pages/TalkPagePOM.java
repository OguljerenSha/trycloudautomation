package com.trycloud.Pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TalkPagePOM extends MenuBarPOM {
    public String message = "Warning !! there is a bug";

    @FindBy(xpath = "(//div[@class='select2-search'])[2]/input")
    public WebElement SearchBox;

    @FindBy(xpath = "//div[@id='s2id_select-participants']/a")
    public WebElement NewConversationText;//in order to send keys to InputSearchBoxInTalk first you need to click to this element

    @FindBy(xpath = "//div[contains(@id,'select2-result-label-')]")//list for all users in the talk search box
    public List<WebElement> usersInSearchBox;

    @FindBy(xpath = "//div[contains(@data-placeholder,'New message')]")
//when you click to a user the message box appears
    public WebElement newMessageBox;

    @FindBy(xpath = "//div[@class='message']")
    public List<WebElement> messageClouds;

    @FindBy(xpath = "//ul[@id='spreedme-room-list']/li")
    public List<WebElement> allUsersInTalkPage; // all users that appear on the left side when you open talk


    public void sendingMessageThroughTalk(String user) {
        PageFactory.initElements(Driver.getDriver(), MenuBarPOM.class);//initialized it
        buttonTalk.click();//click to talk
        BrowserUtils.sleep(3);
        PageFactory.initElements(Driver.getDriver(), this);// initliaze this pages elements

        NewConversationText.click();//click to search button
        SearchBox.sendKeys(user);//search for a user

        BrowserUtils.sleep(3);

        usersInSearchBox.get(0).click();//get the first one appears on the list

        BrowserUtils.sleep(3);


        newMessageBox.sendKeys(message + Keys.ENTER);//find the message box and sent message

        BrowserUtils.sleep(3);//assertion happens in the test base


    }


}
