package com.sample.JdbcOperationsExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnections {

    private static String driver;
    public static String un;
    public static String pass;
    public static String url;
    private static Connection conn=null;
    
    public static Connection getConnection() throws SQLException{

        driver = "com.mysql.cj.jdbc.Driver";
        url="jdbc:mysql://localhost:3306/firstdb";
        un="root";
        pass="Kesava1@";

        try{
                Class.forName(driver);
                conn = DriverManager.getConnection(url, un, pass);
        }
        catch(Exception e){
            System.out.println("not connected");
            e.printStackTrace();
        }
        
        return conn;
    }
}
