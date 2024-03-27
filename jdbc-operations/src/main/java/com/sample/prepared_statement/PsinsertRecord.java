package com.sample.prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PsinsertRecord {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

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

            Scanner sc = new Scanner(System.in);
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
            
            
            String sql="select * from employee where eid = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1,id);
            ResultSet rs = pst.executeQuery();
            if(!rs.next()){
                sql = "insert into employee values(?,?,?,?,?,?)";

                pst = conn.prepareStatement(sql);
                pst.setInt(1,id);
                pst.setString(2,name);
                pst.setInt(3,age);
                pst.setString(4, email);
                pst.setFloat(5, salary);
                pst.setLong(6, phone);
               
               int i=pst.executeUpdate();
    
                if(i>0){
                    System.out.println("Employee inserted successfully");
                }
                else{
                    System.out.println("not inserted");
                }
            }

    }
}







// package com.sample.prepared_statement;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;
// import java.util.Scanner;

// public class PsinsertRecord {

//     static String url="jdbc:mysql://localhost:3306/firstdb";
//     static String un = "root";
//     static String pass="Kesava1@";
//     private static Connection conn = null;

//     static int id;
//     static String name,email;
//     static int age;
//     static float salary;
//     static long phone;
//     static String driver = "com.mysql.cj.jdbc.Driver";

//     public static Connection getConnection() throws ClassNotFoundException, SQLException{
//         Class.forName(driver);
//         conn = DriverManager.getConnection(url,un,pass);
//         return conn;
//     }

//     private static void InsertRecord() throws ClassNotFoundException, SQLException {

//         conn = PsinsertRecord.getConnection();

//         PsinsertRecord.InputData();

//         String sql="select * from employee where eid = ?";
//         PreparedStatement pst = conn.prepareStatement(sql);
//         pst.setInt(1,id);
//         ResultSet rs = pst.executeQuery();

//         if(!rs.next()){

//             sql = "insert into employee values(?,?,?,?,?,?)";

//             pst = conn.prepareStatement(sql);
//             pst.setInt(1,id);
//             pst.setString(2,name);
//             pst.setInt(3,age);
//             pst.setString(4, email);
//             pst.setFloat(5, salary);
//             pst.setLong(6, phone);
           
//             int i=pst.executeUpdate();    
//             if(i>0){
//                 System.out.println("Employee inserted successfully");
//             }
//             else{
//                 System.out.println("not inserted");
//             }
//         }
//     }

//     private static void InputData() {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter id");
//         id=sc.nextInt();
//         System.out.println("enter name");
//         name=sc.next();
//         System.out.println("enter age");
//         age = sc.nextInt();
//         System.out.println("enter emai");
//         email = sc.next();
//         System.out.println("enter salary");
//         salary = sc.nextFloat();
//         System.out.println("enter phone no");
//         phone = sc.nextLong();

//     }


//     public static void main(String[] args) throws ClassNotFoundException, SQLException {

//         PsinsertRecord.InsertRecord();
//     }
// }
