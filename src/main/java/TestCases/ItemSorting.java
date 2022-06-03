package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static browserFactory.BrowserDriver.driver;
public class ItemSorting {
    @Test(description = "sorting the Items low to high")
    public static void ItemSorting() throws InterruptedException {
//        login.login();
        Thread.sleep(5000);

        Select value = new Select(driver.findElement(By.className("product_sort_container")));
        value.selectByIndex(2);
    }
}
