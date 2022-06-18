package object;

import general.BaseTest;
import general.CommonAssertions;
import general.functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static general.CommonAssertions.*;
import static general.EnvGlobals.password;
import static general.EnvGlobals.username;
import static general.functions.*;


public class LoginObjects{

    //Locators used in Login

    public static By Username = By.id("user-name");
    public static By Password = By.id("password");
    public static By LoginButton = By.id("login-button");

    //Login Method
    public static void login(String username, String password) {

        FindElementById(Username).clear();
        sendKeys(FindElementById(Username),username);
        FindElementById(Password).clear();
        sendKeys(FindElementById(Password),password);
        click(FindElementById(LoginButton));
    }

    //Invalid Login Method
    public static void inValidLogin(String username, String password) {
        browseUrl("https://www.saucedemo.com/");
        explicitWait(Username);
        login(username,password);
        click(FindElementById(LoginButton));
    }

    //Erase credentials fields
    public static void Erase() {
        FindElementById(Username).clear();
        FindElementById(Password).clear();
    }


}
