package com.trycloud.tests;

import com.trycloud.Pages.FilesPagePOM;
import com.trycloud.Pages.LogInPagePOM;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US003_TC008_1_karlygash extends TestBase {


    @Test(description = "Validation of deleting file by action icon")
    public void delete_file_test(){
        LogInPagePOM logInPagePOM = new LogInPagePOM();
        PageFactory.initElements(Driver.getDriver(), logInPagePOM);
        //logInPagePOM.login(ConfigurationReader.getProperty("username113"),ConfigurationReader.getProperty("password"));

        logInPagePOM.login();
        FilesPagePOM filesPagePOM = new FilesPagePOM();
        filesPagePOM.deleteFile();



    }
}
