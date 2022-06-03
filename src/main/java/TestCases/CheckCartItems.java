package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static browserFactory.BrowserDriver.driver;

public class CheckCartItems {
    int qunantity = checkCart("//div[@class=\"cart_quantity\"]");

    public CheckCartItems() throws InterruptedException {
    }


    @Test(description = "CheckCartItems")
    public static int checkCart(String Locator) throws InterruptedException{
//        login.login();
//        ItemSorting.ItemSorting();
//        SortCheck.sortedCheck();
//        AddToCart.AddToCart();
//        NavigateToCart.NavigateToCart();
        List<WebElement> cartItems = driver.findElements(By.xpath(Locator));
        int j=0;
        for (WebElement element:cartItems)
        {
            j++;

        } return j;

    }
}
