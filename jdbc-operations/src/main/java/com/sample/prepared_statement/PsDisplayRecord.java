package com.sample.prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PsDisplayRecord {
    public static void main(String[] args) throws Exception {

        int sid;
		String sname;
		int sage;
		String sgen;
		long ph;

        String url="jdbc:mysql://localhost:3306/firstdb";
        String un = "root";
        String pass="Kesava1@";

        // Load the driver.
        String driver = "com.mysql.cj.jdbc.Driver";
        Class.forName(driver);

        // make the connection.
        Connection conn = DriverManager.getConnection(url, un, pass);
        if(conn!=null){
            System.out.println("database connection successful");

            //retrieve the records
        	String sel="select * from student";
            PreparedStatement pst = conn.prepareStatement(sel);
        	ResultSet rs= pst.executeQuery();
        	
        	System.out.println("SID\tSNAME\tSAGE\tGen\tph");
        	while(rs.next()) {
        		sid=rs.getInt(1); //or sid=rs.getInt("sid");
        		sname=rs.getString(2);  //or sname=rs.getString("sname");
        		sage=rs.getInt(3);  //or sage=rs.getString("sage");
        		sgen=rs.getString(4);  //or sgen=rs.getString("sgen");
        		ph=rs.getLong(5); //ph=rs.getLong("sphone");
        		System.out.println(sid+"\t"+sname+"\t"+sage+"\t"+sgen+"\t"+ph);
            }
        }
        else{
            System.out.println("not connected");
        }
    }
}
