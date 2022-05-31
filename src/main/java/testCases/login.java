package testCases;

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

public class login {
    @Test(description = "login with valid crdentials")
    public static void login() {

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
    }
}