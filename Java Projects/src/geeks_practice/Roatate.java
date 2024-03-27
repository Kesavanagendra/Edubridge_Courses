package geeks_practice;
//----------------Roatate Right---------------//

// import java.util.*;
// import java.util.Scanner;
// public class Rotate {
//     public static void main(String[] args) {
//         ArrayList<Integer> a = new ArrayList<>();
//         a.addAll(Arrays.asList(new Integer[] {1,2,3,4,5}));
//         int n=a.size();
//         int b[]=new int[n];
//         int k=1;// for no.of rotations
//         for(int j=0;j<k;j++){
//             int temp= a.get(n-1);
//             b[0]= temp;
//             for(int i=1;i<n;i++){
//                 b[i]=a.get(i-1);
//             }
//             for(int i=0;i<a.size();i++){
//                 a.set(i, b[i]);
//             }
//         }
//         System.out.println(a);
//     }
// }



//--------------Roatate Left--------------------//


import java.util.*;
import java.util.Scanner;
public class Roatate {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7}));// 2 3 4 5 6 7 1
        int n=a.size();
        int b[]=new int[n];
        int k=2;// for no.of rotations
        for(int j=0;j<k;j++){
            int temp= a.get(0);
            b[n-1]= temp;
            for(int i=0;i<n-1;i++){
                b[i]=a.get(i+1);
            }
            for(int i=0;i<a.size();i++){
                a.set(i, b[i]);
            }
        }
        System.out.println(a);
    }
}

