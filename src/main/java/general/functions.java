package general;

import general.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import java.util.List;

import static browserFactory.BrowserDriver.browserDriver;
import static browserFactory.BrowserDriver.driver;

public class functions {

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
