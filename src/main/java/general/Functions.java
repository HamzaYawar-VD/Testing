package general;

//import browserFactory.BrowserDriver;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class Functions {

    public static WebElement findElementById(By Locator) {
        WebElement element = driver.findElement(Locator);
        return element;
    }

    public static WebElement findElementByXpath(By Locator) {
        WebElement element = driver.findElement(Locator);
        return element;
    }

    public static List<WebElement> findElementsByXpath(By Locator) {
        List<WebElement> element = driver.findElements(Locator);
        return element;
    }

    public static WebElement findElementByCss(By Locator) {
        WebElement element = driver.findElement(Locator);
        return element;
    }

    public static WebElement FindElementByValue(By Locator) {
        WebElement element = driver.findElement(Locator);
        return element;
    }

    public static void selectElement(By locator, int value) {

        Select element = new Select(findElementByCss(locator));
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
        js.executeScript("arguments[0].scrollIntoView();", findElementByCss(locator));


    }

    public static void hover(By Locator) {
        Actions builder = new Actions(driver);
        builder.moveToElement(findElementByXpath(Locator)).build().perform();

    }


/////////////////////////////////////////////////////


    public static void explicitWait(By locator) {
        Duration d = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, d);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public static void scrollIntoViewCss(By locator, By locator2) throws InterruptedException {
        WebElement element = findElementByCss(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Functions.explicitWait(locator2);

    }

    public static void scrollIntoViewXpath(By locator, By locator2) throws AWTException {
        WebElement element = findElementByXpath(locator2);
        Robot robot = new Robot();
        robot.mouseMove(0, 1050);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Functions.explicitWait(locator2);


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
                click(findElementByXpath(locator));
                System.out.println("Element is clickable");
                break;
            } catch (ElementClickInterceptedException e) {
                System.out.println("Element isn't clickable");
            }
            i+=1;
        }
    }

    public static String getCurrentURL() {
        return driver.getCurrentUrl();
    }
}

