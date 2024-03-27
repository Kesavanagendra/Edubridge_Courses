package practice_edu;

// import java.util.*;
// import java.util.Collections;

// public class SecondSmallest {

//     public static int getSecondSmallest(int[] a) {
//         try{
//             if(a.length>=2){
//                 ArrayList<Integer> aob = new ArrayList<Integer>();
//                 for(int i=0;i<a.length;i++){
//                     aob.add(a[i]);
//                 }
//                 Collections.sort(aob);
//                 return aob.get(1);
//             }
            
//         }
//         catch(Exception e){
//             System.out.println("arr length ");
//         }
//         return 0;
//     }

//     public static void main(String[] args) {
//         int a[] = new int[6];
//         Scanner sc= new Scanner(System.in);//23 45 32 22 20 96
//         for(int i=0;i<6;i++){
//             a[i]= sc.nextInt();
//         }
//         int res = getSecondSmallest(a);
//         System.out.println(res);
//     }
// }





//---------------------------------------------------------------------
// Here is the program to return the array elements.

// import java.util.*;
// import java.util.Collections;

// public class SecondSmallest {
//               //  ----
//     public static int[] getSecondSmallest(int[] a) {
//         int min=a[0];int temp;
//         for(int i=0;i<a.length-1;i++){
//             for(int j=i+1;j<a.length;j++){
//                 if(a[i]>a[j]){
//                     temp=a[i];
//                     a[i]=a[j];
//                     a[j]=temp;
//                 }
//             }
//         }
//         return a; //----here it returns the whole array elements.
//     }
//     // static void display(int a[]) {
//     //     for(int k=0;k<6;k++){
//     //         System.out.print(a[k]+" ");        
//     //     }
//     // }

//     public static void main(String[] args) {
//         int a[] = new int[6];
//         Scanner sc= new Scanner(System.in);//23 45 32 22 20 96
//         for(int i=0;i<6;i++){
//         a[i]= sc.nextInt();
//         }
//         int res[] =  getSecondSmallest(a);
//         //  display(a);

//         System.out.println(res[1]);
        
//     }
// }



//-----------------------------------------------------------------
// Here is the program to return the particular element of an array.

import java.util.*;
import java.util.Collections;

public class SecondSmallest {

    public static int getSecondSmallest(int[] a) {
        if(a==null && a.length<2){
            throw new NullPointerException("Array is null");
        }
        int min=a[0];int temp;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a[1];
    }

    public static void main(String[] args){
        int a[] = new int[6];
        Scanner sc= new Scanner(System.in);//23 45 32 22 20 96
        for(int i=0;i<6;i++){
            a[i]= sc.nextInt();
        }
        System.out.println( getSecondSmallest(a));
    }
}