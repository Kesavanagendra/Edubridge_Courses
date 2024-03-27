package geeks_practice;
import java.util.*;
import java.util.Scanner;
public class SwapKth {
    public static void main(String[] args) {
        int a[]={5,3,6,1,2};
        //int a[]={1,2,3,4,5,6,7,8};
        int len=a.length-1;
        int k=1;
        for(int i=0;i<=len;i++){
            if(i==k ){
                int f=a[i];
                int l=a[len-k];
                int temp = f;
                a[i]=l;
                a[len-k]=temp;
            }
            System.out.print(a[i]+" ");
        }
        
    }
}
