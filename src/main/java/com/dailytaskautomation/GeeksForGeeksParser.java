package com.dailytaskautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeeksForGeeksParser {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ranjit\\GoogleChromeDriver\\chromedriver.exe");
        System.out.println("Hello Warning");
        WebDriver webDriver = new ChromeDriver();
        String currentUrl = webDriver.getCurrentUrl();
        System.out.println(currentUrl);
        System.out.println("Hello world, This is Ranjit");
        webDriver.close();
        System.exit(0);
    }

}
