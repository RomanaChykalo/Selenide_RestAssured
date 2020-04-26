package com.selenide.example;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import selenide.provider.MyWebDriverProvider;

import java.util.Properties;

public class BaseSelenideTest {

    @BeforeClass
    public void initDriver() {
        System.setProperty("browser", "chrome");/*
        System.setProperty("file.encoding","UTF-8");*/
        Properties properties = System.getProperties();
        System.out.println(properties.toString());
        String browserName =System.getProperty("browser");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName(browserName);
        WebDriver driver = new MyWebDriverProvider().createDriver(desiredCapabilities);
        WebDriverRunner.setWebDriver(driver);
    }

    @AfterClass
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}
