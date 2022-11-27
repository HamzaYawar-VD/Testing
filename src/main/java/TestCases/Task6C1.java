package TestCases;

import general.BaseTest;
import org.testng.annotations.Test;

import static object.Task6C1Objects.*;
import static general.CommonAssertions.*;

public class Task6C1 extends BaseTest {

    @Test(description = "designing")
    public static void designingResource()  {
        designing();
        BeginnerAssertion("Beginner");
        IntermediateAssertion("Intermediate");
        AdvancedAssertion("Advanced");
    }


    @Test(description = "designing")
    public static void programmingResource()  {
        programming();
    }


}
