package TestCases;

import general.BaseTest;
import org.testng.annotations.Test;

import static object.Task6C1Objects.*;
import static general.CommonAssertions.*;

public class Task6C1 extends BaseTest {

    @Test(description = "designing")
    public static void designingResource()  {
        System.out.println("starting designing test case");
        designing();
        BeginnerAssertion("Beginner");
        IntermediateAssertion("Intermediate");
        AdvancedAssertion("Advanced");
        System.out.println("ending designing test case");
    }


    @Test(description = "designing")
    public static void programmingResource()  {
        System.out.println("starting programming test case");
        programming();
        System.out.println("ending designing test case");
    }


}
