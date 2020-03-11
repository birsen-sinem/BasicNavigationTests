package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://lulugandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com/",
                        "https://westelm.com/");
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = BrowserFactory.getDriver("chrome");

        for (String each:urls) {
            driver.get(each);

            if (each.contains(driver.getTitle().substring(0,driver.getTitle().indexOf(" ")).toLowerCase())){
                System.out.println("The title is the part of the url PASSED");
            } else {
                System.out.println("The title is NOT the part of the url FAILED");
            }
        }
        driver.quit();

    }
}
