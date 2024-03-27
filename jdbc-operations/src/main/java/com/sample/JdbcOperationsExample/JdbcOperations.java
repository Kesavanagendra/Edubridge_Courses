package com.sample.JdbcOperationsExample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcOperations {
    private static Connection conn;
    private static Statement st;
    private static ResultSet rs;
    private static String sql;

    private static int id;
    private static String name,email;
    private static int age;
    private static float salary;
    private static long phone;
    private static Scanner sc = new Scanner(System.in);
    private static int i;
    private static int ch;

    public static void displayEmployees() throws SQLException{
        conn = DatabaseConnections.getConnection();
        st = conn.createStatement();
        sql = "select * from employee";
        rs = st.executeQuery(sql);
        System.out.println("Id\tName\tage\tEmailID \tSalary\tPhone");
        while(rs.next()){
            // id = rs.getInt("eid");
            // name = rs.getString("ename");
            // email= rs.getString("eemail");
            // salary= rs.getFloat("esalary");
            // ph =  rs.getLong("ephone");

            id = rs.getInt(1);
            name = rs.getString(2);
            age = rs.getInt(3);
            email= rs.getString(4);
            salary= rs.getFloat(5);
            phone =  rs.getLong(6);
            System.out.println(id +"\t" +name+ "\t" +age+ "\t" +email+ "\t" +salary+ "\t" +phone);

        }
    }

    public static void AddEmployee() throws SQLException {

        // conn = DatabaseConnections.getConnection();
        // st = conn.createStatement();
        // sql="select max(eid) as id from employee";
        // rs = st.executeQuery(sql);
        
        // if(rs.next()){
            
        //     id = rs.getInt("id")+1;
        // }
        // System.out.println("enter name");
        // name=sc.next();
        // System.out.println("enter age");
        // age = sc.nextInt();
        // System.out.println("enter emai");
        // email = sc.next();
        // System.out.println("enter salary");
        // salary = sc.nextFloat();
        // System.out.println("enter phone no");
        // phone = sc.nextLong();

        // sql = "insert into employee values("+id+",'"+name+"',"+age+",'"+email+"',"+salary+","+phone +")";
        // i=st.executeUpdate(sql);

        // if(i>0){
        //     System.out.println("Employee inserted successfully");
        // }
        // else{
        //     System.out.println("not inserted");
        // }


        conn = DatabaseConnections.getConnection();
        st = conn.createStatement();
        System.out.println("enter id");
        id=sc.nextInt();
        System.out.println("enter name");
        name=sc.next();
        System.out.println("enter age");
        age = sc.nextInt();
        System.out.println("enter email");
        email = sc.next();
        System.out.println("enter salary");
        salary = sc.nextFloat();
        System.out.println("enter phone no");
        phone = sc.nextLong();
        
        sql="select * from employee where eid = "+id+"";
        rs = st.executeQuery(sql);
        if(!rs.next()){
            sql = "insert into employee values("+id+",'"+name+"',"+age+",'"+email+"',"+salary+","+phone +")";
            i=st.executeUpdate(sql);

            if(i>0){
                System.out.println("Employee inserted successfully");
            }
            else{
                System.out.println("not inserted");
            }
        }
        else{
            System.out.println("data already exist");
        }
        
    }

    public static void DeleteEmployee() throws SQLException {
        conn = DatabaseConnections.getConnection();
        st = conn.createStatement();

        System.out.println("select column to delete from options");
        System.out.println();
        System.out.println("1. id");
        System.out.println("2. name");
        System.out.println("3. age");
        System.out.println("4. email");
        System.out.println("5. salary");
        System.out.println("6. phone no");

        ch = sc.nextInt();
        switch(ch){
            case 1: System.out.println("enter id");
                    id=sc.nextInt();

                    sql = "select * from employee where eid =" +id;
                    rs = st.executeQuery(sql);
                    if(rs.next()){
                        sql = "delete from employee where eid =" +id;
                        i = st.executeUpdate(sql);
                        if(i>0){
                            System.out.println("deleted successfully");
                        }
                        else{
                            System.out.println("not deleted");
                        }
                    }
                    else{
                        System.out.println("not exist data");
                    }

                    break;



            case 2: System.out.println("enter name");
                    name=sc.next();

                    sql = "select * from employee where ename ='"+name+"'";
                    rs = st.executeQuery(sql);
                    if(rs.next()){
                        sql = "delete from employee where ename ='"+name+"'";
                        i = st.executeUpdate(sql);
                        if(i>0){
                            System.out.println("deleted successfully");
                        }
                        else{
                            System.out.println("not deleted");
                        }
                    }
                    else{
                        System.out.println("not exist data");
                    }

                    break;


            case 3: System.out.println("enter age");
                    age=sc.nextInt();

                    sql = "select * from employee where eage =" +age;
                    rs = st.executeQuery(sql);
                    if(rs.next()){
                        sql = "delete from employee where eid =" +age;
                        i = st.executeUpdate(sql);
                        if(i>0){
                            System.out.println("deleted successfully");
                        }
                        else{
                            System.out.println("not deleted");
                        }
                    }
                    else{
                        System.out.println("not exist data");
                    }

                    break;

            case 4: System.out.println("enter email");
                    email=sc.next();

                    sql = "select * from employee where eemail ='"+email+"'";
                    rs = st.executeQuery(sql);
                    if(rs.next()){
                        sql = "delete from employee where eemail ='"+email+"'";
                        i = st.executeUpdate(sql);
                        if(i>0){
                            System.out.println("deleted successfully");
                        }
                        else{
                            System.out.println("not deleted");
                        }
                    }
                    else{
                        System.out.println("not exist data");
                    }

                    break;


            case 5: System.out.println("enter salary");
                    salary=sc.nextFloat();

                    sql = "select * from employee where esalary =" +salary;
                    rs = st.executeQuery(sql);
                    if(rs.next()){
                        sql = "delete from employee where esalary =" +salary;
                        i = st.executeUpdate(sql);
                        if(i>0){
                            System.out.println("deleted successfully");
                        }
                        else{
                            System.out.println("not deleted");
                        }
                    }
                    else{
                        System.out.println("not exist data");
                    }

                    break;


            case 6: System.out.println("enter phone no");
                    phone=sc.nextLong();

                    sql = "select * from employee where ephone =" +phone;
                    rs = st.executeQuery(sql);
                    if(rs.next()){
                        sql = "delete from employee where ephone =" +phone;
                        i = st.executeUpdate(sql);
                        if(i>0){
                            System.out.println("deleted successfully");
                        }
                        else{
                            System.out.println("not deleted");
                        }
                    }
                    else{
                        System.out.println("not exist data");
                    }

                    break;
            default: System.out.println("chhose from above options");
            break;
            
        }
    }

    public static void updateEmployee() throws SQLException {
        conn = DatabaseConnections.getConnection();
        st = conn.createStatement();
        int upchoice;

        System.out.println("Enter your choice to update");
		System.out.println("1.To change name");
		System.out.println("2.Change Email");
		System.out.println("3.Change phone no");
		System.out.println("4.update age");
		System.out.println("5.update salary");
		
		System.out.println("Enter your choice");
		upchoice = sc.nextInt();
		
		System.out.println("Enter employee id to update");
		id = sc.nextInt();
		
		sql = "select eid from employee where eid="+id;
		rs = st.executeQuery(sql);
		
		if(rs.next()){
				
            switch(upchoice){

                case 1: 
                    System.out.println("Enter name to change");
                    name = sc.next();
                    
                    sql = "update employee set ename='"+name+"' where eid="+id;
                    i = st.executeUpdate(sql);
                    
                    if(i>0) {
                        System.out.println(name+" is changed successfully");
                    }
                    else {
                        System.out.println("name is not changed");
                    }
                    break;
                    
                case 2:System.out.println("Enter new email id");
                        email = sc.next();
                        sql = "update employee set eemail='"+email+"' where eid="+id;
                        i = st.executeUpdate(sql);
                        
                        if(i>0) {
                            System.out.println("email id is changed successfully");
                        }
                        else{
                            System.out.println("name is not changed");
                        }
                        break;

                case 3: System.out.println("Enter phone number to change");
                        phone=sc.nextLong();
                        sql = "update employee set ephone="+phone+" where eid="+id;
                        i = st.executeUpdate(sql);
                        
                        if(i>0) {
                            System.out.println("Phone no is changed");
                        }else{
                            System.out.println("Not changed");
                        }
                        break;

                case 4: System.out.println("Enter age to change");
                        age=sc.nextInt();
                        sql = "update employee set eage="+age+" where eid="+id;
                        i = st.executeUpdate(sql);
                        
                        if(i>0) {
                            System.out.println("Phone no is changed");
                        }else{
                            System.out.println("Not changed");
                        }
                        break;

                case 5: System.out.println("Enter salary to change");
                        salary=sc.nextFloat();
                        sql = "update employee set esalary="+salary+" where eid="+id;
                        i = st.executeUpdate(sql);
                        
                        if(i>0) {
                            System.out.println("Phone no is changed");
                        }else{
                            System.out.println("Not changed");
                        }
                        break;
            }
		}
		else{
			System.out.println("employee "+id +" not exists");
		}
    }
}


