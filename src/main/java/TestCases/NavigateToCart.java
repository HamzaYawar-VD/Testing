package TestCases;

import general.functions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigateToCart {
    @Test(description = "goToCart")
    public static void NavigateToCart() throws InterruptedException {
//        login.login();
//        ItemSorting.ItemSorting();
//        SortCheck.sortedCheck();
//        AddToCart.AddToCart();
        WebElement finalCart = functions.goToCart("//div[@id='shopping_cart_container']");
        finalCart.click();
    }
}
