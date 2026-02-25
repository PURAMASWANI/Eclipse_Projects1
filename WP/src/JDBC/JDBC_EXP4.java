package JDBC;

import java.sql.*;

public class JDBC_EXP4 {
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "Aswani@10");

            // Create a statement to call the stored procedure
            CallableStatement cs = con.prepareCall("{call GetAllEmployees()}");

            // Execute the query
            ResultSet rs = cs.executeQuery();

            // Process the result set
            while (rs.next()) {
                System.out.println(rs.getInt("employee_id") + " - " + rs.getString("First_Name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
