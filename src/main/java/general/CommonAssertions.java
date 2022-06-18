package general;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static general.functions.*;
import static object.CartObjects.*;

import java.util.List;

import static browserFactory.BrowserDriver.driver;

public class CommonAssertions {

    public static void validateLogin(String header) {
        String actual = FindElementByXpath(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals(actual,header);

    }

    public static void loginFailAssertion(String ActualErrorText) {
        String text = FindElementByXpath(By.xpath("//h3[@data-test='error']")).getText();
        Assert.assertEquals(text,ActualErrorText);

    }
    public static void validateCartPage(String PageHeader) {
        String actual = FindElementByXpath(myCart).getText();
        Assert.assertEquals(actual,PageHeader);
    }

    public static int AssertCartQuantiy(List<WebElement> actual) {
        int j=0;
        for (WebElement element:actual)
        {
            j++;

        } return j;
    }
    public static void FbURL(String actual) {
        String fburl = "https://www.facebook.com/saucelabs";

        Assert.assertEquals(actual,fburl);
    }
}
