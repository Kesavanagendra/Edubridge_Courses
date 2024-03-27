package geeks_practice;
// import java.util.ArrayList;
// import java.util.Arrays;

// class TwoD{
//     public static void main(String[] args) {
//         int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
//         //00  01  02
//        // 10  11  12
//         //20  21  22
//         int sum=0;
//           for(int i=0;i<3;i++)
//           {
//             for(int j=0;j<3;j++)
//             {
//                if(i==j)
//                {
//                     sum = sum + a[i][j];
//                }
//             }
//           }
//           System.out.println((sum));
          

//           int temp=a[0][0];
//           for(int i=0;i<3;i++)
//           {
//             for(int j=0;j<3;j++)
//             {
//                 if(a[i][j]>temp)
//                 {
//                     temp=a[i][j];
//                 }
//             }  
             
//           }
//           System.out.println(("max is" + temp));
//     }
// }




// Another method----------------

import java.util.*;
import java.util.Scanner;

public class TwoD {
    public void diagnol(int arr[][], int b[],int n)
    {
          ArrayList<Integer> res = new ArrayList<>();
          int sum=0;
          for(int i=0;i<3;i++)
          {
            for(int j=0;j<3;j++)
            {
               if(i==j)
               {
                    sum = sum + arr[i][j];
                    
               }
            }
          }
         Arrays.sort(b);
         res.add(sum);
         res.add(b[n-1]);
          System.out.println((sum));
          System.out.println(res);
    }

    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        TwoD sc = new TwoD();
        int m = obj.nextInt();
        int n = obj.nextInt();
        int a[][]=new int[m][n];
        int b[] = new int[a.length];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("enter array elements");
                a[i][j] = obj.nextInt();
            }
            
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               b[i]=a[i][j];  
            }
            
        }
        for(int j=0;j<n;j++)
        {
                System.out.print( b[j] +  " ");  
        }
          sc.diagnol(a,b,n);
    }
}