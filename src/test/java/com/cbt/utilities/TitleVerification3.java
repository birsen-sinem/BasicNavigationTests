package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {

    public static void main(String[] args) {
       // "https://lulugandgeorgia.com",
        List<String> urls = Arrays.asList(
                "https://wayfair.com/",
                "https://walmart.com/",
                "https://westelm.com/");

        for (String each:urls) {
            WebDriverManager.chromedriver().version("79").setup();
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get(each);

            if (each.contains(driver.getTitle().substring(0,driver.getTitle().indexOf(" ")).toLowerCase())){
                System.out.println("The title is the part of the url PASSED");
            } else {
                System.out.println("The title is NOT the part of the url FAILED");
            }
            driver.close();
        }


    }
}


