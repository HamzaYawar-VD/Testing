package browserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriver {
    public static WebDriver driver;

    public static WebDriver browserDriver() {
        if(driver == null){
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//            System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
            driver = new ChromeDriver();
//            driver = new FirefoxDriver();
        }
        return driver;
    }
}