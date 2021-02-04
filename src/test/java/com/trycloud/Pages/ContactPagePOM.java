package com.trycloud.Pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class ContactPagePOM extends MenuBarPOM {
    @FindBy(xpath = "//a[contains(@data-original-title,'Talk to')]")
    public List<WebElement> usersInContactDropDown;

    //the method is created to click to one user in the contact bak
    public void clickingToUsersInContact(int num) {
        PageFactory.initElements(Driver.getDriver(),this);
        PageFactory.initElements(Driver.getDriver(),MenuBarPOM.class);
        if (num > 24 || num < 0) {
            throw new RuntimeException();
        }
        BrowserUtils.clickOn(buttonContactMenu,Driver.getDriver(),15);
        BrowserUtils.sleep(3);
        String expectedTitle = new WebDriverWait(Driver.getDriver(), 15).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(usersInContactDropDown.get(num))).getAttribute("data-original-title").substring(8);
        System.out.println(expectedTitle);
        BrowserUtils.clickOn(usersInContactDropDown.get(num), Driver.getDriver(), 25);
        BrowserUtils.sleep(5);
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue(Driver.getDriver().getTitle().startsWith(expectedTitle));
        BrowserUtils.sleep(3);

    }

}
