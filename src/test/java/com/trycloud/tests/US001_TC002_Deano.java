package com.trycloud.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class US001_TC002_Deano {

/*
Test case #2 - verify user cannot login with invalid credentials
1. Navigate to login page http://qa.trycloud.net/index.php/login?clear=1
2. Enter valid username invalid password
3. Click login button
4. Message “Wrong username or password.” should be displayed
5. Page title and url should be same
 */


    @Test
    public void testCase1U2(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        /*driver.get("https://trycloud.net/");

        driver.findElement(By.id("menu-item-47")).click();

         */

        driver.get("http://qa.trycloud.net/index.php/login?redirect_url=/index.php/apps/files/");

        driver.findElement(By.id("user")).sendKeys("User23");


        driver.findElement(By.id("password")).sendKeys("Userpass12");

        driver.findElement(By.id("submit-form")).click();



        String expectedTitle = "Trycloud - QA";
        String expectedMessage = "Wrong username or password.";



    }

    @Test
    public void testCase2U2(){

        //ArrayList<String> userNames = new ArrayList<>(Arrays.asList("User23", "User83", "User83", "User113"));

        // Adding a comment


    }


}




