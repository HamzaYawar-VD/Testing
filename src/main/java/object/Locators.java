package object;

import org.openqa.selenium.By;

public class Locators {

//    public static By UserName = By.cssSelector("#user-name");

    public static By Username = By.id("user-name");
    public static By Password = By.id("password");

    public static By LoginButton = By.id("login-button");

    public static By SortButton = By.xpath("//select[@class=\"product_sort_container\"]");
    public static By SortValue = By.xpath("//select[@class='product_sort_container']//option[3]");
    public static By SortValue2 = By.cssSelector(".product_sort_container > option:nth-child(4)");

    public static By PriceAllitems = By.xpath("//div[@class='inventory_item_price']");

    public static By GetAllItems = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']");

    public static By CartButtonCss = By.cssSelector("a.shopping_cart_link");

    public static By CartQuantity = By.xpath("//div[@class='cart_quantity']");

    public static By MenuButton = By.xpath("//div[@class=\"bm-burger-button\"]");

    public static By AboutButton = By.xpath("//nav[@class=\"bm-item-list\"]//a[@id=\"about_sidebar_link\"]");

    public static By CookiesButton = By.id("onetrust-accept-btn-handler");

    public static By ContactButton = By.xpath("//div[@class='nav-menu']//div[@data-hover-content='Contact']//a[@data-ta='click']");

    public static By ContactSales = By.linkText("Contact Sales");

    public static By FirstName = By.xpath("//input[@id=\"FirstName\"]");

    public static By LastName = By.xpath("//input[@id=\"LastName\"]");

    public static By Company = By.xpath("//input[@id=\"Company\"]");

    public static By BizEmail = By.xpath("//input[@id=\"Email\"]");

    public static By Phone = By.xpath("//input[@id=\"Phone\"]");

//    public static By TextArea = By.xpath("//textarea[@id=\"How_did_you_hear_about_Sauce_Labs__c\"]");
//
//    public static By Comments = By.xpath("//textarea[@id=\"Sales_Contact_Comments__c\"]");

    public static By CompSize = By.cssSelector("#Company_Size__c");

    public static By Country = By.cssSelector("#Country");

    public static By TestingType = By.cssSelector("#LblmktoCheckbox_30797_1");

    public static By TestingType2 = By.cssSelector("#mktoCheckbox_30797_2");

    public static By HowDidYouHear = By.cssSelector("#How_did_you_hear_about_Sauce_Labs__c");

    public static By Comments = By.cssSelector("#Sales_Contact_Comments__c");

    public static By Terms = By.cssSelector("#mktoCheckbox_30802_0");

//    public static By fbButton = By.xpath("//i[@class='svg svg-facebook']//*[name()='svg']//*[name()='path' and contains(@d,'M19 0h-14c')]");
    public static By fbButton = By.xpath("//div[@class='column social-container']/a[1]/i");

    public static By Submit = By.cssSelector("button[class='mktoButton']");

    public static By copywright = By.xpath("//div[@class='copyright']");


















}
