package TestCases;

import general.BaseTest;
import org.testng.annotations.Test;
import general.functions;

import static general.functions.*;
import static general.EnvGlobals.password;
import static general.EnvGlobals.username;
import static object.Locators.*;
import static object.CartObjects.*;
import static general.CommonAssertions.*;

public class Cart extends BaseTest {

    @Test(description = "AddToCart")
    public static void AddToCart() {
        add2Products(FindElementsByXpath(GetAllItems));
    }
    @Test(description = "Navigating To Cart")
    public static void NavigateToCart() {
        goToCart();
        validateCartPage("YOUR CART");
    }
    @Test(description = "AssertCart")
    public static void CartAssert() {
        CheckCart();
    }

}


