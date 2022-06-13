package general;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static browserFactory.BrowserDriver.driver;

public class CommonAssertions {

    public static void Validate(String header) {
        String actual = functions.FindElementByXpath(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals(actual,header);

    }

    public static void LoginFailAssertion(String ActualErrorText) {
        String text = functions.FindElementByXpath(By.xpath("//h3[@data-test='error']")).getText();
        Assert.assertEquals(text,ActualErrorText);

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
