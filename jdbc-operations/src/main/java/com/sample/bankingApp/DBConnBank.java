package com.sample.bankingApp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnBank {
    
    static String url;
    static String un;
    static String pw;
    static String driver;
    static Connection conn;

    public static Connection getConnection(){

        driver = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/bankdb";
        un = "root";
        pw = "Kesava1@";

        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, un, pw);
            if(conn!=null){
                System.out.println("connected sucessfully");
            }

        }
        catch(Exception e){
            System.out.println("not connected");
            e.printStackTrace();
        }
        return conn;
    }
}







