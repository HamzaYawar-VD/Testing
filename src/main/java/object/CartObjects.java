package object;

import general.CommonAssertions;
import general.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static general.CommonAssertions.*;
import static general.functions.*;

public class CartObjects {
    public static By GetAllItems = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']");
    public static By CartButtonCss = By.cssSelector("a.shopping_cart_link");
    public static By CartCounter = By.xpath("//span[@class='shopping_cart_badge']");
    public static By myCart = By.xpath("//span[@class='title']");
    public static By CartQuantity = By.xpath("//div[@class='cart_quantity']");
    public static By CartList = By.xpath("//div[@class='cart_list']");

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
        explicitWait(CartCounter);
        click(FindElementByCss(CartButtonCss));
        explicitWait(myCart);

    }
    public static void CheckCart()  {
        explicitWait(CartList);
        List<WebElement> MyCartItems = FindElementsByXpath(CartQuantity);
        int quantity = MyCartItems.size();
        System.out.println(quantity);
        int check = AssertCartQuantiy(MyCartItems);
        System.out.println(check);
    }


}
