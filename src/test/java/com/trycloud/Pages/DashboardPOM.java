package com.trycloud.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPOM {


    @FindBy(id = "status-status")
    public WebElement setStatusButton;

    @FindBy(id= "status-weather")
    public WebElement setWeatherButton;

    @FindBy(id = "recommendations")
    public WebElement talkButton;
/*
    @FindBy(className = "no-account")
    public WebElement setUpAccountButton;

    @FindBy(className = "button")
    public WebElement createNewEventsButton;

    @FindBy(className = "item__details")
    public WebElement talkUpdateButton;

 */




}
