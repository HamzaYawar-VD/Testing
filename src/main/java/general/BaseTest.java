package general;

import browserFactory.BrowserDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.ExtentReporter;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static general.EnvGlobals.*;
import static general.functions.*;
import static general.functions.driver;

public class BaseTest {



    public static WebDriver driver;
    public ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest logger;


    public static String dbhost = EnvGlobals.dbhost;
    public static String dbUser = EnvGlobals.dbUser;
    public static String dbPassword = EnvGlobals.dbPassword;
    public static String query = "Select * from automation_report WHERE id=274181";


    public static String updateQuery = ("UPDATE sonardb.automation_report SET Project_Name='AutomationTest', Platform='QA', Build='Test', Environment='QA', Component_id=1, Commit_Number='12345', Branch_Name='B', Execution_Date='2020-02-25 00:00:00', Total_Cases=4, Passed=4, Failed=0, Skipped=0, Execution_Start_Time='2020-02-28 14:36:33', Execution_End_Time='2020-02-28 14:36:35', Coverage=NULL, IsCoverageFromTestRail=0, Repository_Name=NULL WHERE id=274181;");




    @BeforeSuite
    public static void beforeMethod() {
        System.out.println("Before suite executing");
        driver = BrowserDriver.browserDriver();
//        updateQuery(updateQuery,dbhost,dbUser,dbPassword);
//        selectQuery(query,dbhost,dbUser,dbPassword);
        browseUrl(URL);
        maximizeBrowser();

    }

    @AfterSuite
    public static void afterMethod() throws InterruptedException {
        System.out.println("After Suite executing...");
        Thread.sleep(10000);
//        driver.close();
//        System.out.println("driver closed");
    }

    @BeforeTest
    public void beforeTestMethod() {
        Random rand = new Random();
        int upperbound = 50;
        int int_random = rand.nextInt(upperbound);

        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + File.separator+ "reports"+File.separator+"MyTestReport"+int_random+".html");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setDocumentTitle("AutoReport");
        htmlReporter.config().setReportName("My1stReport");
        htmlReporter.config().setTheme(Theme.DARK);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Tester","Hamza");


    }

    @BeforeMethod
    public void beforeMethod( Method testMethod){
        logger = extent.createTest(testMethod.getName());


    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        if(result.getStatus()== ITestResult.SUCCESS){
            String methodName = result.getMethod().getMethodName();
            String logText = "Test Case: " + methodName + "passed";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
            logger.log(Status.PASS,m);
        } else if (result.getStatus()== ITestResult.FAILURE) {
            String methodName = result.getMethod().getMethodName();
            String logText = "Test Case: " + methodName + "failed";
            Markup m = MarkupHelper.createLabel(logText,ExtentColor.RED);
            logger.log(Status.FAIL,m);
        }
    }
    @AfterTest
    public void afterTestmethod() {

        extent.flush();
    }


}
