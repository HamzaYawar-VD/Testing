package general;

import browserFactory.BrowserDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.sql.SQLException;

import static general.EnvGlobals.*;
import static general.functions.*;
import static general.functions.driver;

public class BaseTest {

    public static String dbhost = EnvGlobals.dbhost;
    public static String dbUser = EnvGlobals.dbUser;
    public static String dbPassword = EnvGlobals.dbPassword;
    public static String query = "Select * from automation_report WHERE id=274181";
    public static WebDriver driver;

    public static String updateQuery = ("UPDATE sonardb.automation_report SET Project_Name='AutomationTest', Platform='QA', Build='Test', Environment='QA', Component_id=1, Commit_Number='12345', Branch_Name='B', Execution_Date='2020-02-25 00:00:00', Total_Cases=4, Passed=4, Failed=0, Skipped=0, Execution_Start_Time='2020-02-28 14:36:33', Execution_End_Time='2020-02-28 14:36:35', Coverage=NULL, IsCoverageFromTestRail=0, Repository_Name=NULL WHERE id=274181;");




    @BeforeSuite
    public static void beforeMethod() throws SQLException {
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


}
