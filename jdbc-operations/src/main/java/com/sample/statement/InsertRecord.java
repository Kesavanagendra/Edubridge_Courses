package com.sample.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecord {
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
            System.out.println("enter id");
            id=sc.nextInt();
            System.out.println("enter name");
            name=sc.next();
            System.out.println("enter age");
            age = sc.nextInt();
            System.out.println("enter emai");
            email = sc.next();
            System.out.println("enter salary");
            salary = sc.nextFloat();
            System.out.println("enter phone no");
            phone = sc.nextLong();
            
            String sql="select * from employee where eid = "+id;
            ResultSet rs = st.executeQuery(sql);
            if(!rs.next()){
                sql = "insert into employee values("+id+",'"+name+"',"+age+",'"+email+"',"+salary+","+phone +")";
               int i=st.executeUpdate(sql);
    
                if(i>0){
                    System.out.println("Employee inserted successfully");
                }
                else{
                    System.out.println("not inserted");
                }
            }

    }
}
