package geeks_practice;
import java.util.*;
import java.util.Scanner;
public class Closest_no {
    public static void main(String[] args) {
        int a[]={1,2,3,5,6,8,9};
        int k=4;
        int min=a[0];
        int ans=0;
        for(int i=0;i<a.length;i++){
            int res = Math.abs(k-a[i]);
            if(res<=min){
                min=res;
                ans =Math.max(ans,a[i]);
            }
        }
            System.out.println(ans);
    }
}
