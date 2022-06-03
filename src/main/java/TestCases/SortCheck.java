package TestCases;

import general.functions;
import org.testng.annotations.Test;

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
