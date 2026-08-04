package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ChromeBrowser {

    WebDriver driver;

    //Driver setup and configuration
    @BeforeSuite
    public void startBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    //Driver closer
    @AfterSuite
    public void stopBrowser(){
        driver.close();
    }

    //Test
    @Test
    public void openUrl(){
        driver.get("https://www.daraz.com.bd");
    }
}
