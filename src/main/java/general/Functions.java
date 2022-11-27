package general;

//import browserFactory.BrowsergetDriver();

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebgetDriver()Wait;

import java.awt.*;
import java.time.Duration;
import java.util.List;

import static browserFactory.DriverManager.getDriver;

public class Functions {

    public static WebElement findElementById(By Locator) {
        WebElement element = getDriver().findElement(Locator);
        return element;
    }

    public static WebElement findElementByXpath(By Locator) {
        WebElement element = getDriver().findElement(Locator);
        return element;
    }

    public static List<WebElement> findElementsByXpath(By Locator) {
        List<WebElement> element = getDriver().findElements(Locator);
        return element;
    }

    public static WebElement findElementByCss(By Locator) {
        WebElement element = getDriver().findElement(Locator);
        return element;
    }

    public static WebElement FindElementByValue(By Locator) {
        WebElement element = getDriver().findElement(Locator);
        return element;
    }

    public static void selectElement(By locator, int value) {

        Select element = new Select(findElementByCss(locator));
        element.selectByIndex(value);
    }


//    public static WebgetDriver() getDriver() = BaseTest.getDriver();


    public static void browseUrl(String url) {
        getDriver().get(url);
    }

    public static void maximizeBrowser() {
        getDriver().manage().window().maximize();
    }

    public static void quitBrowser() {
        getDriver().quit();
    }

    public static void closeBrowser() {
        getDriver().close();
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
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", findElementByCss(locator));


    }

    public static void hover(By Locator) {
        Actions builder = new Actions(getDriver());
        builder.moveToElement(findElementByXpath(Locator)).build().perform();

    }


/////////////////////////////////////////////////////


    public static void explicitWait(By locator) {
        Duration d = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(getDriver(), d);
//        WebgetDriver()Wait wait = new WebgetDriver()Wait(getDriver(), d);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public static void scrollIntoViewCss(By locator, By locator2) throws InterruptedException {
        WebElement element = findElementByCss(locator);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        Functions.explicitWait(locator2);

    }

    public static void scrollIntoViewXpath(By locator, By locator2) throws AWTException {
        WebElement element = findElementByXpath(locator2);
        Robot robot = new Robot();
        robot.mouseMove(0, 1050);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        Functions.explicitWait(locator2);


    }

    public static void implicitWait(int a){

        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(a)) ;
    }

    public static void scrollUntillAndClick(By locator) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();

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
        return getDriver().getCurrentUrl();
    }
}

