package geeks_practice;
import java.util.*;
import java.util.Scanner;
public class Substring
{
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            int L = sc.nextInt();
            int R = sc.nextInt();
            String s = "cdbkdub";
            System.out.println(s.substring(L, R+1));
            //-----------Another problem---------
            // String s="kes";
            // String s2 ="ava";
            // String s3=s+s2;
            // System.out.println(s3);
            // StringBuffer sb = new StringBuffer();
            // sb.append(s3);
            // sb.reverse();
            // System.out.println(sb);
        }
    }
}

//-------------Another method------------------


// import java.util.*;
// import java.util.Scanner;
// public class Substring {
//     public StringBuffer javasub(String s, int L,int R)
//     {   
//        StringBuffer sb =new StringBuffer(" ");
//         for(int i=L;i<=R;i++)
//         {
//             char c = (s.charAt(i));
//              sb.append(c);
//         }
//         return sb;
//     }
//     public static void main(String[] args) {
//         String s = "cdbkdub";
//         Substring obj = new Substring();
//         Scanner sc = new Scanner(System.in);
//         int L = sc.nextInt();
//         int R = sc.nextInt();
//         System.out.println(obj.javasub(s,L,R));   
//     }
// }


//------------------------------Another method------------------------------------

// import java.util.*;
// import java.util.Scanner;
// public class Substring {

//     public String javasub(String s, int L,int R)
//     {   
//        String sb =new String(" ");
//         for(int i=L;i<=R;i++)
//         {
//             char c = (s.charAt(i));
//              sb=sb+c;
//         }
//         return sb;
//     }
//     public static void main(String[] args) {
//         String s = "cdbkdub";
//         Substring obj = new Substring();
//         Scanner sc = new Scanner(System.in);
//         int L = sc.nextInt();
//         int R = sc.nextInt();
//         System.out.println(obj.javasub(s,L,R));   
//     }
// }
