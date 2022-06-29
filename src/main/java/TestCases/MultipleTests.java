package TestCases;

import general.BaseTest;
import org.testng.annotations.Test;

import static general.CommonAssertions.*;
import static object.MultipleTestObjects.*;

public class MultipleTests extends BaseTest {

    @Test(description = "GoToSauceLab")
    public static void sauceLab()  {
        goToSaucelabs();
    }
    @Test(description = "fill the form")
    public static void myForm() {

        formFill();
    }
    @Test(description = "navigate to facebook")
    public static void fb() {

        goToFacebook();
        fbURL();
    }
}

