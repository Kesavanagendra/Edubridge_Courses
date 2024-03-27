package geeks_practice;

//---finding the max subarray sum in pos and neg numbers
// import java.util.*;
// import java.util.Scanner;
// public class Kadanesalg {
//     public static void main(String[] args) {
//         int a[]={1,2,3,-2,5};
//         int a[]={-1,-2,-3,-4};
//         int temp=a[0];int sum=0;
//         for(int i=0;i<a.length;i++){
//               sum=sum+a[i]; 
//                 if(a[i]>sum){
//                     sum=a[i];
//                 }
//                 if(sum>temp){
//                     temp=sum;
//                 }
//         }
//         System.out.println(temp);
//     }
// }

//---------Another way--------
import java.util.*;
import java.util.Scanner;
public class Kadanesalg {
        public static void main(String[] args) {
        int a[]={1,2,3,-2,5};
        //int a[]={-1,-2,-3,-4};
        int temp=a[0];int sum=0;
        for(int i=0;i<a.length;i++){
              sum=Math.max(a[i],sum+a[i]); 
              temp=Math.max(sum,temp);

        }
        System.out.println(temp);
    }
}
    