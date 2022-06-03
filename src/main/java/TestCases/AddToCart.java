package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static browserFactory.BrowserDriver.driver;

public class AddToCart {
    @Test(description = "AddToCart")
    public static void AddToCart() throws InterruptedException {
//        login.login();
//        ItemSorting.ItemSorting();

        List<WebElement> cart = driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        int i=0;

        for(WebElement element:cart) {
//            System.out.println(element.getText());
            if (i<2) {
                element.click();
            }
            i++;

        }

    }
}
