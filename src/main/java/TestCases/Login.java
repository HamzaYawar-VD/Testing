package TestCases;

import general.BaseTest;
import general.CommonAssertions;
import org.testng.annotations.Test;
import static general.CommonAssertions.*;
import static general.EnvGlobals.password;
import static general.EnvGlobals.username;
import static object.LoginObjects.*;


public class Login extends BaseTest {
    @Test(description = "Valid Login")
    public static void validLogin()  {
        login(username,password);
        validateLogin("PRODUCTS");

    }
    @Test(description = "invalid Login")
    public static void invalidLogin() {
        inValidLogin(username,"false");
        loginFailAssertion("Epic sadface: Username and password do not match any user in this service");

    }
}
