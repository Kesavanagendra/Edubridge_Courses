package geeks_practice;
import java.util.*;
public class Avg{
    public static void main(String[] args)
    {
        // ArrayList<Integer> a=new ArrayList<Integer>();
        // a.addAll(Arrays.asList(new Integer[] {1,2,3,4,5}));
        int a[] = {1,2,3,4,5};
        int res=0;
        // int n=a.length();
        for(int i=0;i<5;i++)
        {
            res = res + a[i];
        }
        float avg= res/5;
        String str = String.format("%.2f",avg);// %.2f--> after decimal point gives 2 numbers
        //System.out.printf("%.2f",avg);
        //---or-----
        System.out.println(res);
         System.out.println(str);
    
    }
}


//Another way i.e; with function method

// import java.util.*;
// import java.util.Scanner;
// public class sol {
//     int res=0;
//     public static void main(String[] args)
//     {
//         Scanner obj = new Scanner(System.in);
//         sol sc = new sol();
//         int n = obj.nextInt();
//         int a[]=new int[n];
//         for(int i=0;i<n;i++)
//         {
//             System.out.print("enter array elements");
//             a[i] = obj.nextInt();
//         }
//         System.out.println("sum is" + sc.res);
//         String fin = sc.calc(a,n);
//         System.out.println(fin);
//     }
//     String calc(int arr[], int n)
//     {
//         for(int i=0;i<5;i++)
//         {
//             res = res + arr[i];
//         }
//         float avg= res/5;
//         String str = String.format("%.2f",avg);// %.2f--> after decimal point gives 2 numbers
//         return str;
//     }

// }
    




    





