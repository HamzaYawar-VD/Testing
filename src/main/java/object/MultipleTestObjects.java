package object;

import general.EnvGlobals;
import org.openqa.selenium.By;

import static browserFactory.DriverManager.getDriver;
import static general.Functions.*;

public class MultipleTestObjects {

    public static By menuButton = By.xpath("//div[@class=\"bm-burger-button\"]");
    public static By aboutButton = By.xpath("//nav[@class=\"bm-item-list\"]//a[@id=\"about_sidebar_link\"]");
    public static By cookiesButton = By.xpath("//div[@id='onetrust-button-group']//button[@id='onetrust-accept-btn-handler']");
    public static By contactButton = By.xpath("//div[@class='nav-menu']//div[@data-hover-content='Contact']//a[@data-ta='click']");
    public static By contactSales = By.linkText("Contact Sales");

    //Form Locators
    public static By firstName = By.xpath("//input[@id=\"FirstName\"]");
    public static By lastName = By.xpath("//input[@id=\"LastName\"]");
    public static By company = By.xpath("//input[@id=\"Company\"]");
    public static By bizEmail = By.xpath("//input[@id=\"Email\"]");
    public static By phone = By.xpath("//input[@id=\"Phone\"]");
    public static By compSize = By.cssSelector("#Company_Size__c");

    public static By country = By.cssSelector("#Country");
    public static By testingType = By.cssSelector("#mktoCheckbox_30954_1");
    public static By howDidYouHear = By.cssSelector("#How_did_you_hear_about_Sauce_Labs__c");

    public static By comments = By.cssSelector("#Sales_Contact_Comments__c");

    public static By terms = By.cssSelector("#mktoCheckbox_30959_0");
    public static By sauceLabHeader = By.xpath("//div[@class='nav-image']//a[@aria-label='Home']");

    public static By fbButton = By.xpath("//div[@class='column social-container']/a[1]/i");



    public static void goToSaucelabs() {
        click(findElementByXpath(menuButton));
        explicitWait(aboutButton);
        click(findElementByXpath(aboutButton));
        explicitWait(cookiesButton);
        click(findElementById(cookiesButton));
        hover(contactButton);
        click(findElementByXpath(contactSales));
    }
    public static void formFill()  {
        explicitWait(firstName);
        sendKeys(findElementByXpath(firstName), EnvGlobals.firstName);
        sendKeys(findElementByXpath(lastName),EnvGlobals.lastName);
        sendKeys(findElementByXpath(company),EnvGlobals.company);
        sendKeys(findElementByXpath(bizEmail),EnvGlobals.bizEmail);
        selectElement(compSize,5);
        selectElement(country,2);
        sendKeys(findElementByXpath(phone),EnvGlobals.phone);
        scrollUntillAndClick(testingType);
        sendKeys(findElementByCss(howDidYouHear),EnvGlobals.howDidYouHear);
        sendKeys(findElementByCss(comments),EnvGlobals.comments);
        scrollUntillAndClick(terms);
    }
    public static void goToFacebook() {
        getDriver().navigate().back();
        explicitWait(sauceLabHeader);
        scrollUntillAndClick(fbButton);

    }

}
