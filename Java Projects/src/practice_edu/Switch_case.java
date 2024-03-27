package practice_edu;

import java.util.Scanner;

public class Switch_case {    
    public static void main(String[] args) {    
            
              int ch;
              Scanner sc = new Scanner(System.in);
              ch = sc.nextInt();
              switch(ch) {
                  
                  case 1:
                  System.out.println("mon");
                  break;
                  case 2:
                  System.out.println("Tues");
                  break;
                  case 3:
                  System.out.println("wed");
                  break;
                  case 4:
                  System.out.println("Thu");
                  break;
                  case 5:
                  System.out.println("Fri");
                  break;
                  case 6:
                  System.out.println("Sat");
                  break;
                      
                // default case
                default:
                  System.out.println("Invalid");
              }
            }
    }    
