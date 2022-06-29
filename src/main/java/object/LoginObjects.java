package object;

import org.openqa.selenium.By;

import static general.Functions.*;


public class LoginObjects{

    //Locators used in Login

    public static By Username = By.id("user-name");
    public static By Password = By.id("password");
    public static By LoginButton = By.id("login-button");

    //Login Method
    public static void login(String username, String password) {

        findElementById(Username).clear();
        sendKeys(findElementById(Username),username);
        findElementById(Password).clear();
        sendKeys(findElementById(Password),password);
        click(findElementById(LoginButton));
    }

    //Invalid Login Method
    public static void inValidLogin(String username, String password) {
        browseUrl("https://www.saucedemo.com/");
        explicitWait(Username);
        login(username,password);
        click(findElementById(LoginButton));
    }

    //Erase credentials fields
    public static void erase() {
        findElementById(Username).clear();
        findElementById(Password).clear();
    }


}
