package com.selenide.example;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenide.data.UserCredential;
import selenide.page.HomePage;

import static com.codeborne.selenide.Selenide.$;

public class LoginLogoutTest extends BaseSelenideTest {

    @Test
    public void loginTest() {
        HomePage homePage = new HomePage();
        Selenide.open("https://makeup.com.ua/");
        UserCredential userCredential = new UserCredential("romo4kachukalo@gmail.com", "musepa");
        homePage.login(userCredential);
        String textOnUserLabel = $(homePage.getUserLabel()).text();
        Assert.assertEquals($(homePage.getUserLabel()).text(),"Кабинет",
                "expected:\"Кабинет\" but found: "+textOnUserLabel);
    }

}
