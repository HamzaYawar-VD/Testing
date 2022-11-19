package general;
import org.openqa.selenium.By;
import org.testng.Assert;

import static browserFactory.DriverManager.getDriver;
import static general.Functions.*;
import static object.CartObjects.*;

import java.util.ArrayList;

//import static browserFactory.BrowserDriver.driver;

public class CommonAssertions {

    public static void validateLogin(String header) {
        String actual = findElementByXpath(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals(actual,header,"login failed");

    }

    public static void loginFailAssertion(String ActualErrorText) {
        String text = findElementByXpath(By.xpath("//h3[@data-test='error']")).getText();
        Assert.assertEquals(text,ActualErrorText,"Error assertion failed");

    }
    public static void validateCartPage(String PageHeader) {
        String actual = findElementByXpath(myCart).getText();
        Assert.assertEquals(actual,PageHeader,"cart navigation failed");
    }

    public static void assertCartQuantity(int actual) {
        int expected = 2;
        Assert.assertEquals(actual,expected);
    }
    public static void fbURL() {
        ArrayList<String> secondTab = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(secondTab.get(1));
        String ActualURL = getCurrentURL();
        String fburl = "https://www.facebook.com/saucelabs";
        Assert.assertEquals(ActualURL,fburl);

    }
}
