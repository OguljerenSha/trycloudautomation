package com.trycloud.Pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPagePOM {
    @FindBy(id = "user")
    public WebElement inputUserName;
    @FindBy(id = "password")
   public WebElement inputPassword;
    @FindBy(id = "submit")
    public WebElement buttonLogin;
    @FindBy(id = "lost-password")
    public WebElement linkForgotPassword;


    public void login(String userName, String password){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        inputUserName.sendKeys(userName);
        inputPassword.sendKeys(password);
        buttonLogin.click();

    }
    public void ForgotPassword(){
        linkForgotPassword.click();
    }//

    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        inputUserName.sendKeys(ConfigurationReader.getProperty("username23"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));
        buttonLogin.click();
    }
}
