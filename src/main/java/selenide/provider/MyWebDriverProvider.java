package selenide.provider;

import com.codeborne.selenide.WebDriverProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MyWebDriverProvider implements WebDriverProvider {

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        WebDriver driver;
        String browserName = desiredCapabilities.getBrowserName();
        switch (browserName) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
        }
        return driver;
        /*WebDriver driver;
       String browserName = System.getProperty("browser");
       switch (browserName) {
           case "chrome":
               WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver();
               break;
           case "firefox":
               WebDriverManager.firefoxdriver().setup();
               driver = new FirefoxDriver();
               break;
           default:
               WebDriverManager.edgedriver().setup();
               driver = new EdgeDriver();
               break;
       }
       return driver;*/
       }
}
