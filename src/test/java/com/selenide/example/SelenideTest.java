package com.selenide.example;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class SelenideTest {
    @Test
    public void testGoogle(){
        Selenide.open("https://rozetka.com.ua/ua/");
        $("a.header-topline__user-link.link-dashed").click();
        $("input#auth_email").setValue("romo4kachukalo@gmail.com");
        $("input#auth_pass").setValue("d9d9e81d").sendKeys(Keys.ENTER);
    }
}
