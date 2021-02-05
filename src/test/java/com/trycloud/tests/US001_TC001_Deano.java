package com.trycloud.tests;

import com.trycloud.Pages.LogInPagePOM;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class US001_TC001_Deano extends TestBase {

    /*
    Test case #1 - verify user login successfully
1. Navigate to login page http://qa.trycloud.net/index.php/login?clear=1
2. Enter valid username
3. Enter valid password
4. Click login button
5. Verify the URL is showed to homepage’s url
(Put this test case in testBase class with an annotation so it runs for all the test case)
 hello
     */

    @Test (priority = 1,description = "Testing login function with user name username23")
    public void test1U1(){

        LogInPagePOM driverLogin = new LogInPagePOM();
        PageFactory.initElements(Driver.getDriver(),driverLogin);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

       driverLogin.login(ConfigurationReader.getProperty("username23"),ConfigurationReader.getProperty("password"));

    }

    @Test
    public void test2U1(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        /*driver.get("https://trycloud.net/");

        driver.findElement(By.id("menu-item-47")).click();

         */

        driver.get("http://qa.trycloud.net/index.php/login?redirect_url=/index.php/apps/files/");

        driver.findElement(By.id("user")).sendKeys("User53");


        driver.findElement(By.id("password")).sendKeys("Userpass123");

        driver.findElement(By.id("submit-form")).click();

       // driver.close();


    }

    @Test
    public void test3U1(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        /*driver.get("https://trycloud.net/");

        driver.findElement(By.id("menu-item-47")).click();

         */

        driver.get("http://qa.trycloud.net/index.php/login?redirect_url=/index.php/apps/files/");

        driver.findElement(By.id("user")).sendKeys("User83");


        driver.findElement(By.id("password")).sendKeys("Userpass123");

        driver.findElement(By.id("submit-form")).click();

        driver.close();

    }

    @Test
    public void test4U1(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        /*driver.get("https://trycloud.net/");

        driver.findElement(By.id("menu-item-47")).click();

         */

        driver.get("http://qa.trycloud.net/index.php/login?redirect_url=/index.php/apps/files/");

        driver.findElement(By.id("user")).sendKeys("User113");


        driver.findElement(By.id("password")).sendKeys("Userpass123");

        driver.findElement(By.id("submit-form")).click();

        driver.close();


    }

    @Test
    public void test5U1() {

        //ArrayList<String> userNames = new ArrayList<>(Arrays.asList("User23", "User83", "User83", "User113"));
        //String expectedUrl = "http://qa.trycloud.net/index.php/apps/files/";


        /*for (String eachUser : userNames) {
            //.Login(driver, eachUser, "password");
           // Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
           // .LogOut(driver);


        }

         */


    }

}
