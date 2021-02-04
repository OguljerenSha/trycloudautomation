package com.trycloud.tests;

import com.trycloud.Pages.LogInPagePOM;
import com.trycloud.Pages.MenuBarPOM;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US003_TC007_Mayasa extends TestBase {
    MenuBarPOM driverMenuBar = new MenuBarPOM();

    @BeforeMethod
    public void SetUpElements() {

        PageFactory.initElements(Driver.getDriver(), driverMenuBar);
    }
    @Test
    //Test case #7 - verify users can upload a file inside a folder
    public void US3_TC7() throws InterruptedException {
        //Test case #7 - verify users can upload a file inside a folder
        // 1.Login as a user
        // 2.Choose a folder from the page
        // 3.Click the “+” icon on top
        // 4.Click “upload file”
        // 5.Upload a file
        // 6.Verify the file is displayed on the page
        LogInPagePOM logInPagePOM=new LogInPagePOM();
        logInPagePOM.inputUserName.click();
        logInPagePOM.inputPassword.click();
        logInPagePOM.buttonLogin.click();

      WebElement fileButton=Driver.getDriver().findElement(By.className("active"));
      fileButton.click();
    }





}