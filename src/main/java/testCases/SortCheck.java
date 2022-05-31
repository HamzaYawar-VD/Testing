package testCases;

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

public class SortCheck {
    @Test(description = "CheckSorting")
    public static void sortedCheck() throws InterruptedException {
//        login.login();
//        ItemSorting.ItemSorting();
//        AddToCart.AddToCart();
//        NavigateToCart.NavigateToCart();
        float[] PricesArray= functions.price("//div[@class='inventory_item_price']");
    }
}
