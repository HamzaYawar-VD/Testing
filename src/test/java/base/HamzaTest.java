package base;
import general.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import java.util.List;

import static browserFactory.BrowserDriver.browserDriver;
import static browserFactory.BrowserDriver.driver;

public class HamzaTest {
    public static void main(String args[]) {
        HamzaTest tester = new HamzaTest();
        tester.login();
        tester.ItemSorting();
        tester.sortedCheck();
        tester.AddToCart();
    }
@Test(description = "login with valid crdentials")
    public void login() {

        WebDriver driver = browserDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        WebElement fieldid = driver.findElement(By.id("user-name"));
        fieldid.click();
        fieldid.sendKeys("standard_user");

        WebElement fieldpass = driver.findElement(By.id("password"));
        fieldpass.click();
        fieldpass.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
//login with valid credentials is done

    }
    @Test(description = "sorting the Items low to high")
    public void ItemSorting() {
//        login();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Select value = new Select(driver.findElement(By.className("product_sort_container")));
        value.selectByIndex(2);
    }
    @Test(description = "CheckSorting")
    public void sortedCheck() {
//        login();
//        ItemSorting();
        float[] PricesArray= functions.price("//div[@class='inventory_item_price']");
           }


    @Test(description = "AddToCart")
    public void AddToCart(){

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
    @Test(description = "goToCart")
    public void NavigateToCart() {
       WebElement finalCart = functions.goToCart("//div[@id='shopping_cart_container']");
       finalCart.click();
    }
    @Test(description = "AssertItemsInCart")
    public int checkCart() {
        List<WebElement> cartItems = driver.findElements(By.xpath("//div[@class=\"cart_quantity\"]"));
        int j=0;
        for (WebElement element:cartItems)
              {
                  j++;

        } return j;

    }

}
