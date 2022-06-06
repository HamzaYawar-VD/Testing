package TestCases;

import general.BaseTest;
import general.functions;
import object.Locators;
import org.testng.annotations.Test;

import java.util.Arrays;

import static general.functions.*;
import static general.EnvGlobals.password;
import static general.EnvGlobals.username;
import static object.Locators.*;

public class Sorting extends BaseTest {
    @Test(description = "sorting the Items low to high")
    public static void ItemSorting() throws InterruptedException {

//        login(username, password);
//        Thread.sleep(3000);
        functions.click(FindElementByXpath(Locators.SortButton));
        click(FindElementByCss(SortValue2));
        Thread.sleep(1000);
        click(FindElementByXpath(SortValue));
    }

    @Test(description = "Assert sorting is low to high")
    public static void AssertSorting() throws InterruptedException {
        float[] PricesArray = functions.price(PriceAllitems);
//        System.out.println(Arrays.toString(PricesArray));


    }
}