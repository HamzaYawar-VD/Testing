package object;

import org.openqa.selenium.By;
import general.BaseTest;
import org.openqa.selenium.WebElement;

import java.util.List;

import static general.functions.*;

public class SortingObjects extends BaseTest{

    public static By sortButton = By.xpath("//select[@class=\"product_sort_container\"]");
    public static By sortValue2 = By.cssSelector(".product_sort_container > option:nth-child(4)");
    public static By sortValue = By.xpath("//select[@class='product_sort_container']//option[3]");
    public static By priceAllitems = By.xpath("//div[@class='inventory_item_price']");
    public static void itemSorting() {
    explicitWait(sortButton);
    click(findElementByCss(sortValue2));
    explicitWait(sortButton);
    click(findElementByXpath(sortValue));
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