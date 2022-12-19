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
            String dbUrl = "";
            //Database Username
            String username = "";
            //Database Password
            String password = "";
            //Query to Execute
            String query = "SELECT * FROM `sonardb`.`automation_report`;";
            String query_db = "INSERT INTO `sonardb`.`automation_report` (`Project_Name`, `Platform`, `Build`, `Environment`, `Component_id`, `Commit_Number`, `Branch_Name`, `Execution_Date` , `Total_Cases`, `Passed`, `Failed`, `Skipped`, `Execution_Start_Time`, `Execution_End_Time`, `Coverage`, `IsCoverageFromTestRail`, `Repository_Name`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            //Load mysql jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Create Connection to DB
            Connection con = DriverManager.getConnection("", "", "");

            //Create Statement Object
            Statement stmt = con.createStatement();

            // Execute the SQL Query. Store results in ResultSet
            ResultSet rs = stmt.executeQuery(query);
//            stmt.executeQuery(query_db);

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
