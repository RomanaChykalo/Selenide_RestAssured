package selenide.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import selenide.data.UserCredential;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private By loginBtn = By.xpath("//div[@data-popup-handler='auth']");
    private By emailInput = By.cssSelector("input[name='user_login']");
    private By passwordInput = By.cssSelector("input[name='user_pw']");
    private By userLabel = By.cssSelector("a[href='/user/']");

    public void login(UserCredential userCredential){
        $(loginBtn).click();
        $(emailInput).clear();
        $(passwordInput).clear();
        $(emailInput).sendKeys(userCredential.getUserName());
        $(passwordInput).sendKeys(userCredential.getPassword());
        $(passwordInput).sendKeys(Keys.ENTER);
    }

    public By getUserLabel() {
        return userLabel;
    }

}
