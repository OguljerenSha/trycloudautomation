package com.trycloud.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    public static void sleep(int seconds){

        try {
            Thread.sleep(seconds* 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void hoover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }


//a method for explicit wait uses WebDriverWait class
    public static void clickOn(WebElement element, WebDriver driver, int timeout) {
        final WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(element)));
        element.click();
    }


}
