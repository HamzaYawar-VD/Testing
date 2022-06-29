package TestCases;

import general.BaseTest;
import org.testng.annotations.Test;

import java.util.Arrays;

import static object.SortingObjects.*;

public class Sorting extends BaseTest {
    @Test(description = "sortingTests")
    public static void sort()  {

        itemSorting();
    }

    @Test(description = "Assert sorting is low to high")
    public static void assertSorting()  {
        float[] pricesArray = price(priceAllitems);
        System.out.println(Arrays.toString(pricesArray));
    }
}