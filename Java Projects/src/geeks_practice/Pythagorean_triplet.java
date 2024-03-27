package geeks_practice;
import java.util.*;
import java.util.Scanner;
public class Pythagorean_triplet {
    public static void main(String[] args) {
        int a[]={3,2,4,6,5};
        for(int i=0;i<a.length;i++){
            int j=i+1;
            while(j<a.length){
                int k=j+1;
                while(k<a.length){
                    double res=0,sum=0;
                    if(k<a.length){
                        int a1 = a[i];
                        int a2 = a[j];//6
                        int a3 = a[k];//5
                        res = Math.pow(a3,2);
                        sum = Math.pow(a1,2) + Math.pow(a2,2);
                        if(res==sum){
                            System.out.println(i+" "+j+" "+k);
                            System.out.println("yes");
                            break;
                        }
                    }k++;
                }
                j++; 
            }
        }
    }

}


// 4 3 2 1 ----8 7 6
// 4 3 2 1
// 8 7 6

// 3 7 4 8 2 6 1



// 1 4 3 2
  
// 1 2 3 4 ---- 4 3 2 1
// 2 1
// 4 3 

//  1  4  2  3