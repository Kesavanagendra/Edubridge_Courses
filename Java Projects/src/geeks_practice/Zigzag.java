package geeks_practice;
import java.util.*;
import java.util.Scanner;
public class Zigzag {
    public static void main(String[] args){
        int a[] ={4,3,7,8,6,2,1};
        int n=a.length;
        for(int i=0;i<n-1;i++){
            if(i%2==0){
                if(a[i]>a[i+1]){
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
            else {
                if(a[i]<a[i+1]){
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}

