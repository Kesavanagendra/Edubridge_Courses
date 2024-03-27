package practice_edu;

import java.util.Scanner;

public class Even_odd_switchcase {    
    public static void main(String[] args) {    
            
              int ch;
              Scanner sc = new Scanner(System.in);
              ch = sc.nextInt();
              switch(ch%2) {
                  
                  case 0:
                  System.out.println("even");
                  break;
                  default:
                  System.out.println("odd");
                  break;
                 
              }
            }
    }    

