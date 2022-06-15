package TestCases;

import general.BaseTest;
import general.CommonAssertions;
import general.functions;
import object.Locators;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static browserFactory.BrowserDriver.driver;
import static general.functions.*;
import static general.EnvGlobals.password;
import static general.EnvGlobals.username;
import static object.Locators.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MultipleTest extends BaseTest {

    @Test(description = "GoToSauceLab")
    public static void GoToSaucelabs() throws InterruptedException, AWTException {
        login(username,password);
        Sorting.ItemSorting();
        Cart.AddToCart();
        Cart.NavigateToCart();
        implicitWait(4);
        CheckCartItems.CheckCart();
        click(FindElementByXpath(MenuButton));
        implicitWait(4);
        click(FindElementByXpath(AboutButton));
        implicitWait(4);
        click(FindElementById(CookiesButton));
        implicitWait(4);
        FormFill();
        Facebook();
        GetFbUrl();


    }

    public static void FormFill() throws InterruptedException {

        Hover(ContactButton);
        click(FindElementByXpath(ContactSales));
        Thread.sleep(3000);

        sendKeys(FindElementByXpath(FirstName),"John");
        sendKeys(FindElementByXpath(LastName),"Doe");
        sendKeys(FindElementByXpath(Company),"VD");
        sendKeys(FindElementByXpath(BizEmail),"dummy@abc.com");

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,500)", "");
//        ScrollTo(CompSize);
        selectElement(CompSize,5);
        selectElement(Country,2);

        sendKeys(FindElementByXpath(Phone),"68486656");
        implicitWait(20);

//        ScrollTo(TestingType);
        functions.scrollIntoViewCss(CompSize,TestingType);
//        WebElement Myelement1 = functions.FindElementByCss(CompSize);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Myelement1);
//        functions.explicitWait(TestingType);
        implicitWait(20);
        click(FindElementByCss(TestingType));

        sendKeys(FindElementByCss(HowDidYouHear),"mujhe assignment se apka pata laga");
        sendKeys(FindElementByCss(Comments),"kuch kahne ko baqi ni hai ab");

        implicitWait(20);

        functions.scrollIntoViewCss(Comments,Terms);
//        WebElement Myelement2 = functions.FindElementByCss(Comments);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Myelement2);
//        functions.explicitWait(Terms);
        implicitWait(20);
        click(FindElementByCss(Terms));



    }

    public static void Facebook() throws InterruptedException, AWTException {
    driver.navigate().back();
//    implicitWait(30);
//        scrollIntoViewXpath(copywright,fbButton);
//        implicitWait(30);
        scrollUntillAndClick(fbButton);
//    functions.scrollIntoViewXpath(fbButton,fbButton);

}
public static void GetFbUrl() throws InterruptedException {
        Thread.sleep(2000);
    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs2.get(1));
    Thread.sleep(2000);
    String URL = driver.getCurrentUrl();
    System.out.println(URL);
    CommonAssertions.FbURL(URL);
}

}
