package TestCases;

import general.BaseTest;
import general.EnvGlobals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static browserFactory.BrowserDriver.browserDriver;

import static general.CommonAssertions.*;
import static general.EnvGlobals.password;
import static general.EnvGlobals.username;
import static general.functions.*;
import static general.EnvGlobals.*;
import static object.Locators.*;

public class login  extends BaseTest {
    @Test(description = "login with valid crdentials")
    public static void Validlogin() throws InterruptedException {

        login(username, password);
        Thread.sleep(1000);
        Validate("PRODUCTS");













//this is my old code
//        driver.get("https://www.saucedemo.com/");
//
//        driver.manage().window().maximize();
//
//        WebElement fieldid = driver.findElement(By.id("user-name"));
//        fieldid.click();
//        fieldid.sendKeys("standard_user");
//
//        WebElement fieldpass = driver.findElement(By.id("password"));
//        fieldpass.click();
//        fieldpass.sendKeys("secret_sauce");
//
//        WebElement login = driver.findElement(By.id("login-button"));
//        login.click();
    }
}