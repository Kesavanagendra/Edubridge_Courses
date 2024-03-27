package com.sample.prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PsDeleteRecord {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        int id;
		String name,email;
		int age;
		float salary;
		long phone;

        String url = "jdbc:mysql://localhost:3306/firstdb";
        String un = "root";
        String pass="Kesava1@"; 

        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, un, pass);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter id to delete");
        id= sc.nextInt();

        String sql = "select * from employee where eid =?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,id);
        ResultSet rs = pst.executeQuery();

        if(rs.next()){
            sql = "delete from employee where eid =?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            int i= pst.executeUpdate();
            if(i>0){
                System.out.println("Deleted successfully");
            }
            else{
                System.out.println("not Deleted");
            }

        }
        else{
            System.out.println("DATA NOT EXIST");
        }

    }
}
