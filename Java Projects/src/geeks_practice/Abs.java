package geeks_practice;
import java.util.*;
import java.util.Scanner;
abstract class A {
    int prod;
    abstract void m1(int p,int q);
    void m2(){
        System.out.println(prod);
    }
}
class B extends  A{
    void m1(int p,int q){
        System.out.println( "product  is "+ p*q);
    }
}
public class Abs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //A obj = new B();
        //-----or-----
        B obj = new B();
        int p=sc.nextInt();
        int q=sc.nextInt();
        obj.m1(p,q);
        
    }
}
    

