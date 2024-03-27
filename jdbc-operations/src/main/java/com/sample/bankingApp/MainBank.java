package com.sample.bankingApp;

import java.sql.SQLException;
import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) throws SQLException {

        Scanner sc = new Scanner(System.in);

        while(true){
        
            System.out.println("Enter your choice");
            System.out.println("1. Create Account");
            System.out.println("2. Login into Account");
            System.out.println("3. Exit");
            System.out.println("+--------------------------------------------------+");
            
            int ch = sc.nextInt();
            switch(ch){
                case 1: BankOperations.createAccount();
                break;

                case 2: BankOperations.loginAccount();
                break;
                case 3:System.out.println("Thank you  for using");
                       System.exit(0);
                default:System.out.println("Choose Option Correctly");
                break;
                
            }
            System.out.println("Enter Y for continue and N for exit");
            String c = sc.next();
            if(c.equalsIgnoreCase("y")){
                System.out.println("+-----------------------------------+");
                continue;
            }
            else{
                break;
            }

        }
    } 
}


