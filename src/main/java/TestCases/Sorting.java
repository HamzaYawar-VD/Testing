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
import static object.SortingObjects.*;

public class Sorting extends BaseTest {
    @Test(description = "sortingTests")
    public static void Sort()  {
        ItemSorting();
    }

    @Test(description = "Assert sorting is low to high")
    public static void AssertSorting()  {
        float[] PricesArray = price(PriceAllitems);
        System.out.println(Arrays.toString(PricesArray));
    }
}