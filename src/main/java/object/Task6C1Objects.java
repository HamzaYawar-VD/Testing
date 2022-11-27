package object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static general.Functions.*;
import static browserFactory.DriverManager.getDriver;

public class Task6C1Objects {

    public static By exploreButton  = By.xpath("//a[@id='exploreBtn']");
    public static By designingButton  = By.xpath("//button[text()='Designing']");
    public static By photoButton = By.xpath("//button[normalize-space()='Photo']");

    public static By homeButton = By.xpath("//a[@id='navResourceBtn' and text()='Resources']");
    public static By startLearningButton = By.xpath("//a[@class='mybutton']");
    public static By programmingButton = By.xpath("//button[text()='Programming']");
    public static By javaButton = By.xpath("//button[normalize-space()='Java']");
    public static By w3SchoolButton = By.xpath("//h5[text()='W3Schools']//following-sibling::a[text()='View More']");






    public static void designing() {
        explicitWait(exploreButton);
        click(findElementByXpath(exploreButton));
        explicitWait(designingButton);
        click(findElementByXpath(designingButton));
        scrollUntillAndClick(photoButton);
    }

    public static void programming() {
        explicitWait(homeButton);
//        click(findElementByXpath(homeButton));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0,500)");
        click(findElementByXpath(startLearningButton));
//        scrollUntillAndClick(startLearningButton);
        explicitWait(programmingButton);
        click(findElementByXpath(programmingButton));
        explicitWait(javaButton);
        click(findElementByXpath(javaButton));
        explicitWait(w3SchoolButton);
        click(findElementByXpath(w3SchoolButton));

    }

}
