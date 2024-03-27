package practice_edu;

import java.util.Scanner;

import java.util.Scanner;

// class car{
//     int u = (36*1000)/3600;
//     int a=5;
//     void travel(int t[]){
//         for(int i=0;i<t.length;i++){
//             int res = (u*t[i])+((a*t[i]*t[i])/2);
//             System.out.println(res);
//         }
//     }
// }

// public class Distance {

   
//     public static void main(String[] args) {

//         int t[]= new int[2];
//         Scanner sc = new Scanner(System.in);
//         car obj = new car();
//         for(int i=0;i<=1;i++){
//              t[i]=sc.nextInt();
//         }
       
//            obj.travel(t);
//     }
// }







//-------------------------------------------------------


// public class Distance {

   
//     public static void main(String[] args) {
//         int test=0; 
//         int t[]= new int[2];
//         Scanner sc = new Scanner(System.in);
//         for(int i=0;i<=1;i++){
//              t[i]=sc.nextInt();
//         }
//        while(test!=2){
//             int u = (36*1000)/3600;
//             int a=5;
//             int res = (u*t[test])+((a*t[test]*t[test])/2);
//             System.out.println(res);
//             test++;
//        }
//     }
// }




// public class Distance {

    
//     static void travel(int t[],int u,int a){
        
//         for(int i=0;i<t.length;i++){
//             int res = (u*t[i])+((a*t[i]*t[i])/2);
//             System.out.println(res);
//         }
//     }
   
//     public static void main(String[] args) {

//         int u = (36*1000)/3600;
//         int a=5;
//         int t[]= new int[2];
//         Scanner sc = new Scanner(System.in);
//         for(int i=0;i<=1;i++){
//              t[i]=sc.nextInt();
//         }
       
//         travel(t,u,a);
//     }
// }




public class Distance {

   
    public static void main(String[] args) {
        int test=0; 
        int t[]= new int[2];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=1;i++){
             t[i]=sc.nextInt();
        }
       while(test!=2){
            double u = (36*1000)/3600;
            double a=5;
            double res = (u*t[test])+((a*t[test]*t[test])/2);
            System.out.println((int)res);
            test++;
       }
    }
}