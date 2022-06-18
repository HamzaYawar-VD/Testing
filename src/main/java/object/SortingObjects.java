package object;

import org.openqa.selenium.By;
import static object.LoginObjects.*;
import static general.CommonAssertions.*;
import general.BaseTest;
import org.openqa.selenium.WebElement;

import java.util.List;

import static general.EnvGlobals.password;
import static general.EnvGlobals.username;
import static general.functions.*;

public class SortingObjects extends BaseTest{

    public static By SortButton = By.xpath("//select[@class=\"product_sort_container\"]");
    public static By SortValue2 = By.cssSelector(".product_sort_container > option:nth-child(4)");
    public static By SortValue = By.xpath("//select[@class='product_sort_container']//option[3]");
    public static By PriceAllitems = By.xpath("//div[@class='inventory_item_price']");
    public static void ItemSorting() {
//    login(username,password);
    explicitWait(SortButton);
    click(FindElementByCss(SortValue2));
    explicitWait(SortButton);
    click(FindElementByXpath(SortValue));
    }
    public static float[] price(By locator) {
        List<WebElement> items = driver.findElements(locator);
        int size = items.size();
        float[] prices = new float[size];
        int counter = 0;
        for (WebElement j : items) {
            prices[counter] = Float.parseFloat(j.getText().replace("$", ""));
            System.out.println("price of " + counter + " is " + prices[counter]);
            counter++;
        }
        return prices;
    }

}