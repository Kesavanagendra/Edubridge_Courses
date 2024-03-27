package com.sample.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecord {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String username;
        String password;

        int id;
        String name,email;
        int age;
        float salary;
        long phone;

        String url="jdbc:mysql://localhost:3306/firstdb";
        String un = "root";
        String pass="Kesava1@";
        
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url,un,pass);
        Statement st = conn.createStatement();

        Scanner sc= new Scanner(System.in);
            System.out.println("enter name to delete");
            name=sc.next();
            
            String sql="select * from employee where ename = '"+name+"'";
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                sql = "Delete from employee where ename = '"+name+"'"; 
               int i=st.executeUpdate(sql);
    
                if(i>0){
                    System.out.println("Employee deleted successfully");
                }
                else{
                    System.out.println("not deleted");
                }
            }
            else{
                System.out.println("data not exist");
            }
    }
}
