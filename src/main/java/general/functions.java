package general;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static browserFactory.BrowserDriver.browserDriver;
import static object.Locators.*;

public class functions {

    public static WebElement FindElementById(By Locator){
        WebElement element = driver.findElement(Locator);
        return element;
    }
    public static WebElement FindElementByXpath(By Locator){
        WebElement element = driver.findElement(Locator);
        return element;
    }

    public static WebElement FindElementByValue(By Locator){
        WebElement element = driver.findElement(Locator);
        return element;
    }


    public static WebDriver driver = browserDriver();


    public static void browseUrl(String url){
        driver.get(url);
    }

    public static void maximizeBrowser(){
        driver.manage().window().maximize();
    }

    public static void quitBrowser(){
        driver.quit();
    }

    public static void closeBrowser(){
        driver.close();
    }

    public static void click(WebElement element, By loginButton){

        element.click();
    }

    public static  void sendKeys(WebElement element,String text ){

        element.sendKeys(text);
    }

    public static void ScrollTo(By locator){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", FindElementByValue(locator));


    }



    public static void login(String username,String password ){
//        sendKeys(FindElementByValue(UserName),username);
        sendKeys(FindElementById(By.id("user-name")),username);
        sendKeys(FindElementById(By.id("password")),password);
        click(FindElementById(By.id("login-button")),LoginButton);


    }




/////////////////////////////////////////////////////

    public static float[] price(String locator) {
        List<WebElement> items = driver.findElements(By.xpath(locator));

        float[] prices = new float[6];
        int counter = 0;
        for (WebElement element : items) {
            System.out.println(element.getText().replace("$", ""));

            prices[counter] = Float.parseFloat((element.getText().replace("$", "")));
            counter++;

        }
        return prices;

    }
    public static WebElement goToCart(String locator) {
        WebElement FilledCart = driver.findElement(By.xpath(locator));
//        FilledCart.click();
        return FilledCart;
    }



}
