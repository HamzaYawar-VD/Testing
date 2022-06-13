package general;

//import browserFactory.BrowserDriver;
import browserFactory.BrowserDriver;
import object.Locators;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static browserFactory.BrowserDriver.browserDriver;
import static browserFactory.BrowserDriver.driver;
import static object.Locators.*;

public class functions {

    public static WebElement FindElementById(By Locator) {
        WebElement element = driver.findElement(Locator);
        return element;
    }

    public static WebElement FindElementByXpath(By Locator) {
        WebElement element = driver.findElement(Locator);
        return element;
    }

    public static List<WebElement> FindElementsByXpath(By Locator) {
        List<WebElement> element = driver.findElements(Locator);
        return element;
    }

    public static WebElement FindElementByCss(By Locator) {
        WebElement element = driver.findElement(Locator);
        return element;
    }

    public static WebElement FindElementByValue(By Locator) {
        WebElement element = driver.findElement(Locator);
        return element;
    }

    public static void selectElement(By locator, int value) {

        Select element = new Select(FindElementByCss(locator));
        element.selectByIndex(value);
    }


    public static WebDriver driver = BaseTest.driver;


    public static void browseUrl(String url) {
        driver.get(url);
    }

    public static void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    public static void quitBrowser() {
        driver.quit();
    }

    public static void closeBrowser() {
        driver.close();
    }

//    public static void click(WebElement element, By loginButton){
//
//        element.click();
//    }

    public static void click(WebElement element) {

        element.click();
    }

    public static void sendKeys(WebElement element, String text) {

        element.sendKeys(text);
    }

    public static void ScrollTo(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", FindElementByCss(locator));


    }

    public static void Hover(By Locator) {
        Actions builder = new Actions(driver);
        builder.moveToElement(FindElementByXpath(Locator)).build().perform();

    }


/////////////////////////////////////////////////////

    public static void login(String username, String password) {
//        sendKeys(FindElementByValue(UserName),username);
        sendKeys(FindElementById(By.id("user-name")), username);
        sendKeys(FindElementById(By.id("password")), password);
        click(FindElementById(LoginButton));
//        click(FindElementById(By.id("login-button")),LoginButton);

    }

    public static float[] price(By locator) {
        List<WebElement> items = driver.findElements(locator);
        int size = items.size();

        float[] prices = new float[size];
        int counter = 0;
        for (WebElement j : items) {
            prices[counter] = Float.parseFloat(j.getText().replace("$", ""));
            System.out.println("price of " + counter + " is" + prices[counter]);

            counter++;

        }
        return prices;

    }

    public static void Add2Products(List<WebElement> MyElements) {
        int i = 0;
        for (WebElement element : MyElements) {
            if (i < 2) {
                click(element);
            }
            i++;
        }
    }

    public static void explicitWait(By locator) {
        Duration d = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, d);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public static void scrollIntoViewCss(By locator, By locator2) throws InterruptedException {
        WebElement element = FindElementByCss(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        functions.explicitWait(locator2);

    }

    public static void scrollIntoViewXpath(By locator, By locator2) throws AWTException {
        WebElement element = FindElementByXpath(locator2);
        Robot robot = new Robot();
        robot.mouseMove(0, 1050);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        functions.explicitWait(locator2);


    }

    public static void implicitWait(int a){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a)) ;
    }

    public static void scrollUntillAndClick(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        int i = 0;

        while (i < 5) {

            js.executeScript("window.scrollBy(0,100)");
            try {
                click(FindElementByXpath(locator));
                System.out.println("Element is clickable");
                break;
            } catch (ElementClickInterceptedException e) {
                System.out.println("Element isn't clickable");
            }
            i+=1;
        }
    }
}

