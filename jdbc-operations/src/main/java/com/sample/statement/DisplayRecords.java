package com.sample.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayRecords {
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
        	Statement st=conn.createStatement();
        	ResultSet rs= st.executeQuery(sel);
        	
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















// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;

// public class RetrieveRecords {
// 	public static void main(String[] args) {
// 		String un,pass;
// 		//load the driver
// 		try{
// 		    Class.forName("com.mysql.cj.jdbc.Driver");
		
// 		//Make the connection
// 		    System.out.println("main");
//             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb", "root", "Kesava1@");
//             System.out.println(con);
//             if(con!=null) {
//             //create statement to execute query
//             Statement st=con.createStatement();

//             String sel="select * from login";
//             ResultSet rs = st.executeQuery(sel);

//             System.out.println("username\tpassword");
            
//             while(rs.next()){
//                 //   un=rs.getString("username"); 
//                 //   pass=rs.getString("password");

//                 un=rs.getString(1); 
//                 pass=rs.getString(2);
//                 System.out.println(un+"\t"+pass);
//             }
//         }
//         }catch(Exception e) {
//             System.out.println("Connection is not available");
//             e.printStackTrace();
//         }
// 	}

// }

