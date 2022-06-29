package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static general.CommonAssertions.*;
import static general.Functions.*;

public class CartObjects {
    public static By getAllItems = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']");
    public static By cartButtonCss = By.cssSelector("a.shopping_cart_link");
    public static By cartCounter = By.xpath("//span[@class='shopping_cart_badge']");
    public static By myCart = By.xpath("//span[@class='title']");
    public static By cartQuantity = By.xpath("//div[@class='cart_quantity']");
    public static By cartList = By.xpath("//div[@class='cart_list']");

    public static void add2Products(List<WebElement> MyElements) {
        int i = 0;
        for (WebElement element : MyElements) {
            if (i < 2) {
                click(element);
            }
            i++;
        }

    }
    public static void goToCart() {
        explicitWait(cartCounter);
        click(findElementByCss(cartButtonCss));
        explicitWait(myCart);

    }
    public static void checkCart()  {
        explicitWait(cartList);
        List<WebElement> MyCartItems = findElementsByXpath(cartQuantity);
        int quantity = MyCartItems.size();
        System.out.println(quantity);
        int check = cartQuantiy(MyCartItems);
        System.out.println(check);
        assertCartQuantity(check);
    }

    public static int cartQuantiy(List<WebElement> actual) {
        int j=0;
        for (WebElement ignored :actual)
        {
            j++;

        } return j;
    }


}
