package testCases;

import general.functions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.concurrent.TimeUnit;

import java.util.List;

import static browserFactory.BrowserDriver.browserDriver;
import static browserFactory.BrowserDriver.driver;

public class MultipleTest {

    @Test(description = "GoToMenu")
    public static void GoToMenu() throws InterruptedException {

        login.login();
//        ItemSorting.ItemSorting();
//        SortCheck.sortedCheck();
//        AddToCart.AddToCart();
//        NavigateToCart.NavigateToCart();

        Thread.sleep(6000);
        WebElement menu = driver.findElement(By.xpath("//div[@class=\"bm-burger-button\"]"));

//        Actions actions = new Actions(driver);
//        actions.moveToElement(menu);
//        actions.perform();
//        WebElement menu = driver.findElement(By.xpath("//div[@id=\"menu_button_container\"]"));
        menu.click();

        Thread.sleep(2000);

        WebElement about = driver.findElement(By.xpath("//nav[@class=\"bm-item-list\"]//a[@id=\"about_sidebar_link\"]"));
        about.click();

        Thread.sleep(2000);

//        Actions actionss = new Actions(driver);
//        actions.moveToElement(about);
//        actions.perform();
        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//div[@class='nav-menu']//div[@data-hover-content='Contact']//a[@data-ta='click']"));
//        WebElement element = driver.findElement(By.linkText("Contact"));
        builder.moveToElement(element).build().perform();

        WebElement contact = driver.findElement(By.linkText("Contact Sales"));
        contact.click();

        Thread.sleep(3000);

        WebElement firstName = driver.findElement(By.xpath("//input[@id=\"FirstName\"]"));
        firstName.click();
        firstName.sendKeys("John");

        WebElement lastName = driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
        lastName.click();
        lastName.sendKeys("Doe");

        WebElement company = driver.findElement(By.xpath("//input[@id=\"Company\"]"));
        company.click();
        company.sendKeys("VD");

        WebElement BizEmail = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
        BizEmail.click();
        BizEmail.sendKeys("John@doe.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");

        Select CompSize = new Select(driver.findElement(By.xpath("//select[@id=\"Company_Size__c\"]")));
        CompSize.selectByIndex(5);

        Select Country = new Select(driver.findElement(By.xpath("//select[@id=\"Country\"]")));
        Country.selectByIndex(2);

        WebElement phone = driver.findElement(By.xpath("//input[@id=\"Phone\"]"));
        //phone.click();
        phone.sendKeys("090078601");

//        driver.findElement(By.xpath("//label[text()=\"API Testing\"]")).click();
        BizEmail.sendKeys("John@doe.com");
//
         driver.findElement(By.xpath("//*[@id='mktoCheckbox_29473_2']")).click();
        WebElement TextArea = driver.findElement(By.xpath("//textarea[@id=\"How_did_you_hear_about_Sauce_Labs__c\"]"));
        TextArea.sendKeys("this is my feedback");
//
        WebElement comments = driver.findElement(By.xpath("//textarea[@id=\"Sales_Contact_Comments__c\"]"));
        comments.sendKeys("this is my comment");

        js.executeScript("window.scrollBy(0,700)", "");
        Thread.sleep(2000);

//
        driver.findElement(By.xpath("//input[@id='mktoCheckbox_29478_0']")).click();

        driver.navigate().back();

        js.executeScript("window.scrollBy(99,5864)", "");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='onetrust-button-group']//button[@id='onetrust-accept-btn-handler']")).click();

//       WebElement fbButton =  driver.findElement(By.xpath("//div[@class='column social-container']/a[@href='https://www.facebook.com/saucelabs']//*[name()='svg']//*[name()='path' and @d='M19 0h-14c-2.761 0-5 2.239-5 5v14c0 2.761 2.239 5 5 5h14c2.762 0 5-2.239 5-5v-14c0-2.761-2.238-5-5-5zm-3 7h-1.924c-.615 0-1.076.252-1.076.889v1.111h3l-.238 3h-2.762v8h-3v-8h-2v-3h2v-1.923c0-2.022 1.064-3.077 3.461-3.077h2.539v3z']"));
//       fbButton.click();

        WebElement web = driver.findElement(By.xpath("//div[@class='column social-container']/a[@href='https://www.facebook.com/saucelabs']//*[name()='svg']//*[name()='path' and @d='M19 0h-14c-2.761 0-5 2.239-5 5v14c0 2.761 2.239 5 5 5h14c2.762 0 5-2.239 5-5v-14c0-2.761-2.238-5-5-5zm-3 7h-1.924c-.615 0-1.076.252-1.076.889v1.111h3l-.238 3h-2.762v8h-3v-8h-2v-3h2v-1.923c0-2.022 1.064-3.077 3.461-3.077h2.539v3z']"));
        String url = web.getAttribute("href");
        driver.navigate().to(url);
        



    }
}
