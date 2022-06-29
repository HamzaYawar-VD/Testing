package TestCases;

import general.BaseTest;
import org.testng.annotations.Test;

import static general.Functions.*;
import static object.CartObjects.*;
import static general.CommonAssertions.*;

public class Cart extends BaseTest {

    @Test(description = "AddToCart")
    public static void addToCart() {

        add2Products(findElementsByXpath(getAllItems));
    }
    @Test(description = "Navigating To Cart")
    public static void navigateToCart() {
        goToCart();
        validateCartPage("YOUR CART");
    }
    @Test(description = "AssertCart")
    public static void cartAssert() {

        checkCart();
    }

}


