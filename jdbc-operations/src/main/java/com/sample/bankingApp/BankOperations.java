// package com.sample.bankingApp;

// import java.math.BigInteger;
// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;
// import java.util.Scanner;

// public class BankOperations {

//     private static Connection conn;
//     static Statement st;
//     static PreparedStatement pst;
//     static ResultSet rs,rs1;
//     static String sql;
//     static int i;
    
//     static String name;
//     static String accno;
//     static int password;
//     static float balance;
   
//     static Scanner sc = new Scanner(System.in);

//     public static void createAccount() throws SQLException {
//         conn = DBConnBank.getConnection();

//         System.out.println("Enter your name");
//         name = sc.nextLine();
//         System.out.println("Enter your account number for account create");
//         accno = sc.next();
//         System.out.println("Generate your password by entering");
//         password = sc.nextInt();

//         try{
                
//             if(accno.length()==11){
//                 sql = "select uaccno from userlogin where uaccno = "+ accno;
//                 st = conn.createStatement();
//                 rs = st.executeQuery(sql);
//                 if(!rs.next()){
//                     sql =  "insert into userlogin(uname,uaccno,upassword) values('"+name+"',"+accno+","+password+")";
//                     i = st.executeUpdate(sql);

//                     if(i>0){
//                         System.out.println("Account created successfully");
//                     }
//                     else{
//                         System.out.println("Account not created");
//                     }
//                 }
//                 else{
//                     System.out.println("Already existed with this account number");
//                 }
//             }
//             else{
//                 System.out.println("Account number must be 11 didgits");
//             }
            
//         }
//         catch(Exception e){
//             e.printStackTrace();
//         }
        
//     }

//     public static void loginAccount() throws SQLException {
    
//         try{

//             conn = DBConnBank.getConnection();

//             System.out.println("Enter Account number to login");
//             accno = sc.next();
//             System.out.println("Enter your Password to login");
//             password = sc.nextInt();

//             sql = "select * from userlogin where uaccno =?"; 
//             pst = conn.prepareStatement(sql);
//             pst.setString(1, accno);
//             rs = pst.executeQuery();

//             if(rs.next()){

//                 int org_password = rs.getInt("upassword");
//                 if(org_password == password){

//                     name = rs.getString("uname");
//                     System.out.println("+--------------------------------------------------+");
//                     System.out.println("Login successfully");
//                     System.out.println();
//                     System.out.println("Welcome "+name);
//                     System.out.println();
//                     System.out.println("+--------------------------------------------------+");

//                     while(true){

                    
//                         System.out.println("Enter your choice");
//                         System.out.println("1.Deposit");
//                         System.out.println("2.Withdraw");
//                         System.out.println("3.Fund Transfer");
//                         System.out.println("4.view Balance");
//                         System.out.println("5.MiniStatement");
//                         System.out.println("6.Update Profile");
//                         System.out.println("7.Exit");
//                         System.out.println("+--------------------------------------------------+");
                        
//                         int ch = sc.nextInt();

//                         switch(ch){
//                             case 1: BankOperations.deposit();
//                             break;
//                             case 2: BankOperations.withdraw();
//                             break;
//                             case 3: BankOperations.fund_Transfer();
//                             break;
//                             case 4: BankOperations.view_Balance();
//                             break;
//                             case 5: BankOperations.MiniStatement();
//                             break;
//                             case 6: BankOperations.updateProfile();
//                             break;
//                             case 7:System.out.println("Thank you for using Application");
//                                 System.exit(0);
//                             default: System.out.println("Choose Option Correctly");
//                             break;

//                         }
//                         System.out.println("Enter Y for continue and N for exit");
//                         String choice = sc.next();
//                         if(choice.equalsIgnoreCase("Y")){
//                             System.out.println("+-----------------------------------+");
//                             continue;
//                         }
//                         else{
//                             System.exit(0);
//                         }
//                     }
//                 }
//                 else{
//                     System.out.println("Password is wrong");
//                 }

//             }
//             else{
//                 System.out.println("Account not there, created your account");
//             }
//         }
//         catch(Exception e){
//             e.printStackTrace();
//         }
//     }

    

    

//     private static void deposit() throws SQLException {
//         System.out.println("Enter Amount to deposit");
//         int amount = sc.nextInt();
    
//         try{
//             if(amount<0){
//                 System.out.println("Enter amount greater than 0 ");
//             }
//             else{
//                 sql = "update userlogin set balance = balance+? where uaccno ="+accno;
//                 pst = conn.prepareStatement(sql);
//                 pst.setInt(1,amount);
//                 i=pst.executeUpdate(); 

//                 if(i>0){
//                     System.out.println("Amount Rs: "+amount+" deposited Sucessfully");
//                 }
//                 else{
//                     System.out.println("Not Deposited");
//                 }
//             }
//         }
//         catch(Exception e){
//             e.printStackTrace();
//         }
//     }

//     private static void withdraw() {
        
//         System.out.println("Enter Amount to Withdraw");
//         int amount = sc.nextInt();
//         try{
//             sql = "select * from userlogin where uaccno="+accno;
//             pst = conn.prepareStatement(sql);
//             rs = pst.executeQuery();
//             if(rs.next()){
//                 if(rs.getFloat("balance")-amount >= 0){

//                     sql = "update userlogin set balance = balance-? where uaccno ="+accno;
//                     pst = conn.prepareStatement(sql);
//                     pst.setInt(1,amount);
//                     i=pst.executeUpdate(); 

//                     if(i>0){
//                         System.out.println("Amount Rs: "+amount+" Withdraw Sucessfully");
//                     }
//                     else{
//                         System.out.println("Withdraw failure");
//                     }
//                 }
//                 else{
//                     System.out.println("Insufficient Balance in your account");
//                 }
//             }
            
//         }
//         catch(Exception e){
//             e.printStackTrace();
//         }
//     }

//     private static void fund_Transfer() throws SQLException {

//         try{

//             System.out.println("Enter Receiver Account number");
//             String rec_accno1 = sc.next();
//             System.out.println("Enter amount to Transfer");
//             int amount = sc.nextInt();

//             BigInteger rec_accno = new BigInteger(rec_accno1);

//             //For setting receiver details
//             sql = "select * from userlogin where uaccno ="+rec_accno;
//             st = conn.createStatement();
//             ResultSet rec = st.executeQuery(sql);
            
//             //for getting user details
//             BigInteger send_accno = new BigInteger(accno);
//             sql ="select * from userlogin where uaccno ="+send_accno;
//             st = conn.createStatement();
//             ResultSet send = st.executeQuery(sql);
            
//             if(send.next() && rec.next()){
//                 if(send.getInt("balance")-amount >= 0){

//                     //debited operation
//                     BigInteger sender_accno = new BigInteger(send.getString("uaccno"));
//                     sql = "update userlogin set balance = balance-? where uaccno ="+sender_accno;
//                     pst = conn.prepareStatement(sql);
//                     pst.setInt(1,amount);
//                     int l = pst.executeUpdate();
                    
//                     //credited operation
//                     sql = "update userlogin set balance = balance+? where uaccno ="+rec_accno;
//                     pst = conn.prepareStatement(sql);
//                     pst.setInt(1,amount);
//                     int m = pst.executeUpdate();

//                     if(l>0 && m>0){
//                         System.out.println("Amount Rs: "+amount+" transfer Successfully");
//                     }
//                     else{
//                         System.out.println("Transaction failure");
//                     }
                    
//                 }
//                 else{
//                     System.out.println("Insufficient balance in your account");
//                 }

//             }
//             else{
//                 System.out.println("There is no account with this number to receive");
//             }
//         }
//         catch(Exception e){
//             e.printStackTrace();
//         }
//     }

//     private static void view_Balance() throws SQLException {

//         try{
//             sql = "select * from userlogin where uaccno = "+accno;
//             st = conn.createStatement();
//             rs = st.executeQuery(sql);
//             while(rs.next()){

//                 name = rs.getString("uname");
//                 accno = rs.getString("uaccno");
//                 balance = rs.getFloat("balance");

//                 System.out.println("name :"+name);
//                 System.out.println("accno :"+accno);
//                 System.out.println("Available Balance Rs: "+balance);
//             }
//         }
//         catch(Exception e){
//             e.printStackTrace();
//         }
//     }

//     private static void MiniStatement() throws SQLException {

//         try{
//             sql = "select * from trans_history where uaccno = "+BigInteger.valueOf(Long.parseLong(accno));
//             st = conn.createStatement();
//             rs = st.executeQuery(sql);

//             System.out.println("name\t                  accno\t                action\t                   balance\t            date_time");

//             while(rs.next()){

//                 name = rs.getString("uname");
//                 accno = rs.getString("uaccno");
//                 String action = rs.getString("action");
//                 balance = rs.getFloat("balance");
//                 String date = rs.getString("date_time");

//                 System.out.println(name+"\t         "+accno+"\t         "+action+"\t            "+balance+"\t           "+date);
//             }
//         }
//         catch(Exception e){
//             e.printStackTrace();        
//         }
//     }

//     private static void updateProfile() throws SQLException {
//         System.out.println("Enter new password to change");
//         String pass1 = sc.next();
//         BigInteger pass = new BigInteger(pass1);

//         sql = "update userlogin set upassword ='"+pass+"' where uaccno ="+accno;
//         st = conn.createStatement();
//         i = st.executeUpdate(sql);

//         if(i>0){
//             System.out.println("password updated Successfully");
//         }
//         else{
//             System.out.println("Password not changed");
//         }
        
//     }
// }









package com.sample.bankingApp;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BankOperations {

    private static Connection conn;
    static Statement st;
    static PreparedStatement pst;
    static ResultSet rs,rs1;
    static String sql;
    static int i;
    
    static String name;
    static String accno;
    static int password;
    static float balance;
   
    static Scanner sc = new Scanner(System.in);

    public static void createAccount() throws SQLException {
        conn = DBConnBank.getConnection();

        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your account number for account create");
        accno = sc.next();
        System.out.println("Generate your password by entering");
        password = sc.nextInt();

        try{
                
            if(accno.length()==11){
                sql = "select uaccno from userlogin where uaccno = "+ accno;
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                if(!rs.next()){
                    sql =  "insert into userlogin(uname,uaccno,upassword) values('"+name+"',"+accno+","+password+")";
                    i = st.executeUpdate(sql);

                    if(i>0){
                        System.out.println("Account created successfully");
                    }
                    else{
                        System.out.println("Account not created");
                    }
                }
                else{
                    System.out.println("Already existed with this account number");
                }
            }
            else{
                System.out.println("Account number must be 11 didgits");
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }

    public static void loginAccount() throws SQLException {
    
        try{

            conn = DBConnBank.getConnection();

            System.out.println("Enter Account number to login");
            accno = sc.next();
            System.out.println("Enter your Password to login");
            password = sc.nextInt();

            sql = "select * from userlogin where uaccno =?"; 
            pst = conn.prepareStatement(sql);
            pst.setString(1, accno);
            rs = pst.executeQuery();

            if(rs.next()){

                int org_password = rs.getInt("upassword");
                if(org_password == password){

                    name = rs.getString("uname");
                    System.out.println("+--------------------------------------------------+");
                    System.out.println("Login successfully");
                    System.out.println();
                    System.out.println("Welcome "+name);
                    System.out.println();
                    System.out.println("+--------------------------------------------------+");

                    while(true){

                    
                        System.out.println("Enter your choice");
                        System.out.println("1.Deposit");
                        System.out.println("2.Withdraw");
                        System.out.println("3.Fund Transfer");
                        System.out.println("4.view Balance");
                        System.out.println("5.MiniStatement");
                        System.out.println("6.Update Profile");
                        System.out.println("7.Exit");
                        System.out.println("+--------------------------------------------------+");
                        
                        int ch = sc.nextInt();

                        switch(ch){
                            case 1: BankOperations.deposit();
                            break;
                            case 2: BankOperations.withdraw();
                            break;
                            case 3: BankOperations.fund_Transfer();
                            break;
                            case 4: BankOperations.view_Balance();
                            break;
                            case 5: BankOperations.MiniStatement();
                            break;
                            case 6: BankOperations.updateProfile();
                            break;
                            case 7:System.out.println("Thank you for using");
                                System.exit(0);
                            default: System.out.println("Choose Option Correctly");
                            break;

                        }
                        System.out.println("Enter Y for continue and N for exit");
                        String choice = sc.next();
                        if(choice.equalsIgnoreCase("Y")){
                            System.out.println("+-----------------------------------+");
                            continue;
                        }
                        else{
                            System.exit(0);
                        }
                    }
                }
                else{
                    System.out.println("Password is wrong");
                }

            }
            else{
                System.out.println("Account not there, created your account");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    

    

    private static void deposit() throws SQLException {
        System.out.println("Enter Amount to deposit");
        int amount = sc.nextInt();
    
        try{
            if(amount<0){
                System.out.println("Enter amount greater than 0 ");
            }
            else{
                sql = "update userlogin set balance = balance+? where uaccno ="+accno;
                pst = conn.prepareStatement(sql);
                pst.setInt(1,amount);
                i=pst.executeUpdate(); 

                if(i>0){
                    System.out.println("Amount Rs: "+amount+" deposited Sucessfully");
                }
                else{
                    System.out.println("Not Deposited");
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void withdraw() {
        
        System.out.println("Enter Amount to Withdraw");
        int amount = sc.nextInt();
        try{
            sql = "select * from userlogin where uaccno="+accno;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                if(rs.getFloat("balance")-amount >= 0){

                    sql = "update userlogin set balance = balance-? where uaccno ="+accno;
                    pst = conn.prepareStatement(sql);
                    pst.setInt(1,amount);
                    i=pst.executeUpdate(); 

                    if(i>0){
                        System.out.println("Amount Rs: "+amount+" Withdraw Sucessfully");
                    }
                    else{
                        System.out.println("Withdraw failure");
                    }
                }
                else{
                    System.out.println("Insufficient Balance in your account");
                }
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void fund_Transfer() throws SQLException {

        try{

            System.out.println("Enter Receiver Account number");
            // String rec_accno1 = sc.next();
            String rec_accno = sc.next();
            System.out.println("Enter amount to Transfer");
            int amount = sc.nextInt();

            // BigInteger rec_accno = new BigInteger(rec_accno1);

            //For setting receiver details
            sql = "select * from userlogin where uaccno ="+rec_accno;
            st = conn.createStatement();
            ResultSet rec = st.executeQuery(sql);
            
            //for getting user details
            BigInteger send_accno = new BigInteger(accno);
            sql ="select * from userlogin where uaccno ="+send_accno;
            st = conn.createStatement();
            ResultSet send = st.executeQuery(sql);
            
            if(send.next() && rec.next()){
                if(send.getInt("balance")-amount >= 0){

                    //debited operation
                    BigInteger sender_accno = new BigInteger(send.getString("uaccno"));
                    sql = "update userlogin set balance = balance-? where uaccno ="+sender_accno;
                    pst = conn.prepareStatement(sql);
                    pst.setInt(1,amount);
                    int l = pst.executeUpdate();
                    
                    //credited operation
                    sql = "update userlogin set balance = balance+? where uaccno ="+rec_accno;
                    pst = conn.prepareStatement(sql);
                    pst.setInt(1,amount);
                    int m = pst.executeUpdate();

                    if(l>0 && m>0){
                        System.out.println("Amount Rs: "+amount+" transfer Successfully");
                    }
                    else{
                        System.out.println("Transaction failure");
                    }
                    
                }
                else{
                    System.out.println("Insufficient balance in your account");
                }

            }
            else{
                System.out.println("There is no account with this number to receive");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void view_Balance() throws SQLException {

        try{
            sql = "select * from userlogin where uaccno = "+accno;
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){

                name = rs.getString("uname");
                accno = rs.getString("uaccno");
                balance = rs.getFloat("balance");

                System.out.println("name :"+name);
                System.out.println("accno :"+accno);
                System.out.println("Available Balance Rs: "+balance);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    private static void MiniStatement() throws SQLException {

        try{

            System.out.println("Enter Start date");
            String start_date = sc.next();
            System.out.println("Enter End date");
            String end_date = sc.next();
            // sql = "select * from trans_history where uaccno = "+BigInteger.valueOf(Long.parseLong(accno));
            sql = "select * from trans_history where uaccno = ? and date_time between ? and ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, accno);
            pst.setString(2, start_date);
            pst.setString(3, end_date);
            rs = pst.executeQuery();

            System.out.println("name\t                  accno\t                action\t                   balance\t            date_time");

            while(rs.next()){

                    name = rs.getString("uname");
                    accno = rs.getString("uaccno");
                    String action = rs.getString("action");
                    balance = rs.getFloat("balance");
                    String date = rs.getString("date_time");
    
                    System.out.println(name+"\t         "+accno+"\t         "+action+"\t            "+balance+"\t           "+date);
                
            }
        }
        catch(Exception e){
            e.printStackTrace();        
        }
    }

    private static void updateProfile() throws SQLException {
        System.out.println("Enter new password to change");
        String pass1 = sc.next();
        BigInteger pass = new BigInteger(pass1);

        sql = "update userlogin set upassword ='"+pass+"' where uaccno ="+accno;
        st = conn.createStatement();
        i = st.executeUpdate(sql);

        if(i>0){
            System.out.println("password updated Successfully");
        }
        else{
            System.out.println("Password not changed");
        }
        
    }
}





