package object;

import org.openqa.selenium.By;

import static general.functions.*;
import static object.Locators.fbButton;

public class MultipleTestObjects {

    public static By MenuButton = By.xpath("//div[@class=\"bm-burger-button\"]");
    public static By AboutButton = By.xpath("//nav[@class=\"bm-item-list\"]//a[@id=\"about_sidebar_link\"]");
    public static By CookiesButton = By.xpath("//div[@id='onetrust-button-group']//button[@id='onetrust-accept-btn-handler']");
    public static By ContactButton = By.xpath("//div[@class='nav-menu']//div[@data-hover-content='Contact']//a[@data-ta='click']");
    public static By ContactSales = By.linkText("Contact Sales");

    //Form Locators
    public static By FirstName = By.xpath("//input[@id=\"FirstName\"]");
    public static By LastName = By.xpath("//input[@id=\"LastName\"]");
    public static By Company = By.xpath("//input[@id=\"Company\"]");
    public static By BizEmail = By.xpath("//input[@id=\"Email\"]");
    public static By Phone = By.xpath("//input[@id=\"Phone\"]");
    public static By CompSize = By.cssSelector("#Company_Size__c");

    public static By Country = By.cssSelector("#Country");
    public static By TestingType = By.cssSelector("#mktoCheckbox_30954_1");
    public static By HowDidYouHear = By.cssSelector("#How_did_you_hear_about_Sauce_Labs__c");

    public static By Comments = By.cssSelector("#Sales_Contact_Comments__c");

    public static By Terms = By.cssSelector("#mktoCheckbox_30959_0");
    public static By SauceLabHeader = By.xpath("//div[@class='nav-image']//a[@aria-label='Home']");

    public static By fbButton = By.xpath("//div[@class='column social-container']/a[1]/i");

    public static void goToSaucelabs() {
        click(FindElementByXpath(MenuButton));
        explicitWait(AboutButton);
        click(FindElementByXpath(AboutButton));
        explicitWait(CookiesButton);
        click(FindElementById(CookiesButton));
        Hover(ContactButton);
        click(FindElementByXpath(ContactSales));
    }
    public static void formFill()  {
        explicitWait(FirstName);
        sendKeys(FindElementByXpath(FirstName),"John");
        sendKeys(FindElementByXpath(LastName),"Doe");
        sendKeys(FindElementByXpath(Company),"VD");
        sendKeys(FindElementByXpath(BizEmail),"dummy@abc.com");
        selectElement(CompSize,5);
        selectElement(Country,2);
        sendKeys(FindElementByXpath(Phone),"68486656");
        scrollUntillAndClick(TestingType);
        sendKeys(FindElementByCss(HowDidYouHear),"mujhe assignment se apka pata laga");
        sendKeys(FindElementByCss(Comments),"kuch kahne ko baqi ni hai ab");
        scrollUntillAndClick(Terms);
    }
    public static void goToFacebook() {
        driver.navigate().back();
        explicitWait(SauceLabHeader);
        scrollUntillAndClick(fbButton);
    }

}
