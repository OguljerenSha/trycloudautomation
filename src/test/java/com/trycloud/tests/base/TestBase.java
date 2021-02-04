package com.trycloud.tests.base;

import applicationRunner.SuitStarter;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase extends SuitStarter {


    @BeforeClass
    public void setupClass() {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        login();



    }

//    @AfterClass
//    public void teardownClass() {
//       Driver.getDriver().close();
//    }

    public void login() {


        WebElement loginBox = Driver.getDriver().findElement(By.xpath("//input[@id='user']"));
        loginBox.sendKeys(ConfigurationReader.getProperty("username23"));

        WebElement passwordBox = Driver.getDriver().findElement(By.xpath("//input[@id='password']"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));

        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//input[@id='submit']"));
        loginButton.click();


//change

    }
}
