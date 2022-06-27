package browserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static general.EnvGlobals.RunBrowser;

public class BrowserDriver {
    public static WebDriver driver;

    //        public static WebDriver browserDriver() {
//            if (driver == null) {
//                System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
////            System.setProperty("webdriver.gecko.driver","resources/geckodriver.exe");
//                driver = new ChromeDriver();
////            driver = new FirefoxDriver();
//            }
//            return driver;
//    }
    public static WebDriver browserDriver() {


        if (driver == null) {
            switch (RunBrowser) {
                case "Chrome":
                    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
                    driver = new ChromeDriver();
                    break;


                case "Firefox":
                    System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
                    driver = new FirefoxDriver();
                    break;

                case "Edge":
                    System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");
                    driver = new EdgeDriver();
                    break;

                case "headless":
                    System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless");
                    driver = new ChromeDriver(options);
                    break;
            }

        }
        return driver;
    }
}