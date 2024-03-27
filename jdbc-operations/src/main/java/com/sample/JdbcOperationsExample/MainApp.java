package com.sample.JdbcOperationsExample;

import java.sql.SQLException;
import java.util.Scanner;

public class MainApp 
{
    public static void main( String[] args ) throws SQLException
    {
        int ch;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("please enter your choice");
            System.out.println();
            System.out.println("1. display employee");
            System.out.println("2. Add employee");
            System.out.println("3.Delete employee");
            System.out.println("4.Update employee");

            ch = sc.nextInt();
            switch(ch){
                case 1: JdbcOperations.displayEmployees();
                break;
                case 2: JdbcOperations.AddEmployee();
                break;
                case 3: JdbcOperations.DeleteEmployee();
                break;
                case 4: JdbcOperations.updateEmployee();
                break;
                default: System.out.println("choose from above options");
                break;
            }

            System.out.println("Enter Y to continue and any button to exit");
            String choice = sc.next();
            if(choice.equalsIgnoreCase("Y")){
                continue;
            }
            else{
                break;
            }
            
        }

    }
}
