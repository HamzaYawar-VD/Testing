package general;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static browserFactory.BrowserDriver.driver;

public class CommonAssertions {

    public static void Validate(String header) {
        String actual = functions.FindElementByXpath(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals(actual,header);

    }
}
