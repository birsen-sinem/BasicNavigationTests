package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class NavigationTests {
    public static void main(String[] args) {


        chrome();
        safari();
        firefox();

    }


    public static void chrome (){

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
        String title = driver.getTitle();

        driver.get("https://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        String title3=driver.getTitle();
        StringUtility.verifyEquals(title,title3);
        driver.navigate().forward();
        String title4=driver.getTitle();
        StringUtility.verifyEquals(title2,title4);

        driver.quit();
    }
    public static void firefox (){

        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://google.com");
        String title = driver.getTitle();

        driver.get("https://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        String title3=driver.getTitle();
        StringUtility.verifyEquals(title,title3);
        driver.navigate().forward();
        String title4=driver.getTitle();
        StringUtility.verifyEquals(title2,title4);

        driver.quit();
    }
    public static void safari (){

        WebDriver driver = BrowserFactory.getDriver("safari");
        driver.get("https://google.com");
        String title = driver.getTitle();

        driver.get("https://etsy.com");
        String title2 = driver.getTitle();
        driver.navigate().back();
        String title3=driver.getTitle();
        StringUtility.verifyEquals(title,title3);
        driver.navigate().forward();
        String title4=driver.getTitle();
        StringUtility.verifyEquals(title2,title4);

        driver.quit();
    }



}
