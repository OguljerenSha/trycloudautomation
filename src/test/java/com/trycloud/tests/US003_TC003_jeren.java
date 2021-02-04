package com.trycloud.tests;


import com.trycloud.Pages.LogInPagePOM;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class US003_TC003_jeren extends TestBase {

    @FindBy(xpath = "(//span[@class='icon icon-more'])[2]")
    WebElement actionIcon;

    @FindBy(id = "searchbox")
    WebElement searchBox;
    @Test
    public void tc3(){
        login();
        BrowserUtils.sleep(3);
        searchBox.click();
    }
}
