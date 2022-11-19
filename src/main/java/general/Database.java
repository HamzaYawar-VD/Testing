package general;

import  java.sql.Connection;
import  java.sql.Statement;
import  java.sql.ResultSet;
import  java.sql.DriverManager;
import  java.sql.SQLException;

import static general.BaseTest.query;

public class Database {
    public static void  main(String[] args) throws  ClassNotFoundException, SQLException {

        dbjob();
    }

        public static void dbjob() throws SQLException, ClassNotFoundException {
            //Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
            String dbUrl = "jdbc:mysql://sonar-metrics.c87wxijx5ezi.us-east-1.rds.amazonaws.com:3306/sonardb";
            //Database Username
            String username = "sonardb_sarosh_user";
            //Database Password
            String password = "WGWi0IIIIi0IdUOY4GWUOkY";
            //Query to Execute
            String query = "SELECT * FROM `sonardb`.`automation_report`;";
            //Load mysql jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Create Connection to DB
            Connection con = DriverManager.getConnection("jdbc:mysql://sonar-metrics.c87wxijx5ezi.us-east-1.rds.amazonaws.com:3306/sonardb", "sonardb_sarosh_user", "WGWi0IIIIi0IdUOY4GWUOkY");

            //Create Statement Object
            Statement stmt = con.createStatement();

            // Execute the SQL Query. Store results in ResultSet
            ResultSet rs = stmt.executeQuery(query);

            // While Loop to iterate through all data and print results
            while (rs.next()) {
                String myName = rs.getString(1);
                String myAge = rs.getString(2);
                System.out.println(myName + "  " + myAge);
            }
            // closing DB Connection
            con.close();
        }



}