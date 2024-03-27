package geeks_practice;
import java.util.*;
import java.util.Scanner;
public class Total_count {
    public static void main(String[] args) {
        int a[]={5,8,10,13};int k=3;
        // int a[]={10,2,3,4,7};int k=4;
        int j=0;
        for(int i=0;i<a.length;i++){
            int sum=0;int count=1;
            if(a[i]<=k){
                System.out.print("1"+" ");
            }else{
                while(j<a.length){
                        sum=a[i]/k;
                        count=sum+count;
                        if(sum<a[i]){
                            int res = sum % k;
                            break;
                        }
                        j++;
                }
                System.out.print(count+" ");


            }
      
        }
    }
}
