package com.programming.empapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static Connection con;
    public static Connection CreateDBConnection() {
        try {
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //get connection
            String url = "jdbc:mysql://localhost:3307/employeeDB?useSSL=false";
            String username = "root";
            String password = "Root3307@-12";
            con = DriverManager.getConnection(url,username,password);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    return con;
    }
}
