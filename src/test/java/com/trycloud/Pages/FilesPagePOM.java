package com.trycloud.Pages;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPagePOM extends MenuBarPOM {

   // @FindBy(xpath = "//ul[@id='appmenu']/li[1]")
   // public WebElement buttonFile;
    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addIcon;
    @FindBy(xpath = "(//span[@class='icon icon-more'])[2]")
    public WebElement actionIcon;
    @FindBy(xpath = "//a[@class='menuitem action action-delete permanent']")
    public WebElement deleteButton;
    @FindBy(xpath = "(//h2[.='No files in here'])[1]")
    public WebElement noFilesInHereText;
    @FindBy(xpath = "//span[@class='displayname']")
    public List<WebElement> addFileOptions;
    @FindBy(id = "view29-input-folder")
    public WebElement fileNameInput;
    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> allFileNames;


    public void deleteFile() {
//        PageFactory.initElements(Driver.getDriver(), MenuBarPOM.class);//initialized it

      //  PageFactory.initElements(Driver.getDriver(), this);

        BrowserUtils.sleep(2);
        buttonFile.click();
        BrowserUtils.sleep(2);

        if (noFilesInHereText.isDisplayed()) {
            addIcon.click();
            BrowserUtils.sleep(2);
            addFileOptions.get(1).click(); // add folder
            fileNameInput.sendKeys("Test1" + Keys.ENTER);// name the folder

        }

        actionIcon.click(); // clicking the action icon of first appeared file
        BrowserUtils.sleep(2);
        deleteButton.click();
        BrowserUtils.sleep(2);


    }





}
