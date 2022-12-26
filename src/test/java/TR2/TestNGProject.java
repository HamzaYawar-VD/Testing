package TR2;


import TR.APIClient;
import TR.APIException;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static general.CommonAssertions.loginFailAssertion;
import static general.CommonAssertions.validateLogin;
import static general.EnvGlobals.password;
import static general.EnvGlobals.username;
import static object.LoginObjects.inValidLogin;
import static object.LoginObjects.login;

public class TestNGProject
{
    String PROJECT_ID = "80";
    APIClient client = null;

    @BeforeSuite
    public void createSuite(ITestContext ctx) throws IOException, APIException {
        client = new APIClient("https://vdqa.testrail.io");
        client.setUser("hamza.yawaruddin@venturedive.com");
        client.setPassword("Hamza@2022");
        Map data = new HashMap();
        data.put("include_all",true);
        data.put("name","Test Run "+System.currentTimeMillis());
        JSONObject c = null;
        c = (JSONObject)client.sendPost("add_run/"+PROJECT_ID,data);
        Long suite_id = (Long)c.get("id");
        ctx.setAttribute("suiteId",suite_id);


    }

    @BeforeMethod
    public void beforeTest(ITestContext ctx,Method method) throws NoSuchMethodException {
        Method m = TestNGProject.class.getMethod(method.getName());

        if (m.isAnnotationPresent(TestRails.class)) {
            TestRails ta = m.getAnnotation(TestRails.class);
            System.out.println(ta.id());
            ctx.setAttribute("caseId",ta.id());
        }
    }
    @TestRails(id="1")
    @Test
    public void validLogin()
    {

        login(username,password);
        validateLogin("PRODUCTS");
    }

    @TestRails(id="2")
    @Test
    public void invalidLogin()
    {

        inValidLogin(username,"false");
        loginFailAssertion("Epic sadface: Username and password do not match any user in this service");

    }

    @AfterMethod
    public void afterTest(ITestResult result, ITestContext ctx) throws IOException, APIException {
        Map data = new HashMap();
        if(result.isSuccess()) {
            data.put("status_id",1);
        }
        else {
            data.put("status_id", 5);
            data.put("comment", result.getThrowable().toString());
        }

        String caseId = (String)ctx.getAttribute("caseId");
        Long suiteId = (Long)ctx.getAttribute("suiteId");
        client.sendPost("add_result_for_case/"+suiteId+"/"+caseId,data);

    }
}