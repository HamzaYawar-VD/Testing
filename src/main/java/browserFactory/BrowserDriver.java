package browserFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static browserFactory.DriverManager.getDriver;
import static browserFactory.DriverManager.setDriver;
import static general.EnvGlobals.RunBrowser;

public class BrowserDriver {
//    private static WebDriver driver;

    //        public static WebDriver browserDriver() {
//            if (driver == null) {
//                System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
////            System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
//                driver = new ChromeDriver();
////            driver = new FirefoxDriver();
//            }
//            return driver;
//    }
    public static void driverInit() {


        if (getDriver() == null) {
            switch (RunBrowser) {
                case "Chrome":
                    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//                    driver = new ChromeDriver();
                    WebDriver driver = WebDriverManager.chromedriver().create();
                    setDriver(driver);
                    break;




                case "Firefox":
                    WebDriver driver2 = WebDriverManager.firefoxdriver().create();
                    setDriver(driver2);
                    break;

                case "Edge":
//                    System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");
                    WebDriver driver3 = WebDriverManager.edgedriver().create();
                    setDriver(driver3);
                    break;

                case "headless":
                    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless");
                    WebDriver driver4 = new ChromeDriver(options);
                    setDriver(driver4);
                    break;
            }

        }
//        return driver;
    }
}