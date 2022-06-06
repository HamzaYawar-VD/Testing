package TestCases;

import general.BaseTest;
import general.CommonAssertions;
import general.EnvGlobals;
import general.functions;
import object.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static general.functions.*;
import static general.EnvGlobals.password;
import static general.EnvGlobals.username;
import static object.Locators.*;

import java.util.List;

import static browserFactory.BrowserDriver.driver;

public class CheckCartItems extends BaseTest {
    @Test(description = "CheckCartItems")
    public static void CheckCart() throws InterruptedException {
//        login(username, password);
//        Sorting.ItemSorting();
//        Cart.AddToCart();
//        Cart.NavigateToCart();
        List<WebElement> MyCartItems = functions.FindElementsByXpath(Locators.CartQuantity);
        int quantity = MyCartItems.size();
        System.out.println(quantity);
        int check = CommonAssertions.AssertCartQuantiy(MyCartItems);
        System.out.println(check);

    }
}



//    public static int checkCart(By Locator) throws InterruptedException{
////        login.login();
////        ItemSorting.ItemSorting();
////        SortCheck.sortedCheck();
////        AddToCart.AddToCart();
////        NavigateToCart.NavigateToCart();
//        List<WebElement> cartItems = driver.findElements(By.xpath(Locator));
//        int j=0;
//        for (WebElement element:cartItems)
//        {
//            j++;
//
//        } return j;
//
//    }

