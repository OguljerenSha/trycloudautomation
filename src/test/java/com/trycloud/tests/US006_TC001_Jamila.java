package com.trycloud.tests;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalTime;

public class US006_TC001_Jamila extends TestBase {

    //
    @Test
    public void createNewFolder() {
        login();
        //

        WebElement addButton = Driver.getDriver().findElement(By.xpath("//a[@class='button new']"));
        // click add button
        addButton.click();


        // click "New Folder" button
        Driver.getDriver().findElement(By.xpath("//a[@data-action='folder']"));

        // write a folder name
        String folderName = "test" + LocalTime.now().getNano(); // adding time stamp to the file name to make it unique everytime
        Driver.getDriver().findElement(By.xpath("//input[@value='New folder']")).sendKeys(folderName);

        // Click submit icon
        Driver.getDriver().findElement(By.xpath("//input[@class='icon-confirm']")).click();

        BrowserUtils.sleep(3);
        WebElement newFolder = Driver.getDriver().findElement(By.xpath("//tr[@data-mime='httpd/unix-directory']//span[.='" + folderName + "']"));

        String actualFolderName = newFolder.getText();
        Assert.assertEquals(actualFolderName, folderName, "Folder name does not match");

    }
}
