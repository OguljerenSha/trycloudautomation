package com.trycloud.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class US001_TC001_Deano {


    @Test
    public void testCase1U1(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://trycloud.net/");

        driver.findElement(By.id("menu-item-47")).click();






    }



}