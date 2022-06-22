package general;

import config.ProjectProperties;

import java.io.IOException;

public class EnvGlobals {
    public static ProjectProperties p = new ProjectProperties();
    public static String password = p.GetProperties("password");
    public static String passwordinv =  p.GetProperties("passwordinv");
    public static String URL = p.GetProperties("URL");

    public static String username = p.GetProperties("username");
    public static String usernameinv = p.GetProperties("usernameinv");

    public static String dbhost = p.GetProperties("dbhost");
    public static String dbUser = p.GetProperties("dbUser");
    public static String dbPassword = p.GetProperties("dbPassword");

    public static String RunBrowser = p.GetProperties("RunBrowser");

    //Form
    public static String firstName = p.GetProperties("firstName");
    public static String lastName = p.GetProperties("lastName");
    public static String company = p.GetProperties("company");
    public static String bizEmail = p.GetProperties("bizEmail");
    public static String phone = p.GetProperties("phone");
    public static String howDidYouHear = p.GetProperties("howDidYouHear");
    public static String comments = p.GetProperties("comments");








}


