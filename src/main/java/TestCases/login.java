package TestCases;

import general.BaseTest;
import general.CommonAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static general.CommonAssertions.*;
import static general.EnvGlobals.password;
import static general.EnvGlobals.username;
import static general.functions.*;

public class login  extends BaseTest {
    @Test(description = "login with valid crdentials")
    public static void Validlogin() throws InterruptedException {

        login(username, password);
        Thread.sleep(1000);
        Validate("PRODUCTS");

    }

    @Test(description = "Invalid Login Attempt")
    public static void InValidLogin() throws InterruptedException {

        login(username,"falsePassword");
        CommonAssertions.LoginFailAssertion("Epic sadface: Username and password do not match any user in this service");

    }
}
