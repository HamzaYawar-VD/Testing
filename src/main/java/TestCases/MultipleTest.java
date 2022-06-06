package TestCases;

import general.BaseTest;
import general.functions;
import object.Locators;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import static general.functions.*;
import static general.EnvGlobals.password;
import static general.EnvGlobals.username;
import static object.Locators.*;

import java.util.List;

public class MultipleTest extends BaseTest {

    @Test(description = "GoToSauceLab")
    public static void GoToSaucelabs() throws InterruptedException {
        login(username,password);
        click(FindElementByXpath(MenuButton));
        Thread.sleep(1000);
        click(FindElementByXpath(AboutButton));
        Thread.sleep(4000);
        click(FindElementById(CookiesButton));
        Thread.sleep(1000);
        FormFill();
        Facebook();

    }

    public static void FormFill() throws InterruptedException {

        Hover(ContactButton);
        click(FindElementByXpath(ContactSales));
        Thread.sleep(3000);

        sendKeys(FindElementByXpath(FirstName),"John");
        sendKeys(FindElementByXpath(LastName),"Doe");
        sendKeys(FindElementByXpath(Company),"VD");
        sendKeys(FindElementByXpath(BizEmail),"dummy@abc.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
//        ScrollTo(CompSize);
        selectElement(CompSize,5);
        selectElement(Country,2);

        sendKeys(FindElementByXpath(Phone),"68486656");
        Thread.sleep(1000);

//        ScrollTo(TestingType);
        WebElement Myelement1 = functions.FindElementByCss(CompSize);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Myelement1);
        Thread.sleep(500);
        click(FindElementByCss(TestingType));



        sendKeys(FindElementByCss(HowDidYouHear),"mujhe assignment se apka pata laga");
        sendKeys(FindElementByCss(Comments),"kuch kahne ko baqi ni hai ab");

        WebElement Myelement2 = functions.FindElementByCss(Comments);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Myelement2);
        Thread.sleep(500);

        click(FindElementByCss(Terms));

        Thread.sleep(1000);


    }

    public static void Facebook() throws InterruptedException{
    driver.navigate().back();
    Thread.sleep(2500);

        WebElement Myelement3 = functions.FindElementByXpath(fbButton);
        Thread.sleep(2500);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Myelement3);
//        Thread.sleep(2500);
        functions.explicitWait(fbButton);
    click(FindElementByXpath(fbButton));
}
}
