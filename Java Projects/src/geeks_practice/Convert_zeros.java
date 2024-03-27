package geeks_practice;
import java.util.*;
import java.util.Scanner;
public class Convert_zeros {
    public static void main(String[] args) {
        int a = 1004;
        //String s= String.valueOf(a);// for int to string conversion
        //-----or------------------//
        String s = Integer.toString(a);// for int to string conversion
        for(int i=0;i<s.length();i++){
           s= s.replace("0","5");
        }
        int res = Integer.parseInt(s);// to Integer conversion
        System.out.println(res);
    }
}
