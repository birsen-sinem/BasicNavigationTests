package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ArrayList<String> title=new ArrayList<String>();
        ArrayList<String> urlVerify=new ArrayList<String>();
        for (int i = 0; i <urls.size() ; i++) {
            driver.get(urls.get(i));
           title.add(driver.getTitle());
           urlVerify.add(driver.getCurrentUrl());

        }
        if(title.get(0).equals(title.get(1)) && title.get(1).equals(title.get(2))){
            System.out.println("they all have the same title. : PASSED");
        }else{
            System.out.println("they all have the same title. : FAILED");
        }

        if(urlVerify.get(0).startsWith("http://practice.cybertekschool.com") &&
               urlVerify.get(1).startsWith("http://practice.cybertekschool.com") &&
               urlVerify.get(2).startsWith("http://practice.cybertekschool.com") ){
            System.out.println("all URLs of all pages start with http://practice.cybertekschool.com : PASSED  ");
        }else{
            System.out.println("all URLs of all pages start with http://practice.cybertekschool.com : FAILED");
        }

        driver.quit();
    }
}
