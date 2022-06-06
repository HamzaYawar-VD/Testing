package TestCases;

import general.BaseTest;
import org.testng.annotations.Test;
import general.functions;

import static general.functions.*;
import static general.EnvGlobals.password;
import static general.EnvGlobals.username;
import static object.Locators.*;

public class Cart extends BaseTest {

    @Test(description = "AddToCart")
    public static void AddToCart() throws InterruptedException {
//        login(username, password);
//        Thread.sleep(1000);
//        Sorting.ItemSorting();
//        Thread.sleep(1000);
        functions.Add2Products(functions.FindElementsByXpath(GetAllItems));

        Thread.sleep(1000);
    }
    @Test(description = "Navigating To Cart")
    public static void NavigateToCart() throws InterruptedException {

        functions.click(FindElementByCss(CartButtonCss));
        Thread.sleep(1000);
    }
}


