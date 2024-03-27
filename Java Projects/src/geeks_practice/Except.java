package geeks_practice;
import java.util.*;
import java.util.Scanner;
public class Except {
    public static void main(String[] args) {
        Except obj =new Except();
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int res;
         
        //System.out.println(res);
         try{
             res =a/b;
             System.out.println(res);
         }
         catch(Exception e){
                System.out.println("Arithmetic exception");
         }
         
         
    }
}
